package com.amooth.data_access;

import com.amooth.configuration.ResultSet;
import com.codahale.metrics.health.HealthCheck;
import com.sforce.soap.enterprise.Soap;

public interface InternalDataAccess<T, Q> {
    public ResultSet<T> getData(Q query, Soap port);
    public ResultSet<T> insertData(T data, Soap port);
    public ResultSet<T> updateData(Q query, T data);
    public ResultSet<T> deleteData(Q query);

    // For health checking
    public HealthCheck.Result check() throws Exception;
}
