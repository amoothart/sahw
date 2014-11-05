package com.amooth.data_access;

import com.amooth.configuration.ResultSet;
import com.amooth.cache.LeadCache;
import com.amooth.context.LeadContext;
import com.amooth.models.InternalLead;
import com.codahale.metrics.health.HealthCheck;
import com.sforce.soap.enterprise.Soap;

public class LeadDataAccess implements InternalDataAccess<InternalLead, LeadContext> {
    private final static LeadCache leadCache = LeadCache.getInstance();

    @Override
    public ResultSet<InternalLead> getData(LeadContext context, Soap port) {
        return leadCache.getData(port);
    }

    @Override
    public ResultSet<InternalLead> insertData(InternalLead data, Soap port) {
        return null;
    }

    @Override
    public ResultSet<InternalLead> updateData(LeadContext context, InternalLead data) {
        return null;
    }

    @Override
    public ResultSet<InternalLead> deleteData(LeadContext context) {
        return null;
    }

    @Override
    public HealthCheck.Result check() throws Exception {
        return leadCache.cacheStatus();
    }
}
