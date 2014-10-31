package com.amooth.health;

import com.amooth.AppConfiguration;
import com.amooth.data_access.LoginHistoryDataAccess;
import com.codahale.metrics.health.HealthCheck;

public class LoginHistoryHealthCheck extends HealthCheck {

    private AppConfiguration appConfiguration;
    private LoginHistoryDataAccess dataAccess;

    public LoginHistoryHealthCheck(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
        this.dataAccess = new LoginHistoryDataAccess();
    }

    @Override
    protected Result check() throws Exception {
        return dataAccess.check();
    }
}
