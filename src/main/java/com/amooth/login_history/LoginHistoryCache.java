package com.amooth.login_history;

import com.amooth.configuration.ResultSet;
import com.amooth.configuration.ResultStatus;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.health.HealthCheck;
import com.google.common.cache.Cache;
import net.kinvey.wsdl.GetLoginHistory;
import net.kinvey.wsdl.GetLoginHistoryResponse;
import net.kinvey.wsdl.LoginHistory;
import net.kinvey.wsdl.LoginHistoryWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class LoginHistoryCache {
    private static final Logger logger = LoggerFactory.getLogger(LoginHistoryCache.class);

    private Cache<String, InternalLoginHistory> cache;
    private String cacheOptions = "";
    private static LoginHistoryCache ourInstance = new LoginHistoryCache();
    public static LoginHistoryCache getInstance() {
        return ourInstance;
    }

    private static InternalLoginHistory buildPolicy(String query, String token) {
        Service loginHistoryService;
        //TODO: What is the wsdl endpoint?
        try {
            loginHistoryService = Service.create(new URL("http://foo.com"),
                    new QName("http://www.kinvey.net/wsdl", "PolicyService"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            //TODO: throw a better exception
            loginHistoryService = null;
        }

        LoginHistoryWs loginHistoryWs = loginHistoryService.getPort(LoginHistoryWs.class);

        logger.info("Fetching policy");
        Integer id;

        //TODO: probably not necessary as we're getting a list
        if(query.equals("")) {
            id = -1;
        } else {
            id = Integer.parseInt(query);
        }

        GetLoginHistory getLoginHistory = new GetLoginHistory();
        getLoginHistory.setArg0(id);
        GetLoginHistoryResponse response = loginHistoryWs.getLoginHistory(getLoginHistory, token);
        LoginHistory loginHistory = response.getReturn();

        logger.info("Fetched login history -> {}", loginHistory.toString());

        InternalLoginHistory internalLoginHistory = new InternalLoginHistory(loginHistory.getId(),
                loginHistory.getApiType(),
                loginHistory.getApiVersion(),
                loginHistory.getApplication(),
                loginHistory.getBrowser(),
                loginHistory.getClientVersion(),
                loginHistory.getLoginTime(),
                loginHistory.getLoginType(),
                loginHistory.getLoginUrl(),
                loginHistory.getPlatform(),
                loginHistory.getSourceIp(),
                loginHistory.getStatus(),
                loginHistory.getUserId());

        logger.info("Got InternalLoginHistory-> {}", internalLoginHistory.toString());
        return internalLoginHistory;

    }

    public ResultSet<InternalLoginHistory> getData(final LoginHistoryContext context) {
        List<InternalLoginHistory> internalLoginHistories = new ArrayList<InternalLoginHistory>();
        ResultStatus resultStatus;

        try {
            internalLoginHistories.add(cache.get(context.getQuery() + context.getToken(), new Callable<InternalLoginHistory>() {
                @Override
                public InternalLoginHistory call() throws Exception {
                    return buildPolicy(context.getQuery(), context.getToken());
                }
            }));
            resultStatus = ResultStatus.SUCCESS;
        } catch (ExecutionException e) {
            resultStatus = ResultStatus.FAILURE;
        }

        return new ResultSet<InternalLoginHistory>(resultStatus, internalLoginHistories.size(), internalLoginHistories);
    }

    public HealthCheck.Result cacheStatus() {
        // TODO: Implement health check for the SOAP API
        return HealthCheck.Result.healthy();
    }

    public String getCacheOptions() {
        return cacheOptions;
    }

    public void setCacheOptions(String cacheOptions) {
        this.cacheOptions = cacheOptions;
    }
}
