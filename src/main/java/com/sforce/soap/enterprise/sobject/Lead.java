
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.AddressType;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for Lead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lead">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="Alternate_Email_Field__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Are_you_a_Coder__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttachedContentDocuments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__Add_to_Supression__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaigns__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_History__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Score__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Score_img__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:sobject.enterprise.soap.sforce.com}Campaign" minOccurs="0"/>
 *         &lt;element name="CampaignMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Sales_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConvertedAccount" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ConvertedAccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConvertedContact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ConvertedContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConvertedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConvertedOpportunity" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="ConvertedOpportunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Custom_Price_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclinedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deskcom__Desk_Cases__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Deskcom__twitter_username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disqualification_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBouncedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailBouncedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailStatuses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Activity_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HasOptedOutOfEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Have_you_heard_of_BaaS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="I_am_a__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_am_downloading_this_content_because__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_am_interested_in_mobile_for__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsConverted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUnreadByOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JigsawContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kinvey_Technical_Contact__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Offer_Completed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Record_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Score__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Most_Recent__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Stage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MEAP__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MQL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Lead" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Message__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_Mobile_Challenge__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_agency_builds__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_org_s_biggest_pain_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_role_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_title_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nature_of_Project__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Never_SQL_This_Person_Again__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Number_of_Employees__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Enterprise_Conversions__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_or_App__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Prospect_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Prospecting_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HggqEAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HggvEAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001Hgh4EAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001Hgh9EAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HghFEAS__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SQL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SQO_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tags" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Twitter__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UndecidedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What_CRM__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What_Platform__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="When_it_comes_to_mobile__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Who_guides_mobile_strategy_in_your_organ__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Why_did_they_SQL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Working_For_Employer_Client__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_Created__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_Date_Last_Updated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_User_Last_Updated__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_User_Last_Updated__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lead", propOrder = {
    "acceptedEventRelations",
    "activityHistories",
    "address",
    "alternate_Email_Field__C",
    "annualRevenue",
    "are_You_A_Coder__C",
    "attachedContentDocuments",
    "attachments",
    "bbp__Add_To_Supression__C",
    "bbp__BuzzBuilder_Campaigns__R",
    "bbp__BuzzBuilder_History__R",
    "bbp__BuzzBuilder_Score__C",
    "bbp__BuzzBuilder_Score_Img__C",
    "campaign",
    "campaignMembers",
    "city",
    "combinedAttachments",
    "company",
    "contact_Sales_Datestamp__C",
    "convertedAccount",
    "convertedAccountId",
    "convertedContact",
    "convertedContactId",
    "convertedDate",
    "convertedOpportunity",
    "convertedOpportunityId",
    "country",
    "createdBy",
    "createdById",
    "createdDate",
    "custom_Price_URL__C",
    "declinedEventRelations",
    "department_Source__C",
    "department__C",
    "description",
    "deskcom__Desk_Cases__R",
    "deskcom__Twitter_Username__C",
    "disqualification_Reason__C",
    "email",
    "emailBouncedDate",
    "emailBouncedReason",
    "emailStatuses",
    "eventRelations",
    "events",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstName",
    "first_Activity_Date__C",
    "hasOptedOutOfEmail",
    "have_You_Heard_Of_BaaS__C",
    "histories",
    "i_Am_A__C",
    "i_Am_Downloading_This_Content_Because__C",
    "i_Am_Interested_In_Mobile_For__C",
    "industry",
    "isConverted",
    "isDeleted",
    "isUnreadByOwner",
    "jigsawContactId",
    "kinvey_Technical_Contact__C",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "lastReferencedDate",
    "lastViewedDate",
    "last_Offer_Completed__C",
    "latitude",
    "leadSource",
    "lead_Record_URL__C",
    "lead_Score__C",
    "lead_Source_Most_Recent__C",
    "lead_Stage__C",
    "longitude",
    "lookedUpFromActivities",
    "meap__C",
    "mql_Datestamp__C",
    "masterRecord",
    "masterRecordId",
    "message__C",
    "mobilePhone",
    "my_Mobile_Challenge__C",
    "my_Agency_Builds__C",
    "my_Org_S_Biggest_Pain_Is__C",
    "my_Role_Is__C",
    "my_Title_Is__C",
    "name",
    "nature_Of_Project__C",
    "never_SQL_This_Person_Again__C",
    "notes",
    "notesAndAttachments",
    "numberOfEmployees",
    "number_Of_Employees__C",
    "number_Of_Enterprise_Conversions__C",
    "openActivities",
    "owner",
    "ownerId",
    "phone",
    "photoUrl",
    "platform_Or_App__C",
    "postalCode",
    "processInstances",
    "processSteps",
    "prospect_Date__C",
    "prospecting_Status__C",
    "rating",
    "role__C",
    "sal_Datestamp__C",
    "sfga__R00N40000001HggqEAC__R",
    "sfga__R00N40000001HggvEAC__R",
    "sfga__R00N40000001Hgh4EAC__R",
    "sfga__R00N40000001Hgh9EAC__R",
    "sfga__R00N40000001HghFEAS__R",
    "sql_Datestamp__C",
    "sqo_Datestamp__C",
    "salutation",
    "shares",
    "state",
    "status",
    "status__C",
    "street",
    "systemModstamp",
    "tags",
    "tasks",
    "title",
    "topicAssignments",
    "twitter__C",
    "undecidedEventRelations",
    "userRecordAccess",
    "website",
    "what_CRM__C",
    "what_Platform__C",
    "when_It_Comes_To_Mobile__C",
    "who_Guides_Mobile_Strategy_In_Your_Organ__C",
    "why_Did_They_SQL__C",
    "working_For_Employer_Client__C",
    "iv__InsideView_Created__C",
    "iv__InsideView_Date_Last_Updated__C",
    "iv__InsideView_User_Last_Updated__C",
    "iv__InsideView_User_Last_Updated__R"
})
public class Lead
    extends SObject
{

    @XmlElementRef(name = "AcceptedEventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> acceptedEventRelations;
    @XmlElementRef(name = "ActivityHistories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> activityHistories;
    @XmlElementRef(name = "Address", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> address;
    @XmlElementRef(name = "Alternate_Email_Field__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternate_Email_Field__C;
    @XmlElementRef(name = "AnnualRevenue", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> annualRevenue;
    @XmlElementRef(name = "Are_you_a_Coder__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> are_You_A_Coder__C;
    @XmlElementRef(name = "AttachedContentDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachedContentDocuments;
    @XmlElementRef(name = "Attachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachments;
    @XmlElementRef(name = "BBP__Add_to_Supression__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bbp__Add_To_Supression__C;
    @XmlElementRef(name = "BBP__BuzzBuilder_Campaigns__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> bbp__BuzzBuilder_Campaigns__R;
    @XmlElementRef(name = "BBP__BuzzBuilder_History__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> bbp__BuzzBuilder_History__R;
    @XmlElementRef(name = "BBP__BuzzBuilder_Score__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bbp__BuzzBuilder_Score__C;
    @XmlElementRef(name = "BBP__BuzzBuilder_Score_img__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__BuzzBuilder_Score_Img__C;
    @XmlElementRef(name = "Campaign", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Campaign> campaign;
    @XmlElementRef(name = "CampaignMembers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> campaignMembers;
    @XmlElementRef(name = "City", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CombinedAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> combinedAttachments;
    @XmlElementRef(name = "Company", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> company;
    @XmlElementRef(name = "Contact_Sales_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> contact_Sales_Datestamp__C;
    @XmlElementRef(name = "ConvertedAccount", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Account> convertedAccount;
    @XmlElementRef(name = "ConvertedAccountId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> convertedAccountId;
    @XmlElementRef(name = "ConvertedContact", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> convertedContact;
    @XmlElementRef(name = "ConvertedContactId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> convertedContactId;
    @XmlElementRef(name = "ConvertedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> convertedDate;
    @XmlElementRef(name = "ConvertedOpportunity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Opportunity> convertedOpportunity;
    @XmlElementRef(name = "ConvertedOpportunityId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> convertedOpportunityId;
    @XmlElementRef(name = "Country", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Custom_Price_URL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custom_Price_URL__C;
    @XmlElementRef(name = "DeclinedEventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> declinedEventRelations;
    @XmlElementRef(name = "Department_Source__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department_Source__C;
    @XmlElementRef(name = "Department__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department__C;
    @XmlElementRef(name = "Description", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Deskcom__Desk_Cases__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> deskcom__Desk_Cases__R;
    @XmlElementRef(name = "Deskcom__twitter_username__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deskcom__Twitter_Username__C;
    @XmlElementRef(name = "Disqualification_Reason__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disqualification_Reason__C;
    @XmlElementRef(name = "Email", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EmailBouncedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> emailBouncedDate;
    @XmlElementRef(name = "EmailBouncedReason", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailBouncedReason;
    @XmlElementRef(name = "EmailStatuses", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> emailStatuses;
    @XmlElementRef(name = "EventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> eventRelations;
    @XmlElementRef(name = "Events", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> events;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "Feeds", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feeds;
    @XmlElementRef(name = "FirstName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "First_Activity_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Activity_Date__C;
    @XmlElementRef(name = "HasOptedOutOfEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasOptedOutOfEmail;
    @XmlElementRef(name = "Have_you_heard_of_BaaS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> have_You_Heard_Of_BaaS__C;
    @XmlElementRef(name = "Histories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> histories;
    @XmlElementRef(name = "I_am_a__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_A__C;
    @XmlElementRef(name = "I_am_downloading_this_content_because__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_Downloading_This_Content_Because__C;
    @XmlElementRef(name = "I_am_interested_in_mobile_for__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_Interested_In_Mobile_For__C;
    @XmlElementRef(name = "Industry", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> industry;
    @XmlElementRef(name = "IsConverted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isConverted;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "IsUnreadByOwner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUnreadByOwner;
    @XmlElementRef(name = "JigsawContactId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jigsawContactId;
    @XmlElementRef(name = "Kinvey_Technical_Contact__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kinvey_Technical_Contact__C;
    @XmlElementRef(name = "LastActivityDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastActivityDate;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "LastName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LastReferencedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastReferencedDate;
    @XmlElementRef(name = "LastViewedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastViewedDate;
    @XmlElementRef(name = "Last_Offer_Completed__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> last_Offer_Completed__C;
    @XmlElementRef(name = "Latitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> latitude;
    @XmlElementRef(name = "LeadSource", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadSource;
    @XmlElementRef(name = "Lead_Record_URL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Record_URL__C;
    @XmlElementRef(name = "Lead_Score__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Score__C;
    @XmlElementRef(name = "Lead_Source_Most_Recent__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Source_Most_Recent__C;
    @XmlElementRef(name = "Lead_Stage__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Stage__C;
    @XmlElementRef(name = "Longitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> longitude;
    @XmlElementRef(name = "LookedUpFromActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> lookedUpFromActivities;
    @XmlElementRef(name = "MEAP__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meap__C;
    @XmlElementRef(name = "MQL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mql_Datestamp__C;
    @XmlElementRef(name = "MasterRecord", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Lead> masterRecord;
    @XmlElementRef(name = "MasterRecordId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterRecordId;
    @XmlElementRef(name = "Message__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message__C;
    @XmlElementRef(name = "MobilePhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "My_Mobile_Challenge__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> my_Mobile_Challenge__C;
    @XmlElementRef(name = "My_agency_builds__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> my_Agency_Builds__C;
    @XmlElementRef(name = "My_org_s_biggest_pain_is__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> my_Org_S_Biggest_Pain_Is__C;
    @XmlElementRef(name = "My_role_is__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> my_Role_Is__C;
    @XmlElementRef(name = "My_title_is__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> my_Title_Is__C;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Nature_of_Project__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nature_Of_Project__C;
    @XmlElementRef(name = "Never_SQL_This_Person_Again__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> never_SQL_This_Person_Again__C;
    @XmlElementRef(name = "Notes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notes;
    @XmlElementRef(name = "NotesAndAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notesAndAttachments;
    @XmlElementRef(name = "NumberOfEmployees", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfEmployees;
    @XmlElementRef(name = "Number_of_Employees__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number_Of_Employees__C;
    @XmlElementRef(name = "Number_of_Enterprise_Conversions__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Enterprise_Conversions__C;
    @XmlElementRef(name = "OpenActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> openActivities;
    @XmlElementRef(name = "Owner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Name> owner;
    @XmlElementRef(name = "OwnerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "Phone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "PhotoUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> photoUrl;
    @XmlElementRef(name = "Platform_or_App__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> platform_Or_App__C;
    @XmlElementRef(name = "PostalCode", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "ProcessInstances", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processInstances;
    @XmlElementRef(name = "ProcessSteps", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processSteps;
    @XmlElementRef(name = "Prospect_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> prospect_Date__C;
    @XmlElementRef(name = "Prospecting_Status__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prospecting_Status__C;
    @XmlElementRef(name = "Rating", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rating;
    @XmlElementRef(name = "Role__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role__C;
    @XmlElementRef(name = "SAL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sal_Datestamp__C;
    @XmlElementRef(name = "SFGA__R00N40000001HggqEAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HggqEAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001HggvEAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HggvEAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001Hgh4EAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001Hgh4EAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001Hgh9EAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001Hgh9EAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001HghFEAS__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HghFEAS__R;
    @XmlElementRef(name = "SQL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sql_Datestamp__C;
    @XmlElementRef(name = "SQO_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sqo_Datestamp__C;
    @XmlElementRef(name = "Salutation", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "Shares", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> shares;
    @XmlElementRef(name = "State", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Status", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Status__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status__C;
    @XmlElementRef(name = "Street", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Tags", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tags;
    @XmlElementRef(name = "Tasks", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tasks;
    @XmlElementRef(name = "Title", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "TopicAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> topicAssignments;
    @XmlElementRef(name = "Twitter__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> twitter__C;
    @XmlElementRef(name = "UndecidedEventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> undecidedEventRelations;
    @XmlElementRef(name = "UserRecordAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRecordAccess> userRecordAccess;
    @XmlElementRef(name = "Website", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> website;
    @XmlElementRef(name = "What_CRM__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> what_CRM__C;
    @XmlElementRef(name = "What_Platform__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> what_Platform__C;
    @XmlElementRef(name = "When_it_comes_to_mobile__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> when_It_Comes_To_Mobile__C;
    @XmlElementRef(name = "Who_guides_mobile_strategy_in_your_organ__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> who_Guides_Mobile_Strategy_In_Your_Organ__C;
    @XmlElementRef(name = "Why_did_they_SQL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> why_Did_They_SQL__C;
    @XmlElementRef(name = "Working_For_Employer_Client__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> working_For_Employer_Client__C;
    @XmlElementRef(name = "iv__InsideView_Created__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> iv__InsideView_Created__C;
    @XmlElementRef(name = "iv__InsideView_Date_Last_Updated__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iv__InsideView_Date_Last_Updated__C;
    @XmlElementRef(name = "iv__InsideView_User_Last_Updated__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iv__InsideView_User_Last_Updated__C;
    @XmlElementRef(name = "iv__InsideView_User_Last_Updated__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> iv__InsideView_User_Last_Updated__R;

    /**
     * Gets the value of the acceptedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAcceptedEventRelations() {
        return acceptedEventRelations;
    }

    /**
     * Sets the value of the acceptedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAcceptedEventRelations(JAXBElement<QueryResultType> value) {
        this.acceptedEventRelations = value;
    }

    /**
     * Gets the value of the activityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getActivityHistories() {
        return activityHistories;
    }

    /**
     * Sets the value of the activityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setActivityHistories(JAXBElement<QueryResultType> value) {
        this.activityHistories = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AddressType> value) {
        this.address = value;
    }

    /**
     * Gets the value of the alternate_Email_Field__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternate_Email_Field__C() {
        return alternate_Email_Field__C;
    }

    /**
     * Sets the value of the alternate_Email_Field__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternate_Email_Field__C(JAXBElement<String> value) {
        this.alternate_Email_Field__C = value;
    }

    /**
     * Gets the value of the annualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the value of the annualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAnnualRevenue(JAXBElement<Double> value) {
        this.annualRevenue = value;
    }

    /**
     * Gets the value of the are_You_A_Coder__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAre_You_A_Coder__C() {
        return are_You_A_Coder__C;
    }

    /**
     * Sets the value of the are_You_A_Coder__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAre_You_A_Coder__C(JAXBElement<Boolean> value) {
        this.are_You_A_Coder__C = value;
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
     * Gets the value of the bbp__Add_To_Supression__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBBP__Add_To_Supression__C() {
        return bbp__Add_To_Supression__C;
    }

    /**
     * Sets the value of the bbp__Add_To_Supression__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBBP__Add_To_Supression__C(JAXBElement<Boolean> value) {
        this.bbp__Add_To_Supression__C = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Campaigns__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getBBP__BuzzBuilder_Campaigns__R() {
        return bbp__BuzzBuilder_Campaigns__R;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Campaigns__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Campaigns__R(JAXBElement<QueryResultType> value) {
        this.bbp__BuzzBuilder_Campaigns__R = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_History__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getBBP__BuzzBuilder_History__R() {
        return bbp__BuzzBuilder_History__R;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_History__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_History__R(JAXBElement<QueryResultType> value) {
        this.bbp__BuzzBuilder_History__R = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Score__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBBP__BuzzBuilder_Score__C() {
        return bbp__BuzzBuilder_Score__C;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Score__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Score__C(JAXBElement<Double> value) {
        this.bbp__BuzzBuilder_Score__C = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Score_Img__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__BuzzBuilder_Score_Img__C() {
        return bbp__BuzzBuilder_Score_Img__C;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Score_Img__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Score_Img__C(JAXBElement<String> value) {
        this.bbp__BuzzBuilder_Score_Img__C = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     *     
     */
    public JAXBElement<Campaign> getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<Campaign> value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the campaignMembers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getCampaignMembers() {
        return campaignMembers;
    }

    /**
     * Sets the value of the campaignMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setCampaignMembers(JAXBElement<QueryResultType> value) {
        this.campaignMembers = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompany(JAXBElement<String> value) {
        this.company = value;
    }

    /**
     * Gets the value of the contact_Sales_Datestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getContact_Sales_Datestamp__C() {
        return contact_Sales_Datestamp__C;
    }

    /**
     * Sets the value of the contact_Sales_Datestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setContact_Sales_Datestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.contact_Sales_Datestamp__C = value;
    }

    /**
     * Gets the value of the convertedAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public JAXBElement<Account> getConvertedAccount() {
        return convertedAccount;
    }

    /**
     * Sets the value of the convertedAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public void setConvertedAccount(JAXBElement<Account> value) {
        this.convertedAccount = value;
    }

    /**
     * Gets the value of the convertedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConvertedAccountId() {
        return convertedAccountId;
    }

    /**
     * Sets the value of the convertedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConvertedAccountId(JAXBElement<String> value) {
        this.convertedAccountId = value;
    }

    /**
     * Gets the value of the convertedContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getConvertedContact() {
        return convertedContact;
    }

    /**
     * Sets the value of the convertedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setConvertedContact(JAXBElement<Contact> value) {
        this.convertedContact = value;
    }

    /**
     * Gets the value of the convertedContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConvertedContactId() {
        return convertedContactId;
    }

    /**
     * Sets the value of the convertedContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConvertedContactId(JAXBElement<String> value) {
        this.convertedContactId = value;
    }

    /**
     * Gets the value of the convertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConvertedDate() {
        return convertedDate;
    }

    /**
     * Sets the value of the convertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConvertedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.convertedDate = value;
    }

    /**
     * Gets the value of the convertedOpportunity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Opportunity }{@code >}
     *     
     */
    public JAXBElement<Opportunity> getConvertedOpportunity() {
        return convertedOpportunity;
    }

    /**
     * Sets the value of the convertedOpportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Opportunity }{@code >}
     *     
     */
    public void setConvertedOpportunity(JAXBElement<Opportunity> value) {
        this.convertedOpportunity = value;
    }

    /**
     * Gets the value of the convertedOpportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConvertedOpportunityId() {
        return convertedOpportunityId;
    }

    /**
     * Sets the value of the convertedOpportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConvertedOpportunityId(JAXBElement<String> value) {
        this.convertedOpportunityId = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
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
     * Gets the value of the custom_Price_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustom_Price_URL__C() {
        return custom_Price_URL__C;
    }

    /**
     * Sets the value of the custom_Price_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustom_Price_URL__C(JAXBElement<String> value) {
        this.custom_Price_URL__C = value;
    }

    /**
     * Gets the value of the declinedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getDeclinedEventRelations() {
        return declinedEventRelations;
    }

    /**
     * Sets the value of the declinedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setDeclinedEventRelations(JAXBElement<QueryResultType> value) {
        this.declinedEventRelations = value;
    }

    /**
     * Gets the value of the department_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment_Source__C() {
        return department_Source__C;
    }

    /**
     * Sets the value of the department_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment_Source__C(JAXBElement<String> value) {
        this.department_Source__C = value;
    }

    /**
     * Gets the value of the department__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment__C() {
        return department__C;
    }

    /**
     * Sets the value of the department__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment__C(JAXBElement<String> value) {
        this.department__C = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the deskcom__Desk_Cases__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getDeskcom__Desk_Cases__R() {
        return deskcom__Desk_Cases__R;
    }

    /**
     * Sets the value of the deskcom__Desk_Cases__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setDeskcom__Desk_Cases__R(JAXBElement<QueryResultType> value) {
        this.deskcom__Desk_Cases__R = value;
    }

    /**
     * Gets the value of the deskcom__Twitter_Username__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeskcom__Twitter_Username__C() {
        return deskcom__Twitter_Username__C;
    }

    /**
     * Sets the value of the deskcom__Twitter_Username__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeskcom__Twitter_Username__C(JAXBElement<String> value) {
        this.deskcom__Twitter_Username__C = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailBouncedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEmailBouncedDate() {
        return emailBouncedDate;
    }

    /**
     * Sets the value of the emailBouncedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEmailBouncedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.emailBouncedDate = value;
    }

    /**
     * Gets the value of the emailBouncedReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailBouncedReason() {
        return emailBouncedReason;
    }

    /**
     * Sets the value of the emailBouncedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailBouncedReason(JAXBElement<String> value) {
        this.emailBouncedReason = value;
    }

    /**
     * Gets the value of the emailStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getEmailStatuses() {
        return emailStatuses;
    }

    /**
     * Sets the value of the emailStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setEmailStatuses(JAXBElement<QueryResultType> value) {
        this.emailStatuses = value;
    }

    /**
     * Gets the value of the eventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getEventRelations() {
        return eventRelations;
    }

    /**
     * Sets the value of the eventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setEventRelations(JAXBElement<QueryResultType> value) {
        this.eventRelations = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setEvents(JAXBElement<QueryResultType> value) {
        this.events = value;
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
     * Gets the value of the feeds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFeeds() {
        return feeds;
    }

    /**
     * Sets the value of the feeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFeeds(JAXBElement<QueryResultType> value) {
        this.feeds = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the first_Activity_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Activity_Date__C() {
        return first_Activity_Date__C;
    }

    /**
     * Sets the value of the first_Activity_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Activity_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Activity_Date__C = value;
    }

    /**
     * Gets the value of the hasOptedOutOfEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasOptedOutOfEmail() {
        return hasOptedOutOfEmail;
    }

    /**
     * Sets the value of the hasOptedOutOfEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasOptedOutOfEmail(JAXBElement<Boolean> value) {
        this.hasOptedOutOfEmail = value;
    }

    /**
     * Gets the value of the have_You_Heard_Of_BaaS__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHave_You_Heard_Of_BaaS__C() {
        return have_You_Heard_Of_BaaS__C;
    }

    /**
     * Sets the value of the have_You_Heard_Of_BaaS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHave_You_Heard_Of_BaaS__C(JAXBElement<String> value) {
        this.have_You_Heard_Of_BaaS__C = value;
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
     * Gets the value of the i_Am_A__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI_Am_A__C() {
        return i_Am_A__C;
    }

    /**
     * Sets the value of the i_Am_A__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI_Am_A__C(JAXBElement<String> value) {
        this.i_Am_A__C = value;
    }

    /**
     * Gets the value of the i_Am_Downloading_This_Content_Because__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI_Am_Downloading_This_Content_Because__C() {
        return i_Am_Downloading_This_Content_Because__C;
    }

    /**
     * Sets the value of the i_Am_Downloading_This_Content_Because__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI_Am_Downloading_This_Content_Because__C(JAXBElement<String> value) {
        this.i_Am_Downloading_This_Content_Because__C = value;
    }

    /**
     * Gets the value of the i_Am_Interested_In_Mobile_For__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI_Am_Interested_In_Mobile_For__C() {
        return i_Am_Interested_In_Mobile_For__C;
    }

    /**
     * Sets the value of the i_Am_Interested_In_Mobile_For__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI_Am_Interested_In_Mobile_For__C(JAXBElement<String> value) {
        this.i_Am_Interested_In_Mobile_For__C = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndustry(JAXBElement<String> value) {
        this.industry = value;
    }

    /**
     * Gets the value of the isConverted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsConverted() {
        return isConverted;
    }

    /**
     * Sets the value of the isConverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsConverted(JAXBElement<Boolean> value) {
        this.isConverted = value;
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
     * Gets the value of the isUnreadByOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUnreadByOwner() {
        return isUnreadByOwner;
    }

    /**
     * Sets the value of the isUnreadByOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUnreadByOwner(JAXBElement<Boolean> value) {
        this.isUnreadByOwner = value;
    }

    /**
     * Gets the value of the jigsawContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJigsawContactId() {
        return jigsawContactId;
    }

    /**
     * Sets the value of the jigsawContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJigsawContactId(JAXBElement<String> value) {
        this.jigsawContactId = value;
    }

    /**
     * Gets the value of the kinvey_Technical_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKinvey_Technical_Contact__C() {
        return kinvey_Technical_Contact__C;
    }

    /**
     * Sets the value of the kinvey_Technical_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKinvey_Technical_Contact__C(JAXBElement<String> value) {
        this.kinvey_Technical_Contact__C = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastActivityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastActivityDate = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
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
     * Gets the value of the last_Offer_Completed__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLast_Offer_Completed__C() {
        return last_Offer_Completed__C;
    }

    /**
     * Sets the value of the last_Offer_Completed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLast_Offer_Completed__C(JAXBElement<String> value) {
        this.last_Offer_Completed__C = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<Double> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeadSource(JAXBElement<String> value) {
        this.leadSource = value;
    }

    /**
     * Gets the value of the lead_Record_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLead_Record_URL__C() {
        return lead_Record_URL__C;
    }

    /**
     * Sets the value of the lead_Record_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLead_Record_URL__C(JAXBElement<String> value) {
        this.lead_Record_URL__C = value;
    }

    /**
     * Gets the value of the lead_Score__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLead_Score__C() {
        return lead_Score__C;
    }

    /**
     * Sets the value of the lead_Score__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLead_Score__C(JAXBElement<String> value) {
        this.lead_Score__C = value;
    }

    /**
     * Gets the value of the lead_Source_Most_Recent__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLead_Source_Most_Recent__C() {
        return lead_Source_Most_Recent__C;
    }

    /**
     * Sets the value of the lead_Source_Most_Recent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLead_Source_Most_Recent__C(JAXBElement<String> value) {
        this.lead_Source_Most_Recent__C = value;
    }

    /**
     * Gets the value of the lead_Stage__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLead_Stage__C() {
        return lead_Stage__C;
    }

    /**
     * Sets the value of the lead_Stage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLead_Stage__C(JAXBElement<String> value) {
        this.lead_Stage__C = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<Double> value) {
        this.longitude = value;
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
     * Gets the value of the meap__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMEAP__C() {
        return meap__C;
    }

    /**
     * Sets the value of the meap__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMEAP__C(JAXBElement<String> value) {
        this.meap__C = value;
    }

    /**
     * Gets the value of the mql_Datestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMQL_Datestamp__C() {
        return mql_Datestamp__C;
    }

    /**
     * Sets the value of the mql_Datestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMQL_Datestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.mql_Datestamp__C = value;
    }

    /**
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Lead }{@code >}
     *     
     */
    public JAXBElement<Lead> getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Lead }{@code >}
     *     
     */
    public void setMasterRecord(JAXBElement<Lead> value) {
        this.masterRecord = value;
    }

    /**
     * Gets the value of the masterRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets the value of the masterRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterRecordId(JAXBElement<String> value) {
        this.masterRecordId = value;
    }

    /**
     * Gets the value of the message__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage__C() {
        return message__C;
    }

    /**
     * Sets the value of the message__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage__C(JAXBElement<String> value) {
        this.message__C = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the my_Mobile_Challenge__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMy_Mobile_Challenge__C() {
        return my_Mobile_Challenge__C;
    }

    /**
     * Sets the value of the my_Mobile_Challenge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMy_Mobile_Challenge__C(JAXBElement<String> value) {
        this.my_Mobile_Challenge__C = value;
    }

    /**
     * Gets the value of the my_Agency_Builds__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMy_Agency_Builds__C() {
        return my_Agency_Builds__C;
    }

    /**
     * Sets the value of the my_Agency_Builds__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMy_Agency_Builds__C(JAXBElement<String> value) {
        this.my_Agency_Builds__C = value;
    }

    /**
     * Gets the value of the my_Org_S_Biggest_Pain_Is__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMy_Org_S_Biggest_Pain_Is__C() {
        return my_Org_S_Biggest_Pain_Is__C;
    }

    /**
     * Sets the value of the my_Org_S_Biggest_Pain_Is__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMy_Org_S_Biggest_Pain_Is__C(JAXBElement<String> value) {
        this.my_Org_S_Biggest_Pain_Is__C = value;
    }

    /**
     * Gets the value of the my_Role_Is__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMy_Role_Is__C() {
        return my_Role_Is__C;
    }

    /**
     * Sets the value of the my_Role_Is__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMy_Role_Is__C(JAXBElement<String> value) {
        this.my_Role_Is__C = value;
    }

    /**
     * Gets the value of the my_Title_Is__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMy_Title_Is__C() {
        return my_Title_Is__C;
    }

    /**
     * Sets the value of the my_Title_Is__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMy_Title_Is__C(JAXBElement<String> value) {
        this.my_Title_Is__C = value;
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
     * Gets the value of the nature_Of_Project__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNature_Of_Project__C() {
        return nature_Of_Project__C;
    }

    /**
     * Sets the value of the nature_Of_Project__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNature_Of_Project__C(JAXBElement<String> value) {
        this.nature_Of_Project__C = value;
    }

    /**
     * Gets the value of the never_SQL_This_Person_Again__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNever_SQL_This_Person_Again__C() {
        return never_SQL_This_Person_Again__C;
    }

    /**
     * Sets the value of the never_SQL_This_Person_Again__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNever_SQL_This_Person_Again__C(JAXBElement<Boolean> value) {
        this.never_SQL_This_Person_Again__C = value;
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
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfEmployees(JAXBElement<Integer> value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the number_Of_Employees__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber_Of_Employees__C() {
        return number_Of_Employees__C;
    }

    /**
     * Sets the value of the number_Of_Employees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber_Of_Employees__C(JAXBElement<String> value) {
        this.number_Of_Employees__C = value;
    }

    /**
     * Gets the value of the number_Of_Enterprise_Conversions__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Of_Enterprise_Conversions__C() {
        return number_Of_Enterprise_Conversions__C;
    }

    /**
     * Sets the value of the number_Of_Enterprise_Conversions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Of_Enterprise_Conversions__C(JAXBElement<Double> value) {
        this.number_Of_Enterprise_Conversions__C = value;
    }

    /**
     * Gets the value of the openActivities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpenActivities() {
        return openActivities;
    }

    /**
     * Sets the value of the openActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpenActivities(JAXBElement<QueryResultType> value) {
        this.openActivities = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the photoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the value of the photoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhotoUrl(JAXBElement<String> value) {
        this.photoUrl = value;
    }

    /**
     * Gets the value of the platform_Or_App__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlatform_Or_App__C() {
        return platform_Or_App__C;
    }

    /**
     * Sets the value of the platform_Or_App__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlatform_Or_App__C(JAXBElement<String> value) {
        this.platform_Or_App__C = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
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
     * Gets the value of the prospect_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProspect_Date__C() {
        return prospect_Date__C;
    }

    /**
     * Sets the value of the prospect_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProspect_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.prospect_Date__C = value;
    }

    /**
     * Gets the value of the prospecting_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProspecting_Status__C() {
        return prospecting_Status__C;
    }

    /**
     * Sets the value of the prospecting_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProspecting_Status__C(JAXBElement<String> value) {
        this.prospecting_Status__C = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRating(JAXBElement<String> value) {
        this.rating = value;
    }

    /**
     * Gets the value of the role__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRole__C() {
        return role__C;
    }

    /**
     * Sets the value of the role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRole__C(JAXBElement<String> value) {
        this.role__C = value;
    }

    /**
     * Gets the value of the sal_Datestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSAL_Datestamp__C() {
        return sal_Datestamp__C;
    }

    /**
     * Sets the value of the sal_Datestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSAL_Datestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.sal_Datestamp__C = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HggqEAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HggqEAC__R() {
        return sfga__R00N40000001HggqEAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HggqEAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HggqEAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HggqEAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HggvEAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HggvEAC__R() {
        return sfga__R00N40000001HggvEAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HggvEAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HggvEAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HggvEAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001Hgh4EAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001Hgh4EAC__R() {
        return sfga__R00N40000001Hgh4EAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001Hgh4EAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001Hgh4EAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001Hgh4EAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001Hgh9EAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001Hgh9EAC__R() {
        return sfga__R00N40000001Hgh9EAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001Hgh9EAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001Hgh9EAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001Hgh9EAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HghFEAS__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HghFEAS__R() {
        return sfga__R00N40000001HghFEAS__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HghFEAS__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HghFEAS__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HghFEAS__R = value;
    }

    /**
     * Gets the value of the sql_Datestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSQL_Datestamp__C() {
        return sql_Datestamp__C;
    }

    /**
     * Sets the value of the sql_Datestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSQL_Datestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.sql_Datestamp__C = value;
    }

    /**
     * Gets the value of the sqo_Datestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSQO_Datestamp__C() {
        return sqo_Datestamp__C;
    }

    /**
     * Sets the value of the sqo_Datestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSQO_Datestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.sqo_Datestamp__C = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutation(JAXBElement<String> value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setShares(JAXBElement<QueryResultType> value) {
        this.shares = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreet(JAXBElement<String> value) {
        this.street = value;
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
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setTasks(JAXBElement<QueryResultType> value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
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
     * Gets the value of the twitter__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTwitter__C() {
        return twitter__C;
    }

    /**
     * Sets the value of the twitter__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTwitter__C(JAXBElement<String> value) {
        this.twitter__C = value;
    }

    /**
     * Gets the value of the undecidedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getUndecidedEventRelations() {
        return undecidedEventRelations;
    }

    /**
     * Sets the value of the undecidedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setUndecidedEventRelations(JAXBElement<QueryResultType> value) {
        this.undecidedEventRelations = value;
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
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebsite(JAXBElement<String> value) {
        this.website = value;
    }

    /**
     * Gets the value of the what_CRM__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhat_CRM__C() {
        return what_CRM__C;
    }

    /**
     * Sets the value of the what_CRM__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhat_CRM__C(JAXBElement<String> value) {
        this.what_CRM__C = value;
    }

    /**
     * Gets the value of the what_Platform__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhat_Platform__C() {
        return what_Platform__C;
    }

    /**
     * Sets the value of the what_Platform__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhat_Platform__C(JAXBElement<String> value) {
        this.what_Platform__C = value;
    }

    /**
     * Gets the value of the when_It_Comes_To_Mobile__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhen_It_Comes_To_Mobile__C() {
        return when_It_Comes_To_Mobile__C;
    }

    /**
     * Sets the value of the when_It_Comes_To_Mobile__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhen_It_Comes_To_Mobile__C(JAXBElement<String> value) {
        this.when_It_Comes_To_Mobile__C = value;
    }

    /**
     * Gets the value of the who_Guides_Mobile_Strategy_In_Your_Organ__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWho_Guides_Mobile_Strategy_In_Your_Organ__C() {
        return who_Guides_Mobile_Strategy_In_Your_Organ__C;
    }

    /**
     * Sets the value of the who_Guides_Mobile_Strategy_In_Your_Organ__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWho_Guides_Mobile_Strategy_In_Your_Organ__C(JAXBElement<String> value) {
        this.who_Guides_Mobile_Strategy_In_Your_Organ__C = value;
    }

    /**
     * Gets the value of the why_Did_They_SQL__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhy_Did_They_SQL__C() {
        return why_Did_They_SQL__C;
    }

    /**
     * Sets the value of the why_Did_They_SQL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhy_Did_They_SQL__C(JAXBElement<String> value) {
        this.why_Did_They_SQL__C = value;
    }

    /**
     * Gets the value of the working_For_Employer_Client__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorking_For_Employer_Client__C() {
        return working_For_Employer_Client__C;
    }

    /**
     * Sets the value of the working_For_Employer_Client__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorking_For_Employer_Client__C(JAXBElement<String> value) {
        this.working_For_Employer_Client__C = value;
    }

    /**
     * Gets the value of the iv__InsideView_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIv__InsideView_Created__C() {
        return iv__InsideView_Created__C;
    }

    /**
     * Sets the value of the iv__InsideView_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIv__InsideView_Created__C(JAXBElement<Boolean> value) {
        this.iv__InsideView_Created__C = value;
    }

    /**
     * Gets the value of the iv__InsideView_Date_Last_Updated__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIv__InsideView_Date_Last_Updated__C() {
        return iv__InsideView_Date_Last_Updated__C;
    }

    /**
     * Sets the value of the iv__InsideView_Date_Last_Updated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIv__InsideView_Date_Last_Updated__C(JAXBElement<XMLGregorianCalendar> value) {
        this.iv__InsideView_Date_Last_Updated__C = value;
    }

    /**
     * Gets the value of the iv__InsideView_User_Last_Updated__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIv__InsideView_User_Last_Updated__C() {
        return iv__InsideView_User_Last_Updated__C;
    }

    /**
     * Sets the value of the iv__InsideView_User_Last_Updated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIv__InsideView_User_Last_Updated__C(JAXBElement<String> value) {
        this.iv__InsideView_User_Last_Updated__C = value;
    }

    /**
     * Gets the value of the iv__InsideView_User_Last_Updated__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getIv__InsideView_User_Last_Updated__R() {
        return iv__InsideView_User_Last_Updated__R;
    }

    /**
     * Sets the value of the iv__InsideView_User_Last_Updated__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setIv__InsideView_User_Last_Updated__R(JAXBElement<User> value) {
        this.iv__InsideView_User_Last_Updated__R = value;
    }

}
