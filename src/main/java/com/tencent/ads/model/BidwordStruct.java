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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 关键词信息 */
@ApiModel(description = "关键词信息")
public class BidwordStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("bidword")
  private String bidword = null;

  @SerializedName("bid_price")
  private Long bidPrice = null;

  @SerializedName("use_group_price")
  private UseGroupPriceType useGroupPrice = null;

  @SerializedName("match_type")
  private BidwordMatchType matchType = null;

  @SerializedName("configured_status")
  private BidwordPauseType configuredStatus = null;

  @SerializedName("pc_landing_page_info")
  private List<KeywordLandingPageInfo> pcLandingPageInfo = null;

  @SerializedName("mobile_landing_page_info")
  private List<KeywordLandingPageInfo> mobileLandingPageInfo = null;

  public BidwordStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public BidwordStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public BidwordStruct bidword(String bidword) {
    this.bidword = bidword;
    return this;
  }

  /**
   * Get bidword
   *
   * @return bidword
   */
  @ApiModelProperty(value = "")
  public String getBidword() {
    return bidword;
  }

  public void setBidword(String bidword) {
    this.bidword = bidword;
  }

  public BidwordStruct bidPrice(Long bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

  /**
   * Get bidPrice
   *
   * @return bidPrice
   */
  @ApiModelProperty(value = "")
  public Long getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Long bidPrice) {
    this.bidPrice = bidPrice;
  }

  public BidwordStruct useGroupPrice(UseGroupPriceType useGroupPrice) {
    this.useGroupPrice = useGroupPrice;
    return this;
  }

  /**
   * Get useGroupPrice
   *
   * @return useGroupPrice
   */
  @ApiModelProperty(value = "")
  public UseGroupPriceType getUseGroupPrice() {
    return useGroupPrice;
  }

  public void setUseGroupPrice(UseGroupPriceType useGroupPrice) {
    this.useGroupPrice = useGroupPrice;
  }

  public BidwordStruct matchType(BidwordMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   *
   * @return matchType
   */
  @ApiModelProperty(value = "")
  public BidwordMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(BidwordMatchType matchType) {
    this.matchType = matchType;
  }

  public BidwordStruct configuredStatus(BidwordPauseType configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public BidwordPauseType getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(BidwordPauseType configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public BidwordStruct pcLandingPageInfo(List<KeywordLandingPageInfo> pcLandingPageInfo) {
    this.pcLandingPageInfo = pcLandingPageInfo;
    return this;
  }

  public BidwordStruct addPcLandingPageInfoItem(KeywordLandingPageInfo pcLandingPageInfoItem) {
    if (this.pcLandingPageInfo == null) {
      this.pcLandingPageInfo = new ArrayList<KeywordLandingPageInfo>();
    }
    this.pcLandingPageInfo.add(pcLandingPageInfoItem);
    return this;
  }

  /**
   * Get pcLandingPageInfo
   *
   * @return pcLandingPageInfo
   */
  @ApiModelProperty(value = "")
  public List<KeywordLandingPageInfo> getPcLandingPageInfo() {
    return pcLandingPageInfo;
  }

  public void setPcLandingPageInfo(List<KeywordLandingPageInfo> pcLandingPageInfo) {
    this.pcLandingPageInfo = pcLandingPageInfo;
  }

  public BidwordStruct mobileLandingPageInfo(List<KeywordLandingPageInfo> mobileLandingPageInfo) {
    this.mobileLandingPageInfo = mobileLandingPageInfo;
    return this;
  }

  public BidwordStruct addMobileLandingPageInfoItem(
      KeywordLandingPageInfo mobileLandingPageInfoItem) {
    if (this.mobileLandingPageInfo == null) {
      this.mobileLandingPageInfo = new ArrayList<KeywordLandingPageInfo>();
    }
    this.mobileLandingPageInfo.add(mobileLandingPageInfoItem);
    return this;
  }

  /**
   * Get mobileLandingPageInfo
   *
   * @return mobileLandingPageInfo
   */
  @ApiModelProperty(value = "")
  public List<KeywordLandingPageInfo> getMobileLandingPageInfo() {
    return mobileLandingPageInfo;
  }

  public void setMobileLandingPageInfo(List<KeywordLandingPageInfo> mobileLandingPageInfo) {
    this.mobileLandingPageInfo = mobileLandingPageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidwordStruct bidwordStruct = (BidwordStruct) o;
    return Objects.equals(this.campaignId, bidwordStruct.campaignId)
        && Objects.equals(this.adgroupId, bidwordStruct.adgroupId)
        && Objects.equals(this.bidword, bidwordStruct.bidword)
        && Objects.equals(this.bidPrice, bidwordStruct.bidPrice)
        && Objects.equals(this.useGroupPrice, bidwordStruct.useGroupPrice)
        && Objects.equals(this.matchType, bidwordStruct.matchType)
        && Objects.equals(this.configuredStatus, bidwordStruct.configuredStatus)
        && Objects.equals(this.pcLandingPageInfo, bidwordStruct.pcLandingPageInfo)
        && Objects.equals(this.mobileLandingPageInfo, bidwordStruct.mobileLandingPageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        adgroupId,
        bidword,
        bidPrice,
        useGroupPrice,
        matchType,
        configuredStatus,
        pcLandingPageInfo,
        mobileLandingPageInfo);
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
