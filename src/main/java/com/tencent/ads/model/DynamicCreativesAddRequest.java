/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** DynamicCreativesAddRequest */
public class DynamicCreativesAddRequest {
  @SerializedName("dynamic_creative_name")
  private String dynamicCreativeName = null;

  @SerializedName("dynamic_creative_template_id")
  private Long dynamicCreativeTemplateId = null;

  @SerializedName("dynamic_creative_elements")
  private DynamicCreativeElements dynamicCreativeElements = null;

  @SerializedName("campaign_type")
  private CampaignType campaignType = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("page_spec")
  private DynamicCreativePageSpec pageSpec = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("dynamic_adcreative_spec")
  private DynamicAdcreativeSpecForDc dynamicAdcreativeSpec = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("barrage_list")
  private List<BarrageListCreateStruct> barrageList = null;

  @SerializedName("dynamic_creative_group_used")
  private DynamicCreativeGroupUsed dynamicCreativeGroupUsed = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public DynamicCreativesAddRequest dynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
    return this;
  }

  /**
   * Get dynamicCreativeName
   *
   * @return dynamicCreativeName
   */
  @ApiModelProperty(value = "")
  public String getDynamicCreativeName() {
    return dynamicCreativeName;
  }

  public void setDynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
  }

  public DynamicCreativesAddRequest dynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
    return this;
  }

  /**
   * Get dynamicCreativeTemplateId
   *
   * @return dynamicCreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeTemplateId() {
    return dynamicCreativeTemplateId;
  }

  public void setDynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
  }

  public DynamicCreativesAddRequest dynamicCreativeElements(
      DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
    return this;
  }

  /**
   * Get dynamicCreativeElements
   *
   * @return dynamicCreativeElements
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeElements getDynamicCreativeElements() {
    return dynamicCreativeElements;
  }

  public void setDynamicCreativeElements(DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
  }

  public DynamicCreativesAddRequest campaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Get campaignType
   *
   * @return campaignType
   */
  @ApiModelProperty(value = "")
  public CampaignType getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
  }

  public DynamicCreativesAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public DynamicCreativesAddRequest pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public DynamicCreativesAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  /**
   * Get automaticSiteEnabled
   *
   * @return automaticSiteEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutomaticSiteEnabled() {
    return automaticSiteEnabled;
  }

  public void setAutomaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
  }

  public DynamicCreativesAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public DynamicCreativesAddRequest addSiteSetItem(String siteSetItem) {
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
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public DynamicCreativesAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public DynamicCreativesAddRequest pageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public DynamicCreativePageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public DynamicCreativesAddRequest deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public DynamicCreativesAddRequest impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

  /**
   * Get impressionTrackingUrl
   *
   * @return impressionTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public DynamicCreativesAddRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * Get clickTrackingUrl
   *
   * @return clickTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public DynamicCreativesAddRequest feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
    return this;
  }

  /**
   * Get feedsVideoCommentSwitch
   *
   * @return feedsVideoCommentSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isFeedsVideoCommentSwitch() {
    return feedsVideoCommentSwitch;
  }

  public void setFeedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
  }

  public DynamicCreativesAddRequest unionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
    return this;
  }

  /**
   * Get unionMarketSwitch
   *
   * @return unionMarketSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isUnionMarketSwitch() {
    return unionMarketSwitch;
  }

  public void setUnionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
  }

  public DynamicCreativesAddRequest profileId(Long profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   *
   * @return profileId
   */
  @ApiModelProperty(value = "")
  public Long getProfileId() {
    return profileId;
  }

  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }

  public DynamicCreativesAddRequest dynamicAdcreativeSpec(
      DynamicAdcreativeSpecForDc dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
    return this;
  }

  /**
   * Get dynamicAdcreativeSpec
   *
   * @return dynamicAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdcreativeSpecForDc getDynamicAdcreativeSpec() {
    return dynamicAdcreativeSpec;
  }

  public void setDynamicAdcreativeSpec(DynamicAdcreativeSpecForDc dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
  }

  public DynamicCreativesAddRequest videoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
    return this;
  }

  /**
   * Get videoEndPage
   *
   * @return videoEndPage
   */
  @ApiModelProperty(value = "")
  public VideoEndPageSpec getVideoEndPage() {
    return videoEndPage;
  }

  public void setVideoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
  }

  public DynamicCreativesAddRequest barrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
    return this;
  }

  public DynamicCreativesAddRequest addBarrageListItem(BarrageListCreateStruct barrageListItem) {
    if (this.barrageList == null) {
      this.barrageList = new ArrayList<BarrageListCreateStruct>();
    }
    this.barrageList.add(barrageListItem);
    return this;
  }

  /**
   * Get barrageList
   *
   * @return barrageList
   */
  @ApiModelProperty(value = "")
  public List<BarrageListCreateStruct> getBarrageList() {
    return barrageList;
  }

  public void setBarrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
  }

  public DynamicCreativesAddRequest dynamicCreativeGroupUsed(
      DynamicCreativeGroupUsed dynamicCreativeGroupUsed) {
    this.dynamicCreativeGroupUsed = dynamicCreativeGroupUsed;
    return this;
  }

  /**
   * Get dynamicCreativeGroupUsed
   *
   * @return dynamicCreativeGroupUsed
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeGroupUsed getDynamicCreativeGroupUsed() {
    return dynamicCreativeGroupUsed;
  }

  public void setDynamicCreativeGroupUsed(DynamicCreativeGroupUsed dynamicCreativeGroupUsed) {
    this.dynamicCreativeGroupUsed = dynamicCreativeGroupUsed;
  }

  public DynamicCreativesAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesAddRequest dynamicCreativesAddRequest = (DynamicCreativesAddRequest) o;
    return Objects.equals(this.dynamicCreativeName, dynamicCreativesAddRequest.dynamicCreativeName)
        && Objects.equals(
            this.dynamicCreativeTemplateId, dynamicCreativesAddRequest.dynamicCreativeTemplateId)
        && Objects.equals(
            this.dynamicCreativeElements, dynamicCreativesAddRequest.dynamicCreativeElements)
        && Objects.equals(this.campaignType, dynamicCreativesAddRequest.campaignType)
        && Objects.equals(this.promotedObjectType, dynamicCreativesAddRequest.promotedObjectType)
        && Objects.equals(this.pageType, dynamicCreativesAddRequest.pageType)
        && Objects.equals(
            this.automaticSiteEnabled, dynamicCreativesAddRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, dynamicCreativesAddRequest.siteSet)
        && Objects.equals(this.promotedObjectId, dynamicCreativesAddRequest.promotedObjectId)
        && Objects.equals(this.pageSpec, dynamicCreativesAddRequest.pageSpec)
        && Objects.equals(this.deepLinkUrl, dynamicCreativesAddRequest.deepLinkUrl)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesAddRequest.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesAddRequest.clickTrackingUrl)
        && Objects.equals(
            this.feedsVideoCommentSwitch, dynamicCreativesAddRequest.feedsVideoCommentSwitch)
        && Objects.equals(this.unionMarketSwitch, dynamicCreativesAddRequest.unionMarketSwitch)
        && Objects.equals(this.profileId, dynamicCreativesAddRequest.profileId)
        && Objects.equals(
            this.dynamicAdcreativeSpec, dynamicCreativesAddRequest.dynamicAdcreativeSpec)
        && Objects.equals(this.videoEndPage, dynamicCreativesAddRequest.videoEndPage)
        && Objects.equals(this.barrageList, dynamicCreativesAddRequest.barrageList)
        && Objects.equals(
            this.dynamicCreativeGroupUsed, dynamicCreativesAddRequest.dynamicCreativeGroupUsed)
        && Objects.equals(this.accountId, dynamicCreativesAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dynamicCreativeName,
        dynamicCreativeTemplateId,
        dynamicCreativeElements,
        campaignType,
        promotedObjectType,
        pageType,
        automaticSiteEnabled,
        siteSet,
        promotedObjectId,
        pageSpec,
        deepLinkUrl,
        impressionTrackingUrl,
        clickTrackingUrl,
        feedsVideoCommentSwitch,
        unionMarketSwitch,
        profileId,
        dynamicAdcreativeSpec,
        videoEndPage,
        barrageList,
        dynamicCreativeGroupUsed,
        accountId);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
