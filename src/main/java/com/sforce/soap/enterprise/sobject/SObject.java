
package com.sforce.soap.enterprise.sobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:enterprise.soap.sforce.com}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", propOrder = {
    "fieldsToNull",
    "id"
})
@XmlSeeAlso({
    ASDA__C.class,
    CaseSolution.class,
    ProcessInstanceNode.class,
    ApexTestResult.class,
    ContractHistory.class,
    CaseContactRole.class,
    AuthSession.class,
    NoteTag.class,
    Document.class,
    SFGA__Text_Ad__C.class,
    ASDA__Tag.class,
    ProcessInstanceWorkitem.class,
    FeedLike.class,
    CaseFeed.class,
    KBe__C.class,
    Pricebook2History.class,
    Approval.class,
    OpportunityTag.class,
    MailmergeTemplate.class,
    CronTrigger.class,
    DashboardTag.class,
    TaskTag.class,
    ContentDocumentHistory.class,
    AssignmentRule.class,
    SFGA__Keyword__Tag.class,
    PricebookEntry.class,
    AS_Pipeline_Report__C.class,
    Product2Feed.class,
    AccountPartner.class,
    QueueSobject.class,
    ApexClass.class,
    Note.class,
    SelfServiceUser.class,
    AS_2X_Week_Pipeline_Report__C.class,
    Deskcom__Case__C.class,
    FeedPollVote.class,
    BBP__Campaign_Members__Tag.class,
    Group.class,
    GroupMember.class,
    LeadHistory.class,
    FieldPermissions.class,
    Announcement.class,
    SFGA__Version_33_0_3__C.class,
    LeadTag.class,
    AccountFeed.class,
    KBeContactAssociation__Tag.class,
    DeclinedEventRelation.class,
    ContactTag.class,
    SFGA__Keyword__C.class,
    BBP__Configuration__Tag.class,
    ContentVersion.class,
    EventRelation.class,
    IdeaComment.class,
    ProcessInstanceHistory.class,
    CaseTag.class,
    ObjectPermissions.class,
    AcceptedEventRelation.class,
    AS_2X_Week_Pipeline_Report__Tag.class,
    CollaborationGroupMemberRequest.class,
    CaseTeamTemplateMember.class,
    ContactFeed.class,
    SFGA__Google_Campaign__Tag.class,
    ContentDocumentFeed.class,
    EventFeed.class,
    OpportunityStage.class,
    Holiday.class,
    KBe__Tag.class,
    Event.class,
    UserPackageLicense.class,
    ApexComponent.class,
    TaskPriority.class,
    OpportunityLineItem.class,
    SetupEntityAccess.class,
    Dashboard.class,
    Attachment.class,
    UserLicense.class,
    OpportunityHistory.class,
    BBP__CampaignMembersCache__Tag.class,
    ContentDocumentLink.class,
    SFGA__Google_Campaign__C.class,
    Name.class,
    ListView.class,
    AS_Pipeline_Report__Tag.class,
    BBP__CampaignMembersCache__C.class,
    CaseTeamMember.class,
    EmailServicesFunction.class,
    FiscalYearSettings.class,
    OpportunityShare.class,
    FeedComment.class,
    UserLogin.class,
    SolutionStatus.class,
    AccountTag.class,
    BBP__BuzzBuilder_History__Tag.class,
    FeedTrackedChange.class,
    AdditionalNumber.class,
    CaseShare.class,
    EventTag.class,
    RecentlyViewed.class,
    OrgWideEmailAddress.class,
    Campaign.class,
    EmailTemplate.class,
    ProcessInstance.class,
    InstalledMobileApp.class,
    SiteHistory.class,
    Domain.class,
    PartnerRole.class,
    CategoryData.class,
    ContentDistribution.class,
    SolutionFeed.class,
    SFGA__Ad_Group__C.class,
    OpportunityFieldHistory.class,
    ContractStatus.class,
    CaseComment.class,
    PermissionSetLicenseAssign.class,
    ProcessInstanceStep.class,
    Opportunity.class,
    ApexTrigger.class,
    CampaignFeed.class,
    OauthToken.class,
    Report.class,
    DomainSite.class,
    BusinessHours.class,
    StaticResource.class,
    ContactHistory.class,
    ApexPage.class,
    CampaignShare.class,
    ContentDocument.class,
    OpportunityPartner.class,
    UserRole.class,
    ContactShare.class,
    ReportFeed.class,
    Community.class,
    OpenActivity.class,
    BusinessProcess.class,
    Account.class,
    BBP__BuzzBuilder_Campaigns__Tag.class,
    EmailStatus.class,
    LeadShare.class,
    CustomPermissionDependency.class,
    SFGA__Text_Ad__Tag.class,
    AuthConfig.class,
    AttachedContentDocument.class,
    KBe__History.class,
    ForecastShare.class,
    MobileDeviceRegistrar.class,
    PushTopic.class,
    Scontrol.class,
    ClientBrowser.class,
    Asset.class,
    CronJobDetail.class,
    UserPreference.class,
    CollaborationInvitation.class,
    CampaignMember.class,
    CollaborationGroupMember.class,
    KBeContactAssociation__C.class,
    AccountContactRole.class,
    Vote.class,
    Pricebook2 .class,
    EmailServicesAddress.class,
    CallCenter.class,
    AssetTag.class,
    BBP__BuzzBuilder_History__C.class,
    EntitySubscription.class,
    Idea.class,
    CaseStatus.class,
    BBP__BuzzBuilder_Campaigns__C.class,
    ChatterActivity.class,
    Contract.class,
    Site.class,
    CombinedAttachment.class,
    WH_Data__Feed.class,
    Organization.class,
    Product2 .class,
    ActivityHistory.class,
    ExternalDataUserAuth.class,
    Folder.class,
    Profile.class,
    Case.class,
    Deskcom__Case__History.class,
    CaseTeamTemplate.class,
    PermissionSetAssignment.class,
    OwnedContentDocument.class,
    Lead.class,
    FeedPollChoice.class,
    AsyncApexJob.class,
    Partner.class,
    Solution.class,
    AssetFeed.class,
    ApexTestQueueItem.class,
    AuthConfigProviders.class,
    SFGA__Search_Phrase__C.class,
    AuthProvider.class,
    CaseTeamRole.class,
    DocumentAttachmentMap.class,
    TaskStatus.class,
    UserRecordAccess.class,
    WebLink.class,
    CategoryNode.class,
    TenantUsageEntitlement.class,
    WH_Data__Tag.class,
    CollaborationGroup.class,
    Deskcom__Case__Tag.class,
    Task.class,
    TaskFeed.class,
    ProcessNode.class,
    CaseTeamTemplateRecord.class,
    ProcessDefinition.class,
    ExternalDataSource.class,
    CustomPermission.class,
    ContractContactRole.class,
    FeedItem.class,
    ThirdPartyAccountLink.class,
    AggregateResult.class,
    AccountHistory.class,
    OpportunityFeed.class,
    CaseHistory.class,
    LookedUpFromActivity.class,
    KBeContactAssociation__History.class,
    PackageLicense.class,
    SFGA__Version_33_0_3__Tag.class,
    CampaignMemberStatus.class,
    Period.class,
    BBP__Campaign_Members__C.class,
    BBP__Configuration__C.class,
    UserShare.class,
    LoginHistory.class,
    PermissionSet.class,
    SiteFeed.class,
    DashboardComponent.class,
    OpportunityCompetitor.class,
    TagDefinition.class,
    DocumentTag.class,
    User.class,
    ReportTag.class,
    KnowledgeableUser.class,
    CustomObjectUserLicenseMetrics.class,
    ContentDistributionView.class,
    NoteAndAttachment.class,
    AppMenuItem.class,
    LeadStatus.class,
    ContractTag.class,
    SolutionHistory.class,
    SamlSsoConfig.class,
    RecordType.class,
    SolutionTag.class,
    CampaignTag.class,
    CollaborationGroupFeed.class,
    UserFeed.class,
    HashtagDefinition.class,
    Topic.class,
    ContractFeed.class,
    DashboardFeed.class,
    TopicFeed.class,
    WH_Data__C.class,
    OpportunityContactRole.class,
    ContentVersionHistory.class,
    PermissionSetLicense.class,
    SFGA__Ad_Group__Tag.class,
    BrandTemplate.class,
    LeadFeed.class,
    Contact.class,
    LoginIp.class,
    UndecidedEventRelation.class,
    SFGA__Search_Phrase__Tag.class,
    DashboardComponentFeed.class,
    AccountShare.class,
    ApexLog.class,
    TopicAssignment.class
})
public class SObject {

    @XmlElement(nillable = true)
    protected List<String> fieldsToNull;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNull() {
        if (fieldsToNull == null) {
            fieldsToNull = new ArrayList<String>();
        }
        return this.fieldsToNull;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
