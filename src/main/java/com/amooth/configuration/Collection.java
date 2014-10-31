package com.amooth.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class Collection {
    @JsonProperty
    @NotEmpty
    private String name;

    @JsonProperty
    private boolean usingGlobalHttpClient = false;

    @Override
    public String toString() {
        return "Collection{" +
                "name='" + name + '\'' +
                ", usingGlobalHttpClient=" + usingGlobalHttpClient +
                '}';
    }

    public Collection() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsingGlobalHttpClient() {
        return usingGlobalHttpClient;
    }

    public void setUsingGlobalHttpClient(boolean usingGlobalHttpClient) {
        this.usingGlobalHttpClient = usingGlobalHttpClient;
    }
}
