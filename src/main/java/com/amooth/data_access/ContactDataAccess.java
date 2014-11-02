package com.amooth.data_access;

import com.amooth.cache.ContactCache;
import com.amooth.configuration.ResultSet;
import com.amooth.context.ContactContext;
import com.amooth.models.InternalContact;
import com.codahale.metrics.health.HealthCheck;
import com.sforce.soap.enterprise.Create;
import com.sforce.soap.enterprise.Soap;
import com.sforce.soap.enterprise.Upsert;
import com.sforce.soap.enterprise.sobject.SObject;

import java.util.ArrayList;
import java.util.List;

public class ContactDataAccess implements InternalDataAccess<InternalContact, ContactContext> {
    private final static ContactCache contactCache = ContactCache.getInstance();

    @Override
    public ResultSet<InternalContact> getData(ContactContext query, Soap port) {
        return contactCache.getContactByFirstName(query, port);
    }

    @Override
    public ResultSet<InternalContact> insertData(InternalContact data, Soap port) {
        Create create = new Create();
        List<SObject> sObjects = new ArrayList<SObject>();
        return null;
    }

    @Override
    public ResultSet<InternalContact> updateData(ContactContext query, InternalContact data) {
        return null;
    }

    @Override
    public ResultSet<InternalContact> deleteData(ContactContext query) {
        return null;
    }

    @Override
    public HealthCheck.Result check() throws Exception {
        return null;
    }
}
