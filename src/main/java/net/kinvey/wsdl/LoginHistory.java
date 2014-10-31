package net.kinvey.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * <p>Java class for Policy complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <complexType name="LoginHistory">
 * <complexContent>
 * <extension base="ens:sObject">
 * <sequence>
 * <element name="ApiType" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="ApiVersion" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="Application" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="Browser" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="ClientVersion" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="LoginTime" nillable="true" minOccurs="0" type="xsd:dateTime"/>
 * <element name="LoginType" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="LoginUrl" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="Platform" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="SourceIp" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="Status" nillable="true" minOccurs="0" type="xsd:string"/>
 * <element name="UserId" nillable="true" minOccurs="0" type="tns:ID"/>
 * </sequence>
 * </extension>
 * </complexContent>
 * </complexType>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginHistory", propOrder = {
        "id",
        "apiType",
        "apiVersion",
        "application",
        "browser",
        "clientVersion",
        "loginTime",
        "loginType",
        "loginUrl",
        "platform",
        "sourceIp",
        "status",
        "userId"
})
 public class LoginHistory {
    //TODO: is this id truly coming in?
    protected String id;
    protected String apiType;
    protected String apiVersion;
    protected String application;
    protected String browser;
    protected String clientVersion;
    protected Date loginTime;
    protected String loginType;
    protected String loginUrl;
    protected String platform;
    protected String sourceIp;
    protected String status;
    protected int userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
