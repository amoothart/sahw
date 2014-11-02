
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuthProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthProvider">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AuthorizeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultScopes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutionUserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTokenIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionsIncludeOrgIdInId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsSendAccessTokenInHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsSendClientCredentialsInHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationHandlerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="TokenUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInfoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthProvider", propOrder = {
    "authorizeUrl",
    "consumerKey",
    "consumerSecret",
    "createdDate",
    "defaultScopes",
    "developerName",
    "errorUrl",
    "executionUserId",
    "friendlyName",
    "iconUrl",
    "idTokenIssuer",
    "optionsIncludeOrgIdInId",
    "optionsSendAccessTokenInHeader",
    "optionsSendClientCredentialsInHeader",
    "providerType",
    "registrationHandlerId",
    "tokenUrl",
    "userInfoUrl"
})
public class AuthProvider
    extends SObject
{

    @XmlElementRef(name = "AuthorizeUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizeUrl;
    @XmlElementRef(name = "ConsumerKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerKey;
    @XmlElementRef(name = "ConsumerSecret", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerSecret;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DefaultScopes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultScopes;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "ErrorUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorUrl;
    @XmlElementRef(name = "ExecutionUserId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> executionUserId;
    @XmlElementRef(name = "FriendlyName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> friendlyName;
    @XmlElementRef(name = "IconUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iconUrl;
    @XmlElementRef(name = "IdTokenIssuer", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idTokenIssuer;
    @XmlElementRef(name = "OptionsIncludeOrgIdInId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> optionsIncludeOrgIdInId;
    @XmlElementRef(name = "OptionsSendAccessTokenInHeader", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> optionsSendAccessTokenInHeader;
    @XmlElementRef(name = "OptionsSendClientCredentialsInHeader", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> optionsSendClientCredentialsInHeader;
    @XmlElementRef(name = "ProviderType", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> providerType;
    @XmlElementRef(name = "RegistrationHandlerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationHandlerId;
    @XmlElementRef(name = "TokenUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenUrl;
    @XmlElementRef(name = "UserInfoUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userInfoUrl;

    /**
     * Gets the value of the authorizeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizeUrl() {
        return authorizeUrl;
    }

    /**
     * Sets the value of the authorizeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizeUrl(JAXBElement<String> value) {
        this.authorizeUrl = value;
    }

    /**
     * Gets the value of the consumerKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerKey() {
        return consumerKey;
    }

    /**
     * Sets the value of the consumerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerKey(JAXBElement<String> value) {
        this.consumerKey = value;
    }

    /**
     * Gets the value of the consumerSecret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Sets the value of the consumerSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerSecret(JAXBElement<String> value) {
        this.consumerSecret = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the defaultScopes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultScopes() {
        return defaultScopes;
    }

    /**
     * Sets the value of the defaultScopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultScopes(JAXBElement<String> value) {
        this.defaultScopes = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeveloperName(JAXBElement<String> value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorUrl(JAXBElement<String> value) {
        this.errorUrl = value;
    }

    /**
     * Gets the value of the executionUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExecutionUserId() {
        return executionUserId;
    }

    /**
     * Sets the value of the executionUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExecutionUserId(JAXBElement<String> value) {
        this.executionUserId = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFriendlyName(JAXBElement<String> value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIconUrl(JAXBElement<String> value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the idTokenIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTokenIssuer() {
        return idTokenIssuer;
    }

    /**
     * Sets the value of the idTokenIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTokenIssuer(JAXBElement<String> value) {
        this.idTokenIssuer = value;
    }

    /**
     * Gets the value of the optionsIncludeOrgIdInId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOptionsIncludeOrgIdInId() {
        return optionsIncludeOrgIdInId;
    }

    /**
     * Sets the value of the optionsIncludeOrgIdInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOptionsIncludeOrgIdInId(JAXBElement<Boolean> value) {
        this.optionsIncludeOrgIdInId = value;
    }

    /**
     * Gets the value of the optionsSendAccessTokenInHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOptionsSendAccessTokenInHeader() {
        return optionsSendAccessTokenInHeader;
    }

    /**
     * Sets the value of the optionsSendAccessTokenInHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOptionsSendAccessTokenInHeader(JAXBElement<Boolean> value) {
        this.optionsSendAccessTokenInHeader = value;
    }

    /**
     * Gets the value of the optionsSendClientCredentialsInHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOptionsSendClientCredentialsInHeader() {
        return optionsSendClientCredentialsInHeader;
    }

    /**
     * Sets the value of the optionsSendClientCredentialsInHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOptionsSendClientCredentialsInHeader(JAXBElement<Boolean> value) {
        this.optionsSendClientCredentialsInHeader = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProviderType(JAXBElement<String> value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the registrationHandlerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationHandlerId() {
        return registrationHandlerId;
    }

    /**
     * Sets the value of the registrationHandlerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationHandlerId(JAXBElement<String> value) {
        this.registrationHandlerId = value;
    }

    /**
     * Gets the value of the tokenUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenUrl() {
        return tokenUrl;
    }

    /**
     * Sets the value of the tokenUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenUrl(JAXBElement<String> value) {
        this.tokenUrl = value;
    }

    /**
     * Gets the value of the userInfoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserInfoUrl() {
        return userInfoUrl;
    }

    /**
     * Sets the value of the userInfoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserInfoUrl(JAXBElement<String> value) {
        this.userInfoUrl = value;
    }

}
