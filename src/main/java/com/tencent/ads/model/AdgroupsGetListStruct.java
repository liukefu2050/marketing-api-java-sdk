/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.tencent.ads.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 返回结构
 */
@ApiModel(description = "返回结构")

public class AdgroupsGetListStruct {

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("billing_event")
  private BillingEvent billingEvent = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting")
  private ReadTargetingSettingForAdgroup targeting = null;

  @SerializedName("targeting_translation")
  private String targetingTranslation = null;

  @SerializedName("is_include_unsupported_targeting")
  private Boolean isIncludeUnsupportedTargeting = null;

  @SerializedName("scene_spec")
  private SceneTargeting sceneSpec = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("customized_category")
  private String customizedCategory = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("dynamic_ad_spec")
  private DynamicAdSpec dynamicAdSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("additional_user_action_sets")
  private List<UserActionSetStruct> additionalUserActionSets = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("is_rewarded_video_ad")
  private Boolean isRewardedVideoAd = null;

  @SerializedName("cost_guarantee_message")
  private String costGuaranteeMessage = null;

  @SerializedName("cost_guarantee_status")
  private CostGuaranteeStatus costGuaranteeStatus = null;

  @SerializedName("bid_strategy")
  private BidStrategy bidStrategy = null;

  @SerializedName("cold_start_audience")
  private List<Long> coldStartAudience = null;

  @SerializedName("auto_audience")
  private Boolean autoAudience = null;

  @SerializedName("expand_enabled")
  private Boolean expandEnabled = null;

  @SerializedName("expand_targeting")
  private List<String> expandTargeting = null;

  @SerializedName("deep_conversion_spec")
  private DeepConversionSpec deepConversionSpec = null;

  @SerializedName("deep_optimization_action_type")
  private DeepOptimizationActionType deepOptimizationActionType = null;

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("deep_conversion_behavior_bid")
  private Long deepConversionBehaviorBid = null;

  @SerializedName("deep_conversion_worth_bid")
  private Long deepConversionWorthBid = null;

  public AdgroupsGetListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   **/
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdgroupsGetListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   **/
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdgroupsGetListStruct adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   **/
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupsGetListStruct siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsGetListStruct addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   **/
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public AdgroupsGetListStruct automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  /**
   * Get automaticSiteEnabled
   *
   * @return automaticSiteEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isAutomaticSiteEnabled() {
    return automaticSiteEnabled;
  }

  public void setAutomaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
  }

  public AdgroupsGetListStruct optimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   **/
  @ApiModelProperty(value = "")
  public OptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public AdgroupsGetListStruct billingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  /**
   * Get billingEvent
   *
   * @return billingEvent
   **/
  @ApiModelProperty(value = "")
  public BillingEvent getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
  }

  public AdgroupsGetListStruct bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  /**
   * Get bidAmount
   *
   * @return bidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }

  public AdgroupsGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   **/
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public AdgroupsGetListStruct promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   **/
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public AdgroupsGetListStruct promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   **/
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public AdgroupsGetListStruct appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   **/
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  public AdgroupsGetListStruct targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   **/
  @ApiModelProperty(value = "")
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public AdgroupsGetListStruct targeting(ReadTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   **/
  @ApiModelProperty(value = "")
  public ReadTargetingSettingForAdgroup getTargeting() {
    return targeting;
  }

  public void setTargeting(ReadTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
  }

  public AdgroupsGetListStruct targetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
    return this;
  }

  /**
   * Get targetingTranslation
   *
   * @return targetingTranslation
   **/
  @ApiModelProperty(value = "")
  public String getTargetingTranslation() {
    return targetingTranslation;
  }

  public void setTargetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
  }

  public AdgroupsGetListStruct isIncludeUnsupportedTargeting(
      Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
    return this;
  }

  /**
   * Get isIncludeUnsupportedTargeting
   *
   * @return isIncludeUnsupportedTargeting
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsIncludeUnsupportedTargeting() {
    return isIncludeUnsupportedTargeting;
  }

  public void setIsIncludeUnsupportedTargeting(Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
  }

  public AdgroupsGetListStruct sceneSpec(SceneTargeting sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  /**
   * Get sceneSpec
   *
   * @return sceneSpec
   **/
  @ApiModelProperty(value = "")
  public SceneTargeting getSceneSpec() {
    return sceneSpec;
  }

  public void setSceneSpec(SceneTargeting sceneSpec) {
    this.sceneSpec = sceneSpec;
  }

  public AdgroupsGetListStruct beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   *
   * @return beginDate
   **/
  @ApiModelProperty(value = "")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public AdgroupsGetListStruct endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdgroupsGetListStruct timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Get timeSeries
   *
   * @return timeSeries
   **/
  @ApiModelProperty(value = "")
  public String getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
  }

  public AdgroupsGetListStruct configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   **/
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public AdgroupsGetListStruct customizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
    return this;
  }

  /**
   * Get customizedCategory
   *
   * @return customizedCategory
   **/
  @ApiModelProperty(value = "")
  public String getCustomizedCategory() {
    return customizedCategory;
  }

  public void setCustomizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
  }

  public AdgroupsGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public AdgroupsGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   **/
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public AdgroupsGetListStruct dynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
    return this;
  }

  /**
   * Get dynamicAdSpec
   *
   * @return dynamicAdSpec
   **/
  @ApiModelProperty(value = "")
  public DynamicAdSpec getDynamicAdSpec() {
    return dynamicAdSpec;
  }

  public void setDynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
  }

  public AdgroupsGetListStruct userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsGetListStruct addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
    if (this.userActionSets == null) {
      this.userActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.userActionSets.add(userActionSetsItem);
    return this;
  }

  /**
   * Get userActionSets
   *
   * @return userActionSets
   **/
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getUserActionSets() {
    return userActionSets;
  }

  public void setUserActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
  }

  public AdgroupsGetListStruct additionalUserActionSets(
      List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
    return this;
  }

  public AdgroupsGetListStruct addAdditionalUserActionSetsItem(
      UserActionSetStruct additionalUserActionSetsItem) {
    if (this.additionalUserActionSets == null) {
      this.additionalUserActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.additionalUserActionSets.add(additionalUserActionSetsItem);
    return this;
  }

  /**
   * Get additionalUserActionSets
   *
   * @return additionalUserActionSets
   **/
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getAdditionalUserActionSets() {
    return additionalUserActionSets;
  }

  public void setAdditionalUserActionSets(List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
  }

  public AdgroupsGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public AdgroupsGetListStruct dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  /**
   * Get dynamicCreativeId
   *
   * @return dynamicCreativeId
   **/
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeId() {
    return dynamicCreativeId;
  }

  public void setDynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
  }

  public AdgroupsGetListStruct isRewardedVideoAd(Boolean isRewardedVideoAd) {
    this.isRewardedVideoAd = isRewardedVideoAd;
    return this;
  }

  /**
   * Get isRewardedVideoAd
   *
   * @return isRewardedVideoAd
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsRewardedVideoAd() {
    return isRewardedVideoAd;
  }

  public void setIsRewardedVideoAd(Boolean isRewardedVideoAd) {
    this.isRewardedVideoAd = isRewardedVideoAd;
  }

  public AdgroupsGetListStruct costGuaranteeMessage(String costGuaranteeMessage) {
    this.costGuaranteeMessage = costGuaranteeMessage;
    return this;
  }

  /**
   * Get costGuaranteeMessage
   *
   * @return costGuaranteeMessage
   **/
  @ApiModelProperty(value = "")
  public String getCostGuaranteeMessage() {
    return costGuaranteeMessage;
  }

  public void setCostGuaranteeMessage(String costGuaranteeMessage) {
    this.costGuaranteeMessage = costGuaranteeMessage;
  }

  public AdgroupsGetListStruct costGuaranteeStatus(CostGuaranteeStatus costGuaranteeStatus) {
    this.costGuaranteeStatus = costGuaranteeStatus;
    return this;
  }

  /**
   * Get costGuaranteeStatus
   *
   * @return costGuaranteeStatus
   **/
  @ApiModelProperty(value = "")
  public CostGuaranteeStatus getCostGuaranteeStatus() {
    return costGuaranteeStatus;
  }

  public void setCostGuaranteeStatus(CostGuaranteeStatus costGuaranteeStatus) {
    this.costGuaranteeStatus = costGuaranteeStatus;
  }

  public AdgroupsGetListStruct bidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

  /**
   * Get bidStrategy
   *
   * @return bidStrategy
   **/
  @ApiModelProperty(value = "")
  public BidStrategy getBidStrategy() {
    return bidStrategy;
  }

  public void setBidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
  }

  public AdgroupsGetListStruct coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupsGetListStruct addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  /**
   * Get coldStartAudience
   *
   * @return coldStartAudience
   **/
  @ApiModelProperty(value = "")
  public List<Long> getColdStartAudience() {
    return coldStartAudience;
  }

  public void setColdStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
  }

  public AdgroupsGetListStruct autoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
    return this;
  }

  /**
   * Get autoAudience
   *
   * @return autoAudience
   **/
  @ApiModelProperty(value = "")
  public Boolean isAutoAudience() {
    return autoAudience;
  }

  public void setAutoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
  }

  public AdgroupsGetListStruct expandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
    return this;
  }

  /**
   * Get expandEnabled
   *
   * @return expandEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isExpandEnabled() {
    return expandEnabled;
  }

  public void setExpandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
  }

  public AdgroupsGetListStruct expandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
    return this;
  }

  public AdgroupsGetListStruct addExpandTargetingItem(String expandTargetingItem) {
    if (this.expandTargeting == null) {
      this.expandTargeting = new ArrayList<String>();
    }
    this.expandTargeting.add(expandTargetingItem);
    return this;
  }

  /**
   * Get expandTargeting
   *
   * @return expandTargeting
   **/
  @ApiModelProperty(value = "")
  public List<String> getExpandTargeting() {
    return expandTargeting;
  }

  public void setExpandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
  }

  public AdgroupsGetListStruct deepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
    return this;
  }

  /**
   * Get deepConversionSpec
   *
   * @return deepConversionSpec
   **/
  @ApiModelProperty(value = "")
  public DeepConversionSpec getDeepConversionSpec() {
    return deepConversionSpec;
  }

  public void setDeepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
  }

  public AdgroupsGetListStruct deepOptimizationActionType(
      DeepOptimizationActionType deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
    return this;
  }

  /**
   * Get deepOptimizationActionType
   *
   * @return deepOptimizationActionType
   **/
  @ApiModelProperty(value = "")
  public DeepOptimizationActionType getDeepOptimizationActionType() {
    return deepOptimizationActionType;
  }

  public void setDeepOptimizationActionType(DeepOptimizationActionType deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
  }

  public AdgroupsGetListStruct conversionId(Long conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  /**
   * Get conversionId
   *
   * @return conversionId
   **/
  @ApiModelProperty(value = "")
  public Long getConversionId() {
    return conversionId;
  }

  public void setConversionId(Long conversionId) {
    this.conversionId = conversionId;
  }

  public AdgroupsGetListStruct deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorBid
   *
   * @return deepConversionBehaviorBid
   **/
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorBid() {
    return deepConversionBehaviorBid;
  }

  public void setDeepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
  }

  public AdgroupsGetListStruct deepConversionWorthBid(Long deepConversionWorthBid) {
    this.deepConversionWorthBid = deepConversionWorthBid;
    return this;
  }

  /**
   * Get deepConversionWorthBid
   *
   * @return deepConversionWorthBid
   **/
  @ApiModelProperty(value = "")
  public Long getDeepConversionWorthBid() {
    return deepConversionWorthBid;
  }

  public void setDeepConversionWorthBid(Long deepConversionWorthBid) {
    this.deepConversionWorthBid = deepConversionWorthBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsGetListStruct adgroupsGetListStruct = (AdgroupsGetListStruct) o;
    return Objects.equals(this.campaignId, adgroupsGetListStruct.campaignId) &&
        Objects.equals(this.adgroupId, adgroupsGetListStruct.adgroupId) &&
        Objects.equals(this.adgroupName, adgroupsGetListStruct.adgroupName) &&
        Objects.equals(this.siteSet, adgroupsGetListStruct.siteSet) &&
        Objects.equals(this.automaticSiteEnabled, adgroupsGetListStruct.automaticSiteEnabled) &&
        Objects.equals(this.optimizationGoal, adgroupsGetListStruct.optimizationGoal) &&
        Objects.equals(this.billingEvent, adgroupsGetListStruct.billingEvent) &&
        Objects.equals(this.bidAmount, adgroupsGetListStruct.bidAmount) &&
        Objects.equals(this.dailyBudget, adgroupsGetListStruct.dailyBudget) &&
        Objects.equals(this.promotedObjectType, adgroupsGetListStruct.promotedObjectType) &&
        Objects.equals(this.promotedObjectId, adgroupsGetListStruct.promotedObjectId) &&
        Objects.equals(this.appAndroidChannelPackageId,
            adgroupsGetListStruct.appAndroidChannelPackageId) &&
        Objects.equals(this.targetingId, adgroupsGetListStruct.targetingId) &&
        Objects.equals(this.targeting, adgroupsGetListStruct.targeting) &&
        Objects.equals(this.targetingTranslation, adgroupsGetListStruct.targetingTranslation) &&
        Objects.equals(this.isIncludeUnsupportedTargeting,
            adgroupsGetListStruct.isIncludeUnsupportedTargeting) &&
        Objects.equals(this.sceneSpec, adgroupsGetListStruct.sceneSpec) &&
        Objects.equals(this.beginDate, adgroupsGetListStruct.beginDate) &&
        Objects.equals(this.endDate, adgroupsGetListStruct.endDate) &&
        Objects.equals(this.timeSeries, adgroupsGetListStruct.timeSeries) &&
        Objects.equals(this.configuredStatus, adgroupsGetListStruct.configuredStatus) &&
        Objects.equals(this.customizedCategory, adgroupsGetListStruct.customizedCategory) &&
        Objects.equals(this.createdTime, adgroupsGetListStruct.createdTime) &&
        Objects.equals(this.lastModifiedTime, adgroupsGetListStruct.lastModifiedTime) &&
        Objects.equals(this.dynamicAdSpec, adgroupsGetListStruct.dynamicAdSpec) &&
        Objects.equals(this.userActionSets, adgroupsGetListStruct.userActionSets) &&
        Objects
            .equals(this.additionalUserActionSets, adgroupsGetListStruct.additionalUserActionSets)
        &&
        Objects.equals(this.isDeleted, adgroupsGetListStruct.isDeleted) &&
        Objects.equals(this.dynamicCreativeId, adgroupsGetListStruct.dynamicCreativeId) &&
        Objects.equals(this.isRewardedVideoAd, adgroupsGetListStruct.isRewardedVideoAd) &&
        Objects.equals(this.costGuaranteeMessage, adgroupsGetListStruct.costGuaranteeMessage) &&
        Objects.equals(this.costGuaranteeStatus, adgroupsGetListStruct.costGuaranteeStatus) &&
        Objects.equals(this.bidStrategy, adgroupsGetListStruct.bidStrategy) &&
        Objects.equals(this.coldStartAudience, adgroupsGetListStruct.coldStartAudience) &&
        Objects.equals(this.autoAudience, adgroupsGetListStruct.autoAudience) &&
        Objects.equals(this.expandEnabled, adgroupsGetListStruct.expandEnabled) &&
        Objects.equals(this.expandTargeting, adgroupsGetListStruct.expandTargeting) &&
        Objects.equals(this.deepConversionSpec, adgroupsGetListStruct.deepConversionSpec) &&
        Objects.equals(this.deepOptimizationActionType,
            adgroupsGetListStruct.deepOptimizationActionType) &&
        Objects.equals(this.conversionId, adgroupsGetListStruct.conversionId) &&
        Objects
            .equals(this.deepConversionBehaviorBid, adgroupsGetListStruct.deepConversionBehaviorBid)
        &&
        Objects.equals(this.deepConversionWorthBid, adgroupsGetListStruct.deepConversionWorthBid);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(campaignId, adgroupId, adgroupName, siteSet, automaticSiteEnabled, optimizationGoal,
            billingEvent, bidAmount, dailyBudget, promotedObjectType, promotedObjectId,
            appAndroidChannelPackageId, targetingId, targeting, targetingTranslation,
            isIncludeUnsupportedTargeting, sceneSpec, beginDate, endDate, timeSeries,
            configuredStatus, customizedCategory, createdTime, lastModifiedTime, dynamicAdSpec,
            userActionSets, additionalUserActionSets, isDeleted, dynamicCreativeId,
            isRewardedVideoAd, costGuaranteeMessage, costGuaranteeStatus, bidStrategy,
            coldStartAudience, autoAudience, expandEnabled, expandTargeting, deepConversionSpec,
            deepOptimizationActionType, conversionId, deepConversionBehaviorBid,
            deepConversionWorthBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupsGetListStruct {\n");

    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    siteSet: ").append(toIndentedString(siteSet)).append("\n");
    sb.append("    automaticSiteEnabled: ").append(toIndentedString(automaticSiteEnabled))
        .append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    billingEvent: ").append(toIndentedString(billingEvent)).append("\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
    sb.append("    dailyBudget: ").append(toIndentedString(dailyBudget)).append("\n");
    sb.append("    promotedObjectType: ").append(toIndentedString(promotedObjectType)).append("\n");
    sb.append("    promotedObjectId: ").append(toIndentedString(promotedObjectId)).append("\n");
    sb.append("    appAndroidChannelPackageId: ")
        .append(toIndentedString(appAndroidChannelPackageId)).append("\n");
    sb.append("    targetingId: ").append(toIndentedString(targetingId)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    targetingTranslation: ").append(toIndentedString(targetingTranslation))
        .append("\n");
    sb.append("    isIncludeUnsupportedTargeting: ")
        .append(toIndentedString(isIncludeUnsupportedTargeting)).append("\n");
    sb.append("    sceneSpec: ").append(toIndentedString(sceneSpec)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    configuredStatus: ").append(toIndentedString(configuredStatus)).append("\n");
    sb.append("    customizedCategory: ").append(toIndentedString(customizedCategory)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    dynamicAdSpec: ").append(toIndentedString(dynamicAdSpec)).append("\n");
    sb.append("    userActionSets: ").append(toIndentedString(userActionSets)).append("\n");
    sb.append("    additionalUserActionSets: ").append(toIndentedString(additionalUserActionSets))
        .append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    dynamicCreativeId: ").append(toIndentedString(dynamicCreativeId)).append("\n");
    sb.append("    isRewardedVideoAd: ").append(toIndentedString(isRewardedVideoAd)).append("\n");
    sb.append("    costGuaranteeMessage: ").append(toIndentedString(costGuaranteeMessage))
        .append("\n");
    sb.append("    costGuaranteeStatus: ").append(toIndentedString(costGuaranteeStatus))
        .append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
    sb.append("    coldStartAudience: ").append(toIndentedString(coldStartAudience)).append("\n");
    sb.append("    autoAudience: ").append(toIndentedString(autoAudience)).append("\n");
    sb.append("    expandEnabled: ").append(toIndentedString(expandEnabled)).append("\n");
    sb.append("    expandTargeting: ").append(toIndentedString(expandTargeting)).append("\n");
    sb.append("    deepConversionSpec: ").append(toIndentedString(deepConversionSpec)).append("\n");
    sb.append("    deepOptimizationActionType: ")
        .append(toIndentedString(deepOptimizationActionType)).append("\n");
    sb.append("    conversionId: ").append(toIndentedString(conversionId)).append("\n");
    sb.append("    deepConversionBehaviorBid: ").append(toIndentedString(deepConversionBehaviorBid))
        .append("\n");
    sb.append("    deepConversionWorthBid: ").append(toIndentedString(deepConversionWorthBid))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

