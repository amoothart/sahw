package com.amooth.data_access;

import com.amooth.configuration.ResultSet;
import com.amooth.login_history.LoginHistoryCache;
import com.amooth.login_history.LoginHistoryContext;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.health.HealthCheck;

public class LoginHistoryDataAccess implements InternalDataAccess<InternalLoginHistory, LoginHistoryContext> {
    private final static LoginHistoryCache loginHistoryCache = LoginHistoryCache.getInstance();

    @Override
    public ResultSet<InternalLoginHistory> getData(LoginHistoryContext context) {
        return loginHistoryCache.getData(context);
    }

    @Override
    public ResultSet<InternalLoginHistory> insertData(InternalLoginHistory data) {
        return null;
    }

    @Override
    public ResultSet<InternalLoginHistory> updateData(LoginHistoryContext context, InternalLoginHistory data) {
        return null;
    }

    @Override
    public ResultSet<InternalLoginHistory> deleteData(LoginHistoryContext context) {
        return null;
    }

    @Override
    public HealthCheck.Result check() throws Exception {
        return loginHistoryCache.cacheStatus();
    }
}
