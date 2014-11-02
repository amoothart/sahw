
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomObjectUserLicenseMetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectUserLicenseMetrics">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CustomObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetricsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ObjectCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLicense" type="{urn:sobject.enterprise.soap.sforce.com}UserLicense" minOccurs="0"/>
 *         &lt;element name="UserLicenseId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectUserLicenseMetrics", propOrder = {
    "customObjectId",
    "customObjectName",
    "customObjectType",
    "metricsDate",
    "objectCount",
    "systemModstamp",
    "userLicense",
    "userLicenseId"
})
public class CustomObjectUserLicenseMetrics
    extends SObject
{

    @XmlElementRef(name = "CustomObjectId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customObjectId;
    @XmlElementRef(name = "CustomObjectName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customObjectName;
    @XmlElementRef(name = "CustomObjectType", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customObjectType;
    @XmlElementRef(name = "MetricsDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> metricsDate;
    @XmlElementRef(name = "ObjectCount", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> objectCount;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "UserLicense", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserLicense> userLicense;
    @XmlElementRef(name = "UserLicenseId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLicenseId;

    /**
     * Gets the value of the customObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomObjectId() {
        return customObjectId;
    }

    /**
     * Sets the value of the customObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomObjectId(JAXBElement<String> value) {
        this.customObjectId = value;
    }

    /**
     * Gets the value of the customObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomObjectName() {
        return customObjectName;
    }

    /**
     * Sets the value of the customObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomObjectName(JAXBElement<String> value) {
        this.customObjectName = value;
    }

    /**
     * Gets the value of the customObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomObjectType() {
        return customObjectType;
    }

    /**
     * Sets the value of the customObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomObjectType(JAXBElement<String> value) {
        this.customObjectType = value;
    }

    /**
     * Gets the value of the metricsDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMetricsDate() {
        return metricsDate;
    }

    /**
     * Sets the value of the metricsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMetricsDate(JAXBElement<XMLGregorianCalendar> value) {
        this.metricsDate = value;
    }

    /**
     * Gets the value of the objectCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getObjectCount() {
        return objectCount;
    }

    /**
     * Sets the value of the objectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setObjectCount(JAXBElement<Integer> value) {
        this.objectCount = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSystemModstamp(JAXBElement<XMLGregorianCalendar> value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserLicense }{@code >}
     *     
     */
    public JAXBElement<UserLicense> getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserLicense }{@code >}
     *     
     */
    public void setUserLicense(JAXBElement<UserLicense> value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLicenseId() {
        return userLicenseId;
    }

    /**
     * Sets the value of the userLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLicenseId(JAXBElement<String> value) {
        this.userLicenseId = value;
    }

}
