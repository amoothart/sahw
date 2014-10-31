package com.amooth.resources;

import com.amooth.AppConfiguration;
import com.amooth.configuration.ResultSet;
import com.amooth.data_access.LoginHistoryDataAccess;
import com.amooth.login_history.LoginHistoryCache;
import com.amooth.login_history.LoginHistoryContext;
import com.amooth.models.LoginHistory;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
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

    public LoginHistoryResource(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
        LoginHistoryCache.getInstance().setCacheOptions(appConfiguration.getCachingOptions());
    }

    @GET
    @Timed
    /**
     * Handle requests to the /login_history/ endpoint
     *
     * @param authToken Set if the X-Kinvey-Auth header is present, and will contain a SAML assertion
     */
    public List<LoginHistory> getLoginHistories(@HeaderParam("X-Kinvey-Auth") String authToken) {
        LoginHistoryContext context = LoginHistoryContext.createContext(authToken);

        ResultSet<InternalLoginHistory> rs = dataAccess.getData(context);
        return null;
    }
}
