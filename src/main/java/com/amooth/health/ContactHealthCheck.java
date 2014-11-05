package com.amooth.health;

import com.amooth.AppConfiguration;
import com.amooth.data_access.LeadDataAccess;
import com.codahale.metrics.health.HealthCheck;
import com.sforce.soap.enterprise.Soap;

public class ContactHealthCheck extends HealthCheck {
    private AppConfiguration appConfiguration;
    private LeadDataAccess dataAccess;

    public ContactHealthCheck(AppConfiguration appConfiguration, Soap port) {
        this.appConfiguration = appConfiguration;
        this.dataAccess = new LeadDataAccess();
    }

    @Override
    protected Result check() throws Exception {
        return null;
    }
}
