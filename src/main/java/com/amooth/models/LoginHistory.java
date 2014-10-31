package com.amooth.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LoginHistory {

    @JsonProperty("_id")
    private final String id;
    @JsonProperty
    private final String apiType;
    @JsonProperty
    private final String apiVersion;
    @JsonProperty
    private final String application;
    @JsonProperty
    private final String browser;
    @JsonProperty
    private final String clientVersion;
    @JsonProperty
    private final Date loginTime;
    @JsonProperty
    private final String loginType;
    @JsonProperty
    private final String loginUrl;
    @JsonProperty
    private final String platform;
    @JsonProperty
    private final String sourceIp;
    @JsonProperty
    private final String status;
    @JsonProperty
    private final int userId;

    public LoginHistory(String id, String apiType, String apiVersion, String application, String browser, String clientVersion, Date loginTime, String loginType, String loginUrl, String platform, String sourceIp, String status, int userId) {
        this.id = id;
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.application = application;
        this.browser = browser;
        this.clientVersion = clientVersion;
        this.loginTime = loginTime;
        this.loginType = loginType;
        this.loginUrl = loginUrl;
        this.platform = platform;
        this.sourceIp = sourceIp;
        this.status = status;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public String getApiType() {
        return apiType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getApplication() {
        return application;
    }

    public String getBrowser() {
        return browser;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public String getLoginType() {
        return loginType;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getPlatform() {
        return platform;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public String getStatus() {
        return status;
    }

    public int getUserId() {
        return userId;
    }
}
