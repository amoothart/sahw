package com.amooth.cache;

import com.amooth.configuration.ResultSet;
import com.amooth.configuration.ResultStatus;
import com.amooth.models.InternalLead;
import com.codahale.metrics.health.HealthCheck;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sforce.soap.enterprise.*;
import com.sforce.soap.enterprise.sobject.Lead;
import com.sforce.soap.enterprise.sobject.SObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class LeadCache {
    private static final Logger logger = LoggerFactory.getLogger(LeadCache.class);

    private Cache<String, List<InternalLead>> cache;
    private String cacheOptions = "";
    private static LeadCache ourInstance = new LeadCache();
    public static LeadCache getInstance() {
        return ourInstance;
    }

    public LeadCache() {
        this.cache = CacheBuilder.from(cacheOptions).build();
    }

    private List<InternalLead> buildPolicy(Soap port) {
        logger.info("Fetching leads");

        Query query = new Query();
        query.setQueryString("Select Address, City, Company, CreatedDate from Lead");
        QueryResponse queryResponse;
        try {
            queryResponse = port.query(query);
        } catch (Exception e) {
            logger.error("Salesforce query failed: ", e);
            throw new RuntimeException(e);
        }

        logger.info("Fetched leads -> {}", queryResponse.getResult().toString());

        List<InternalLead> internalLeads = new ArrayList<InternalLead>();
        for(SObject sObject : queryResponse.getResult().getRecords()) {
            Lead lead = (Lead)sObject;
            internalLeads.add(new InternalLead(lead.getId(),
                    lead.getAddress().getValue().getStreet(),
                    lead.getCity().getValue(),
                    lead.getCompany().getValue(),
                    lead.getCreatedDate().getValue()));
        }

        logger.info("Got " + internalLeads.size() + " InternalLeads with first being -> {}", internalLeads.get(0).toString());
        return internalLeads;
    }

    public ResultSet<InternalLead> getData(final Soap port) {
        List<InternalLead> internalLeads = new ArrayList<InternalLead>();
        ResultStatus resultStatus;

        try {
            internalLeads.addAll(cache.get("LeadsList", new Callable<List<InternalLead>>() {
                @Override
                public List<InternalLead> call() throws Exception {
                    return buildPolicy(port);
                }
            }));
            resultStatus = ResultStatus.SUCCESS;
        } catch (ExecutionException e) {
            resultStatus = ResultStatus.FAILURE;
        }

        return new ResultSet<InternalLead>(resultStatus, internalLeads.size(), internalLeads);
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
