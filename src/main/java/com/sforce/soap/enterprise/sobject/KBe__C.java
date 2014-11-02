
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for KBe__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KBe__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="API_Call_Quality_L14__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="API_Call_Quality_L7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AttachedContentDocuments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Charges_API_Calls_Last_Month__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Charges_AU_Last_Month__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Charges_Storage_Last_Month__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Created_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Creating_User__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Creating_User__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Current_Storage_GB__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Current_Storage_Usage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Deleted_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Edition_Expiry__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Edition__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="First_API_Call_From_Console__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_API_Call_From_iOS__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_API_Call_Incl_Console__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_API_Call_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_API_Call_from_Android__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_API_Call_from_JS__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_AppCloud_SDK_Request__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_HTML5_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Node_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Phonegap_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Titanium_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_TriggerIO_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Has_Used_Android_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_Any_JS_SDK__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Has_Used_AppCloud_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_JS_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_PhoneGap_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_Titanium_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_TriggerIO_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Used_iOS_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_used_HTML5_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_used_Node_SDK__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="I_m_making_this_app_for__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Backend_Deleted__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KBeContactAssociations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="KBe_ID_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_API_Call_from_Android__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_API_Call_from_JS__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_API_Call_from_iOS__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_KCS_API_Call__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Month_AU__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Last_Month_Mean_Storage_GB__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Last_Month_Mean_Storage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Latest_AppCloud_SDK_Request__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latest_HTML5_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latest_Node_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latest_Phonegap_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latest_Titanium_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latest_TriggerIO_SDK_Request_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Lifetime_API_Calls_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_API_Calls__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MTD_Storage_Usage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_L30_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_L30__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_L7_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_L7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_Yesterday_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_API_Calls_Yesterday__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_AU_MTD__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owning_User__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Owning_User__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Standing__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Storage_MTD_GB__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tags" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Usage_Bucket_API_Calls__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Bucket__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="Value_of_Who_This_Is_For__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KBe__c", propOrder = {
    "api_Call_Quality_L14__C",
    "api_Call_Quality_L7__C",
    "attachedContentDocuments",
    "attachments",
    "charges_API_Calls_Last_Month__C",
    "charges_AU_Last_Month__C",
    "charges_Storage_Last_Month__C",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "created_Date__C",
    "creating_User__C",
    "creating_User__R",
    "current_Storage_GB__C",
    "current_Storage_Usage__C",
    "deleted_Date__C",
    "edition_Expiry__C",
    "edition__C",
    "feedSubscriptionsForEntity",
    "first_API_Call_From_Console__C",
    "first_API_Call_From_IOS__C",
    "first_API_Call_Incl_Console__C",
    "first_API_Call_Timestamp__C",
    "first_API_Call_From_Android__C",
    "first_API_Call_From_JS__C",
    "first_AppCloud_SDK_Request__C",
    "first_HTML5_SDK_Request_Time__C",
    "first_Node_SDK_Request_Time__C",
    "first_Phonegap_SDK_Request_Time__C",
    "first_Titanium_SDK_Request_Time__C",
    "first_TriggerIO_SDK_Request_Time__C",
    "has_Used_Android_SDK__C",
    "has_Used_Any_JS_SDK__C",
    "has_Used_AppCloud_SDK__C",
    "has_Used_JS_SDK__C",
    "has_Used_PhoneGap_SDK__C",
    "has_Used_Titanium_SDK__C",
    "has_Used_TriggerIO_SDK__C",
    "has_Used_IOS_SDK__C",
    "has_Used_HTML5_SDK__C",
    "has_Used_Node_SDK__C",
    "histories",
    "i_M_Making_This_App_For__C",
    "isDeleted",
    "is_Backend_Deleted__C",
    "kBeContactAssociations__R",
    "kBe_ID_Number__C",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "last_API_Call_From_Android__C",
    "last_API_Call_From_JS__C",
    "last_API_Call_From_IOS__C",
    "last_KCS_API_Call__C",
    "last_Month_AU__C",
    "last_Month_Mean_Storage_GB__C",
    "last_Month_Mean_Storage__C",
    "latest_AppCloud_SDK_Request__C",
    "latest_HTML5_SDK_Request_Time__C",
    "latest_Node_SDK_Request_Time__C",
    "latest_Phonegap_SDK_Request_Time__C",
    "latest_Titanium_SDK_Request_Time__C",
    "latest_TriggerIO_SDK_Request_Time__C",
    "lifetime_API_Calls_Total__C",
    "lifetime_API_Calls__C",
    "lookedUpFromActivities",
    "mtd_Storage_Usage__C",
    "name",
    "notes",
    "notesAndAttachments",
    "number_API_Calls_L30_Total__C",
    "number_API_Calls_L30__C",
    "number_API_Calls_L7_Total__C",
    "number_API_Calls_L7__C",
    "number_API_Calls_Yesterday_Total__C",
    "number_API_Calls_Yesterday__C",
    "number_Of_AU_MTD__C",
    "owning_User__C",
    "owning_User__R",
    "processInstances",
    "processSteps",
    "standing__C",
    "storage_MTD_GB__C",
    "systemModstamp",
    "tags",
    "topicAssignments",
    "usage_Bucket_API_Calls__C",
    "usage_Bucket__C",
    "userRecordAccess",
    "value_Of_Who_This_Is_For__C"
})
public class KBe__C
    extends SObject
{

    @XmlElementRef(name = "API_Call_Quality_L14__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Call_Quality_L14__C;
    @XmlElementRef(name = "API_Call_Quality_L7__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Call_Quality_L7__C;
    @XmlElementRef(name = "AttachedContentDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachedContentDocuments;
    @XmlElementRef(name = "Attachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachments;
    @XmlElementRef(name = "Charges_API_Calls_Last_Month__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> charges_API_Calls_Last_Month__C;
    @XmlElementRef(name = "Charges_AU_Last_Month__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> charges_AU_Last_Month__C;
    @XmlElementRef(name = "Charges_Storage_Last_Month__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> charges_Storage_Last_Month__C;
    @XmlElementRef(name = "CombinedAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> combinedAttachments;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Created_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> created_Date__C;
    @XmlElementRef(name = "Creating_User__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creating_User__C;
    @XmlElementRef(name = "Creating_User__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> creating_User__R;
    @XmlElementRef(name = "Current_Storage_GB__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> current_Storage_GB__C;
    @XmlElementRef(name = "Current_Storage_Usage__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> current_Storage_Usage__C;
    @XmlElementRef(name = "Deleted_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deleted_Date__C;
    @XmlElementRef(name = "Edition_Expiry__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> edition_Expiry__C;
    @XmlElementRef(name = "Edition__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> edition__C;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "First_API_Call_From_Console__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_From_Console__C;
    @XmlElementRef(name = "First_API_Call_From_iOS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_From_IOS__C;
    @XmlElementRef(name = "First_API_Call_Incl_Console__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_Incl_Console__C;
    @XmlElementRef(name = "First_API_Call_Timestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_Timestamp__C;
    @XmlElementRef(name = "First_API_Call_from_Android__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_From_Android__C;
    @XmlElementRef(name = "First_API_Call_from_JS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_From_JS__C;
    @XmlElementRef(name = "First_AppCloud_SDK_Request__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_AppCloud_SDK_Request__C;
    @XmlElementRef(name = "First_HTML5_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_HTML5_SDK_Request_Time__C;
    @XmlElementRef(name = "First_Node_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Node_SDK_Request_Time__C;
    @XmlElementRef(name = "First_Phonegap_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Phonegap_SDK_Request_Time__C;
    @XmlElementRef(name = "First_Titanium_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Titanium_SDK_Request_Time__C;
    @XmlElementRef(name = "First_TriggerIO_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_TriggerIO_SDK_Request_Time__C;
    @XmlElementRef(name = "Has_Used_Android_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_Android_SDK__C;
    @XmlElementRef(name = "Has_Used_Any_JS_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> has_Used_Any_JS_SDK__C;
    @XmlElementRef(name = "Has_Used_AppCloud_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_AppCloud_SDK__C;
    @XmlElementRef(name = "Has_Used_JS_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_JS_SDK__C;
    @XmlElementRef(name = "Has_Used_PhoneGap_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_PhoneGap_SDK__C;
    @XmlElementRef(name = "Has_Used_Titanium_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_Titanium_SDK__C;
    @XmlElementRef(name = "Has_Used_TriggerIO_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_TriggerIO_SDK__C;
    @XmlElementRef(name = "Has_Used_iOS_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_IOS_SDK__C;
    @XmlElementRef(name = "Has_used_HTML5_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_HTML5_SDK__C;
    @XmlElementRef(name = "Has_used_Node_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> has_Used_Node_SDK__C;
    @XmlElementRef(name = "Histories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> histories;
    @XmlElementRef(name = "I_m_making_this_app_for__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_M_Making_This_App_For__C;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "Is_Backend_Deleted__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> is_Backend_Deleted__C;
    @XmlElementRef(name = "KBeContactAssociations__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> kBeContactAssociations__R;
    @XmlElementRef(name = "KBe_ID_Number__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kBe_ID_Number__C;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "LastReferencedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastReferencedDate;
    @XmlElementRef(name = "LastViewedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastViewedDate;
    @XmlElementRef(name = "Last_API_Call_from_Android__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> last_API_Call_From_Android__C;
    @XmlElementRef(name = "Last_API_Call_from_JS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> last_API_Call_From_JS__C;
    @XmlElementRef(name = "Last_API_Call_from_iOS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> last_API_Call_From_IOS__C;
    @XmlElementRef(name = "Last_KCS_API_Call__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> last_KCS_API_Call__C;
    @XmlElementRef(name = "Last_Month_AU__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> last_Month_AU__C;
    @XmlElementRef(name = "Last_Month_Mean_Storage_GB__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> last_Month_Mean_Storage_GB__C;
    @XmlElementRef(name = "Last_Month_Mean_Storage__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> last_Month_Mean_Storage__C;
    @XmlElementRef(name = "Latest_AppCloud_SDK_Request__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_AppCloud_SDK_Request__C;
    @XmlElementRef(name = "Latest_HTML5_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_HTML5_SDK_Request_Time__C;
    @XmlElementRef(name = "Latest_Node_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_Node_SDK_Request_Time__C;
    @XmlElementRef(name = "Latest_Phonegap_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_Phonegap_SDK_Request_Time__C;
    @XmlElementRef(name = "Latest_Titanium_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_Titanium_SDK_Request_Time__C;
    @XmlElementRef(name = "Latest_TriggerIO_SDK_Request_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> latest_TriggerIO_SDK_Request_Time__C;
    @XmlElementRef(name = "Lifetime_API_Calls_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_API_Calls_Total__C;
    @XmlElementRef(name = "Lifetime_API_Calls__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_API_Calls__C;
    @XmlElementRef(name = "LookedUpFromActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> lookedUpFromActivities;
    @XmlElementRef(name = "MTD_Storage_Usage__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mtd_Storage_Usage__C;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Notes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notes;
    @XmlElementRef(name = "NotesAndAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notesAndAttachments;
    @XmlElementRef(name = "Number_API_Calls_L30_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_L30_Total__C;
    @XmlElementRef(name = "Number_API_Calls_L30__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_L30__C;
    @XmlElementRef(name = "Number_API_Calls_L7_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_L7_Total__C;
    @XmlElementRef(name = "Number_API_Calls_L7__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_L7__C;
    @XmlElementRef(name = "Number_API_Calls_Yesterday_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_Yesterday_Total__C;
    @XmlElementRef(name = "Number_API_Calls_Yesterday__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_API_Calls_Yesterday__C;
    @XmlElementRef(name = "Number_of_AU_MTD__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_AU_MTD__C;
    @XmlElementRef(name = "Owning_User__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owning_User__C;
    @XmlElementRef(name = "Owning_User__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> owning_User__R;
    @XmlElementRef(name = "ProcessInstances", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processInstances;
    @XmlElementRef(name = "ProcessSteps", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processSteps;
    @XmlElementRef(name = "Standing__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standing__C;
    @XmlElementRef(name = "Storage_MTD_GB__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> storage_MTD_GB__C;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Tags", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tags;
    @XmlElementRef(name = "TopicAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> topicAssignments;
    @XmlElementRef(name = "Usage_Bucket_API_Calls__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usage_Bucket_API_Calls__C;
    @XmlElementRef(name = "Usage_Bucket__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usage_Bucket__C;
    @XmlElementRef(name = "UserRecordAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRecordAccess> userRecordAccess;
    @XmlElementRef(name = "Value_of_Who_This_Is_For__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> value_Of_Who_This_Is_For__C;

    /**
     * Gets the value of the api_Call_Quality_L14__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Call_Quality_L14__C() {
        return api_Call_Quality_L14__C;
    }

    /**
     * Sets the value of the api_Call_Quality_L14__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Call_Quality_L14__C(JAXBElement<Double> value) {
        this.api_Call_Quality_L14__C = value;
    }

    /**
     * Gets the value of the api_Call_Quality_L7__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Call_Quality_L7__C() {
        return api_Call_Quality_L7__C;
    }

    /**
     * Sets the value of the api_Call_Quality_L7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Call_Quality_L7__C(JAXBElement<Double> value) {
        this.api_Call_Quality_L7__C = value;
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
     * Gets the value of the charges_API_Calls_Last_Month__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCharges_API_Calls_Last_Month__C() {
        return charges_API_Calls_Last_Month__C;
    }

    /**
     * Sets the value of the charges_API_Calls_Last_Month__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCharges_API_Calls_Last_Month__C(JAXBElement<Double> value) {
        this.charges_API_Calls_Last_Month__C = value;
    }

    /**
     * Gets the value of the charges_AU_Last_Month__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCharges_AU_Last_Month__C() {
        return charges_AU_Last_Month__C;
    }

    /**
     * Sets the value of the charges_AU_Last_Month__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCharges_AU_Last_Month__C(JAXBElement<Double> value) {
        this.charges_AU_Last_Month__C = value;
    }

    /**
     * Gets the value of the charges_Storage_Last_Month__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCharges_Storage_Last_Month__C() {
        return charges_Storage_Last_Month__C;
    }

    /**
     * Sets the value of the charges_Storage_Last_Month__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCharges_Storage_Last_Month__C(JAXBElement<Double> value) {
        this.charges_Storage_Last_Month__C = value;
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
     * Gets the value of the created_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreated_Date__C() {
        return created_Date__C;
    }

    /**
     * Sets the value of the created_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreated_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.created_Date__C = value;
    }

    /**
     * Gets the value of the creating_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreating_User__C() {
        return creating_User__C;
    }

    /**
     * Sets the value of the creating_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreating_User__C(JAXBElement<String> value) {
        this.creating_User__C = value;
    }

    /**
     * Gets the value of the creating_User__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getCreating_User__R() {
        return creating_User__R;
    }

    /**
     * Sets the value of the creating_User__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setCreating_User__R(JAXBElement<Contact> value) {
        this.creating_User__R = value;
    }

    /**
     * Gets the value of the current_Storage_GB__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrent_Storage_GB__C() {
        return current_Storage_GB__C;
    }

    /**
     * Sets the value of the current_Storage_GB__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrent_Storage_GB__C(JAXBElement<Double> value) {
        this.current_Storage_GB__C = value;
    }

    /**
     * Gets the value of the current_Storage_Usage__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrent_Storage_Usage__C() {
        return current_Storage_Usage__C;
    }

    /**
     * Sets the value of the current_Storage_Usage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrent_Storage_Usage__C(JAXBElement<Double> value) {
        this.current_Storage_Usage__C = value;
    }

    /**
     * Gets the value of the deleted_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeleted_Date__C() {
        return deleted_Date__C;
    }

    /**
     * Sets the value of the deleted_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeleted_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.deleted_Date__C = value;
    }

    /**
     * Gets the value of the edition_Expiry__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEdition_Expiry__C() {
        return edition_Expiry__C;
    }

    /**
     * Sets the value of the edition_Expiry__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEdition_Expiry__C(JAXBElement<XMLGregorianCalendar> value) {
        this.edition_Expiry__C = value;
    }

    /**
     * Gets the value of the edition__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdition__C() {
        return edition__C;
    }

    /**
     * Sets the value of the edition__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdition__C(JAXBElement<String> value) {
        this.edition__C = value;
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
     * Gets the value of the first_API_Call_From_Console__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_From_Console__C() {
        return first_API_Call_From_Console__C;
    }

    /**
     * Sets the value of the first_API_Call_From_Console__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_From_Console__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_From_Console__C = value;
    }

    /**
     * Gets the value of the first_API_Call_From_IOS__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_From_IOS__C() {
        return first_API_Call_From_IOS__C;
    }

    /**
     * Sets the value of the first_API_Call_From_IOS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_From_IOS__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_From_IOS__C = value;
    }

    /**
     * Gets the value of the first_API_Call_Incl_Console__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_Incl_Console__C() {
        return first_API_Call_Incl_Console__C;
    }

    /**
     * Sets the value of the first_API_Call_Incl_Console__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_Incl_Console__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_Incl_Console__C = value;
    }

    /**
     * Gets the value of the first_API_Call_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_Timestamp__C() {
        return first_API_Call_Timestamp__C;
    }

    /**
     * Sets the value of the first_API_Call_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_Timestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_Timestamp__C = value;
    }

    /**
     * Gets the value of the first_API_Call_From_Android__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_From_Android__C() {
        return first_API_Call_From_Android__C;
    }

    /**
     * Sets the value of the first_API_Call_From_Android__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_From_Android__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_From_Android__C = value;
    }

    /**
     * Gets the value of the first_API_Call_From_JS__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_From_JS__C() {
        return first_API_Call_From_JS__C;
    }

    /**
     * Sets the value of the first_API_Call_From_JS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_From_JS__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_From_JS__C = value;
    }

    /**
     * Gets the value of the first_AppCloud_SDK_Request__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_AppCloud_SDK_Request__C() {
        return first_AppCloud_SDK_Request__C;
    }

    /**
     * Sets the value of the first_AppCloud_SDK_Request__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_AppCloud_SDK_Request__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_AppCloud_SDK_Request__C = value;
    }

    /**
     * Gets the value of the first_HTML5_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_HTML5_SDK_Request_Time__C() {
        return first_HTML5_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the first_HTML5_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_HTML5_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_HTML5_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the first_Node_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Node_SDK_Request_Time__C() {
        return first_Node_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the first_Node_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Node_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Node_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the first_Phonegap_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Phonegap_SDK_Request_Time__C() {
        return first_Phonegap_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the first_Phonegap_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Phonegap_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Phonegap_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the first_Titanium_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Titanium_SDK_Request_Time__C() {
        return first_Titanium_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the first_Titanium_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Titanium_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Titanium_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the first_TriggerIO_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_TriggerIO_SDK_Request_Time__C() {
        return first_TriggerIO_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the first_TriggerIO_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_TriggerIO_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_TriggerIO_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the has_Used_Android_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_Android_SDK__C() {
        return has_Used_Android_SDK__C;
    }

    /**
     * Sets the value of the has_Used_Android_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_Android_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_Android_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_Any_JS_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHas_Used_Any_JS_SDK__C() {
        return has_Used_Any_JS_SDK__C;
    }

    /**
     * Sets the value of the has_Used_Any_JS_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHas_Used_Any_JS_SDK__C(JAXBElement<String> value) {
        this.has_Used_Any_JS_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_AppCloud_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_AppCloud_SDK__C() {
        return has_Used_AppCloud_SDK__C;
    }

    /**
     * Sets the value of the has_Used_AppCloud_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_AppCloud_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_AppCloud_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_JS_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_JS_SDK__C() {
        return has_Used_JS_SDK__C;
    }

    /**
     * Sets the value of the has_Used_JS_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_JS_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_JS_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_PhoneGap_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_PhoneGap_SDK__C() {
        return has_Used_PhoneGap_SDK__C;
    }

    /**
     * Sets the value of the has_Used_PhoneGap_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_PhoneGap_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_PhoneGap_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_Titanium_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_Titanium_SDK__C() {
        return has_Used_Titanium_SDK__C;
    }

    /**
     * Sets the value of the has_Used_Titanium_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_Titanium_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_Titanium_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_TriggerIO_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_TriggerIO_SDK__C() {
        return has_Used_TriggerIO_SDK__C;
    }

    /**
     * Sets the value of the has_Used_TriggerIO_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_TriggerIO_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_TriggerIO_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_IOS_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_IOS_SDK__C() {
        return has_Used_IOS_SDK__C;
    }

    /**
     * Sets the value of the has_Used_IOS_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_IOS_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_IOS_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_HTML5_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_HTML5_SDK__C() {
        return has_Used_HTML5_SDK__C;
    }

    /**
     * Sets the value of the has_Used_HTML5_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_HTML5_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_HTML5_SDK__C = value;
    }

    /**
     * Gets the value of the has_Used_Node_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHas_Used_Node_SDK__C() {
        return has_Used_Node_SDK__C;
    }

    /**
     * Sets the value of the has_Used_Node_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHas_Used_Node_SDK__C(JAXBElement<Boolean> value) {
        this.has_Used_Node_SDK__C = value;
    }

    /**
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setHistories(JAXBElement<QueryResultType> value) {
        this.histories = value;
    }

    /**
     * Gets the value of the i_M_Making_This_App_For__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI_M_Making_This_App_For__C() {
        return i_M_Making_This_App_For__C;
    }

    /**
     * Sets the value of the i_M_Making_This_App_For__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI_M_Making_This_App_For__C(JAXBElement<String> value) {
        this.i_M_Making_This_App_For__C = value;
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
     * Gets the value of the is_Backend_Deleted__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIs_Backend_Deleted__C() {
        return is_Backend_Deleted__C;
    }

    /**
     * Sets the value of the is_Backend_Deleted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIs_Backend_Deleted__C(JAXBElement<Boolean> value) {
        this.is_Backend_Deleted__C = value;
    }

    /**
     * Gets the value of the kBeContactAssociations__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getKBeContactAssociations__R() {
        return kBeContactAssociations__R;
    }

    /**
     * Sets the value of the kBeContactAssociations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setKBeContactAssociations__R(JAXBElement<QueryResultType> value) {
        this.kBeContactAssociations__R = value;
    }

    /**
     * Gets the value of the kBe_ID_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKBe_ID_Number__C() {
        return kBe_ID_Number__C;
    }

    /**
     * Sets the value of the kBe_ID_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKBe_ID_Number__C(JAXBElement<String> value) {
        this.kBe_ID_Number__C = value;
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
     * Gets the value of the lastReferencedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the value of the lastReferencedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastReferencedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastReferencedDate = value;
    }

    /**
     * Gets the value of the lastViewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the value of the lastViewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastViewedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastViewedDate = value;
    }

    /**
     * Gets the value of the last_API_Call_From_Android__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLast_API_Call_From_Android__C() {
        return last_API_Call_From_Android__C;
    }

    /**
     * Sets the value of the last_API_Call_From_Android__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLast_API_Call_From_Android__C(JAXBElement<XMLGregorianCalendar> value) {
        this.last_API_Call_From_Android__C = value;
    }

    /**
     * Gets the value of the last_API_Call_From_JS__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLast_API_Call_From_JS__C() {
        return last_API_Call_From_JS__C;
    }

    /**
     * Sets the value of the last_API_Call_From_JS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLast_API_Call_From_JS__C(JAXBElement<XMLGregorianCalendar> value) {
        this.last_API_Call_From_JS__C = value;
    }

    /**
     * Gets the value of the last_API_Call_From_IOS__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLast_API_Call_From_IOS__C() {
        return last_API_Call_From_IOS__C;
    }

    /**
     * Sets the value of the last_API_Call_From_IOS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLast_API_Call_From_IOS__C(JAXBElement<XMLGregorianCalendar> value) {
        this.last_API_Call_From_IOS__C = value;
    }

    /**
     * Gets the value of the last_KCS_API_Call__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLast_KCS_API_Call__C() {
        return last_KCS_API_Call__C;
    }

    /**
     * Sets the value of the last_KCS_API_Call__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLast_KCS_API_Call__C(JAXBElement<XMLGregorianCalendar> value) {
        this.last_KCS_API_Call__C = value;
    }

    /**
     * Gets the value of the last_Month_AU__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLast_Month_AU__C() {
        return last_Month_AU__C;
    }

    /**
     * Sets the value of the last_Month_AU__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLast_Month_AU__C(JAXBElement<Double> value) {
        this.last_Month_AU__C = value;
    }

    /**
     * Gets the value of the last_Month_Mean_Storage_GB__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLast_Month_Mean_Storage_GB__C() {
        return last_Month_Mean_Storage_GB__C;
    }

    /**
     * Sets the value of the last_Month_Mean_Storage_GB__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLast_Month_Mean_Storage_GB__C(JAXBElement<Double> value) {
        this.last_Month_Mean_Storage_GB__C = value;
    }

    /**
     * Gets the value of the last_Month_Mean_Storage__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLast_Month_Mean_Storage__C() {
        return last_Month_Mean_Storage__C;
    }

    /**
     * Sets the value of the last_Month_Mean_Storage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLast_Month_Mean_Storage__C(JAXBElement<Double> value) {
        this.last_Month_Mean_Storage__C = value;
    }

    /**
     * Gets the value of the latest_AppCloud_SDK_Request__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_AppCloud_SDK_Request__C() {
        return latest_AppCloud_SDK_Request__C;
    }

    /**
     * Sets the value of the latest_AppCloud_SDK_Request__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_AppCloud_SDK_Request__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_AppCloud_SDK_Request__C = value;
    }

    /**
     * Gets the value of the latest_HTML5_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_HTML5_SDK_Request_Time__C() {
        return latest_HTML5_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the latest_HTML5_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_HTML5_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_HTML5_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the latest_Node_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_Node_SDK_Request_Time__C() {
        return latest_Node_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the latest_Node_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_Node_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_Node_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the latest_Phonegap_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_Phonegap_SDK_Request_Time__C() {
        return latest_Phonegap_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the latest_Phonegap_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_Phonegap_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_Phonegap_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the latest_Titanium_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_Titanium_SDK_Request_Time__C() {
        return latest_Titanium_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the latest_Titanium_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_Titanium_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_Titanium_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the latest_TriggerIO_SDK_Request_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatest_TriggerIO_SDK_Request_Time__C() {
        return latest_TriggerIO_SDK_Request_Time__C;
    }

    /**
     * Sets the value of the latest_TriggerIO_SDK_Request_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatest_TriggerIO_SDK_Request_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.latest_TriggerIO_SDK_Request_Time__C = value;
    }

    /**
     * Gets the value of the lifetime_API_Calls_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_API_Calls_Total__C() {
        return lifetime_API_Calls_Total__C;
    }

    /**
     * Sets the value of the lifetime_API_Calls_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_API_Calls_Total__C(JAXBElement<Double> value) {
        this.lifetime_API_Calls_Total__C = value;
    }

    /**
     * Gets the value of the lifetime_API_Calls__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_API_Calls__C() {
        return lifetime_API_Calls__C;
    }

    /**
     * Sets the value of the lifetime_API_Calls__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_API_Calls__C(JAXBElement<Double> value) {
        this.lifetime_API_Calls__C = value;
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
     * Gets the value of the mtd_Storage_Usage__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMTD_Storage_Usage__C() {
        return mtd_Storage_Usage__C;
    }

    /**
     * Sets the value of the mtd_Storage_Usage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMTD_Storage_Usage__C(JAXBElement<Double> value) {
        this.mtd_Storage_Usage__C = value;
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
     * Gets the value of the number_API_Calls_L30_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_L30_Total__C() {
        return number_API_Calls_L30_Total__C;
    }

    /**
     * Sets the value of the number_API_Calls_L30_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_L30_Total__C(JAXBElement<Double> value) {
        this.number_API_Calls_L30_Total__C = value;
    }

    /**
     * Gets the value of the number_API_Calls_L30__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_L30__C() {
        return number_API_Calls_L30__C;
    }

    /**
     * Sets the value of the number_API_Calls_L30__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_L30__C(JAXBElement<Double> value) {
        this.number_API_Calls_L30__C = value;
    }

    /**
     * Gets the value of the number_API_Calls_L7_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_L7_Total__C() {
        return number_API_Calls_L7_Total__C;
    }

    /**
     * Sets the value of the number_API_Calls_L7_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_L7_Total__C(JAXBElement<Double> value) {
        this.number_API_Calls_L7_Total__C = value;
    }

    /**
     * Gets the value of the number_API_Calls_L7__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_L7__C() {
        return number_API_Calls_L7__C;
    }

    /**
     * Sets the value of the number_API_Calls_L7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_L7__C(JAXBElement<Double> value) {
        this.number_API_Calls_L7__C = value;
    }

    /**
     * Gets the value of the number_API_Calls_Yesterday_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_Yesterday_Total__C() {
        return number_API_Calls_Yesterday_Total__C;
    }

    /**
     * Sets the value of the number_API_Calls_Yesterday_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_Yesterday_Total__C(JAXBElement<Double> value) {
        this.number_API_Calls_Yesterday_Total__C = value;
    }

    /**
     * Gets the value of the number_API_Calls_Yesterday__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_API_Calls_Yesterday__C() {
        return number_API_Calls_Yesterday__C;
    }

    /**
     * Sets the value of the number_API_Calls_Yesterday__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_API_Calls_Yesterday__C(JAXBElement<Double> value) {
        this.number_API_Calls_Yesterday__C = value;
    }

    /**
     * Gets the value of the number_Of_AU_MTD__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Of_AU_MTD__C() {
        return number_Of_AU_MTD__C;
    }

    /**
     * Sets the value of the number_Of_AU_MTD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Of_AU_MTD__C(JAXBElement<Double> value) {
        this.number_Of_AU_MTD__C = value;
    }

    /**
     * Gets the value of the owning_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwning_User__C() {
        return owning_User__C;
    }

    /**
     * Sets the value of the owning_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwning_User__C(JAXBElement<String> value) {
        this.owning_User__C = value;
    }

    /**
     * Gets the value of the owning_User__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getOwning_User__R() {
        return owning_User__R;
    }

    /**
     * Sets the value of the owning_User__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setOwning_User__R(JAXBElement<Contact> value) {
        this.owning_User__R = value;
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
     * Gets the value of the standing__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStanding__C() {
        return standing__C;
    }

    /**
     * Sets the value of the standing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStanding__C(JAXBElement<String> value) {
        this.standing__C = value;
    }

    /**
     * Gets the value of the storage_MTD_GB__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStorage_MTD_GB__C() {
        return storage_MTD_GB__C;
    }

    /**
     * Sets the value of the storage_MTD_GB__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStorage_MTD_GB__C(JAXBElement<Double> value) {
        this.storage_MTD_GB__C = value;
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
     * Gets the value of the usage_Bucket_API_Calls__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsage_Bucket_API_Calls__C() {
        return usage_Bucket_API_Calls__C;
    }

    /**
     * Sets the value of the usage_Bucket_API_Calls__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsage_Bucket_API_Calls__C(JAXBElement<String> value) {
        this.usage_Bucket_API_Calls__C = value;
    }

    /**
     * Gets the value of the usage_Bucket__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsage_Bucket__C() {
        return usage_Bucket__C;
    }

    /**
     * Sets the value of the usage_Bucket__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsage_Bucket__C(JAXBElement<String> value) {
        this.usage_Bucket__C = value;
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
     * Gets the value of the value_Of_Who_This_Is_For__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValue_Of_Who_This_Is_For__C() {
        return value_Of_Who_This_Is_For__C;
    }

    /**
     * Sets the value of the value_Of_Who_This_Is_For__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValue_Of_Who_This_Is_For__C(JAXBElement<Double> value) {
        this.value_Of_Who_This_Is_For__C = value;
    }

}
