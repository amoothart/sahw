package com.amooth.resources;

import com.amooth.AppConfiguration;
import com.amooth.configuration.ResultSet;
import com.amooth.context.LoginHistoryContext;
import com.amooth.data_access.LoginHistoryDataAccess;
import com.amooth.cache.LoginHistoryCache;
import com.amooth.models.LoginHistory;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.annotation.Timed;
import com.sforce.soap.enterprise.Soap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/login_history")
@Produces(MediaType.APPLICATION_JSON)
public class LoginHistoryResource {

    private final LoginHistoryDataAccess dataAccess = new LoginHistoryDataAccess();
    private final Logger logger = LoggerFactory.getLogger(LoginHistoryResource.class);
    private final AppConfiguration appConfiguration;
    private final Soap port;

    public LoginHistoryResource(AppConfiguration appConfiguration, Soap port) {
        this.appConfiguration = appConfiguration;
        this.port = port;
        LoginHistoryCache.getInstance().setCacheOptions(appConfiguration.getCachingOptions());
    }

    @GET
    @Timed
    public List<LoginHistory> getLoginHistories() {
        LoginHistoryContext context = LoginHistoryContext.createContext("");

        ResultSet<InternalLoginHistory> rs = dataAccess.getData(context, port);
        return null;
    }
}
