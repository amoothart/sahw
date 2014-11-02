
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for ASDA__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASDA__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Android_SDK_Rollup__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AttachedContentDocuments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Days_With_1_Internal_API_Call_Lifetime__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Disqualification_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="First_KBE_Created__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_API_Calls_L1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Internal_API_Calls_L30__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Internal_API_Calls_L7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JS_SDK_Rollup__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Kinvey_Account_UID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lifetime_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MTD_AU_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Mailing_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailing_State_Province__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonConsole_KCS_API_Calls_L1_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonConsole_KCS_API_Calls_L30_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonConsole_KCS_API_Calls_L7_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Number_Current_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Active_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Signs_of_Life_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Sign_up_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tags" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="iOS_SDK_Rollup__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASDA__c", propOrder = {
    "android_SDK_Rollup__C",
    "attachedContentDocuments",
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "days_With_1_Internal_API_Call_Lifetime__C",
    "disqualification_Reason__C",
    "email__C",
    "feedSubscriptionsForEntity",
    "first_KBE_Created__C",
    "first_Name__C",
    "internal_API_Calls_L1__C",
    "internal_API_Calls_L30__C",
    "internal_API_Calls_L7__C",
    "isDeleted",
    "js_SDK_Rollup__C",
    "kinvey_Account_UID__C",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "last_Name__C",
    "lifetime_KBEs__C",
    "lookedUpFromActivities",
    "mtd_AU_All_KBes__C",
    "mailing_Country__C",
    "mailing_State_Province__C",
    "name",
    "nonConsole_KCS_API_Calls_L1_All_KBes__C",
    "nonConsole_KCS_API_Calls_L30_All_KBes__C",
    "nonConsole_KCS_API_Calls_L7_All_KBes__C",
    "notes",
    "notesAndAttachments",
    "number_Current_KBEs__C",
    "number_Of_Active_KBEs__C",
    "number_Of_Signs_Of_Life_KBEs__C",
    "owner",
    "ownerId",
    "processInstances",
    "processSteps",
    "sign_Up_Timestamp__C",
    "status__C",
    "systemModstamp",
    "tags",
    "topicAssignments",
    "userRecordAccess",
    "ios_SDK_Rollup__C"
})
public class ASDA__C
    extends SObject
{

    @XmlElementRef(name = "Android_SDK_Rollup__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> android_SDK_Rollup__C;
    @XmlElementRef(name = "AttachedContentDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachedContentDocuments;
    @XmlElementRef(name = "Attachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachments;
    @XmlElementRef(name = "CombinedAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> combinedAttachments;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Days_With_1_Internal_API_Call_Lifetime__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> days_With_1_Internal_API_Call_Lifetime__C;
    @XmlElementRef(name = "Disqualification_Reason__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disqualification_Reason__C;
    @XmlElementRef(name = "Email__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email__C;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "First_KBE_Created__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_KBE_Created__C;
    @XmlElementRef(name = "First_Name__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> first_Name__C;
    @XmlElementRef(name = "Internal_API_Calls_L1__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> internal_API_Calls_L1__C;
    @XmlElementRef(name = "Internal_API_Calls_L30__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> internal_API_Calls_L30__C;
    @XmlElementRef(name = "Internal_API_Calls_L7__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> internal_API_Calls_L7__C;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "JS_SDK_Rollup__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> js_SDK_Rollup__C;
    @XmlElementRef(name = "Kinvey_Account_UID__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kinvey_Account_UID__C;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "Last_Name__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> last_Name__C;
    @XmlElementRef(name = "Lifetime_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_KBEs__C;
    @XmlElementRef(name = "LookedUpFromActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> lookedUpFromActivities;
    @XmlElementRef(name = "MTD_AU_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mtd_AU_All_KBes__C;
    @XmlElementRef(name = "Mailing_Country__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailing_Country__C;
    @XmlElementRef(name = "Mailing_State_Province__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailing_State_Province__C;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NonConsole_KCS_API_Calls_L1_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonConsole_KCS_API_Calls_L1_All_KBes__C;
    @XmlElementRef(name = "NonConsole_KCS_API_Calls_L30_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonConsole_KCS_API_Calls_L30_All_KBes__C;
    @XmlElementRef(name = "NonConsole_KCS_API_Calls_L7_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonConsole_KCS_API_Calls_L7_All_KBes__C;
    @XmlElementRef(name = "Notes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notes;
    @XmlElementRef(name = "NotesAndAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notesAndAttachments;
    @XmlElementRef(name = "Number_Current_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Current_KBEs__C;
    @XmlElementRef(name = "Number_of_Active_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Active_KBEs__C;
    @XmlElementRef(name = "Number_of_Signs_of_Life_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Signs_Of_Life_KBEs__C;
    @XmlElementRef(name = "Owner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Name> owner;
    @XmlElementRef(name = "OwnerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "ProcessInstances", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processInstances;
    @XmlElementRef(name = "ProcessSteps", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processSteps;
    @XmlElementRef(name = "Sign_up_Timestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sign_Up_Timestamp__C;
    @XmlElementRef(name = "Status__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status__C;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Tags", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tags;
    @XmlElementRef(name = "TopicAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> topicAssignments;
    @XmlElementRef(name = "UserRecordAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRecordAccess> userRecordAccess;
    @XmlElementRef(name = "iOS_SDK_Rollup__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ios_SDK_Rollup__C;

    /**
     * Gets the value of the android_SDK_Rollup__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAndroid_SDK_Rollup__C() {
        return android_SDK_Rollup__C;
    }

    /**
     * Sets the value of the android_SDK_Rollup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAndroid_SDK_Rollup__C(JAXBElement<Double> value) {
        this.android_SDK_Rollup__C = value;
    }

    /**
     * Gets the value of the attachedContentDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAttachedContentDocuments() {
        return attachedContentDocuments;
    }

    /**
     * Sets the value of the attachedContentDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAttachedContentDocuments(JAXBElement<QueryResultType> value) {
        this.attachedContentDocuments = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<QueryResultType> value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the combinedAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getCombinedAttachments() {
        return combinedAttachments;
    }

    /**
     * Sets the value of the combinedAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setCombinedAttachments(JAXBElement<QueryResultType> value) {
        this.combinedAttachments = value;
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
     * Gets the value of the days_With_1_Internal_API_Call_Lifetime__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDays_With_1_Internal_API_Call_Lifetime__C() {
        return days_With_1_Internal_API_Call_Lifetime__C;
    }

    /**
     * Sets the value of the days_With_1_Internal_API_Call_Lifetime__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDays_With_1_Internal_API_Call_Lifetime__C(JAXBElement<Double> value) {
        this.days_With_1_Internal_API_Call_Lifetime__C = value;
    }

    /**
     * Gets the value of the disqualification_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisqualification_Reason__C() {
        return disqualification_Reason__C;
    }

    /**
     * Sets the value of the disqualification_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisqualification_Reason__C(JAXBElement<String> value) {
        this.disqualification_Reason__C = value;
    }

    /**
     * Gets the value of the email__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail__C() {
        return email__C;
    }

    /**
     * Sets the value of the email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail__C(JAXBElement<String> value) {
        this.email__C = value;
    }

    /**
     * Gets the value of the feedSubscriptionsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }

    /**
     * Sets the value of the feedSubscriptionsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFeedSubscriptionsForEntity(JAXBElement<QueryResultType> value) {
        this.feedSubscriptionsForEntity = value;
    }

    /**
     * Gets the value of the first_KBE_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_KBE_Created__C() {
        return first_KBE_Created__C;
    }

    /**
     * Sets the value of the first_KBE_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_KBE_Created__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_KBE_Created__C = value;
    }

    /**
     * Gets the value of the first_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirst_Name__C() {
        return first_Name__C;
    }

    /**
     * Sets the value of the first_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirst_Name__C(JAXBElement<String> value) {
        this.first_Name__C = value;
    }

    /**
     * Gets the value of the internal_API_Calls_L1__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInternal_API_Calls_L1__C() {
        return internal_API_Calls_L1__C;
    }

    /**
     * Sets the value of the internal_API_Calls_L1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInternal_API_Calls_L1__C(JAXBElement<Double> value) {
        this.internal_API_Calls_L1__C = value;
    }

    /**
     * Gets the value of the internal_API_Calls_L30__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInternal_API_Calls_L30__C() {
        return internal_API_Calls_L30__C;
    }

    /**
     * Sets the value of the internal_API_Calls_L30__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInternal_API_Calls_L30__C(JAXBElement<Double> value) {
        this.internal_API_Calls_L30__C = value;
    }

    /**
     * Gets the value of the internal_API_Calls_L7__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInternal_API_Calls_L7__C() {
        return internal_API_Calls_L7__C;
    }

    /**
     * Sets the value of the internal_API_Calls_L7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInternal_API_Calls_L7__C(JAXBElement<Double> value) {
        this.internal_API_Calls_L7__C = value;
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
     * Gets the value of the js_SDK_Rollup__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getJS_SDK_Rollup__C() {
        return js_SDK_Rollup__C;
    }

    /**
     * Sets the value of the js_SDK_Rollup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setJS_SDK_Rollup__C(JAXBElement<Double> value) {
        this.js_SDK_Rollup__C = value;
    }

    /**
     * Gets the value of the kinvey_Account_UID__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKinvey_Account_UID__C() {
        return kinvey_Account_UID__C;
    }

    /**
     * Sets the value of the kinvey_Account_UID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKinvey_Account_UID__C(JAXBElement<String> value) {
        this.kinvey_Account_UID__C = value;
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
     * Gets the value of the last_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLast_Name__C() {
        return last_Name__C;
    }

    /**
     * Sets the value of the last_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLast_Name__C(JAXBElement<String> value) {
        this.last_Name__C = value;
    }

    /**
     * Gets the value of the lifetime_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_KBEs__C() {
        return lifetime_KBEs__C;
    }

    /**
     * Sets the value of the lifetime_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_KBEs__C(JAXBElement<Double> value) {
        this.lifetime_KBEs__C = value;
    }

    /**
     * Gets the value of the lookedUpFromActivities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }

    /**
     * Sets the value of the lookedUpFromActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setLookedUpFromActivities(JAXBElement<QueryResultType> value) {
        this.lookedUpFromActivities = value;
    }

    /**
     * Gets the value of the mtd_AU_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMTD_AU_All_KBes__C() {
        return mtd_AU_All_KBes__C;
    }

    /**
     * Sets the value of the mtd_AU_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMTD_AU_All_KBes__C(JAXBElement<Double> value) {
        this.mtd_AU_All_KBes__C = value;
    }

    /**
     * Gets the value of the mailing_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailing_Country__C() {
        return mailing_Country__C;
    }

    /**
     * Sets the value of the mailing_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailing_Country__C(JAXBElement<String> value) {
        this.mailing_Country__C = value;
    }

    /**
     * Gets the value of the mailing_State_Province__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailing_State_Province__C() {
        return mailing_State_Province__C;
    }

    /**
     * Sets the value of the mailing_State_Province__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailing_State_Province__C(JAXBElement<String> value) {
        this.mailing_State_Province__C = value;
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
     * Gets the value of the nonConsole_KCS_API_Calls_L1_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonConsole_KCS_API_Calls_L1_All_KBes__C() {
        return nonConsole_KCS_API_Calls_L1_All_KBes__C;
    }

    /**
     * Sets the value of the nonConsole_KCS_API_Calls_L1_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonConsole_KCS_API_Calls_L1_All_KBes__C(JAXBElement<Double> value) {
        this.nonConsole_KCS_API_Calls_L1_All_KBes__C = value;
    }

    /**
     * Gets the value of the nonConsole_KCS_API_Calls_L30_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonConsole_KCS_API_Calls_L30_All_KBes__C() {
        return nonConsole_KCS_API_Calls_L30_All_KBes__C;
    }

    /**
     * Sets the value of the nonConsole_KCS_API_Calls_L30_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonConsole_KCS_API_Calls_L30_All_KBes__C(JAXBElement<Double> value) {
        this.nonConsole_KCS_API_Calls_L30_All_KBes__C = value;
    }

    /**
     * Gets the value of the nonConsole_KCS_API_Calls_L7_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonConsole_KCS_API_Calls_L7_All_KBes__C() {
        return nonConsole_KCS_API_Calls_L7_All_KBes__C;
    }

    /**
     * Sets the value of the nonConsole_KCS_API_Calls_L7_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonConsole_KCS_API_Calls_L7_All_KBes__C(JAXBElement<Double> value) {
        this.nonConsole_KCS_API_Calls_L7_All_KBes__C = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setNotes(JAXBElement<QueryResultType> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notesAndAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getNotesAndAttachments() {
        return notesAndAttachments;
    }

    /**
     * Sets the value of the notesAndAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setNotesAndAttachments(JAXBElement<QueryResultType> value) {
        this.notesAndAttachments = value;
    }

    /**
     * Gets the value of the number_Current_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Current_KBEs__C() {
        return number_Current_KBEs__C;
    }

    /**
     * Sets the value of the number_Current_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Current_KBEs__C(JAXBElement<Double> value) {
        this.number_Current_KBEs__C = value;
    }

    /**
     * Gets the value of the number_Of_Active_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Of_Active_KBEs__C() {
        return number_Of_Active_KBEs__C;
    }

    /**
     * Sets the value of the number_Of_Active_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Of_Active_KBEs__C(JAXBElement<Double> value) {
        this.number_Of_Active_KBEs__C = value;
    }

    /**
     * Gets the value of the number_Of_Signs_Of_Life_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Of_Signs_Of_Life_KBEs__C() {
        return number_Of_Signs_Of_Life_KBEs__C;
    }

    /**
     * Sets the value of the number_Of_Signs_Of_Life_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Of_Signs_Of_Life_KBEs__C(JAXBElement<Double> value) {
        this.number_Of_Signs_Of_Life_KBEs__C = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public JAXBElement<Name> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public void setOwner(JAXBElement<Name> value) {
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
     * Gets the value of the processInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getProcessInstances() {
        return processInstances;
    }

    /**
     * Sets the value of the processInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setProcessInstances(JAXBElement<QueryResultType> value) {
        this.processInstances = value;
    }

    /**
     * Gets the value of the processSteps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getProcessSteps() {
        return processSteps;
    }

    /**
     * Sets the value of the processSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setProcessSteps(JAXBElement<QueryResultType> value) {
        this.processSteps = value;
    }

    /**
     * Gets the value of the sign_Up_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSign_Up_Timestamp__C() {
        return sign_Up_Timestamp__C;
    }

    /**
     * Sets the value of the sign_Up_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSign_Up_Timestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.sign_Up_Timestamp__C = value;
    }

    /**
     * Gets the value of the status__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus__C() {
        return status__C;
    }

    /**
     * Sets the value of the status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus__C(JAXBElement<String> value) {
        this.status__C = value;
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
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setTags(JAXBElement<QueryResultType> value) {
        this.tags = value;
    }

    /**
     * Gets the value of the topicAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getTopicAssignments() {
        return topicAssignments;
    }

    /**
     * Sets the value of the topicAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setTopicAssignments(JAXBElement<QueryResultType> value) {
        this.topicAssignments = value;
    }

    /**
     * Gets the value of the userRecordAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserRecordAccess }{@code >}
     *     
     */
    public JAXBElement<UserRecordAccess> getUserRecordAccess() {
        return userRecordAccess;
    }

    /**
     * Sets the value of the userRecordAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserRecordAccess }{@code >}
     *     
     */
    public void setUserRecordAccess(JAXBElement<UserRecordAccess> value) {
        this.userRecordAccess = value;
    }

    /**
     * Gets the value of the ios_SDK_Rollup__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIOS_SDK_Rollup__C() {
        return ios_SDK_Rollup__C;
    }

    /**
     * Sets the value of the ios_SDK_Rollup__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIOS_SDK_Rollup__C(JAXBElement<Double> value) {
        this.ios_SDK_Rollup__C = value;
    }

}
