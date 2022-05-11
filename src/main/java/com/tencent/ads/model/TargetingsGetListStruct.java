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
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class TargetingsGetListStruct {
  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting_name")
  private String targetingName = null;

  @SerializedName("is_include_unsupported_targeting")
  private Boolean isIncludeUnsupportedTargeting = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("ad_lock_status")
  private AdLockStatus adLockStatus = null;

  @SerializedName("targeting_translation")
  private String targetingTranslation = null;

  @SerializedName("targeting_source_type")
  private TargetingSourceType targetingSourceType = null;

  @SerializedName("share_from_account_id")
  private Long shareFromAccountId = null;

  @SerializedName("share_from_targeting_id")
  private Long shareFromTargetingId = null;

  @SerializedName("targeting")
  private ReadTargetingSetting targeting = null;

  public TargetingsGetListStruct targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   */
  @ApiModelProperty(value = "")
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public TargetingsGetListStruct targetingName(String targetingName) {
    this.targetingName = targetingName;
    return this;
  }

  /**
   * Get targetingName
   *
   * @return targetingName
   */
  @ApiModelProperty(value = "")
  public String getTargetingName() {
    return targetingName;
  }

  public void setTargetingName(String targetingName) {
    this.targetingName = targetingName;
  }

  public TargetingsGetListStruct isIncludeUnsupportedTargeting(
      Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
    return this;
  }

  /**
   * Get isIncludeUnsupportedTargeting
   *
   * @return isIncludeUnsupportedTargeting
   */
  @ApiModelProperty(value = "")
  public Boolean isIsIncludeUnsupportedTargeting() {
    return isIncludeUnsupportedTargeting;
  }

  public void setIsIncludeUnsupportedTargeting(Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
  }

  public TargetingsGetListStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TargetingsGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public TargetingsGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingsGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public TargetingsGetListStruct adLockStatus(AdLockStatus adLockStatus) {
    this.adLockStatus = adLockStatus;
    return this;
  }

  /**
   * Get adLockStatus
   *
   * @return adLockStatus
   */
  @ApiModelProperty(value = "")
  public AdLockStatus getAdLockStatus() {
    return adLockStatus;
  }

  public void setAdLockStatus(AdLockStatus adLockStatus) {
    this.adLockStatus = adLockStatus;
  }

  public TargetingsGetListStruct targetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
    return this;
  }

  /**
   * Get targetingTranslation
   *
   * @return targetingTranslation
   */
  @ApiModelProperty(value = "")
  public String getTargetingTranslation() {
    return targetingTranslation;
  }

  public void setTargetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
  }

  public TargetingsGetListStruct targetingSourceType(TargetingSourceType targetingSourceType) {
    this.targetingSourceType = targetingSourceType;
    return this;
  }

  /**
   * Get targetingSourceType
   *
   * @return targetingSourceType
   */
  @ApiModelProperty(value = "")
  public TargetingSourceType getTargetingSourceType() {
    return targetingSourceType;
  }

  public void setTargetingSourceType(TargetingSourceType targetingSourceType) {
    this.targetingSourceType = targetingSourceType;
  }

  public TargetingsGetListStruct shareFromAccountId(Long shareFromAccountId) {
    this.shareFromAccountId = shareFromAccountId;
    return this;
  }

  /**
   * Get shareFromAccountId
   *
   * @return shareFromAccountId
   */
  @ApiModelProperty(value = "")
  public Long getShareFromAccountId() {
    return shareFromAccountId;
  }

  public void setShareFromAccountId(Long shareFromAccountId) {
    this.shareFromAccountId = shareFromAccountId;
  }

  public TargetingsGetListStruct shareFromTargetingId(Long shareFromTargetingId) {
    this.shareFromTargetingId = shareFromTargetingId;
    return this;
  }

  /**
   * Get shareFromTargetingId
   *
   * @return shareFromTargetingId
   */
  @ApiModelProperty(value = "")
  public Long getShareFromTargetingId() {
    return shareFromTargetingId;
  }

  public void setShareFromTargetingId(Long shareFromTargetingId) {
    this.shareFromTargetingId = shareFromTargetingId;
  }

  public TargetingsGetListStruct targeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public ReadTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingsGetListStruct targetingsGetListStruct = (TargetingsGetListStruct) o;
    return Objects.equals(this.targetingId, targetingsGetListStruct.targetingId)
        && Objects.equals(this.targetingName, targetingsGetListStruct.targetingName)
        && Objects.equals(
            this.isIncludeUnsupportedTargeting,
            targetingsGetListStruct.isIncludeUnsupportedTargeting)
        && Objects.equals(this.description, targetingsGetListStruct.description)
        && Objects.equals(this.isDeleted, targetingsGetListStruct.isDeleted)
        && Objects.equals(this.createdTime, targetingsGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, targetingsGetListStruct.lastModifiedTime)
        && Objects.equals(this.adLockStatus, targetingsGetListStruct.adLockStatus)
        && Objects.equals(this.targetingTranslation, targetingsGetListStruct.targetingTranslation)
        && Objects.equals(this.targetingSourceType, targetingsGetListStruct.targetingSourceType)
        && Objects.equals(this.shareFromAccountId, targetingsGetListStruct.shareFromAccountId)
        && Objects.equals(this.shareFromTargetingId, targetingsGetListStruct.shareFromTargetingId)
        && Objects.equals(this.targeting, targetingsGetListStruct.targeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        targetingId,
        targetingName,
        isIncludeUnsupportedTargeting,
        description,
        isDeleted,
        createdTime,
        lastModifiedTime,
        adLockStatus,
        targetingTranslation,
        targetingSourceType,
        shareFromAccountId,
        shareFromTargetingId,
        targeting);
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
