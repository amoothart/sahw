
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResultType;


/**
 * <p>Java class for PermissionSetLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetLicense">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsActivateContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAllowEmailIC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsApiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsApiUserOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAssignPermissionSets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAssignTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAuthorApex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsBulkApiHardDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCanInsertFeedSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCanUseNewDashboardBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsChatterFileLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsChatterForSharePoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsChatterInternalUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsChatterInviteExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsChatterOwnGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsConnectOrgToEnvironmentHub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsContentAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsConvertLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateCustomizeFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreatePackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateWorkspaces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomMobileAppsAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomSidebarOnAllPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomizeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDataExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDeleteActivatedContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDeleteTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDistributeFromPersWksp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditBrandTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditCaseComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditHtmlTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditOppLineItemUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditPublicDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditPublicTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditReadonlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailMass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailSingle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailTemplateManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEnableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsExportReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsFlowUFLRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsForceTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsIdentityConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsIdentityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsImportLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsImportPersonal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsInboundMigrationToolsUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsInstallPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageAnalyticSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageAuthProviders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageBusinessHourHolidays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCallCenters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageChatterMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCssUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCustomReportTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDataIntegrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageEmailClientConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageInteraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageInternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageIpAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageLoginAccessPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManagePasswordPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageProfilesPermissionsets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageRemoteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSelfService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageUnlistedGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsMassInlineEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsModerateChatter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsModifyAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsNewReportBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsOutboundMigrationToolsUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsPasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsPublishPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsResetPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsRunFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsRunReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsScheduleJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsSendSitRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsSolutionImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTagManager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyLead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTwoFactorApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsUseTeamReassignWizards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewAllUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewEncryptedData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewHelpLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewMyTeamsDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionSetLicenseAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PermissionSetLicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UsedLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetLicense", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "developerName",
    "expirationDate",
    "isDeleted",
    "language",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "masterLabel",
    "maximumPermissionsActivateContract",
    "maximumPermissionsAllowEmailIC",
    "maximumPermissionsApiEnabled",
    "maximumPermissionsApiUserOnly",
    "maximumPermissionsAssignPermissionSets",
    "maximumPermissionsAssignTopics",
    "maximumPermissionsAuthorApex",
    "maximumPermissionsBulkApiHardDelete",
    "maximumPermissionsCanInsertFeedSystemFields",
    "maximumPermissionsCanUseNewDashboardBuilder",
    "maximumPermissionsChatterFileLink",
    "maximumPermissionsChatterForSharePoint",
    "maximumPermissionsChatterInternalUser",
    "maximumPermissionsChatterInviteExternalUsers",
    "maximumPermissionsChatterOwnGroups",
    "maximumPermissionsConnectOrgToEnvironmentHub",
    "maximumPermissionsContentAdministrator",
    "maximumPermissionsConvertLeads",
    "maximumPermissionsCreateCustomizeFilters",
    "maximumPermissionsCreatePackaging",
    "maximumPermissionsCreateTopics",
    "maximumPermissionsCreateWorkspaces",
    "maximumPermissionsCustomMobileAppsAccess",
    "maximumPermissionsCustomSidebarOnAllPages",
    "maximumPermissionsCustomizeApplication",
    "maximumPermissionsDataExport",
    "maximumPermissionsDeleteActivatedContract",
    "maximumPermissionsDeleteTopics",
    "maximumPermissionsDistributeFromPersWksp",
    "maximumPermissionsEditBrandTemplates",
    "maximumPermissionsEditCaseComments",
    "maximumPermissionsEditEvent",
    "maximumPermissionsEditHtmlTemplates",
    "maximumPermissionsEditOppLineItemUnitPrice",
    "maximumPermissionsEditPublicDocuments",
    "maximumPermissionsEditPublicTemplates",
    "maximumPermissionsEditReadonlyFields",
    "maximumPermissionsEditReports",
    "maximumPermissionsEditTask",
    "maximumPermissionsEditTopics",
    "maximumPermissionsEmailAdministration",
    "maximumPermissionsEmailMass",
    "maximumPermissionsEmailSingle",
    "maximumPermissionsEmailTemplateManagement",
    "maximumPermissionsEnableNotifications",
    "maximumPermissionsExportReport",
    "maximumPermissionsFlowUFLRequired",
    "maximumPermissionsForceTwoFactor",
    "maximumPermissionsIdentityConnect",
    "maximumPermissionsIdentityEnabled",
    "maximumPermissionsImportLeads",
    "maximumPermissionsImportPersonal",
    "maximumPermissionsInboundMigrationToolsUser",
    "maximumPermissionsInstallPackaging",
    "maximumPermissionsManageAnalyticSnapshots",
    "maximumPermissionsManageAuthProviders",
    "maximumPermissionsManageBusinessHourHolidays",
    "maximumPermissionsManageCallCenters",
    "maximumPermissionsManageCases",
    "maximumPermissionsManageCategories",
    "maximumPermissionsManageChatterMessages",
    "maximumPermissionsManageContentPermissions",
    "maximumPermissionsManageContentProperties",
    "maximumPermissionsManageContentTypes",
    "maximumPermissionsManageCssUsers",
    "maximumPermissionsManageCustomReportTypes",
    "maximumPermissionsManageDashboards",
    "maximumPermissionsManageDataCategories",
    "maximumPermissionsManageDataIntegrations",
    "maximumPermissionsManageEmailClientConfig",
    "maximumPermissionsManageInteraction",
    "maximumPermissionsManageInternalUsers",
    "maximumPermissionsManageIpAddresses",
    "maximumPermissionsManageLeads",
    "maximumPermissionsManageLoginAccessPolicies",
    "maximumPermissionsManageMobile",
    "maximumPermissionsManagePasswordPolicies",
    "maximumPermissionsManageProfilesPermissionsets",
    "maximumPermissionsManageRemoteAccess",
    "maximumPermissionsManageRoles",
    "maximumPermissionsManageSelfService",
    "maximumPermissionsManageSharing",
    "maximumPermissionsManageSolutions",
    "maximumPermissionsManageTwoFactor",
    "maximumPermissionsManageUnlistedGroups",
    "maximumPermissionsManageUsers",
    "maximumPermissionsMassInlineEdit",
    "maximumPermissionsModerateChatter",
    "maximumPermissionsModifyAllData",
    "maximumPermissionsNewReportBuilder",
    "maximumPermissionsOutboundMigrationToolsUser",
    "maximumPermissionsPasswordNeverExpires",
    "maximumPermissionsPublishPackaging",
    "maximumPermissionsResetPasswords",
    "maximumPermissionsRunFlow",
    "maximumPermissionsRunReports",
    "maximumPermissionsScheduleJob",
    "maximumPermissionsScheduleReports",
    "maximumPermissionsSendSitRequests",
    "maximumPermissionsSolutionImport",
    "maximumPermissionsTagManager",
    "maximumPermissionsTransferAnyCase",
    "maximumPermissionsTransferAnyEntity",
    "maximumPermissionsTransferAnyLead",
    "maximumPermissionsTwoFactorApi",
    "maximumPermissionsUseTeamReassignWizards",
    "maximumPermissionsViewAllData",
    "maximumPermissionsViewAllUsers",
    "maximumPermissionsViewContent",
    "maximumPermissionsViewDataCategories",
    "maximumPermissionsViewEncryptedData",
    "maximumPermissionsViewHelpLink",
    "maximumPermissionsViewMyTeamsDashboards",
    "maximumPermissionsViewSetup",
    "permissionSetLicenseAssignments",
    "permissionSetLicenseKey",
    "status",
    "systemModstamp",
    "totalLicenses",
    "usedLicenses"
})
public class PermissionSetLicense
    extends SObject
{

    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "ExpirationDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationDate;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "Language", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "MasterLabel", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterLabel;
    @XmlElementRef(name = "MaximumPermissionsActivateContract", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsActivateContract;
    @XmlElementRef(name = "MaximumPermissionsAllowEmailIC", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsAllowEmailIC;
    @XmlElementRef(name = "MaximumPermissionsApiEnabled", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsApiEnabled;
    @XmlElementRef(name = "MaximumPermissionsApiUserOnly", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsApiUserOnly;
    @XmlElementRef(name = "MaximumPermissionsAssignPermissionSets", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsAssignPermissionSets;
    @XmlElementRef(name = "MaximumPermissionsAssignTopics", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsAssignTopics;
    @XmlElementRef(name = "MaximumPermissionsAuthorApex", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsAuthorApex;
    @XmlElementRef(name = "MaximumPermissionsBulkApiHardDelete", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsBulkApiHardDelete;
    @XmlElementRef(name = "MaximumPermissionsCanInsertFeedSystemFields", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCanInsertFeedSystemFields;
    @XmlElementRef(name = "MaximumPermissionsCanUseNewDashboardBuilder", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCanUseNewDashboardBuilder;
    @XmlElementRef(name = "MaximumPermissionsChatterFileLink", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsChatterFileLink;
    @XmlElementRef(name = "MaximumPermissionsChatterForSharePoint", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsChatterForSharePoint;
    @XmlElementRef(name = "MaximumPermissionsChatterInternalUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsChatterInternalUser;
    @XmlElementRef(name = "MaximumPermissionsChatterInviteExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsChatterInviteExternalUsers;
    @XmlElementRef(name = "MaximumPermissionsChatterOwnGroups", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsChatterOwnGroups;
    @XmlElementRef(name = "MaximumPermissionsConnectOrgToEnvironmentHub", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsConnectOrgToEnvironmentHub;
    @XmlElementRef(name = "MaximumPermissionsContentAdministrator", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsContentAdministrator;
    @XmlElementRef(name = "MaximumPermissionsConvertLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsConvertLeads;
    @XmlElementRef(name = "MaximumPermissionsCreateCustomizeFilters", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCreateCustomizeFilters;
    @XmlElementRef(name = "MaximumPermissionsCreatePackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCreatePackaging;
    @XmlElementRef(name = "MaximumPermissionsCreateTopics", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCreateTopics;
    @XmlElementRef(name = "MaximumPermissionsCreateWorkspaces", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCreateWorkspaces;
    @XmlElementRef(name = "MaximumPermissionsCustomMobileAppsAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCustomMobileAppsAccess;
    @XmlElementRef(name = "MaximumPermissionsCustomSidebarOnAllPages", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCustomSidebarOnAllPages;
    @XmlElementRef(name = "MaximumPermissionsCustomizeApplication", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsCustomizeApplication;
    @XmlElementRef(name = "MaximumPermissionsDataExport", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsDataExport;
    @XmlElementRef(name = "MaximumPermissionsDeleteActivatedContract", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsDeleteActivatedContract;
    @XmlElementRef(name = "MaximumPermissionsDeleteTopics", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsDeleteTopics;
    @XmlElementRef(name = "MaximumPermissionsDistributeFromPersWksp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsDistributeFromPersWksp;
    @XmlElementRef(name = "MaximumPermissionsEditBrandTemplates", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditBrandTemplates;
    @XmlElementRef(name = "MaximumPermissionsEditCaseComments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditCaseComments;
    @XmlElementRef(name = "MaximumPermissionsEditEvent", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditEvent;
    @XmlElementRef(name = "MaximumPermissionsEditHtmlTemplates", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditHtmlTemplates;
    @XmlElementRef(name = "MaximumPermissionsEditOppLineItemUnitPrice", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditOppLineItemUnitPrice;
    @XmlElementRef(name = "MaximumPermissionsEditPublicDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditPublicDocuments;
    @XmlElementRef(name = "MaximumPermissionsEditPublicTemplates", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditPublicTemplates;
    @XmlElementRef(name = "MaximumPermissionsEditReadonlyFields", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditReadonlyFields;
    @XmlElementRef(name = "MaximumPermissionsEditReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditReports;
    @XmlElementRef(name = "MaximumPermissionsEditTask", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditTask;
    @XmlElementRef(name = "MaximumPermissionsEditTopics", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEditTopics;
    @XmlElementRef(name = "MaximumPermissionsEmailAdministration", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEmailAdministration;
    @XmlElementRef(name = "MaximumPermissionsEmailMass", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEmailMass;
    @XmlElementRef(name = "MaximumPermissionsEmailSingle", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEmailSingle;
    @XmlElementRef(name = "MaximumPermissionsEmailTemplateManagement", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEmailTemplateManagement;
    @XmlElementRef(name = "MaximumPermissionsEnableNotifications", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsEnableNotifications;
    @XmlElementRef(name = "MaximumPermissionsExportReport", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsExportReport;
    @XmlElementRef(name = "MaximumPermissionsFlowUFLRequired", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsFlowUFLRequired;
    @XmlElementRef(name = "MaximumPermissionsForceTwoFactor", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsForceTwoFactor;
    @XmlElementRef(name = "MaximumPermissionsIdentityConnect", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsIdentityConnect;
    @XmlElementRef(name = "MaximumPermissionsIdentityEnabled", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsIdentityEnabled;
    @XmlElementRef(name = "MaximumPermissionsImportLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsImportLeads;
    @XmlElementRef(name = "MaximumPermissionsImportPersonal", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsImportPersonal;
    @XmlElementRef(name = "MaximumPermissionsInboundMigrationToolsUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsInboundMigrationToolsUser;
    @XmlElementRef(name = "MaximumPermissionsInstallPackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsInstallPackaging;
    @XmlElementRef(name = "MaximumPermissionsManageAnalyticSnapshots", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageAnalyticSnapshots;
    @XmlElementRef(name = "MaximumPermissionsManageAuthProviders", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageAuthProviders;
    @XmlElementRef(name = "MaximumPermissionsManageBusinessHourHolidays", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageBusinessHourHolidays;
    @XmlElementRef(name = "MaximumPermissionsManageCallCenters", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageCallCenters;
    @XmlElementRef(name = "MaximumPermissionsManageCases", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageCases;
    @XmlElementRef(name = "MaximumPermissionsManageCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageCategories;
    @XmlElementRef(name = "MaximumPermissionsManageChatterMessages", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageChatterMessages;
    @XmlElementRef(name = "MaximumPermissionsManageContentPermissions", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageContentPermissions;
    @XmlElementRef(name = "MaximumPermissionsManageContentProperties", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageContentProperties;
    @XmlElementRef(name = "MaximumPermissionsManageContentTypes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageContentTypes;
    @XmlElementRef(name = "MaximumPermissionsManageCssUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageCssUsers;
    @XmlElementRef(name = "MaximumPermissionsManageCustomReportTypes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageCustomReportTypes;
    @XmlElementRef(name = "MaximumPermissionsManageDashboards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageDashboards;
    @XmlElementRef(name = "MaximumPermissionsManageDataCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageDataCategories;
    @XmlElementRef(name = "MaximumPermissionsManageDataIntegrations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageDataIntegrations;
    @XmlElementRef(name = "MaximumPermissionsManageEmailClientConfig", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageEmailClientConfig;
    @XmlElementRef(name = "MaximumPermissionsManageInteraction", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageInteraction;
    @XmlElementRef(name = "MaximumPermissionsManageInternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageInternalUsers;
    @XmlElementRef(name = "MaximumPermissionsManageIpAddresses", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageIpAddresses;
    @XmlElementRef(name = "MaximumPermissionsManageLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageLeads;
    @XmlElementRef(name = "MaximumPermissionsManageLoginAccessPolicies", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageLoginAccessPolicies;
    @XmlElementRef(name = "MaximumPermissionsManageMobile", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageMobile;
    @XmlElementRef(name = "MaximumPermissionsManagePasswordPolicies", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManagePasswordPolicies;
    @XmlElementRef(name = "MaximumPermissionsManageProfilesPermissionsets", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageProfilesPermissionsets;
    @XmlElementRef(name = "MaximumPermissionsManageRemoteAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageRemoteAccess;
    @XmlElementRef(name = "MaximumPermissionsManageRoles", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageRoles;
    @XmlElementRef(name = "MaximumPermissionsManageSelfService", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageSelfService;
    @XmlElementRef(name = "MaximumPermissionsManageSharing", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageSharing;
    @XmlElementRef(name = "MaximumPermissionsManageSolutions", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageSolutions;
    @XmlElementRef(name = "MaximumPermissionsManageTwoFactor", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageTwoFactor;
    @XmlElementRef(name = "MaximumPermissionsManageUnlistedGroups", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageUnlistedGroups;
    @XmlElementRef(name = "MaximumPermissionsManageUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsManageUsers;
    @XmlElementRef(name = "MaximumPermissionsMassInlineEdit", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsMassInlineEdit;
    @XmlElementRef(name = "MaximumPermissionsModerateChatter", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsModerateChatter;
    @XmlElementRef(name = "MaximumPermissionsModifyAllData", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsModifyAllData;
    @XmlElementRef(name = "MaximumPermissionsNewReportBuilder", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsNewReportBuilder;
    @XmlElementRef(name = "MaximumPermissionsOutboundMigrationToolsUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsOutboundMigrationToolsUser;
    @XmlElementRef(name = "MaximumPermissionsPasswordNeverExpires", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsPasswordNeverExpires;
    @XmlElementRef(name = "MaximumPermissionsPublishPackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsPublishPackaging;
    @XmlElementRef(name = "MaximumPermissionsResetPasswords", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsResetPasswords;
    @XmlElementRef(name = "MaximumPermissionsRunFlow", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsRunFlow;
    @XmlElementRef(name = "MaximumPermissionsRunReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsRunReports;
    @XmlElementRef(name = "MaximumPermissionsScheduleJob", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsScheduleJob;
    @XmlElementRef(name = "MaximumPermissionsScheduleReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsScheduleReports;
    @XmlElementRef(name = "MaximumPermissionsSendSitRequests", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsSendSitRequests;
    @XmlElementRef(name = "MaximumPermissionsSolutionImport", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsSolutionImport;
    @XmlElementRef(name = "MaximumPermissionsTagManager", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsTagManager;
    @XmlElementRef(name = "MaximumPermissionsTransferAnyCase", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsTransferAnyCase;
    @XmlElementRef(name = "MaximumPermissionsTransferAnyEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsTransferAnyEntity;
    @XmlElementRef(name = "MaximumPermissionsTransferAnyLead", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsTransferAnyLead;
    @XmlElementRef(name = "MaximumPermissionsTwoFactorApi", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsTwoFactorApi;
    @XmlElementRef(name = "MaximumPermissionsUseTeamReassignWizards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsUseTeamReassignWizards;
    @XmlElementRef(name = "MaximumPermissionsViewAllData", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewAllData;
    @XmlElementRef(name = "MaximumPermissionsViewAllUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewAllUsers;
    @XmlElementRef(name = "MaximumPermissionsViewContent", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewContent;
    @XmlElementRef(name = "MaximumPermissionsViewDataCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewDataCategories;
    @XmlElementRef(name = "MaximumPermissionsViewEncryptedData", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewEncryptedData;
    @XmlElementRef(name = "MaximumPermissionsViewHelpLink", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewHelpLink;
    @XmlElementRef(name = "MaximumPermissionsViewMyTeamsDashboards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewMyTeamsDashboards;
    @XmlElementRef(name = "MaximumPermissionsViewSetup", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumPermissionsViewSetup;
    @XmlElementRef(name = "PermissionSetLicenseAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> permissionSetLicenseAssignments;
    @XmlElementRef(name = "PermissionSetLicenseKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> permissionSetLicenseKey;
    @XmlElementRef(name = "Status", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "TotalLicenses", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalLicenses;
    @XmlElementRef(name = "UsedLicenses", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> usedLicenses;

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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationDate = value;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
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
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterLabel(JAXBElement<String> value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the maximumPermissionsActivateContract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsActivateContract() {
        return maximumPermissionsActivateContract;
    }

    /**
     * Sets the value of the maximumPermissionsActivateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsActivateContract(JAXBElement<Boolean> value) {
        this.maximumPermissionsActivateContract = value;
    }

    /**
     * Gets the value of the maximumPermissionsAllowEmailIC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsAllowEmailIC() {
        return maximumPermissionsAllowEmailIC;
    }

    /**
     * Sets the value of the maximumPermissionsAllowEmailIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsAllowEmailIC(JAXBElement<Boolean> value) {
        this.maximumPermissionsAllowEmailIC = value;
    }

    /**
     * Gets the value of the maximumPermissionsApiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsApiEnabled() {
        return maximumPermissionsApiEnabled;
    }

    /**
     * Sets the value of the maximumPermissionsApiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsApiEnabled(JAXBElement<Boolean> value) {
        this.maximumPermissionsApiEnabled = value;
    }

    /**
     * Gets the value of the maximumPermissionsApiUserOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsApiUserOnly() {
        return maximumPermissionsApiUserOnly;
    }

    /**
     * Sets the value of the maximumPermissionsApiUserOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsApiUserOnly(JAXBElement<Boolean> value) {
        this.maximumPermissionsApiUserOnly = value;
    }

    /**
     * Gets the value of the maximumPermissionsAssignPermissionSets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsAssignPermissionSets() {
        return maximumPermissionsAssignPermissionSets;
    }

    /**
     * Sets the value of the maximumPermissionsAssignPermissionSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsAssignPermissionSets(JAXBElement<Boolean> value) {
        this.maximumPermissionsAssignPermissionSets = value;
    }

    /**
     * Gets the value of the maximumPermissionsAssignTopics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsAssignTopics() {
        return maximumPermissionsAssignTopics;
    }

    /**
     * Sets the value of the maximumPermissionsAssignTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsAssignTopics(JAXBElement<Boolean> value) {
        this.maximumPermissionsAssignTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsAuthorApex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsAuthorApex() {
        return maximumPermissionsAuthorApex;
    }

    /**
     * Sets the value of the maximumPermissionsAuthorApex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsAuthorApex(JAXBElement<Boolean> value) {
        this.maximumPermissionsAuthorApex = value;
    }

    /**
     * Gets the value of the maximumPermissionsBulkApiHardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsBulkApiHardDelete() {
        return maximumPermissionsBulkApiHardDelete;
    }

    /**
     * Sets the value of the maximumPermissionsBulkApiHardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsBulkApiHardDelete(JAXBElement<Boolean> value) {
        this.maximumPermissionsBulkApiHardDelete = value;
    }

    /**
     * Gets the value of the maximumPermissionsCanInsertFeedSystemFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCanInsertFeedSystemFields() {
        return maximumPermissionsCanInsertFeedSystemFields;
    }

    /**
     * Sets the value of the maximumPermissionsCanInsertFeedSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCanInsertFeedSystemFields(JAXBElement<Boolean> value) {
        this.maximumPermissionsCanInsertFeedSystemFields = value;
    }

    /**
     * Gets the value of the maximumPermissionsCanUseNewDashboardBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCanUseNewDashboardBuilder() {
        return maximumPermissionsCanUseNewDashboardBuilder;
    }

    /**
     * Sets the value of the maximumPermissionsCanUseNewDashboardBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCanUseNewDashboardBuilder(JAXBElement<Boolean> value) {
        this.maximumPermissionsCanUseNewDashboardBuilder = value;
    }

    /**
     * Gets the value of the maximumPermissionsChatterFileLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsChatterFileLink() {
        return maximumPermissionsChatterFileLink;
    }

    /**
     * Sets the value of the maximumPermissionsChatterFileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsChatterFileLink(JAXBElement<Boolean> value) {
        this.maximumPermissionsChatterFileLink = value;
    }

    /**
     * Gets the value of the maximumPermissionsChatterForSharePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsChatterForSharePoint() {
        return maximumPermissionsChatterForSharePoint;
    }

    /**
     * Sets the value of the maximumPermissionsChatterForSharePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsChatterForSharePoint(JAXBElement<Boolean> value) {
        this.maximumPermissionsChatterForSharePoint = value;
    }

    /**
     * Gets the value of the maximumPermissionsChatterInternalUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsChatterInternalUser() {
        return maximumPermissionsChatterInternalUser;
    }

    /**
     * Sets the value of the maximumPermissionsChatterInternalUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsChatterInternalUser(JAXBElement<Boolean> value) {
        this.maximumPermissionsChatterInternalUser = value;
    }

    /**
     * Gets the value of the maximumPermissionsChatterInviteExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsChatterInviteExternalUsers() {
        return maximumPermissionsChatterInviteExternalUsers;
    }

    /**
     * Sets the value of the maximumPermissionsChatterInviteExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsChatterInviteExternalUsers(JAXBElement<Boolean> value) {
        this.maximumPermissionsChatterInviteExternalUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsChatterOwnGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsChatterOwnGroups() {
        return maximumPermissionsChatterOwnGroups;
    }

    /**
     * Sets the value of the maximumPermissionsChatterOwnGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsChatterOwnGroups(JAXBElement<Boolean> value) {
        this.maximumPermissionsChatterOwnGroups = value;
    }

    /**
     * Gets the value of the maximumPermissionsConnectOrgToEnvironmentHub property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsConnectOrgToEnvironmentHub() {
        return maximumPermissionsConnectOrgToEnvironmentHub;
    }

    /**
     * Sets the value of the maximumPermissionsConnectOrgToEnvironmentHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsConnectOrgToEnvironmentHub(JAXBElement<Boolean> value) {
        this.maximumPermissionsConnectOrgToEnvironmentHub = value;
    }

    /**
     * Gets the value of the maximumPermissionsContentAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsContentAdministrator() {
        return maximumPermissionsContentAdministrator;
    }

    /**
     * Sets the value of the maximumPermissionsContentAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsContentAdministrator(JAXBElement<Boolean> value) {
        this.maximumPermissionsContentAdministrator = value;
    }

    /**
     * Gets the value of the maximumPermissionsConvertLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsConvertLeads() {
        return maximumPermissionsConvertLeads;
    }

    /**
     * Sets the value of the maximumPermissionsConvertLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsConvertLeads(JAXBElement<Boolean> value) {
        this.maximumPermissionsConvertLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateCustomizeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCreateCustomizeFilters() {
        return maximumPermissionsCreateCustomizeFilters;
    }

    /**
     * Sets the value of the maximumPermissionsCreateCustomizeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCreateCustomizeFilters(JAXBElement<Boolean> value) {
        this.maximumPermissionsCreateCustomizeFilters = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreatePackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCreatePackaging() {
        return maximumPermissionsCreatePackaging;
    }

    /**
     * Sets the value of the maximumPermissionsCreatePackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCreatePackaging(JAXBElement<Boolean> value) {
        this.maximumPermissionsCreatePackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateTopics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCreateTopics() {
        return maximumPermissionsCreateTopics;
    }

    /**
     * Sets the value of the maximumPermissionsCreateTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCreateTopics(JAXBElement<Boolean> value) {
        this.maximumPermissionsCreateTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateWorkspaces property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCreateWorkspaces() {
        return maximumPermissionsCreateWorkspaces;
    }

    /**
     * Sets the value of the maximumPermissionsCreateWorkspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCreateWorkspaces(JAXBElement<Boolean> value) {
        this.maximumPermissionsCreateWorkspaces = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomMobileAppsAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCustomMobileAppsAccess() {
        return maximumPermissionsCustomMobileAppsAccess;
    }

    /**
     * Sets the value of the maximumPermissionsCustomMobileAppsAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCustomMobileAppsAccess(JAXBElement<Boolean> value) {
        this.maximumPermissionsCustomMobileAppsAccess = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomSidebarOnAllPages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCustomSidebarOnAllPages() {
        return maximumPermissionsCustomSidebarOnAllPages;
    }

    /**
     * Sets the value of the maximumPermissionsCustomSidebarOnAllPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCustomSidebarOnAllPages(JAXBElement<Boolean> value) {
        this.maximumPermissionsCustomSidebarOnAllPages = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomizeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsCustomizeApplication() {
        return maximumPermissionsCustomizeApplication;
    }

    /**
     * Sets the value of the maximumPermissionsCustomizeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsCustomizeApplication(JAXBElement<Boolean> value) {
        this.maximumPermissionsCustomizeApplication = value;
    }

    /**
     * Gets the value of the maximumPermissionsDataExport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsDataExport() {
        return maximumPermissionsDataExport;
    }

    /**
     * Sets the value of the maximumPermissionsDataExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsDataExport(JAXBElement<Boolean> value) {
        this.maximumPermissionsDataExport = value;
    }

    /**
     * Gets the value of the maximumPermissionsDeleteActivatedContract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsDeleteActivatedContract() {
        return maximumPermissionsDeleteActivatedContract;
    }

    /**
     * Sets the value of the maximumPermissionsDeleteActivatedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsDeleteActivatedContract(JAXBElement<Boolean> value) {
        this.maximumPermissionsDeleteActivatedContract = value;
    }

    /**
     * Gets the value of the maximumPermissionsDeleteTopics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsDeleteTopics() {
        return maximumPermissionsDeleteTopics;
    }

    /**
     * Sets the value of the maximumPermissionsDeleteTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsDeleteTopics(JAXBElement<Boolean> value) {
        this.maximumPermissionsDeleteTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsDistributeFromPersWksp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsDistributeFromPersWksp() {
        return maximumPermissionsDistributeFromPersWksp;
    }

    /**
     * Sets the value of the maximumPermissionsDistributeFromPersWksp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsDistributeFromPersWksp(JAXBElement<Boolean> value) {
        this.maximumPermissionsDistributeFromPersWksp = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditBrandTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditBrandTemplates() {
        return maximumPermissionsEditBrandTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditBrandTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditBrandTemplates(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditBrandTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditCaseComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditCaseComments() {
        return maximumPermissionsEditCaseComments;
    }

    /**
     * Sets the value of the maximumPermissionsEditCaseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditCaseComments(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditCaseComments = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditEvent() {
        return maximumPermissionsEditEvent;
    }

    /**
     * Sets the value of the maximumPermissionsEditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditEvent(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditEvent = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditHtmlTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditHtmlTemplates() {
        return maximumPermissionsEditHtmlTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditHtmlTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditHtmlTemplates(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditHtmlTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditOppLineItemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditOppLineItemUnitPrice() {
        return maximumPermissionsEditOppLineItemUnitPrice;
    }

    /**
     * Sets the value of the maximumPermissionsEditOppLineItemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditOppLineItemUnitPrice(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditOppLineItemUnitPrice = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditPublicDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditPublicDocuments() {
        return maximumPermissionsEditPublicDocuments;
    }

    /**
     * Sets the value of the maximumPermissionsEditPublicDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditPublicDocuments(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditPublicDocuments = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditPublicTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditPublicTemplates() {
        return maximumPermissionsEditPublicTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditPublicTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditPublicTemplates(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditPublicTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditReadonlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditReadonlyFields() {
        return maximumPermissionsEditReadonlyFields;
    }

    /**
     * Sets the value of the maximumPermissionsEditReadonlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditReadonlyFields(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditReadonlyFields = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditReports() {
        return maximumPermissionsEditReports;
    }

    /**
     * Sets the value of the maximumPermissionsEditReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditReports(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditTask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditTask() {
        return maximumPermissionsEditTask;
    }

    /**
     * Sets the value of the maximumPermissionsEditTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditTask(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditTask = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditTopics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEditTopics() {
        return maximumPermissionsEditTopics;
    }

    /**
     * Sets the value of the maximumPermissionsEditTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEditTopics(JAXBElement<Boolean> value) {
        this.maximumPermissionsEditTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEmailAdministration() {
        return maximumPermissionsEmailAdministration;
    }

    /**
     * Sets the value of the maximumPermissionsEmailAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEmailAdministration(JAXBElement<Boolean> value) {
        this.maximumPermissionsEmailAdministration = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailMass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEmailMass() {
        return maximumPermissionsEmailMass;
    }

    /**
     * Sets the value of the maximumPermissionsEmailMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEmailMass(JAXBElement<Boolean> value) {
        this.maximumPermissionsEmailMass = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailSingle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEmailSingle() {
        return maximumPermissionsEmailSingle;
    }

    /**
     * Sets the value of the maximumPermissionsEmailSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEmailSingle(JAXBElement<Boolean> value) {
        this.maximumPermissionsEmailSingle = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailTemplateManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEmailTemplateManagement() {
        return maximumPermissionsEmailTemplateManagement;
    }

    /**
     * Sets the value of the maximumPermissionsEmailTemplateManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEmailTemplateManagement(JAXBElement<Boolean> value) {
        this.maximumPermissionsEmailTemplateManagement = value;
    }

    /**
     * Gets the value of the maximumPermissionsEnableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsEnableNotifications() {
        return maximumPermissionsEnableNotifications;
    }

    /**
     * Sets the value of the maximumPermissionsEnableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsEnableNotifications(JAXBElement<Boolean> value) {
        this.maximumPermissionsEnableNotifications = value;
    }

    /**
     * Gets the value of the maximumPermissionsExportReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsExportReport() {
        return maximumPermissionsExportReport;
    }

    /**
     * Sets the value of the maximumPermissionsExportReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsExportReport(JAXBElement<Boolean> value) {
        this.maximumPermissionsExportReport = value;
    }

    /**
     * Gets the value of the maximumPermissionsFlowUFLRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsFlowUFLRequired() {
        return maximumPermissionsFlowUFLRequired;
    }

    /**
     * Sets the value of the maximumPermissionsFlowUFLRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsFlowUFLRequired(JAXBElement<Boolean> value) {
        this.maximumPermissionsFlowUFLRequired = value;
    }

    /**
     * Gets the value of the maximumPermissionsForceTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsForceTwoFactor() {
        return maximumPermissionsForceTwoFactor;
    }

    /**
     * Sets the value of the maximumPermissionsForceTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsForceTwoFactor(JAXBElement<Boolean> value) {
        this.maximumPermissionsForceTwoFactor = value;
    }

    /**
     * Gets the value of the maximumPermissionsIdentityConnect property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsIdentityConnect() {
        return maximumPermissionsIdentityConnect;
    }

    /**
     * Sets the value of the maximumPermissionsIdentityConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsIdentityConnect(JAXBElement<Boolean> value) {
        this.maximumPermissionsIdentityConnect = value;
    }

    /**
     * Gets the value of the maximumPermissionsIdentityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsIdentityEnabled() {
        return maximumPermissionsIdentityEnabled;
    }

    /**
     * Sets the value of the maximumPermissionsIdentityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsIdentityEnabled(JAXBElement<Boolean> value) {
        this.maximumPermissionsIdentityEnabled = value;
    }

    /**
     * Gets the value of the maximumPermissionsImportLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsImportLeads() {
        return maximumPermissionsImportLeads;
    }

    /**
     * Sets the value of the maximumPermissionsImportLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsImportLeads(JAXBElement<Boolean> value) {
        this.maximumPermissionsImportLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsImportPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsImportPersonal() {
        return maximumPermissionsImportPersonal;
    }

    /**
     * Sets the value of the maximumPermissionsImportPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsImportPersonal(JAXBElement<Boolean> value) {
        this.maximumPermissionsImportPersonal = value;
    }

    /**
     * Gets the value of the maximumPermissionsInboundMigrationToolsUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsInboundMigrationToolsUser() {
        return maximumPermissionsInboundMigrationToolsUser;
    }

    /**
     * Sets the value of the maximumPermissionsInboundMigrationToolsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsInboundMigrationToolsUser(JAXBElement<Boolean> value) {
        this.maximumPermissionsInboundMigrationToolsUser = value;
    }

    /**
     * Gets the value of the maximumPermissionsInstallPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsInstallPackaging() {
        return maximumPermissionsInstallPackaging;
    }

    /**
     * Sets the value of the maximumPermissionsInstallPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsInstallPackaging(JAXBElement<Boolean> value) {
        this.maximumPermissionsInstallPackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageAnalyticSnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageAnalyticSnapshots() {
        return maximumPermissionsManageAnalyticSnapshots;
    }

    /**
     * Sets the value of the maximumPermissionsManageAnalyticSnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageAnalyticSnapshots(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageAnalyticSnapshots = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageAuthProviders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageAuthProviders() {
        return maximumPermissionsManageAuthProviders;
    }

    /**
     * Sets the value of the maximumPermissionsManageAuthProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageAuthProviders(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageAuthProviders = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageBusinessHourHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageBusinessHourHolidays() {
        return maximumPermissionsManageBusinessHourHolidays;
    }

    /**
     * Sets the value of the maximumPermissionsManageBusinessHourHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageBusinessHourHolidays(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageBusinessHourHolidays = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCallCenters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageCallCenters() {
        return maximumPermissionsManageCallCenters;
    }

    /**
     * Sets the value of the maximumPermissionsManageCallCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageCallCenters(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageCallCenters = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageCases() {
        return maximumPermissionsManageCases;
    }

    /**
     * Sets the value of the maximumPermissionsManageCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageCases(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageCases = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageCategories() {
        return maximumPermissionsManageCategories;
    }

    /**
     * Sets the value of the maximumPermissionsManageCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageCategories(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageChatterMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageChatterMessages() {
        return maximumPermissionsManageChatterMessages;
    }

    /**
     * Sets the value of the maximumPermissionsManageChatterMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageChatterMessages(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageChatterMessages = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageContentPermissions() {
        return maximumPermissionsManageContentPermissions;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageContentPermissions(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageContentPermissions = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageContentProperties() {
        return maximumPermissionsManageContentProperties;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageContentProperties(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageContentProperties = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageContentTypes() {
        return maximumPermissionsManageContentTypes;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageContentTypes(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageContentTypes = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCssUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageCssUsers() {
        return maximumPermissionsManageCssUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageCssUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageCssUsers(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageCssUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCustomReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageCustomReportTypes() {
        return maximumPermissionsManageCustomReportTypes;
    }

    /**
     * Sets the value of the maximumPermissionsManageCustomReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageCustomReportTypes(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageCustomReportTypes = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageDashboards() {
        return maximumPermissionsManageDashboards;
    }

    /**
     * Sets the value of the maximumPermissionsManageDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageDashboards(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageDashboards = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageDataCategories() {
        return maximumPermissionsManageDataCategories;
    }

    /**
     * Sets the value of the maximumPermissionsManageDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageDataCategories(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageDataCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDataIntegrations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageDataIntegrations() {
        return maximumPermissionsManageDataIntegrations;
    }

    /**
     * Sets the value of the maximumPermissionsManageDataIntegrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageDataIntegrations(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageDataIntegrations = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageEmailClientConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageEmailClientConfig() {
        return maximumPermissionsManageEmailClientConfig;
    }

    /**
     * Sets the value of the maximumPermissionsManageEmailClientConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageEmailClientConfig(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageEmailClientConfig = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageInteraction() {
        return maximumPermissionsManageInteraction;
    }

    /**
     * Sets the value of the maximumPermissionsManageInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageInteraction(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageInteraction = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageInternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageInternalUsers() {
        return maximumPermissionsManageInternalUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageInternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageInternalUsers(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageInternalUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageIpAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageIpAddresses() {
        return maximumPermissionsManageIpAddresses;
    }

    /**
     * Sets the value of the maximumPermissionsManageIpAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageIpAddresses(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageIpAddresses = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageLeads() {
        return maximumPermissionsManageLeads;
    }

    /**
     * Sets the value of the maximumPermissionsManageLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageLeads(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageLoginAccessPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageLoginAccessPolicies() {
        return maximumPermissionsManageLoginAccessPolicies;
    }

    /**
     * Sets the value of the maximumPermissionsManageLoginAccessPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageLoginAccessPolicies(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageLoginAccessPolicies = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageMobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageMobile() {
        return maximumPermissionsManageMobile;
    }

    /**
     * Sets the value of the maximumPermissionsManageMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageMobile(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageMobile = value;
    }

    /**
     * Gets the value of the maximumPermissionsManagePasswordPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManagePasswordPolicies() {
        return maximumPermissionsManagePasswordPolicies;
    }

    /**
     * Sets the value of the maximumPermissionsManagePasswordPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManagePasswordPolicies(JAXBElement<Boolean> value) {
        this.maximumPermissionsManagePasswordPolicies = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageProfilesPermissionsets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageProfilesPermissionsets() {
        return maximumPermissionsManageProfilesPermissionsets;
    }

    /**
     * Sets the value of the maximumPermissionsManageProfilesPermissionsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageProfilesPermissionsets(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageProfilesPermissionsets = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageRemoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageRemoteAccess() {
        return maximumPermissionsManageRemoteAccess;
    }

    /**
     * Sets the value of the maximumPermissionsManageRemoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageRemoteAccess(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageRemoteAccess = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageRoles() {
        return maximumPermissionsManageRoles;
    }

    /**
     * Sets the value of the maximumPermissionsManageRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageRoles(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageRoles = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSelfService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageSelfService() {
        return maximumPermissionsManageSelfService;
    }

    /**
     * Sets the value of the maximumPermissionsManageSelfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageSelfService(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageSelfService = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSharing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageSharing() {
        return maximumPermissionsManageSharing;
    }

    /**
     * Sets the value of the maximumPermissionsManageSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageSharing(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageSharing = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageSolutions() {
        return maximumPermissionsManageSolutions;
    }

    /**
     * Sets the value of the maximumPermissionsManageSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageSolutions(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageSolutions = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageTwoFactor() {
        return maximumPermissionsManageTwoFactor;
    }

    /**
     * Sets the value of the maximumPermissionsManageTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageTwoFactor(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageTwoFactor = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageUnlistedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageUnlistedGroups() {
        return maximumPermissionsManageUnlistedGroups;
    }

    /**
     * Sets the value of the maximumPermissionsManageUnlistedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageUnlistedGroups(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageUnlistedGroups = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsManageUsers() {
        return maximumPermissionsManageUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsManageUsers(JAXBElement<Boolean> value) {
        this.maximumPermissionsManageUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsMassInlineEdit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsMassInlineEdit() {
        return maximumPermissionsMassInlineEdit;
    }

    /**
     * Sets the value of the maximumPermissionsMassInlineEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsMassInlineEdit(JAXBElement<Boolean> value) {
        this.maximumPermissionsMassInlineEdit = value;
    }

    /**
     * Gets the value of the maximumPermissionsModerateChatter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsModerateChatter() {
        return maximumPermissionsModerateChatter;
    }

    /**
     * Sets the value of the maximumPermissionsModerateChatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsModerateChatter(JAXBElement<Boolean> value) {
        this.maximumPermissionsModerateChatter = value;
    }

    /**
     * Gets the value of the maximumPermissionsModifyAllData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsModifyAllData() {
        return maximumPermissionsModifyAllData;
    }

    /**
     * Sets the value of the maximumPermissionsModifyAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsModifyAllData(JAXBElement<Boolean> value) {
        this.maximumPermissionsModifyAllData = value;
    }

    /**
     * Gets the value of the maximumPermissionsNewReportBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsNewReportBuilder() {
        return maximumPermissionsNewReportBuilder;
    }

    /**
     * Sets the value of the maximumPermissionsNewReportBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsNewReportBuilder(JAXBElement<Boolean> value) {
        this.maximumPermissionsNewReportBuilder = value;
    }

    /**
     * Gets the value of the maximumPermissionsOutboundMigrationToolsUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsOutboundMigrationToolsUser() {
        return maximumPermissionsOutboundMigrationToolsUser;
    }

    /**
     * Sets the value of the maximumPermissionsOutboundMigrationToolsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsOutboundMigrationToolsUser(JAXBElement<Boolean> value) {
        this.maximumPermissionsOutboundMigrationToolsUser = value;
    }

    /**
     * Gets the value of the maximumPermissionsPasswordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsPasswordNeverExpires() {
        return maximumPermissionsPasswordNeverExpires;
    }

    /**
     * Sets the value of the maximumPermissionsPasswordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsPasswordNeverExpires(JAXBElement<Boolean> value) {
        this.maximumPermissionsPasswordNeverExpires = value;
    }

    /**
     * Gets the value of the maximumPermissionsPublishPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsPublishPackaging() {
        return maximumPermissionsPublishPackaging;
    }

    /**
     * Sets the value of the maximumPermissionsPublishPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsPublishPackaging(JAXBElement<Boolean> value) {
        this.maximumPermissionsPublishPackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsResetPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsResetPasswords() {
        return maximumPermissionsResetPasswords;
    }

    /**
     * Sets the value of the maximumPermissionsResetPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsResetPasswords(JAXBElement<Boolean> value) {
        this.maximumPermissionsResetPasswords = value;
    }

    /**
     * Gets the value of the maximumPermissionsRunFlow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsRunFlow() {
        return maximumPermissionsRunFlow;
    }

    /**
     * Sets the value of the maximumPermissionsRunFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsRunFlow(JAXBElement<Boolean> value) {
        this.maximumPermissionsRunFlow = value;
    }

    /**
     * Gets the value of the maximumPermissionsRunReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsRunReports() {
        return maximumPermissionsRunReports;
    }

    /**
     * Sets the value of the maximumPermissionsRunReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsRunReports(JAXBElement<Boolean> value) {
        this.maximumPermissionsRunReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsScheduleJob property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsScheduleJob() {
        return maximumPermissionsScheduleJob;
    }

    /**
     * Sets the value of the maximumPermissionsScheduleJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsScheduleJob(JAXBElement<Boolean> value) {
        this.maximumPermissionsScheduleJob = value;
    }

    /**
     * Gets the value of the maximumPermissionsScheduleReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsScheduleReports() {
        return maximumPermissionsScheduleReports;
    }

    /**
     * Sets the value of the maximumPermissionsScheduleReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsScheduleReports(JAXBElement<Boolean> value) {
        this.maximumPermissionsScheduleReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsSendSitRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsSendSitRequests() {
        return maximumPermissionsSendSitRequests;
    }

    /**
     * Sets the value of the maximumPermissionsSendSitRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsSendSitRequests(JAXBElement<Boolean> value) {
        this.maximumPermissionsSendSitRequests = value;
    }

    /**
     * Gets the value of the maximumPermissionsSolutionImport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsSolutionImport() {
        return maximumPermissionsSolutionImport;
    }

    /**
     * Sets the value of the maximumPermissionsSolutionImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsSolutionImport(JAXBElement<Boolean> value) {
        this.maximumPermissionsSolutionImport = value;
    }

    /**
     * Gets the value of the maximumPermissionsTagManager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsTagManager() {
        return maximumPermissionsTagManager;
    }

    /**
     * Sets the value of the maximumPermissionsTagManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsTagManager(JAXBElement<Boolean> value) {
        this.maximumPermissionsTagManager = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyCase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsTransferAnyCase() {
        return maximumPermissionsTransferAnyCase;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsTransferAnyCase(JAXBElement<Boolean> value) {
        this.maximumPermissionsTransferAnyCase = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsTransferAnyEntity() {
        return maximumPermissionsTransferAnyEntity;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsTransferAnyEntity(JAXBElement<Boolean> value) {
        this.maximumPermissionsTransferAnyEntity = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyLead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsTransferAnyLead() {
        return maximumPermissionsTransferAnyLead;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsTransferAnyLead(JAXBElement<Boolean> value) {
        this.maximumPermissionsTransferAnyLead = value;
    }

    /**
     * Gets the value of the maximumPermissionsTwoFactorApi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsTwoFactorApi() {
        return maximumPermissionsTwoFactorApi;
    }

    /**
     * Sets the value of the maximumPermissionsTwoFactorApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsTwoFactorApi(JAXBElement<Boolean> value) {
        this.maximumPermissionsTwoFactorApi = value;
    }

    /**
     * Gets the value of the maximumPermissionsUseTeamReassignWizards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsUseTeamReassignWizards() {
        return maximumPermissionsUseTeamReassignWizards;
    }

    /**
     * Sets the value of the maximumPermissionsUseTeamReassignWizards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsUseTeamReassignWizards(JAXBElement<Boolean> value) {
        this.maximumPermissionsUseTeamReassignWizards = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewAllData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewAllData() {
        return maximumPermissionsViewAllData;
    }

    /**
     * Sets the value of the maximumPermissionsViewAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewAllData(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewAllData = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewAllUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewAllUsers() {
        return maximumPermissionsViewAllUsers;
    }

    /**
     * Sets the value of the maximumPermissionsViewAllUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewAllUsers(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewAllUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewContent() {
        return maximumPermissionsViewContent;
    }

    /**
     * Sets the value of the maximumPermissionsViewContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewContent(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewContent = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewDataCategories() {
        return maximumPermissionsViewDataCategories;
    }

    /**
     * Sets the value of the maximumPermissionsViewDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewDataCategories(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewDataCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewEncryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewEncryptedData() {
        return maximumPermissionsViewEncryptedData;
    }

    /**
     * Sets the value of the maximumPermissionsViewEncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewEncryptedData(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewEncryptedData = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewHelpLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewHelpLink() {
        return maximumPermissionsViewHelpLink;
    }

    /**
     * Sets the value of the maximumPermissionsViewHelpLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewHelpLink(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewHelpLink = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewMyTeamsDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewMyTeamsDashboards() {
        return maximumPermissionsViewMyTeamsDashboards;
    }

    /**
     * Sets the value of the maximumPermissionsViewMyTeamsDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewMyTeamsDashboards(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewMyTeamsDashboards = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumPermissionsViewSetup() {
        return maximumPermissionsViewSetup;
    }

    /**
     * Sets the value of the maximumPermissionsViewSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumPermissionsViewSetup(JAXBElement<Boolean> value) {
        this.maximumPermissionsViewSetup = value;
    }

    /**
     * Gets the value of the permissionSetLicenseAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getPermissionSetLicenseAssignments() {
        return permissionSetLicenseAssignments;
    }

    /**
     * Sets the value of the permissionSetLicenseAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setPermissionSetLicenseAssignments(JAXBElement<QueryResultType> value) {
        this.permissionSetLicenseAssignments = value;
    }

    /**
     * Gets the value of the permissionSetLicenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPermissionSetLicenseKey() {
        return permissionSetLicenseKey;
    }

    /**
     * Sets the value of the permissionSetLicenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPermissionSetLicenseKey(JAXBElement<String> value) {
        this.permissionSetLicenseKey = value;
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
     * Gets the value of the totalLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalLicenses() {
        return totalLicenses;
    }

    /**
     * Sets the value of the totalLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalLicenses(JAXBElement<Integer> value) {
        this.totalLicenses = value;
    }

    /**
     * Gets the value of the usedLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUsedLicenses() {
        return usedLicenses;
    }

    /**
     * Sets the value of the usedLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUsedLicenses(JAXBElement<Integer> value) {
        this.usedLicenses = value;
    }

}
