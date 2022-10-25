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
public class BidwordUpdateStruct {
  @SerializedName("bidword_id")
  private Long bidwordId = null;

  @SerializedName("bid_price")
  private Long bidPrice = null;

  @SerializedName("bid_mode")
  private BidMode bidMode = null;

  @SerializedName("use_group_price")
  private UseGroupPriceType useGroupPrice = null;

  @SerializedName("price_update_type")
  private BidwordPriceUpdateType priceUpdateType = null;

  @SerializedName("raise_price")
  private Long raisePrice = null;

  @SerializedName("match_type")
  private BidwordMatchType matchType = null;

  @SerializedName("configured_status")
  private BidwordPauseType configuredStatus = null;

  @SerializedName("pc_landing_page_info")
  private List<KeywordLandingPageInfo> pcLandingPageInfo = null;

  @SerializedName("mobile_landing_page_info")
  private List<KeywordLandingPageInfo> mobileLandingPageInfo = null;

  public BidwordUpdateStruct bidwordId(Long bidwordId) {
    this.bidwordId = bidwordId;
    return this;
  }

  /**
   * Get bidwordId
   *
   * @return bidwordId
   */
  @ApiModelProperty(value = "")
  public Long getBidwordId() {
    return bidwordId;
  }

  public void setBidwordId(Long bidwordId) {
    this.bidwordId = bidwordId;
  }

  public BidwordUpdateStruct bidPrice(Long bidPrice) {
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

  public BidwordUpdateStruct bidMode(BidMode bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  /**
   * Get bidMode
   *
   * @return bidMode
   */
  @ApiModelProperty(value = "")
  public BidMode getBidMode() {
    return bidMode;
  }

  public void setBidMode(BidMode bidMode) {
    this.bidMode = bidMode;
  }

  public BidwordUpdateStruct useGroupPrice(UseGroupPriceType useGroupPrice) {
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

  public BidwordUpdateStruct priceUpdateType(BidwordPriceUpdateType priceUpdateType) {
    this.priceUpdateType = priceUpdateType;
    return this;
  }

  /**
   * Get priceUpdateType
   *
   * @return priceUpdateType
   */
  @ApiModelProperty(value = "")
  public BidwordPriceUpdateType getPriceUpdateType() {
    return priceUpdateType;
  }

  public void setPriceUpdateType(BidwordPriceUpdateType priceUpdateType) {
    this.priceUpdateType = priceUpdateType;
  }

  public BidwordUpdateStruct raisePrice(Long raisePrice) {
    this.raisePrice = raisePrice;
    return this;
  }

  /**
   * Get raisePrice
   *
   * @return raisePrice
   */
  @ApiModelProperty(value = "")
  public Long getRaisePrice() {
    return raisePrice;
  }

  public void setRaisePrice(Long raisePrice) {
    this.raisePrice = raisePrice;
  }

  public BidwordUpdateStruct matchType(BidwordMatchType matchType) {
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

  public BidwordUpdateStruct configuredStatus(BidwordPauseType configuredStatus) {
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

  public BidwordUpdateStruct pcLandingPageInfo(List<KeywordLandingPageInfo> pcLandingPageInfo) {
    this.pcLandingPageInfo = pcLandingPageInfo;
    return this;
  }

  public BidwordUpdateStruct addPcLandingPageInfoItem(
      KeywordLandingPageInfo pcLandingPageInfoItem) {
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

  public BidwordUpdateStruct mobileLandingPageInfo(
      List<KeywordLandingPageInfo> mobileLandingPageInfo) {
    this.mobileLandingPageInfo = mobileLandingPageInfo;
    return this;
  }

  public BidwordUpdateStruct addMobileLandingPageInfoItem(
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
    BidwordUpdateStruct bidwordUpdateStruct = (BidwordUpdateStruct) o;
    return Objects.equals(this.bidwordId, bidwordUpdateStruct.bidwordId)
        && Objects.equals(this.bidPrice, bidwordUpdateStruct.bidPrice)
        && Objects.equals(this.bidMode, bidwordUpdateStruct.bidMode)
        && Objects.equals(this.useGroupPrice, bidwordUpdateStruct.useGroupPrice)
        && Objects.equals(this.priceUpdateType, bidwordUpdateStruct.priceUpdateType)
        && Objects.equals(this.raisePrice, bidwordUpdateStruct.raisePrice)
        && Objects.equals(this.matchType, bidwordUpdateStruct.matchType)
        && Objects.equals(this.configuredStatus, bidwordUpdateStruct.configuredStatus)
        && Objects.equals(this.pcLandingPageInfo, bidwordUpdateStruct.pcLandingPageInfo)
        && Objects.equals(this.mobileLandingPageInfo, bidwordUpdateStruct.mobileLandingPageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bidwordId,
        bidPrice,
        bidMode,
        useGroupPrice,
        priceUpdateType,
        raisePrice,
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
