
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
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="API_Calls_L1_Across_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="API_Calls_L30_Across_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="API_Calls_L7_Across_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="API_Charges_All_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AU_Charges_All_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AcceptedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_UID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="All_Charges_All_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Alternate_Email_Field__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Android_SDK_Rollup__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="App_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="App_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Are_you_a_Coder__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Assets" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AssistantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssistantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachedContentDocuments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__Add_to_Supression__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaigns__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_History__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Score__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Score_img__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBP__Industry__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BE_Trial__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CampaignMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CaseContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Console_API_Calls_L1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Console_API_Calls_L30__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Console_API_Calls_L7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Contact_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Sales_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContractContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Custom_Price_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Days_With_1_API_Call_L30__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_with_1_API_Call_L7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DeclinedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deskcom__Desk_Cases__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Deskcom__twitter_username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disqualification_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Earliest_Expiry__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBouncedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailBouncedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailStatuses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Email_Verification_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_API_Call_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Activity_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Backend_Created__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="First_Doc_Accessed__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HasOptedOutOfEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Active_Users__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Has_Hit_Any_JS_SDK__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Have_you_heard_of_BaaS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_am_a__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_am_downloading_this_content_because__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_am_interested_in_mobile_for__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmailBounced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JigsawContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KBeContactAssociations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Kinvey_Backends1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Kinvey_Backends__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Kinvey_Technical_Contact__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastCURequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastCUUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Login_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Offer_Completed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Score__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Most_Recent__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Stage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lifetime_API_Calls__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_Android_SDK_Downloads__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_Console_API_Calls__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_Days_With_1_API_Call__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_Docs_Accessed__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_JS_SDK_Downloads__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_KBes_Deleted__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_SDK_Downloads__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lifetime_iOS_SDK_Downloads__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MEAP__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MQL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MTD_AU_Across_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Made_1_API_Call_Yesterday__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="MailingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MailingLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MailingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Message__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Most_Recent_Backend_Created__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="My_Mobile_Challenge__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_agency_builds__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_org_s_biggest_pain_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_role_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="My_title_is__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nature_of_Project__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Never_SQL_This_Person_Again__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NonConsole_KCS_API_Calls_Lifetime__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Number_Current_Backends__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Active_Backends__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Employees__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Enterprise_Conversions__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Signs_of_Life_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OtherAddress" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="OtherCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OtherLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OtherPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform_or_App__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ReportsTo" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ReportsToId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SQL_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SQO_Datestamp__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Signup_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Storage_Charges_All_KBEs__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Storage_Charges_Last_Month_All_KBes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tags" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Time_Last_Backend_Deleted__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Time_of_1st_SDK_Download__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Time_of_Most_Recent_SDK_Download__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Twitter__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UndecidedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="What_CRM__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What_Platform__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="When_it_comes_to_mobile__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Who_I_m_Building_For__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Who_guides_mobile_strategy_in_your_organ__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Why_did_they_SQL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Working_For_Employer_Client__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iOS_SDK_Rollup__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_Created__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_Date_Last_Updated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_User_Last_Updated__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="iv__InsideView_User_Last_Updated__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="why_i_build__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "api_Calls_L1_Across_All_KBes__C",
    "api_Calls_L30_Across_All_KBes__C",
    "api_Calls_L7_Across_All_KBes__C",
    "api_Charges_All_KBEs__C",
    "au_Charges_All_KBEs__C",
    "acceptedEventRelations",
    "account",
    "accountContactRoles",
    "accountId",
    "account_UID__C",
    "activityHistories",
    "all_Charges_All_KBEs__C",
    "alternate_Email_Field__C",
    "android_SDK_Rollup__C",
    "app_Name__C",
    "app_URL__C",
    "are_You_A_Coder__C",
    "assets",
    "assistantName",
    "assistantPhone",
    "attachedContentDocuments",
    "attachments",
    "bbp__Add_To_Supression__C",
    "bbp__BuzzBuilder_Campaigns__R",
    "bbp__BuzzBuilder_History__R",
    "bbp__BuzzBuilder_Score__C",
    "bbp__BuzzBuilder_Score_Img__C",
    "bbp__Industry__C",
    "be_Trial__C",
    "birthdate",
    "campaignMembers",
    "caseContactRoles",
    "cases",
    "combinedAttachments",
    "console_API_Calls_L1__C",
    "console_API_Calls_L30__C",
    "console_API_Calls_L7__C",
    "contact_Role__C",
    "contact_Sales_Datestamp__C",
    "contractContactRoles",
    "contractsSigned",
    "createdBy",
    "createdById",
    "createdDate",
    "custom_Price_URL__C",
    "days_With_1_API_Call_L30__C",
    "days_With_1_API_Call_L7__C",
    "declinedEventRelations",
    "department",
    "department_Source__C",
    "department__C",
    "description",
    "deskcom__Desk_Cases__R",
    "deskcom__Twitter_Username__C",
    "disqualification_Reason__C",
    "earliest_Expiry__C",
    "email",
    "emailBouncedDate",
    "emailBouncedReason",
    "emailStatuses",
    "email_Verification_Timestamp__C",
    "eventRelations",
    "events",
    "fax",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstName",
    "first_API_Call_Time__C",
    "first_Activity_Date__C",
    "first_Backend_Created__C",
    "first_Doc_Accessed__C",
    "hasOptedOutOfEmail",
    "has_Active_Users__C",
    "has_Hit_Any_JS_SDK__C",
    "have_You_Heard_Of_BaaS__C",
    "histories",
    "homePhone",
    "i_Am_A__C",
    "i_Am_Downloading_This_Content_Because__C",
    "i_Am_Interested_In_Mobile_For__C",
    "isDeleted",
    "isEmailBounced",
    "jigsawContactId",
    "kBeContactAssociations__R",
    "kinvey_Backends1__R",
    "kinvey_Backends__R",
    "kinvey_Technical_Contact__C",
    "lastActivityDate",
    "lastCURequestDate",
    "lastCUUpdateDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "lastReferencedDate",
    "lastViewedDate",
    "last_Login_Date__C",
    "last_Offer_Completed__C",
    "leadSource",
    "lead_Score__C",
    "lead_Source_Most_Recent__C",
    "lead_Stage__C",
    "lifetime_API_Calls__C",
    "lifetime_Android_SDK_Downloads__C",
    "lifetime_Console_API_Calls__C",
    "lifetime_Days_With_1_API_Call__C",
    "lifetime_Docs_Accessed__C",
    "lifetime_JS_SDK_Downloads__C",
    "lifetime_KBes_Deleted__C",
    "lifetime_KBes__C",
    "lifetime_SDK_Downloads__C",
    "lifetime_IOS_SDK_Downloads__C",
    "lookedUpFromActivities",
    "meap__C",
    "mql_Datestamp__C",
    "mtd_AU_Across_All_KBes__C",
    "made_1_API_Call_Yesterday__C",
    "mailingAddress",
    "mailingCity",
    "mailingCountry",
    "mailingLatitude",
    "mailingLongitude",
    "mailingPostalCode",
    "mailingState",
    "mailingStreet",
    "masterRecord",
    "masterRecordId",
    "message__C",
    "mobilePhone",
    "most_Recent_Backend_Created__C",
    "my_Mobile_Challenge__C",
    "my_Agency_Builds__C",
    "my_Org_S_Biggest_Pain_Is__C",
    "my_Role_Is__C",
    "my_Title_Is__C",
    "name",
    "nature_Of_Project__C",
    "never_SQL_This_Person_Again__C",
    "nonConsole_KCS_API_Calls_Lifetime__C",
    "notes",
    "notesAndAttachments",
    "number_Current_Backends__C",
    "number_Of_Active_Backends__C",
    "number_Of_Employees__C",
    "number_Of_Enterprise_Conversions__C",
    "number_Of_Signs_Of_Life_KBEs__C",
    "openActivities",
    "opportunities",
    "opportunityContactRoles",
    "otherAddress",
    "otherCity",
    "otherCountry",
    "otherLatitude",
    "otherLongitude",
    "otherPhone",
    "otherPostalCode",
    "otherState",
    "otherStreet",
    "owner",
    "ownerId",
    "phone",
    "photoUrl",
    "platform_Or_App__C",
    "processInstances",
    "processSteps",
    "reportsTo",
    "reportsToId",
    "role__C",
    "sal_Datestamp__C",
    "sql_Datestamp__C",
    "sqo_Datestamp__C",
    "salutation",
    "shares",
    "signup_Timestamp__C",
    "status__C",
    "storage_Charges_All_KBEs__C",
    "storage_Charges_Last_Month_All_KBes__C",
    "systemModstamp",
    "tags",
    "tasks",
    "time_Last_Backend_Deleted__C",
    "time_Of_1St_SDK_Download__C",
    "time_Of_Most_Recent_SDK_Download__C",
    "title",
    "topicAssignments",
    "twitter__C",
    "undecidedEventRelations",
    "userRecordAccess",
    "what_CRM__C",
    "what_Platform__C",
    "when_It_Comes_To_Mobile__C",
    "who_I_M_Building_For__C",
    "who_Guides_Mobile_Strategy_In_Your_Organ__C",
    "why_Did_They_SQL__C",
    "working_For_Employer_Client__C",
    "ios_SDK_Rollup__C",
    "iv__InsideView_Created__C",
    "iv__InsideView_Date_Last_Updated__C",
    "iv__InsideView_User_Last_Updated__C",
    "iv__InsideView_User_Last_Updated__R",
    "why_I_Build__C"
})
public class Contact
    extends SObject
{

    @XmlElementRef(name = "API_Calls_L1_Across_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Calls_L1_Across_All_KBes__C;
    @XmlElementRef(name = "API_Calls_L30_Across_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Calls_L30_Across_All_KBes__C;
    @XmlElementRef(name = "API_Calls_L7_Across_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Calls_L7_Across_All_KBes__C;
    @XmlElementRef(name = "API_Charges_All_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> api_Charges_All_KBEs__C;
    @XmlElementRef(name = "AU_Charges_All_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> au_Charges_All_KBEs__C;
    @XmlElementRef(name = "AcceptedEventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> acceptedEventRelations;
    @XmlElementRef(name = "Account", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Account> account;
    @XmlElementRef(name = "AccountContactRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> accountContactRoles;
    @XmlElementRef(name = "AccountId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountId;
    @XmlElementRef(name = "Account_UID__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> account_UID__C;
    @XmlElementRef(name = "ActivityHistories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> activityHistories;
    @XmlElementRef(name = "All_Charges_All_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> all_Charges_All_KBEs__C;
    @XmlElementRef(name = "Alternate_Email_Field__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternate_Email_Field__C;
    @XmlElementRef(name = "Android_SDK_Rollup__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> android_SDK_Rollup__C;
    @XmlElementRef(name = "App_Name__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> app_Name__C;
    @XmlElementRef(name = "App_URL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> app_URL__C;
    @XmlElementRef(name = "Are_you_a_Coder__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> are_You_A_Coder__C;
    @XmlElementRef(name = "Assets", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> assets;
    @XmlElementRef(name = "AssistantName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assistantName;
    @XmlElementRef(name = "AssistantPhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assistantPhone;
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
    @XmlElementRef(name = "BBP__Industry__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__Industry__C;
    @XmlElementRef(name = "BE_Trial__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> be_Trial__C;
    @XmlElementRef(name = "Birthdate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthdate;
    @XmlElementRef(name = "CampaignMembers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> campaignMembers;
    @XmlElementRef(name = "CaseContactRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> caseContactRoles;
    @XmlElementRef(name = "Cases", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> cases;
    @XmlElementRef(name = "CombinedAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> combinedAttachments;
    @XmlElementRef(name = "Console_API_Calls_L1__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> console_API_Calls_L1__C;
    @XmlElementRef(name = "Console_API_Calls_L30__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> console_API_Calls_L30__C;
    @XmlElementRef(name = "Console_API_Calls_L7__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> console_API_Calls_L7__C;
    @XmlElementRef(name = "Contact_Role__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contact_Role__C;
    @XmlElementRef(name = "Contact_Sales_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> contact_Sales_Datestamp__C;
    @XmlElementRef(name = "ContractContactRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> contractContactRoles;
    @XmlElementRef(name = "ContractsSigned", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> contractsSigned;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Custom_Price_URL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custom_Price_URL__C;
    @XmlElementRef(name = "Days_With_1_API_Call_L30__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> days_With_1_API_Call_L30__C;
    @XmlElementRef(name = "Days_with_1_API_Call_L7__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> days_With_1_API_Call_L7__C;
    @XmlElementRef(name = "DeclinedEventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> declinedEventRelations;
    @XmlElementRef(name = "Department", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
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
    @XmlElementRef(name = "Earliest_Expiry__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> earliest_Expiry__C;
    @XmlElementRef(name = "Email", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EmailBouncedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> emailBouncedDate;
    @XmlElementRef(name = "EmailBouncedReason", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailBouncedReason;
    @XmlElementRef(name = "EmailStatuses", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> emailStatuses;
    @XmlElementRef(name = "Email_Verification_Timestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> email_Verification_Timestamp__C;
    @XmlElementRef(name = "EventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> eventRelations;
    @XmlElementRef(name = "Events", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> events;
    @XmlElementRef(name = "Fax", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "Feeds", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feeds;
    @XmlElementRef(name = "FirstName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "First_API_Call_Time__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_API_Call_Time__C;
    @XmlElementRef(name = "First_Activity_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Activity_Date__C;
    @XmlElementRef(name = "First_Backend_Created__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Backend_Created__C;
    @XmlElementRef(name = "First_Doc_Accessed__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> first_Doc_Accessed__C;
    @XmlElementRef(name = "HasOptedOutOfEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasOptedOutOfEmail;
    @XmlElementRef(name = "Has_Active_Users__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> has_Active_Users__C;
    @XmlElementRef(name = "Has_Hit_Any_JS_SDK__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> has_Hit_Any_JS_SDK__C;
    @XmlElementRef(name = "Have_you_heard_of_BaaS__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> have_You_Heard_Of_BaaS__C;
    @XmlElementRef(name = "Histories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> histories;
    @XmlElementRef(name = "HomePhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "I_am_a__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_A__C;
    @XmlElementRef(name = "I_am_downloading_this_content_because__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_Downloading_This_Content_Because__C;
    @XmlElementRef(name = "I_am_interested_in_mobile_for__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i_Am_Interested_In_Mobile_For__C;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "IsEmailBounced", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEmailBounced;
    @XmlElementRef(name = "JigsawContactId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jigsawContactId;
    @XmlElementRef(name = "KBeContactAssociations__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> kBeContactAssociations__R;
    @XmlElementRef(name = "Kinvey_Backends1__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> kinvey_Backends1__R;
    @XmlElementRef(name = "Kinvey_Backends__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> kinvey_Backends__R;
    @XmlElementRef(name = "Kinvey_Technical_Contact__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kinvey_Technical_Contact__C;
    @XmlElementRef(name = "LastActivityDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastActivityDate;
    @XmlElementRef(name = "LastCURequestDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastCURequestDate;
    @XmlElementRef(name = "LastCUUpdateDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastCUUpdateDate;
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
    @XmlElementRef(name = "Last_Login_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> last_Login_Date__C;
    @XmlElementRef(name = "Last_Offer_Completed__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> last_Offer_Completed__C;
    @XmlElementRef(name = "LeadSource", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadSource;
    @XmlElementRef(name = "Lead_Score__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Score__C;
    @XmlElementRef(name = "Lead_Source_Most_Recent__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Source_Most_Recent__C;
    @XmlElementRef(name = "Lead_Stage__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lead_Stage__C;
    @XmlElementRef(name = "Lifetime_API_Calls__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_API_Calls__C;
    @XmlElementRef(name = "Lifetime_Android_SDK_Downloads__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_Android_SDK_Downloads__C;
    @XmlElementRef(name = "Lifetime_Console_API_Calls__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_Console_API_Calls__C;
    @XmlElementRef(name = "Lifetime_Days_With_1_API_Call__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_Days_With_1_API_Call__C;
    @XmlElementRef(name = "Lifetime_Docs_Accessed__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_Docs_Accessed__C;
    @XmlElementRef(name = "Lifetime_JS_SDK_Downloads__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_JS_SDK_Downloads__C;
    @XmlElementRef(name = "Lifetime_KBes_Deleted__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_KBes_Deleted__C;
    @XmlElementRef(name = "Lifetime_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_KBes__C;
    @XmlElementRef(name = "Lifetime_SDK_Downloads__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_SDK_Downloads__C;
    @XmlElementRef(name = "Lifetime_iOS_SDK_Downloads__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lifetime_IOS_SDK_Downloads__C;
    @XmlElementRef(name = "LookedUpFromActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> lookedUpFromActivities;
    @XmlElementRef(name = "MEAP__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meap__C;
    @XmlElementRef(name = "MQL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mql_Datestamp__C;
    @XmlElementRef(name = "MTD_AU_Across_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mtd_AU_Across_All_KBes__C;
    @XmlElementRef(name = "Made_1_API_Call_Yesterday__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> made_1_API_Call_Yesterday__C;
    @XmlElementRef(name = "MailingAddress", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> mailingAddress;
    @XmlElementRef(name = "MailingCity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingCity;
    @XmlElementRef(name = "MailingCountry", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingCountry;
    @XmlElementRef(name = "MailingLatitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mailingLatitude;
    @XmlElementRef(name = "MailingLongitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mailingLongitude;
    @XmlElementRef(name = "MailingPostalCode", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingPostalCode;
    @XmlElementRef(name = "MailingState", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingState;
    @XmlElementRef(name = "MailingStreet", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingStreet;
    @XmlElementRef(name = "MasterRecord", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> masterRecord;
    @XmlElementRef(name = "MasterRecordId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterRecordId;
    @XmlElementRef(name = "Message__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message__C;
    @XmlElementRef(name = "MobilePhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "Most_Recent_Backend_Created__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> most_Recent_Backend_Created__C;
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
    @XmlElementRef(name = "NonConsole_KCS_API_Calls_Lifetime__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonConsole_KCS_API_Calls_Lifetime__C;
    @XmlElementRef(name = "Notes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notes;
    @XmlElementRef(name = "NotesAndAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notesAndAttachments;
    @XmlElementRef(name = "Number_Current_Backends__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Current_Backends__C;
    @XmlElementRef(name = "Number_of_Active_Backends__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Active_Backends__C;
    @XmlElementRef(name = "Number_of_Employees__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number_Of_Employees__C;
    @XmlElementRef(name = "Number_of_Enterprise_Conversions__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Enterprise_Conversions__C;
    @XmlElementRef(name = "Number_of_Signs_of_Life_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> number_Of_Signs_Of_Life_KBEs__C;
    @XmlElementRef(name = "OpenActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> openActivities;
    @XmlElementRef(name = "Opportunities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunities;
    @XmlElementRef(name = "OpportunityContactRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityContactRoles;
    @XmlElementRef(name = "OtherAddress", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> otherAddress;
    @XmlElementRef(name = "OtherCity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherCity;
    @XmlElementRef(name = "OtherCountry", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherCountry;
    @XmlElementRef(name = "OtherLatitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> otherLatitude;
    @XmlElementRef(name = "OtherLongitude", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> otherLongitude;
    @XmlElementRef(name = "OtherPhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPhone;
    @XmlElementRef(name = "OtherPostalCode", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPostalCode;
    @XmlElementRef(name = "OtherState", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherState;
    @XmlElementRef(name = "OtherStreet", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherStreet;
    @XmlElementRef(name = "Owner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> owner;
    @XmlElementRef(name = "OwnerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "Phone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "PhotoUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> photoUrl;
    @XmlElementRef(name = "Platform_or_App__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> platform_Or_App__C;
    @XmlElementRef(name = "ProcessInstances", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processInstances;
    @XmlElementRef(name = "ProcessSteps", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processSteps;
    @XmlElementRef(name = "ReportsTo", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> reportsTo;
    @XmlElementRef(name = "ReportsToId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportsToId;
    @XmlElementRef(name = "Role__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> role__C;
    @XmlElementRef(name = "SAL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sal_Datestamp__C;
    @XmlElementRef(name = "SQL_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sql_Datestamp__C;
    @XmlElementRef(name = "SQO_Datestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sqo_Datestamp__C;
    @XmlElementRef(name = "Salutation", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "Shares", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> shares;
    @XmlElementRef(name = "Signup_Timestamp__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> signup_Timestamp__C;
    @XmlElementRef(name = "Status__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status__C;
    @XmlElementRef(name = "Storage_Charges_All_KBEs__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> storage_Charges_All_KBEs__C;
    @XmlElementRef(name = "Storage_Charges_Last_Month_All_KBes__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> storage_Charges_Last_Month_All_KBes__C;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Tags", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tags;
    @XmlElementRef(name = "Tasks", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tasks;
    @XmlElementRef(name = "Time_Last_Backend_Deleted__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> time_Last_Backend_Deleted__C;
    @XmlElementRef(name = "Time_of_1st_SDK_Download__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> time_Of_1St_SDK_Download__C;
    @XmlElementRef(name = "Time_of_Most_Recent_SDK_Download__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> time_Of_Most_Recent_SDK_Download__C;
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
    @XmlElementRef(name = "What_CRM__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> what_CRM__C;
    @XmlElementRef(name = "What_Platform__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> what_Platform__C;
    @XmlElementRef(name = "When_it_comes_to_mobile__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> when_It_Comes_To_Mobile__C;
    @XmlElementRef(name = "Who_I_m_Building_For__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> who_I_M_Building_For__C;
    @XmlElementRef(name = "Who_guides_mobile_strategy_in_your_organ__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> who_Guides_Mobile_Strategy_In_Your_Organ__C;
    @XmlElementRef(name = "Why_did_they_SQL__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> why_Did_They_SQL__C;
    @XmlElementRef(name = "Working_For_Employer_Client__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> working_For_Employer_Client__C;
    @XmlElementRef(name = "iOS_SDK_Rollup__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ios_SDK_Rollup__C;
    @XmlElementRef(name = "iv__InsideView_Created__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> iv__InsideView_Created__C;
    @XmlElementRef(name = "iv__InsideView_Date_Last_Updated__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iv__InsideView_Date_Last_Updated__C;
    @XmlElementRef(name = "iv__InsideView_User_Last_Updated__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iv__InsideView_User_Last_Updated__C;
    @XmlElementRef(name = "iv__InsideView_User_Last_Updated__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> iv__InsideView_User_Last_Updated__R;
    @XmlElementRef(name = "why_i_build__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> why_I_Build__C;

    /**
     * Gets the value of the api_Calls_L1_Across_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Calls_L1_Across_All_KBes__C() {
        return api_Calls_L1_Across_All_KBes__C;
    }

    /**
     * Sets the value of the api_Calls_L1_Across_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Calls_L1_Across_All_KBes__C(JAXBElement<Double> value) {
        this.api_Calls_L1_Across_All_KBes__C = value;
    }

    /**
     * Gets the value of the api_Calls_L30_Across_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Calls_L30_Across_All_KBes__C() {
        return api_Calls_L30_Across_All_KBes__C;
    }

    /**
     * Sets the value of the api_Calls_L30_Across_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Calls_L30_Across_All_KBes__C(JAXBElement<Double> value) {
        this.api_Calls_L30_Across_All_KBes__C = value;
    }

    /**
     * Gets the value of the api_Calls_L7_Across_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Calls_L7_Across_All_KBes__C() {
        return api_Calls_L7_Across_All_KBes__C;
    }

    /**
     * Sets the value of the api_Calls_L7_Across_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Calls_L7_Across_All_KBes__C(JAXBElement<Double> value) {
        this.api_Calls_L7_Across_All_KBes__C = value;
    }

    /**
     * Gets the value of the api_Charges_All_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAPI_Charges_All_KBEs__C() {
        return api_Charges_All_KBEs__C;
    }

    /**
     * Sets the value of the api_Charges_All_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAPI_Charges_All_KBEs__C(JAXBElement<Double> value) {
        this.api_Charges_All_KBEs__C = value;
    }

    /**
     * Gets the value of the au_Charges_All_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAU_Charges_All_KBEs__C() {
        return au_Charges_All_KBEs__C;
    }

    /**
     * Sets the value of the au_Charges_All_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAU_Charges_All_KBEs__C(JAXBElement<Double> value) {
        this.au_Charges_All_KBEs__C = value;
    }

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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public JAXBElement<Account> getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public void setAccount(JAXBElement<Account> value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAccountContactRoles() {
        return accountContactRoles;
    }

    /**
     * Sets the value of the accountContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAccountContactRoles(JAXBElement<QueryResultType> value) {
        this.accountContactRoles = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<String> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the account_UID__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccount_UID__C() {
        return account_UID__C;
    }

    /**
     * Sets the value of the account_UID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccount_UID__C(JAXBElement<String> value) {
        this.account_UID__C = value;
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
     * Gets the value of the all_Charges_All_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAll_Charges_All_KBEs__C() {
        return all_Charges_All_KBEs__C;
    }

    /**
     * Sets the value of the all_Charges_All_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAll_Charges_All_KBEs__C(JAXBElement<Double> value) {
        this.all_Charges_All_KBEs__C = value;
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
     * Gets the value of the app_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApp_Name__C() {
        return app_Name__C;
    }

    /**
     * Sets the value of the app_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApp_Name__C(JAXBElement<String> value) {
        this.app_Name__C = value;
    }

    /**
     * Gets the value of the app_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApp_URL__C() {
        return app_URL__C;
    }

    /**
     * Sets the value of the app_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApp_URL__C(JAXBElement<String> value) {
        this.app_URL__C = value;
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
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAssets(JAXBElement<QueryResultType> value) {
        this.assets = value;
    }

    /**
     * Gets the value of the assistantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssistantName() {
        return assistantName;
    }

    /**
     * Sets the value of the assistantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssistantName(JAXBElement<String> value) {
        this.assistantName = value;
    }

    /**
     * Gets the value of the assistantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets the value of the assistantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssistantPhone(JAXBElement<String> value) {
        this.assistantPhone = value;
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
     * Gets the value of the bbp__Industry__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__Industry__C() {
        return bbp__Industry__C;
    }

    /**
     * Sets the value of the bbp__Industry__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__Industry__C(JAXBElement<String> value) {
        this.bbp__Industry__C = value;
    }

    /**
     * Gets the value of the be_Trial__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBE_Trial__C() {
        return be_Trial__C;
    }

    /**
     * Sets the value of the be_Trial__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBE_Trial__C(JAXBElement<Double> value) {
        this.be_Trial__C = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthdate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthdate = value;
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
     * Gets the value of the caseContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getCaseContactRoles() {
        return caseContactRoles;
    }

    /**
     * Sets the value of the caseContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setCaseContactRoles(JAXBElement<QueryResultType> value) {
        this.caseContactRoles = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setCases(JAXBElement<QueryResultType> value) {
        this.cases = value;
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
     * Gets the value of the console_API_Calls_L1__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConsole_API_Calls_L1__C() {
        return console_API_Calls_L1__C;
    }

    /**
     * Sets the value of the console_API_Calls_L1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConsole_API_Calls_L1__C(JAXBElement<Double> value) {
        this.console_API_Calls_L1__C = value;
    }

    /**
     * Gets the value of the console_API_Calls_L30__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConsole_API_Calls_L30__C() {
        return console_API_Calls_L30__C;
    }

    /**
     * Sets the value of the console_API_Calls_L30__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConsole_API_Calls_L30__C(JAXBElement<Double> value) {
        this.console_API_Calls_L30__C = value;
    }

    /**
     * Gets the value of the console_API_Calls_L7__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConsole_API_Calls_L7__C() {
        return console_API_Calls_L7__C;
    }

    /**
     * Sets the value of the console_API_Calls_L7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConsole_API_Calls_L7__C(JAXBElement<Double> value) {
        this.console_API_Calls_L7__C = value;
    }

    /**
     * Gets the value of the contact_Role__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContact_Role__C() {
        return contact_Role__C;
    }

    /**
     * Sets the value of the contact_Role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContact_Role__C(JAXBElement<String> value) {
        this.contact_Role__C = value;
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
     * Gets the value of the contractContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getContractContactRoles() {
        return contractContactRoles;
    }

    /**
     * Sets the value of the contractContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setContractContactRoles(JAXBElement<QueryResultType> value) {
        this.contractContactRoles = value;
    }

    /**
     * Gets the value of the contractsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getContractsSigned() {
        return contractsSigned;
    }

    /**
     * Sets the value of the contractsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setContractsSigned(JAXBElement<QueryResultType> value) {
        this.contractsSigned = value;
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
     * Gets the value of the days_With_1_API_Call_L30__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDays_With_1_API_Call_L30__C() {
        return days_With_1_API_Call_L30__C;
    }

    /**
     * Sets the value of the days_With_1_API_Call_L30__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDays_With_1_API_Call_L30__C(JAXBElement<Double> value) {
        this.days_With_1_API_Call_L30__C = value;
    }

    /**
     * Gets the value of the days_With_1_API_Call_L7__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDays_With_1_API_Call_L7__C() {
        return days_With_1_API_Call_L7__C;
    }

    /**
     * Sets the value of the days_With_1_API_Call_L7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDays_With_1_API_Call_L7__C(JAXBElement<Double> value) {
        this.days_With_1_API_Call_L7__C = value;
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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
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
     * Gets the value of the earliest_Expiry__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEarliest_Expiry__C() {
        return earliest_Expiry__C;
    }

    /**
     * Sets the value of the earliest_Expiry__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEarliest_Expiry__C(JAXBElement<XMLGregorianCalendar> value) {
        this.earliest_Expiry__C = value;
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
     * Gets the value of the email_Verification_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEmail_Verification_Timestamp__C() {
        return email_Verification_Timestamp__C;
    }

    /**
     * Sets the value of the email_Verification_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEmail_Verification_Timestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.email_Verification_Timestamp__C = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
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
     * Gets the value of the first_API_Call_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_API_Call_Time__C() {
        return first_API_Call_Time__C;
    }

    /**
     * Sets the value of the first_API_Call_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_API_Call_Time__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_API_Call_Time__C = value;
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
     * Gets the value of the first_Backend_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Backend_Created__C() {
        return first_Backend_Created__C;
    }

    /**
     * Sets the value of the first_Backend_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Backend_Created__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Backend_Created__C = value;
    }

    /**
     * Gets the value of the first_Doc_Accessed__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirst_Doc_Accessed__C() {
        return first_Doc_Accessed__C;
    }

    /**
     * Sets the value of the first_Doc_Accessed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirst_Doc_Accessed__C(JAXBElement<XMLGregorianCalendar> value) {
        this.first_Doc_Accessed__C = value;
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
     * Gets the value of the has_Active_Users__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHas_Active_Users__C() {
        return has_Active_Users__C;
    }

    /**
     * Sets the value of the has_Active_Users__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHas_Active_Users__C(JAXBElement<String> value) {
        this.has_Active_Users__C = value;
    }

    /**
     * Gets the value of the has_Hit_Any_JS_SDK__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHas_Hit_Any_JS_SDK__C() {
        return has_Hit_Any_JS_SDK__C;
    }

    /**
     * Sets the value of the has_Hit_Any_JS_SDK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHas_Hit_Any_JS_SDK__C(JAXBElement<Double> value) {
        this.has_Hit_Any_JS_SDK__C = value;
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
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhone(JAXBElement<String> value) {
        this.homePhone = value;
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
     * Gets the value of the isEmailBounced property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEmailBounced() {
        return isEmailBounced;
    }

    /**
     * Sets the value of the isEmailBounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEmailBounced(JAXBElement<Boolean> value) {
        this.isEmailBounced = value;
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
     * Gets the value of the kinvey_Backends1__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getKinvey_Backends1__R() {
        return kinvey_Backends1__R;
    }

    /**
     * Sets the value of the kinvey_Backends1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setKinvey_Backends1__R(JAXBElement<QueryResultType> value) {
        this.kinvey_Backends1__R = value;
    }

    /**
     * Gets the value of the kinvey_Backends__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getKinvey_Backends__R() {
        return kinvey_Backends__R;
    }

    /**
     * Sets the value of the kinvey_Backends__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setKinvey_Backends__R(JAXBElement<QueryResultType> value) {
        this.kinvey_Backends__R = value;
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
     * Gets the value of the lastCURequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastCURequestDate() {
        return lastCURequestDate;
    }

    /**
     * Sets the value of the lastCURequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastCURequestDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastCURequestDate = value;
    }

    /**
     * Gets the value of the lastCUUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }

    /**
     * Sets the value of the lastCUUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastCUUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastCUUpdateDate = value;
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
     * Gets the value of the last_Login_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLast_Login_Date__C() {
        return last_Login_Date__C;
    }

    /**
     * Sets the value of the last_Login_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLast_Login_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.last_Login_Date__C = value;
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
     * Gets the value of the lifetime_Android_SDK_Downloads__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_Android_SDK_Downloads__C() {
        return lifetime_Android_SDK_Downloads__C;
    }

    /**
     * Sets the value of the lifetime_Android_SDK_Downloads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_Android_SDK_Downloads__C(JAXBElement<Double> value) {
        this.lifetime_Android_SDK_Downloads__C = value;
    }

    /**
     * Gets the value of the lifetime_Console_API_Calls__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_Console_API_Calls__C() {
        return lifetime_Console_API_Calls__C;
    }

    /**
     * Sets the value of the lifetime_Console_API_Calls__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_Console_API_Calls__C(JAXBElement<Double> value) {
        this.lifetime_Console_API_Calls__C = value;
    }

    /**
     * Gets the value of the lifetime_Days_With_1_API_Call__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_Days_With_1_API_Call__C() {
        return lifetime_Days_With_1_API_Call__C;
    }

    /**
     * Sets the value of the lifetime_Days_With_1_API_Call__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_Days_With_1_API_Call__C(JAXBElement<Double> value) {
        this.lifetime_Days_With_1_API_Call__C = value;
    }

    /**
     * Gets the value of the lifetime_Docs_Accessed__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_Docs_Accessed__C() {
        return lifetime_Docs_Accessed__C;
    }

    /**
     * Sets the value of the lifetime_Docs_Accessed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_Docs_Accessed__C(JAXBElement<Double> value) {
        this.lifetime_Docs_Accessed__C = value;
    }

    /**
     * Gets the value of the lifetime_JS_SDK_Downloads__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_JS_SDK_Downloads__C() {
        return lifetime_JS_SDK_Downloads__C;
    }

    /**
     * Sets the value of the lifetime_JS_SDK_Downloads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_JS_SDK_Downloads__C(JAXBElement<Double> value) {
        this.lifetime_JS_SDK_Downloads__C = value;
    }

    /**
     * Gets the value of the lifetime_KBes_Deleted__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_KBes_Deleted__C() {
        return lifetime_KBes_Deleted__C;
    }

    /**
     * Sets the value of the lifetime_KBes_Deleted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_KBes_Deleted__C(JAXBElement<Double> value) {
        this.lifetime_KBes_Deleted__C = value;
    }

    /**
     * Gets the value of the lifetime_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_KBes__C() {
        return lifetime_KBes__C;
    }

    /**
     * Sets the value of the lifetime_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_KBes__C(JAXBElement<Double> value) {
        this.lifetime_KBes__C = value;
    }

    /**
     * Gets the value of the lifetime_SDK_Downloads__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_SDK_Downloads__C() {
        return lifetime_SDK_Downloads__C;
    }

    /**
     * Sets the value of the lifetime_SDK_Downloads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_SDK_Downloads__C(JAXBElement<Double> value) {
        this.lifetime_SDK_Downloads__C = value;
    }

    /**
     * Gets the value of the lifetime_IOS_SDK_Downloads__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLifetime_IOS_SDK_Downloads__C() {
        return lifetime_IOS_SDK_Downloads__C;
    }

    /**
     * Sets the value of the lifetime_IOS_SDK_Downloads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLifetime_IOS_SDK_Downloads__C(JAXBElement<Double> value) {
        this.lifetime_IOS_SDK_Downloads__C = value;
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
     * Gets the value of the mtd_AU_Across_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMTD_AU_Across_All_KBes__C() {
        return mtd_AU_Across_All_KBes__C;
    }

    /**
     * Sets the value of the mtd_AU_Across_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMTD_AU_Across_All_KBes__C(JAXBElement<Double> value) {
        this.mtd_AU_Across_All_KBes__C = value;
    }

    /**
     * Gets the value of the made_1_API_Call_Yesterday__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMade_1_API_Call_Yesterday__C() {
        return made_1_API_Call_Yesterday__C;
    }

    /**
     * Sets the value of the made_1_API_Call_Yesterday__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMade_1_API_Call_Yesterday__C(JAXBElement<Boolean> value) {
        this.made_1_API_Call_Yesterday__C = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setMailingAddress(JAXBElement<AddressType> value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the mailingCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingCity() {
        return mailingCity;
    }

    /**
     * Sets the value of the mailingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingCity(JAXBElement<String> value) {
        this.mailingCity = value;
    }

    /**
     * Gets the value of the mailingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Sets the value of the mailingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingCountry(JAXBElement<String> value) {
        this.mailingCountry = value;
    }

    /**
     * Gets the value of the mailingLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMailingLatitude() {
        return mailingLatitude;
    }

    /**
     * Sets the value of the mailingLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMailingLatitude(JAXBElement<Double> value) {
        this.mailingLatitude = value;
    }

    /**
     * Gets the value of the mailingLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMailingLongitude() {
        return mailingLongitude;
    }

    /**
     * Sets the value of the mailingLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMailingLongitude(JAXBElement<Double> value) {
        this.mailingLongitude = value;
    }

    /**
     * Gets the value of the mailingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Sets the value of the mailingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingPostalCode(JAXBElement<String> value) {
        this.mailingPostalCode = value;
    }

    /**
     * Gets the value of the mailingState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingState() {
        return mailingState;
    }

    /**
     * Sets the value of the mailingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingState(JAXBElement<String> value) {
        this.mailingState = value;
    }

    /**
     * Gets the value of the mailingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingStreet() {
        return mailingStreet;
    }

    /**
     * Sets the value of the mailingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingStreet(JAXBElement<String> value) {
        this.mailingStreet = value;
    }

    /**
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setMasterRecord(JAXBElement<Contact> value) {
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
     * Gets the value of the most_Recent_Backend_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMost_Recent_Backend_Created__C() {
        return most_Recent_Backend_Created__C;
    }

    /**
     * Sets the value of the most_Recent_Backend_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMost_Recent_Backend_Created__C(JAXBElement<XMLGregorianCalendar> value) {
        this.most_Recent_Backend_Created__C = value;
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
     * Gets the value of the nonConsole_KCS_API_Calls_Lifetime__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonConsole_KCS_API_Calls_Lifetime__C() {
        return nonConsole_KCS_API_Calls_Lifetime__C;
    }

    /**
     * Sets the value of the nonConsole_KCS_API_Calls_Lifetime__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonConsole_KCS_API_Calls_Lifetime__C(JAXBElement<Double> value) {
        this.nonConsole_KCS_API_Calls_Lifetime__C = value;
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
     * Gets the value of the number_Current_Backends__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Current_Backends__C() {
        return number_Current_Backends__C;
    }

    /**
     * Sets the value of the number_Current_Backends__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Current_Backends__C(JAXBElement<Double> value) {
        this.number_Current_Backends__C = value;
    }

    /**
     * Gets the value of the number_Of_Active_Backends__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumber_Of_Active_Backends__C() {
        return number_Of_Active_Backends__C;
    }

    /**
     * Sets the value of the number_Of_Active_Backends__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumber_Of_Active_Backends__C(JAXBElement<Double> value) {
        this.number_Of_Active_Backends__C = value;
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
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunities(JAXBElement<QueryResultType> value) {
        this.opportunities = value;
    }

    /**
     * Gets the value of the opportunityContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunityContactRoles() {
        return opportunityContactRoles;
    }

    /**
     * Sets the value of the opportunityContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunityContactRoles(JAXBElement<QueryResultType> value) {
        this.opportunityContactRoles = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getOtherAddress() {
        return otherAddress;
    }

    /**
     * Sets the value of the otherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setOtherAddress(JAXBElement<AddressType> value) {
        this.otherAddress = value;
    }

    /**
     * Gets the value of the otherCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherCity() {
        return otherCity;
    }

    /**
     * Sets the value of the otherCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherCity(JAXBElement<String> value) {
        this.otherCity = value;
    }

    /**
     * Gets the value of the otherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherCountry() {
        return otherCountry;
    }

    /**
     * Sets the value of the otherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherCountry(JAXBElement<String> value) {
        this.otherCountry = value;
    }

    /**
     * Gets the value of the otherLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOtherLatitude() {
        return otherLatitude;
    }

    /**
     * Sets the value of the otherLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOtherLatitude(JAXBElement<Double> value) {
        this.otherLatitude = value;
    }

    /**
     * Gets the value of the otherLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOtherLongitude() {
        return otherLongitude;
    }

    /**
     * Sets the value of the otherLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOtherLongitude(JAXBElement<Double> value) {
        this.otherLongitude = value;
    }

    /**
     * Gets the value of the otherPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the value of the otherPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPhone(JAXBElement<String> value) {
        this.otherPhone = value;
    }

    /**
     * Gets the value of the otherPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPostalCode() {
        return otherPostalCode;
    }

    /**
     * Sets the value of the otherPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPostalCode(JAXBElement<String> value) {
        this.otherPostalCode = value;
    }

    /**
     * Gets the value of the otherState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherState() {
        return otherState;
    }

    /**
     * Sets the value of the otherState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherState(JAXBElement<String> value) {
        this.otherState = value;
    }

    /**
     * Gets the value of the otherStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherStreet() {
        return otherStreet;
    }

    /**
     * Sets the value of the otherStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherStreet(JAXBElement<String> value) {
        this.otherStreet = value;
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
     * Gets the value of the reportsTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getReportsTo() {
        return reportsTo;
    }

    /**
     * Sets the value of the reportsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setReportsTo(JAXBElement<Contact> value) {
        this.reportsTo = value;
    }

    /**
     * Gets the value of the reportsToId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportsToId() {
        return reportsToId;
    }

    /**
     * Sets the value of the reportsToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportsToId(JAXBElement<String> value) {
        this.reportsToId = value;
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
     * Gets the value of the signup_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSignup_Timestamp__C() {
        return signup_Timestamp__C;
    }

    /**
     * Sets the value of the signup_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSignup_Timestamp__C(JAXBElement<XMLGregorianCalendar> value) {
        this.signup_Timestamp__C = value;
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
     * Gets the value of the storage_Charges_All_KBEs__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStorage_Charges_All_KBEs__C() {
        return storage_Charges_All_KBEs__C;
    }

    /**
     * Sets the value of the storage_Charges_All_KBEs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStorage_Charges_All_KBEs__C(JAXBElement<Double> value) {
        this.storage_Charges_All_KBEs__C = value;
    }

    /**
     * Gets the value of the storage_Charges_Last_Month_All_KBes__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStorage_Charges_Last_Month_All_KBes__C() {
        return storage_Charges_Last_Month_All_KBes__C;
    }

    /**
     * Sets the value of the storage_Charges_Last_Month_All_KBes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStorage_Charges_Last_Month_All_KBes__C(JAXBElement<Double> value) {
        this.storage_Charges_Last_Month_All_KBes__C = value;
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
     * Gets the value of the time_Last_Backend_Deleted__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTime_Last_Backend_Deleted__C() {
        return time_Last_Backend_Deleted__C;
    }

    /**
     * Sets the value of the time_Last_Backend_Deleted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTime_Last_Backend_Deleted__C(JAXBElement<XMLGregorianCalendar> value) {
        this.time_Last_Backend_Deleted__C = value;
    }

    /**
     * Gets the value of the time_Of_1St_SDK_Download__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTime_Of_1St_SDK_Download__C() {
        return time_Of_1St_SDK_Download__C;
    }

    /**
     * Sets the value of the time_Of_1St_SDK_Download__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTime_Of_1St_SDK_Download__C(JAXBElement<XMLGregorianCalendar> value) {
        this.time_Of_1St_SDK_Download__C = value;
    }

    /**
     * Gets the value of the time_Of_Most_Recent_SDK_Download__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTime_Of_Most_Recent_SDK_Download__C() {
        return time_Of_Most_Recent_SDK_Download__C;
    }

    /**
     * Sets the value of the time_Of_Most_Recent_SDK_Download__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTime_Of_Most_Recent_SDK_Download__C(JAXBElement<XMLGregorianCalendar> value) {
        this.time_Of_Most_Recent_SDK_Download__C = value;
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
     * Gets the value of the who_I_M_Building_For__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWho_I_M_Building_For__C() {
        return who_I_M_Building_For__C;
    }

    /**
     * Sets the value of the who_I_M_Building_For__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWho_I_M_Building_For__C(JAXBElement<String> value) {
        this.who_I_M_Building_For__C = value;
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

    /**
     * Gets the value of the why_I_Build__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getWhy_I_Build__C() {
        return why_I_Build__C;
    }

    /**
     * Sets the value of the why_I_Build__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setWhy_I_Build__C(JAXBElement<Double> value) {
        this.why_I_Build__C = value;
    }

}
