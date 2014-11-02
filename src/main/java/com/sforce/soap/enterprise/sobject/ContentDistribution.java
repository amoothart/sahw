
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for ContentDistribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDistribution">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ContentDistributionViews" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContentDocumentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentVersion" type="{urn:sobject.enterprise.soap.sforce.com}ContentVersion" minOccurs="0"/>
 *         &lt;element name="ContentVersionId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DistributionPublicUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FirstViewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowOriginalDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowPDFDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowViewInBrowser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesLinkLatestVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesNotifyOnVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesNotifyRndtnComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesPasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelatedRecord" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="RelatedRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDistribution", propOrder = {
    "contentDistributionViews",
    "contentDocumentId",
    "contentVersion",
    "contentVersionId",
    "createdBy",
    "createdById",
    "createdDate",
    "distributionPublicUrl",
    "expiryDate",
    "firstViewDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastViewDate",
    "name",
    "owner",
    "ownerId",
    "password",
    "preferencesAllowOriginalDownload",
    "preferencesAllowPDFDownload",
    "preferencesAllowViewInBrowser",
    "preferencesExpires",
    "preferencesLinkLatestVersion",
    "preferencesNotifyOnVisit",
    "preferencesNotifyRndtnComplete",
    "preferencesPasswordRequired",
    "relatedRecord",
    "relatedRecordId",
    "systemModstamp",
    "viewCount"
})
public class ContentDistribution
    extends SObject
{

    @XmlElementRef(name = "ContentDistributionViews", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> contentDistributionViews;
    @XmlElementRef(name = "ContentDocumentId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentDocumentId;
    @XmlElementRef(name = "ContentVersion", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentVersion> contentVersion;
    @XmlElementRef(name = "ContentVersionId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentVersionId;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DistributionPublicUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributionPublicUrl;
    @XmlElementRef(name = "ExpiryDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;
    @XmlElementRef(name = "FirstViewDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstViewDate;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "LastViewDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastViewDate;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Owner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> owner;
    @XmlElementRef(name = "OwnerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "Password", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "PreferencesAllowOriginalDownload", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesAllowOriginalDownload;
    @XmlElementRef(name = "PreferencesAllowPDFDownload", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesAllowPDFDownload;
    @XmlElementRef(name = "PreferencesAllowViewInBrowser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesAllowViewInBrowser;
    @XmlElementRef(name = "PreferencesExpires", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesExpires;
    @XmlElementRef(name = "PreferencesLinkLatestVersion", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesLinkLatestVersion;
    @XmlElementRef(name = "PreferencesNotifyOnVisit", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesNotifyOnVisit;
    @XmlElementRef(name = "PreferencesNotifyRndtnComplete", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesNotifyRndtnComplete;
    @XmlElementRef(name = "PreferencesPasswordRequired", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferencesPasswordRequired;
    @XmlElementRef(name = "RelatedRecord", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Name> relatedRecord;
    @XmlElementRef(name = "RelatedRecordId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relatedRecordId;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "ViewCount", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> viewCount;

    /**
     * Gets the value of the contentDistributionViews property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getContentDistributionViews() {
        return contentDistributionViews;
    }

    /**
     * Sets the value of the contentDistributionViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setContentDistributionViews(JAXBElement<QueryResultType> value) {
        this.contentDistributionViews = value;
    }

    /**
     * Gets the value of the contentDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentDocumentId() {
        return contentDocumentId;
    }

    /**
     * Sets the value of the contentDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentDocumentId(JAXBElement<String> value) {
        this.contentDocumentId = value;
    }

    /**
     * Gets the value of the contentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentVersion }{@code >}
     *     
     */
    public JAXBElement<ContentVersion> getContentVersion() {
        return contentVersion;
    }

    /**
     * Sets the value of the contentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentVersion }{@code >}
     *     
     */
    public void setContentVersion(JAXBElement<ContentVersion> value) {
        this.contentVersion = value;
    }

    /**
     * Gets the value of the contentVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentVersionId() {
        return contentVersionId;
    }

    /**
     * Sets the value of the contentVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentVersionId(JAXBElement<String> value) {
        this.contentVersionId = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<User> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedById(JAXBElement<String> value) {
        this.createdById = value;
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
     * Gets the value of the distributionPublicUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributionPublicUrl() {
        return distributionPublicUrl;
    }

    /**
     * Sets the value of the distributionPublicUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributionPublicUrl(JAXBElement<String> value) {
        this.distributionPublicUrl = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the firstViewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstViewDate() {
        return firstViewDate;
    }

    /**
     * Sets the value of the firstViewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstViewDate(JAXBElement<XMLGregorianCalendar> value) {
        this.firstViewDate = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setLastModifiedBy(JAXBElement<User> value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastModifiedById(JAXBElement<String> value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastViewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastViewDate() {
        return lastViewDate;
    }

    /**
     * Sets the value of the lastViewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastViewDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastViewDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setOwner(JAXBElement<User> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerId(JAXBElement<String> value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the preferencesAllowOriginalDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesAllowOriginalDownload() {
        return preferencesAllowOriginalDownload;
    }

    /**
     * Sets the value of the preferencesAllowOriginalDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesAllowOriginalDownload(JAXBElement<Boolean> value) {
        this.preferencesAllowOriginalDownload = value;
    }

    /**
     * Gets the value of the preferencesAllowPDFDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesAllowPDFDownload() {
        return preferencesAllowPDFDownload;
    }

    /**
     * Sets the value of the preferencesAllowPDFDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesAllowPDFDownload(JAXBElement<Boolean> value) {
        this.preferencesAllowPDFDownload = value;
    }

    /**
     * Gets the value of the preferencesAllowViewInBrowser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesAllowViewInBrowser() {
        return preferencesAllowViewInBrowser;
    }

    /**
     * Sets the value of the preferencesAllowViewInBrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesAllowViewInBrowser(JAXBElement<Boolean> value) {
        this.preferencesAllowViewInBrowser = value;
    }

    /**
     * Gets the value of the preferencesExpires property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesExpires() {
        return preferencesExpires;
    }

    /**
     * Sets the value of the preferencesExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesExpires(JAXBElement<Boolean> value) {
        this.preferencesExpires = value;
    }

    /**
     * Gets the value of the preferencesLinkLatestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesLinkLatestVersion() {
        return preferencesLinkLatestVersion;
    }

    /**
     * Sets the value of the preferencesLinkLatestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesLinkLatestVersion(JAXBElement<Boolean> value) {
        this.preferencesLinkLatestVersion = value;
    }

    /**
     * Gets the value of the preferencesNotifyOnVisit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesNotifyOnVisit() {
        return preferencesNotifyOnVisit;
    }

    /**
     * Sets the value of the preferencesNotifyOnVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesNotifyOnVisit(JAXBElement<Boolean> value) {
        this.preferencesNotifyOnVisit = value;
    }

    /**
     * Gets the value of the preferencesNotifyRndtnComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesNotifyRndtnComplete() {
        return preferencesNotifyRndtnComplete;
    }

    /**
     * Sets the value of the preferencesNotifyRndtnComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesNotifyRndtnComplete(JAXBElement<Boolean> value) {
        this.preferencesNotifyRndtnComplete = value;
    }

    /**
     * Gets the value of the preferencesPasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferencesPasswordRequired() {
        return preferencesPasswordRequired;
    }

    /**
     * Sets the value of the preferencesPasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferencesPasswordRequired(JAXBElement<Boolean> value) {
        this.preferencesPasswordRequired = value;
    }

    /**
     * Gets the value of the relatedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public JAXBElement<Name> getRelatedRecord() {
        return relatedRecord;
    }

    /**
     * Sets the value of the relatedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public void setRelatedRecord(JAXBElement<Name> value) {
        this.relatedRecord = value;
    }

    /**
     * Gets the value of the relatedRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelatedRecordId() {
        return relatedRecordId;
    }

    /**
     * Sets the value of the relatedRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelatedRecordId(JAXBElement<String> value) {
        this.relatedRecordId = value;
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
     * Gets the value of the viewCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getViewCount() {
        return viewCount;
    }

    /**
     * Sets the value of the viewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setViewCount(JAXBElement<Integer> value) {
        this.viewCount = value;
    }

}
