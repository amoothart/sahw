package com.amooth;

import com.amooth.configuration.Collection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class AppConfiguration extends Configuration {
    @JsonProperty
    @Valid
    @NotNull
    private Boolean usingApiKey = false;

    @JsonProperty
    @Valid
    private String apiKey = "";

    @Valid
    @NotNull
    @JsonProperty
    private HttpClientConfiguration httpClientConfiguration = new HttpClientConfiguration();

    @Valid
    @JsonProperty
    private String cachingOptions = "maximumSize=1000,expireAfterWrite=5m";

    @JsonProperty
    @Valid
    @NotNull
    private List<Collection> collections = Lists.newArrayList();

    public Boolean getUsingApiKey() {
        return usingApiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public HttpClientConfiguration getHttpClientConfiguration() {
        return httpClientConfiguration;
    }

    public String getCachingOptions() {
        return cachingOptions;
    }

    public List<Collection> getCollections() {
        return collections;
    }
}
