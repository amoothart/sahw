package com.amooth.models;

import java.util.Date;

public class InternalLoginHistory {
    private final String id;
    private final String apiType;
    private final String apiVersion;
    private final String application;
    private final String browser;
    private final String clientVersion;
    private final Date loginTime;
    private final String loginType;
    private final String loginUrl;
    private final String platform;
    private final String sourceIp;
    private final String status;
    private final int userId;

    public InternalLoginHistory(String id, String apiType, String apiVersion, String application, String browser, String clientVersion, Date loginTime, String loginType, String loginUrl, String platform, String sourceIp, String status, int userId) {
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
