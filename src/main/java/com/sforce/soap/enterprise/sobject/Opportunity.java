
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AccountPartners" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AttachedContentDocuments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaign__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaign__r" type="{urn:sobject.enterprise.soap.sforce.com}BBP__Campaign_Members__c" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaigns__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="BBP__BuzzBuilder_Campaigns__r" type="{urn:sobject.enterprise.soap.sforce.com}BBP__BuzzBuilder_Campaigns__c" minOccurs="0"/>
 *         &lt;element name="BBP__CurrentGenerators__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBP__DeliveryInstallationStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBP__MainCompetitors__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBP__OrderNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBP__TrackingNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:sobject.enterprise.soap.sforce.com}Campaign" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deskcom__Desk_Cases__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Edition__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Fiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalQuarter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ForecastCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasOpportunityLineItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitors" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityLineItems" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityPartnersFrom" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Partner_Involved__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Partner_Involved__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Partner_Involvement__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partners" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Pricebook2" type="{urn:sobject.enterprise.soap.sforce.com}Pricebook2" minOccurs="0"/>
 *         &lt;element name="Pricebook2Id" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Probability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Reason_for_Closed_Lost__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HggrEAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HggwEAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001Hgh5EAC__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HghAEAS__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SFGA__R00N40000001HghEEAS__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Services_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="StageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subscription_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Subscription_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Subscription_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tags" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Total_Deal_Value__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "account",
    "accountId",
    "accountPartners",
    "activityHistories",
    "amount",
    "attachedContentDocuments",
    "attachments",
    "bbp__BuzzBuilder_Campaign__C",
    "bbp__BuzzBuilder_Campaign__R",
    "bbp__BuzzBuilder_Campaigns__C",
    "bbp__BuzzBuilder_Campaigns__R",
    "bbp__CurrentGenerators__C",
    "bbp__DeliveryInstallationStatus__C",
    "bbp__MainCompetitors__C",
    "bbp__OrderNumber__C",
    "bbp__TrackingNumber__C",
    "campaign",
    "campaignId",
    "closeDate",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "deskcom__Desk_Cases__R",
    "edition__C",
    "events",
    "feedSubscriptionsForEntity",
    "feeds",
    "fiscal",
    "fiscalQuarter",
    "fiscalYear",
    "forecastCategory",
    "forecastCategoryName",
    "hasOpportunityLineItem",
    "histories",
    "isClosed",
    "isDeleted",
    "isWon",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "leadSource",
    "lookedUpFromActivities",
    "name",
    "nextStep",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "opportunityCompetitors",
    "opportunityContactRoles",
    "opportunityHistories",
    "opportunityLineItems",
    "opportunityPartnersFrom",
    "owner",
    "ownerId",
    "partner_Involved__C",
    "partner_Involved__R",
    "partner_Involvement__C",
    "partners",
    "pricebook2",
    "pricebook2Id",
    "probability",
    "processInstances",
    "processSteps",
    "reason_For_Closed_Lost__C",
    "sfga__R00N40000001HggrEAC__R",
    "sfga__R00N40000001HggwEAC__R",
    "sfga__R00N40000001Hgh5EAC__R",
    "sfga__R00N40000001HghAEAS__R",
    "sfga__R00N40000001HghEEAS__R",
    "services_Total__C",
    "shares",
    "stageName",
    "subscription_End_Date__C",
    "subscription_Start_Date__C",
    "subscription_Total__C",
    "systemModstamp",
    "tags",
    "tasks",
    "topicAssignments",
    "total_Deal_Value__C",
    "type",
    "userRecordAccess"
})
public class Opportunity
    extends SObject
{

    @XmlElementRef(name = "Account", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Account> account;
    @XmlElementRef(name = "AccountId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountId;
    @XmlElementRef(name = "AccountPartners", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> accountPartners;
    @XmlElementRef(name = "ActivityHistories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> activityHistories;
    @XmlElementRef(name = "Amount", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> amount;
    @XmlElementRef(name = "AttachedContentDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachedContentDocuments;
    @XmlElementRef(name = "Attachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> attachments;
    @XmlElementRef(name = "BBP__BuzzBuilder_Campaign__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__BuzzBuilder_Campaign__C;
    @XmlElementRef(name = "BBP__BuzzBuilder_Campaign__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BBP__Campaign_Members__C> bbp__BuzzBuilder_Campaign__R;
    @XmlElementRef(name = "BBP__BuzzBuilder_Campaigns__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__BuzzBuilder_Campaigns__C;
    @XmlElementRef(name = "BBP__BuzzBuilder_Campaigns__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BBP__BuzzBuilder_Campaigns__C> bbp__BuzzBuilder_Campaigns__R;
    @XmlElementRef(name = "BBP__CurrentGenerators__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__CurrentGenerators__C;
    @XmlElementRef(name = "BBP__DeliveryInstallationStatus__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__DeliveryInstallationStatus__C;
    @XmlElementRef(name = "BBP__MainCompetitors__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__MainCompetitors__C;
    @XmlElementRef(name = "BBP__OrderNumber__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__OrderNumber__C;
    @XmlElementRef(name = "BBP__TrackingNumber__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bbp__TrackingNumber__C;
    @XmlElementRef(name = "Campaign", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Campaign> campaign;
    @XmlElementRef(name = "CampaignId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignId;
    @XmlElementRef(name = "CloseDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closeDate;
    @XmlElementRef(name = "CombinedAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> combinedAttachments;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Description", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Deskcom__Desk_Cases__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> deskcom__Desk_Cases__R;
    @XmlElementRef(name = "Edition__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> edition__C;
    @XmlElementRef(name = "Events", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> events;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "Feeds", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feeds;
    @XmlElementRef(name = "Fiscal", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiscal;
    @XmlElementRef(name = "FiscalQuarter", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fiscalQuarter;
    @XmlElementRef(name = "FiscalYear", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fiscalYear;
    @XmlElementRef(name = "ForecastCategory", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastCategory;
    @XmlElementRef(name = "ForecastCategoryName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastCategoryName;
    @XmlElementRef(name = "HasOpportunityLineItem", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasOpportunityLineItem;
    @XmlElementRef(name = "Histories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> histories;
    @XmlElementRef(name = "IsClosed", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isClosed;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "IsWon", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWon;
    @XmlElementRef(name = "LastActivityDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastActivityDate;
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
    @XmlElementRef(name = "LeadSource", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadSource;
    @XmlElementRef(name = "LookedUpFromActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> lookedUpFromActivities;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NextStep", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextStep;
    @XmlElementRef(name = "Notes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notes;
    @XmlElementRef(name = "NotesAndAttachments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> notesAndAttachments;
    @XmlElementRef(name = "OpenActivities", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> openActivities;
    @XmlElementRef(name = "OpportunityCompetitors", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityCompetitors;
    @XmlElementRef(name = "OpportunityContactRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityContactRoles;
    @XmlElementRef(name = "OpportunityHistories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityHistories;
    @XmlElementRef(name = "OpportunityLineItems", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityLineItems;
    @XmlElementRef(name = "OpportunityPartnersFrom", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> opportunityPartnersFrom;
    @XmlElementRef(name = "Owner", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> owner;
    @XmlElementRef(name = "OwnerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerId;
    @XmlElementRef(name = "Partner_Involved__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partner_Involved__C;
    @XmlElementRef(name = "Partner_Involved__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Account> partner_Involved__R;
    @XmlElementRef(name = "Partner_Involvement__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partner_Involvement__C;
    @XmlElementRef(name = "Partners", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> partners;
    @XmlElementRef(name = "Pricebook2", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Pricebook2> pricebook2;
    @XmlElementRef(name = "Pricebook2Id", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pricebook2Id;
    @XmlElementRef(name = "Probability", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> probability;
    @XmlElementRef(name = "ProcessInstances", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processInstances;
    @XmlElementRef(name = "ProcessSteps", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> processSteps;
    @XmlElementRef(name = "Reason_for_Closed_Lost__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason_For_Closed_Lost__C;
    @XmlElementRef(name = "SFGA__R00N40000001HggrEAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HggrEAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001HggwEAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HggwEAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001Hgh5EAC__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001Hgh5EAC__R;
    @XmlElementRef(name = "SFGA__R00N40000001HghAEAS__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HghAEAS__R;
    @XmlElementRef(name = "SFGA__R00N40000001HghEEAS__r", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> sfga__R00N40000001HghEEAS__R;
    @XmlElementRef(name = "Services_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> services_Total__C;
    @XmlElementRef(name = "Shares", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> shares;
    @XmlElementRef(name = "StageName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stageName;
    @XmlElementRef(name = "Subscription_End_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> subscription_End_Date__C;
    @XmlElementRef(name = "Subscription_Start_Date__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> subscription_Start_Date__C;
    @XmlElementRef(name = "Subscription_Total__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> subscription_Total__C;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Tags", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tags;
    @XmlElementRef(name = "Tasks", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> tasks;
    @XmlElementRef(name = "TopicAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> topicAssignments;
    @XmlElementRef(name = "Total_Deal_Value__c", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> total_Deal_Value__C;
    @XmlElementRef(name = "Type", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "UserRecordAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRecordAccess> userRecordAccess;

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
     * Gets the value of the accountPartners property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAccountPartners() {
        return accountPartners;
    }

    /**
     * Sets the value of the accountPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAccountPartners(JAXBElement<QueryResultType> value) {
        this.accountPartners = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAmount(JAXBElement<Double> value) {
        this.amount = value;
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
     * Gets the value of the bbp__BuzzBuilder_Campaign__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__BuzzBuilder_Campaign__C() {
        return bbp__BuzzBuilder_Campaign__C;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Campaign__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Campaign__C(JAXBElement<String> value) {
        this.bbp__BuzzBuilder_Campaign__C = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Campaign__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BBP__Campaign_Members__C }{@code >}
     *     
     */
    public JAXBElement<BBP__Campaign_Members__C> getBBP__BuzzBuilder_Campaign__R() {
        return bbp__BuzzBuilder_Campaign__R;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Campaign__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BBP__Campaign_Members__C }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Campaign__R(JAXBElement<BBP__Campaign_Members__C> value) {
        this.bbp__BuzzBuilder_Campaign__R = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Campaigns__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__BuzzBuilder_Campaigns__C() {
        return bbp__BuzzBuilder_Campaigns__C;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Campaigns__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Campaigns__C(JAXBElement<String> value) {
        this.bbp__BuzzBuilder_Campaigns__C = value;
    }

    /**
     * Gets the value of the bbp__BuzzBuilder_Campaigns__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BBP__BuzzBuilder_Campaigns__C }{@code >}
     *     
     */
    public JAXBElement<BBP__BuzzBuilder_Campaigns__C> getBBP__BuzzBuilder_Campaigns__R() {
        return bbp__BuzzBuilder_Campaigns__R;
    }

    /**
     * Sets the value of the bbp__BuzzBuilder_Campaigns__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BBP__BuzzBuilder_Campaigns__C }{@code >}
     *     
     */
    public void setBBP__BuzzBuilder_Campaigns__R(JAXBElement<BBP__BuzzBuilder_Campaigns__C> value) {
        this.bbp__BuzzBuilder_Campaigns__R = value;
    }

    /**
     * Gets the value of the bbp__CurrentGenerators__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__CurrentGenerators__C() {
        return bbp__CurrentGenerators__C;
    }

    /**
     * Sets the value of the bbp__CurrentGenerators__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__CurrentGenerators__C(JAXBElement<String> value) {
        this.bbp__CurrentGenerators__C = value;
    }

    /**
     * Gets the value of the bbp__DeliveryInstallationStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__DeliveryInstallationStatus__C() {
        return bbp__DeliveryInstallationStatus__C;
    }

    /**
     * Sets the value of the bbp__DeliveryInstallationStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__DeliveryInstallationStatus__C(JAXBElement<String> value) {
        this.bbp__DeliveryInstallationStatus__C = value;
    }

    /**
     * Gets the value of the bbp__MainCompetitors__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__MainCompetitors__C() {
        return bbp__MainCompetitors__C;
    }

    /**
     * Sets the value of the bbp__MainCompetitors__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__MainCompetitors__C(JAXBElement<String> value) {
        this.bbp__MainCompetitors__C = value;
    }

    /**
     * Gets the value of the bbp__OrderNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__OrderNumber__C() {
        return bbp__OrderNumber__C;
    }

    /**
     * Sets the value of the bbp__OrderNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__OrderNumber__C(JAXBElement<String> value) {
        this.bbp__OrderNumber__C = value;
    }

    /**
     * Gets the value of the bbp__TrackingNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBP__TrackingNumber__C() {
        return bbp__TrackingNumber__C;
    }

    /**
     * Sets the value of the bbp__TrackingNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBP__TrackingNumber__C(JAXBElement<String> value) {
        this.bbp__TrackingNumber__C = value;
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
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignId(JAXBElement<String> value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.closeDate = value;
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
     * Gets the value of the fiscal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscal() {
        return fiscal;
    }

    /**
     * Sets the value of the fiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscal(JAXBElement<String> value) {
        this.fiscal = value;
    }

    /**
     * Gets the value of the fiscalQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFiscalQuarter() {
        return fiscalQuarter;
    }

    /**
     * Sets the value of the fiscalQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFiscalQuarter(JAXBElement<Integer> value) {
        this.fiscalQuarter = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFiscalYear(JAXBElement<Integer> value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the forecastCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastCategory() {
        return forecastCategory;
    }

    /**
     * Sets the value of the forecastCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastCategory(JAXBElement<String> value) {
        this.forecastCategory = value;
    }

    /**
     * Gets the value of the forecastCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastCategoryName() {
        return forecastCategoryName;
    }

    /**
     * Sets the value of the forecastCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastCategoryName(JAXBElement<String> value) {
        this.forecastCategoryName = value;
    }

    /**
     * Gets the value of the hasOpportunityLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasOpportunityLineItem() {
        return hasOpportunityLineItem;
    }

    /**
     * Sets the value of the hasOpportunityLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasOpportunityLineItem(JAXBElement<Boolean> value) {
        this.hasOpportunityLineItem = value;
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
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsClosed(JAXBElement<Boolean> value) {
        this.isClosed = value;
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
     * Gets the value of the isWon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWon() {
        return isWon;
    }

    /**
     * Sets the value of the isWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWon(JAXBElement<Boolean> value) {
        this.isWon = value;
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
     * Gets the value of the nextStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextStep() {
        return nextStep;
    }

    /**
     * Sets the value of the nextStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextStep(JAXBElement<String> value) {
        this.nextStep = value;
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
     * Gets the value of the opportunityCompetitors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunityCompetitors() {
        return opportunityCompetitors;
    }

    /**
     * Sets the value of the opportunityCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunityCompetitors(JAXBElement<QueryResultType> value) {
        this.opportunityCompetitors = value;
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
     * Gets the value of the opportunityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunityHistories() {
        return opportunityHistories;
    }

    /**
     * Sets the value of the opportunityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunityHistories(JAXBElement<QueryResultType> value) {
        this.opportunityHistories = value;
    }

    /**
     * Gets the value of the opportunityLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunityLineItems() {
        return opportunityLineItems;
    }

    /**
     * Sets the value of the opportunityLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunityLineItems(JAXBElement<QueryResultType> value) {
        this.opportunityLineItems = value;
    }

    /**
     * Gets the value of the opportunityPartnersFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getOpportunityPartnersFrom() {
        return opportunityPartnersFrom;
    }

    /**
     * Sets the value of the opportunityPartnersFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setOpportunityPartnersFrom(JAXBElement<QueryResultType> value) {
        this.opportunityPartnersFrom = value;
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
     * Gets the value of the partner_Involved__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartner_Involved__C() {
        return partner_Involved__C;
    }

    /**
     * Sets the value of the partner_Involved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartner_Involved__C(JAXBElement<String> value) {
        this.partner_Involved__C = value;
    }

    /**
     * Gets the value of the partner_Involved__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public JAXBElement<Account> getPartner_Involved__R() {
        return partner_Involved__R;
    }

    /**
     * Sets the value of the partner_Involved__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     
     */
    public void setPartner_Involved__R(JAXBElement<Account> value) {
        this.partner_Involved__R = value;
    }

    /**
     * Gets the value of the partner_Involvement__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartner_Involvement__C() {
        return partner_Involvement__C;
    }

    /**
     * Sets the value of the partner_Involvement__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartner_Involvement__C(JAXBElement<String> value) {
        this.partner_Involvement__C = value;
    }

    /**
     * Gets the value of the partners property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getPartners() {
        return partners;
    }

    /**
     * Sets the value of the partners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setPartners(JAXBElement<QueryResultType> value) {
        this.partners = value;
    }

    /**
     * Gets the value of the pricebook2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Pricebook2 }{@code >}
     *     
     */
    public JAXBElement<Pricebook2> getPricebook2() {
        return pricebook2;
    }

    /**
     * Sets the value of the pricebook2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Pricebook2 }{@code >}
     *     
     */
    public void setPricebook2(JAXBElement<Pricebook2> value) {
        this.pricebook2 = value;
    }

    /**
     * Gets the value of the pricebook2Id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPricebook2Id() {
        return pricebook2Id;
    }

    /**
     * Sets the value of the pricebook2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPricebook2Id(JAXBElement<String> value) {
        this.pricebook2Id = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setProbability(JAXBElement<Double> value) {
        this.probability = value;
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
     * Gets the value of the reason_For_Closed_Lost__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason_For_Closed_Lost__C() {
        return reason_For_Closed_Lost__C;
    }

    /**
     * Sets the value of the reason_For_Closed_Lost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason_For_Closed_Lost__C(JAXBElement<String> value) {
        this.reason_For_Closed_Lost__C = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HggrEAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HggrEAC__R() {
        return sfga__R00N40000001HggrEAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HggrEAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HggrEAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HggrEAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HggwEAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HggwEAC__R() {
        return sfga__R00N40000001HggwEAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HggwEAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HggwEAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HggwEAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001Hgh5EAC__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001Hgh5EAC__R() {
        return sfga__R00N40000001Hgh5EAC__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001Hgh5EAC__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001Hgh5EAC__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001Hgh5EAC__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HghAEAS__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HghAEAS__R() {
        return sfga__R00N40000001HghAEAS__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HghAEAS__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HghAEAS__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HghAEAS__R = value;
    }

    /**
     * Gets the value of the sfga__R00N40000001HghEEAS__R property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSFGA__R00N40000001HghEEAS__R() {
        return sfga__R00N40000001HghEEAS__R;
    }

    /**
     * Sets the value of the sfga__R00N40000001HghEEAS__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSFGA__R00N40000001HghEEAS__R(JAXBElement<QueryResultType> value) {
        this.sfga__R00N40000001HghEEAS__R = value;
    }

    /**
     * Gets the value of the services_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getServices_Total__C() {
        return services_Total__C;
    }

    /**
     * Sets the value of the services_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setServices_Total__C(JAXBElement<Double> value) {
        this.services_Total__C = value;
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
     * Gets the value of the stageName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStageName() {
        return stageName;
    }

    /**
     * Sets the value of the stageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStageName(JAXBElement<String> value) {
        this.stageName = value;
    }

    /**
     * Gets the value of the subscription_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSubscription_End_Date__C() {
        return subscription_End_Date__C;
    }

    /**
     * Sets the value of the subscription_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSubscription_End_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.subscription_End_Date__C = value;
    }

    /**
     * Gets the value of the subscription_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSubscription_Start_Date__C() {
        return subscription_Start_Date__C;
    }

    /**
     * Sets the value of the subscription_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSubscription_Start_Date__C(JAXBElement<XMLGregorianCalendar> value) {
        this.subscription_Start_Date__C = value;
    }

    /**
     * Gets the value of the subscription_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSubscription_Total__C() {
        return subscription_Total__C;
    }

    /**
     * Sets the value of the subscription_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSubscription_Total__C(JAXBElement<Double> value) {
        this.subscription_Total__C = value;
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
     * Gets the value of the total_Deal_Value__C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotal_Deal_Value__C() {
        return total_Deal_Value__C;
    }

    /**
     * Sets the value of the total_Deal_Value__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotal_Deal_Value__C(JAXBElement<Double> value) {
        this.total_Deal_Value__C = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
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

}
