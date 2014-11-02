package com.amooth.cache;

import com.amooth.configuration.ResultSet;
import com.amooth.configuration.ResultStatus;
import com.amooth.context.ContactContext;
import com.amooth.models.InternalContact;
import com.codahale.metrics.health.HealthCheck;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sforce.soap.enterprise.Query;
import com.sforce.soap.enterprise.QueryResponse;
import com.sforce.soap.enterprise.Soap;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.SObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ContactCache {
    public static ContactCache getInstance() {
        return ourInstance;
    }

    private static final Logger logger = LoggerFactory.getLogger(ContactCache.class);
    private static ContactCache ourInstance = new ContactCache();

    private Cache<String, List<InternalContact>> cache;
    private String cacheOptions = "";

    public ContactCache() {
        this.cache = CacheBuilder.from(cacheOptions).build();
    }

    public ResultSet<InternalContact> getContactByFirstName(ContactContext context, Soap port) {
        List<InternalContact> internalContacts = new ArrayList<InternalContact>();
        ResultStatus resultStatus;

        try {
            internalContacts.addAll(cache.get("ContactById" + context.getQuery(), new Callable<List<InternalContact>>() {
                @Override
                public List<InternalContact> call() throws Exception {
                    return buildContact(context, port);
                }
            }));
            resultStatus = ResultStatus.SUCCESS;
        } catch (ExecutionException e) {
            resultStatus = ResultStatus.FAILURE;
        }

        return new ResultSet<InternalContact>(resultStatus, internalContacts.size(), internalContacts);
    }

    private List<InternalContact> buildContact(ContactContext context, Soap port) {
        logger.info("Fetching contact");

        Query query = new Query();
        query.setQueryString("Select id, AccountId, FirstName, Description, LastName from Contact where FirstName = '" + context.getQuery() + "'");
        QueryResponse queryResponse;
        try {
            queryResponse = port.query(query);
        } catch (Exception e) {
            logger.error("Salesforce query failed: ", e);
            throw new RuntimeException(e);
        }

        logger.info("Fetched contacts -> {}", queryResponse.getResult().toString());

        List<InternalContact> internalContacts = new ArrayList<InternalContact>();
        for(SObject sObject : queryResponse.getResult().getRecords()) {
            Contact contact = (Contact)sObject;
            internalContacts.add(new InternalContact(contact.getId(),
                    contact.getAccountId().getValue(),
                    contact.getDescription().getValue(),
                    contact.getFirstName().getValue(),
                    contact.getLastName().getValue()));
        }

        logger.info("Got " + internalContacts.size() + " InternalContacts");
        if(internalContacts.size() > 0) {
            logger.info("First being -> {}", internalContacts.get(0).toString());
        }
        return internalContacts;
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