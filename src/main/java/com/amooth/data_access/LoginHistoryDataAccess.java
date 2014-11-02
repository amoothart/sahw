package com.amooth.data_access;

import com.amooth.configuration.ResultSet;
import com.amooth.cache.LoginHistoryCache;
import com.amooth.context.LoginHistoryContext;
import com.amooth.models.InternalLoginHistory;
import com.codahale.metrics.health.HealthCheck;
import com.sforce.soap.enterprise.Soap;

public class LoginHistoryDataAccess implements InternalDataAccess<InternalLoginHistory, LoginHistoryContext> {
    private final static LoginHistoryCache loginHistoryCache = LoginHistoryCache.getInstance();

    @Override
    public ResultSet<InternalLoginHistory> getData(LoginHistoryContext context, Soap port) {
        return loginHistoryCache.getData(port);
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
