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
import java.util.Objects;

/**
 * 推广计划信息
 */
@ApiModel(description = "推广计划信息")

public class CampaignTargeting {

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("campaign_type")
  private CampaignType campaignType = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  public CampaignTargeting campaignId(Long campaignId) {
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

  public CampaignTargeting campaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Get campaignType
   *
   * @return campaignType
   **/
  @ApiModelProperty(value = "")
  public CampaignType getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
  }

  public CampaignTargeting dailyBudget(Long dailyBudget) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargeting campaignTargeting = (CampaignTargeting) o;
    return Objects.equals(this.campaignId, campaignTargeting.campaignId) &&
        Objects.equals(this.campaignType, campaignTargeting.campaignType) &&
        Objects.equals(this.dailyBudget, campaignTargeting.dailyBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignType, dailyBudget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargeting {\n");

    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    dailyBudget: ").append(toIndentedString(dailyBudget)).append("\n");
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

