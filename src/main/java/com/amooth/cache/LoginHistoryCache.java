package com.amooth.cache;

import com.amooth.configuration.ResultSet;
import com.amooth.configuration.ResultStatus;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.health.HealthCheck;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sforce.soap.enterprise.*;
import com.sforce.soap.enterprise.sobject.LoginHistory;
import com.sforce.soap.enterprise.sobject.SObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class LoginHistoryCache {
    private static final Logger logger = LoggerFactory.getLogger(LoginHistoryCache.class);

    private Cache<String, List<InternalLoginHistory>> cache;
    private String cacheOptions = "";
    private static LoginHistoryCache ourInstance = new LoginHistoryCache();
    public static LoginHistoryCache getInstance() {
        return ourInstance;
    }

    public LoginHistoryCache() {
        this.cache = CacheBuilder.from(cacheOptions).build();
    }

    private List<InternalLoginHistory> buildPolicy(Soap port) {
        logger.info("Fetching login history");

        Query query = new Query();
        query.setQueryString("Select ApiType, ApiVersion, Application, Browser, ClientVersion, LoginTime, LoginType, LoginUrl, Platform, SourceIp, Status, UserId from LoginHistory");
        QueryResponse queryResponse;
        try {
            queryResponse = port.query(query);
        } catch (Exception e) {
            logger.error("Salesforce query failed: ", e);
            throw new RuntimeException(e);
        }

        logger.info("Fetched login histories -> {}", queryResponse.getResult().toString());

        List<InternalLoginHistory> internalLoginHistories = new ArrayList<InternalLoginHistory>();
        for(SObject sObject : queryResponse.getResult().getRecords()) {
            LoginHistory loginHistory = (LoginHistory)sObject;
            internalLoginHistories.add(new InternalLoginHistory(loginHistory.getId(),
                    loginHistory.getApiType().getValue(),
                    loginHistory.getApiVersion().getValue(),
                    loginHistory.getApplication().getValue(),
                    loginHistory.getBrowser().getValue(),
                    loginHistory.getClientVersion().getValue(),
                    loginHistory.getLoginTime().getValue(),
                    loginHistory.getLoginType().getValue(),
                    loginHistory.getLoginUrl() == null ? "" : loginHistory.getLoginUrl().getValue(),
                    loginHistory.getPlatform().getValue(),
                    loginHistory.getSourceIp().getValue(),
                    loginHistory.getStatus().getValue(),
                    loginHistory.getUserId().getValue()));
        }

        logger.info("Got " + internalLoginHistories.size() + " InternalLoginHistories with first being -> {}", internalLoginHistories.get(0).toString());
        return internalLoginHistories;
    }

    public ResultSet<InternalLoginHistory> getData(final Soap port) {
        List<InternalLoginHistory> internalLoginHistories = new ArrayList<InternalLoginHistory>();
        ResultStatus resultStatus;

        try {
            internalLoginHistories.addAll(cache.get("LoginHistoriesList", new Callable<List<InternalLoginHistory>>() {
                @Override
                public List<InternalLoginHistory> call() throws Exception {
                    return buildPolicy(port);
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
