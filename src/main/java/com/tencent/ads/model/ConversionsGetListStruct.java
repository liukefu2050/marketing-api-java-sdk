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
 * 返回结构
 */
@ApiModel(description = "返回结构")

public class ConversionsGetListStruct {

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("conversion_name")
  private String conversionName = null;

  @SerializedName("access_type")
  private AccessType accessType = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("claim_type")
  private ClaimType claimType = null;

  @SerializedName("feedback_url")
  private String feedbackUrl = null;

  @SerializedName("self_attributed")
  private Boolean selfAttributed = null;

  @SerializedName("optimization_goal")
  private IntOptimizationGoal optimizationGoal = null;

  @SerializedName("deep_behavior_optimization_goal")
  private IntOptimizationGoal deepBehaviorOptimizationGoal = null;

  @SerializedName("deep_worth_optimization_goal")
  private ConversionOptimizationGoal deepWorthOptimizationGoal = null;

  @SerializedName("user_action_set_id")
  private Long userActionSetId = null;

  @SerializedName("site_set_enable")
  private Boolean siteSetEnable = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("access_status")
  private AccessStatus accessStatus = null;

  public ConversionsGetListStruct conversionId(Long conversionId) {
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

  public ConversionsGetListStruct conversionName(String conversionName) {
    this.conversionName = conversionName;
    return this;
  }

  /**
   * Get conversionName
   *
   * @return conversionName
   **/
  @ApiModelProperty(value = "")
  public String getConversionName() {
    return conversionName;
  }

  public void setConversionName(String conversionName) {
    this.conversionName = conversionName;
  }

  public ConversionsGetListStruct accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   *
   * @return accessType
   **/
  @ApiModelProperty(value = "")
  public AccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }

  public ConversionsGetListStruct promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public ConversionsGetListStruct promotedObjectId(String promotedObjectId) {
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

  public ConversionsGetListStruct claimType(ClaimType claimType) {
    this.claimType = claimType;
    return this;
  }

  /**
   * Get claimType
   *
   * @return claimType
   **/
  @ApiModelProperty(value = "")
  public ClaimType getClaimType() {
    return claimType;
  }

  public void setClaimType(ClaimType claimType) {
    this.claimType = claimType;
  }

  public ConversionsGetListStruct feedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
    return this;
  }

  /**
   * Get feedbackUrl
   *
   * @return feedbackUrl
   **/
  @ApiModelProperty(value = "")
  public String getFeedbackUrl() {
    return feedbackUrl;
  }

  public void setFeedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }

  public ConversionsGetListStruct selfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
    return this;
  }

  /**
   * Get selfAttributed
   *
   * @return selfAttributed
   **/
  @ApiModelProperty(value = "")
  public Boolean isSelfAttributed() {
    return selfAttributed;
  }

  public void setSelfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
  }

  public ConversionsGetListStruct optimizationGoal(IntOptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   **/
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(IntOptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public ConversionsGetListStruct deepBehaviorOptimizationGoal(
      IntOptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
    return this;
  }

  /**
   * Get deepBehaviorOptimizationGoal
   *
   * @return deepBehaviorOptimizationGoal
   **/
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getDeepBehaviorOptimizationGoal() {
    return deepBehaviorOptimizationGoal;
  }

  public void setDeepBehaviorOptimizationGoal(IntOptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
  }

  public ConversionsGetListStruct deepWorthOptimizationGoal(
      ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
    return this;
  }

  /**
   * Get deepWorthOptimizationGoal
   *
   * @return deepWorthOptimizationGoal
   **/
  @ApiModelProperty(value = "")
  public ConversionOptimizationGoal getDeepWorthOptimizationGoal() {
    return deepWorthOptimizationGoal;
  }

  public void setDeepWorthOptimizationGoal(ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
  }

  public ConversionsGetListStruct userActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
    return this;
  }

  /**
   * Get userActionSetId
   *
   * @return userActionSetId
   **/
  @ApiModelProperty(value = "")
  public Long getUserActionSetId() {
    return userActionSetId;
  }

  public void setUserActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
  }

  public ConversionsGetListStruct siteSetEnable(Boolean siteSetEnable) {
    this.siteSetEnable = siteSetEnable;
    return this;
  }

  /**
   * Get siteSetEnable
   *
   * @return siteSetEnable
   **/
  @ApiModelProperty(value = "")
  public Boolean isSiteSetEnable() {
    return siteSetEnable;
  }

  public void setSiteSetEnable(Boolean siteSetEnable) {
    this.siteSetEnable = siteSetEnable;
  }

  public ConversionsGetListStruct isDeleted(Boolean isDeleted) {
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

  public ConversionsGetListStruct accessStatus(AccessStatus accessStatus) {
    this.accessStatus = accessStatus;
    return this;
  }

  /**
   * Get accessStatus
   *
   * @return accessStatus
   **/
  @ApiModelProperty(value = "")
  public AccessStatus getAccessStatus() {
    return accessStatus;
  }

  public void setAccessStatus(AccessStatus accessStatus) {
    this.accessStatus = accessStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionsGetListStruct conversionsGetListStruct = (ConversionsGetListStruct) o;
    return Objects.equals(this.conversionId, conversionsGetListStruct.conversionId) &&
        Objects.equals(this.conversionName, conversionsGetListStruct.conversionName) &&
        Objects.equals(this.accessType, conversionsGetListStruct.accessType) &&
        Objects.equals(this.promotedObjectType, conversionsGetListStruct.promotedObjectType) &&
        Objects.equals(this.promotedObjectId, conversionsGetListStruct.promotedObjectId) &&
        Objects.equals(this.claimType, conversionsGetListStruct.claimType) &&
        Objects.equals(this.feedbackUrl, conversionsGetListStruct.feedbackUrl) &&
        Objects.equals(this.selfAttributed, conversionsGetListStruct.selfAttributed) &&
        Objects.equals(this.optimizationGoal, conversionsGetListStruct.optimizationGoal) &&
        Objects.equals(this.deepBehaviorOptimizationGoal,
            conversionsGetListStruct.deepBehaviorOptimizationGoal) &&
        Objects.equals(this.deepWorthOptimizationGoal,
            conversionsGetListStruct.deepWorthOptimizationGoal) &&
        Objects.equals(this.userActionSetId, conversionsGetListStruct.userActionSetId) &&
        Objects.equals(this.siteSetEnable, conversionsGetListStruct.siteSetEnable) &&
        Objects.equals(this.isDeleted, conversionsGetListStruct.isDeleted) &&
        Objects.equals(this.accessStatus, conversionsGetListStruct.accessStatus);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(conversionId, conversionName, accessType, promotedObjectType, promotedObjectId,
            claimType, feedbackUrl, selfAttributed, optimizationGoal, deepBehaviorOptimizationGoal,
            deepWorthOptimizationGoal, userActionSetId, siteSetEnable, isDeleted, accessStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionsGetListStruct {\n");

    sb.append("    conversionId: ").append(toIndentedString(conversionId)).append("\n");
    sb.append("    conversionName: ").append(toIndentedString(conversionName)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    promotedObjectType: ").append(toIndentedString(promotedObjectType)).append("\n");
    sb.append("    promotedObjectId: ").append(toIndentedString(promotedObjectId)).append("\n");
    sb.append("    claimType: ").append(toIndentedString(claimType)).append("\n");
    sb.append("    feedbackUrl: ").append(toIndentedString(feedbackUrl)).append("\n");
    sb.append("    selfAttributed: ").append(toIndentedString(selfAttributed)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    deepBehaviorOptimizationGoal: ")
        .append(toIndentedString(deepBehaviorOptimizationGoal)).append("\n");
    sb.append("    deepWorthOptimizationGoal: ").append(toIndentedString(deepWorthOptimizationGoal))
        .append("\n");
    sb.append("    userActionSetId: ").append(toIndentedString(userActionSetId)).append("\n");
    sb.append("    siteSetEnable: ").append(toIndentedString(siteSetEnable)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
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

