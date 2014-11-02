
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAccountLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAccountLink">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsNotSsoUsable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemoteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsoProvider" type="{urn:sobject.enterprise.soap.sforce.com}AuthProvider" minOccurs="0"/>
 *         &lt;element name="SsoProviderId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SsoProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAccountLinkKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="UserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAccountLink", propOrder = {
    "handle",
    "isNotSsoUsable",
    "provider",
    "remoteIdentifier",
    "ssoProvider",
    "ssoProviderId",
    "ssoProviderName",
    "thirdPartyAccountLinkKey",
    "user",
    "userId"
})
public class ThirdPartyAccountLink
    extends SObject
{

    @XmlElementRef(name = "Handle", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> handle;
    @XmlElementRef(name = "IsNotSsoUsable", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isNotSsoUsable;
    @XmlElementRef(name = "Provider", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provider;
    @XmlElementRef(name = "RemoteIdentifier", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remoteIdentifier;
    @XmlElementRef(name = "SsoProvider", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthProvider> ssoProvider;
    @XmlElementRef(name = "SsoProviderId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssoProviderId;
    @XmlElementRef(name = "SsoProviderName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssoProviderName;
    @XmlElementRef(name = "ThirdPartyAccountLinkKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirdPartyAccountLinkKey;
    @XmlElementRef(name = "User", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> user;
    @XmlElementRef(name = "UserId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHandle(JAXBElement<String> value) {
        this.handle = value;
    }

    /**
     * Gets the value of the isNotSsoUsable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsNotSsoUsable() {
        return isNotSsoUsable;
    }

    /**
     * Sets the value of the isNotSsoUsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsNotSsoUsable(JAXBElement<Boolean> value) {
        this.isNotSsoUsable = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvider(JAXBElement<String> value) {
        this.provider = value;
    }

    /**
     * Gets the value of the remoteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemoteIdentifier() {
        return remoteIdentifier;
    }

    /**
     * Sets the value of the remoteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemoteIdentifier(JAXBElement<String> value) {
        this.remoteIdentifier = value;
    }

    /**
     * Gets the value of the ssoProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthProvider }{@code >}
     *     
     */
    public JAXBElement<AuthProvider> getSsoProvider() {
        return ssoProvider;
    }

    /**
     * Sets the value of the ssoProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthProvider }{@code >}
     *     
     */
    public void setSsoProvider(JAXBElement<AuthProvider> value) {
        this.ssoProvider = value;
    }

    /**
     * Gets the value of the ssoProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSsoProviderId() {
        return ssoProviderId;
    }

    /**
     * Sets the value of the ssoProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSsoProviderId(JAXBElement<String> value) {
        this.ssoProviderId = value;
    }

    /**
     * Gets the value of the ssoProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSsoProviderName() {
        return ssoProviderName;
    }

    /**
     * Sets the value of the ssoProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSsoProviderName(JAXBElement<String> value) {
        this.ssoProviderName = value;
    }

    /**
     * Gets the value of the thirdPartyAccountLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirdPartyAccountLinkKey() {
        return thirdPartyAccountLinkKey;
    }

    /**
     * Sets the value of the thirdPartyAccountLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirdPartyAccountLinkKey(JAXBElement<String> value) {
        this.thirdPartyAccountLinkKey = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setUser(JAXBElement<User> value) {
        this.user = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
    }

}
