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

/** 创意组件信息 */
@ApiModel(description = "创意组件信息")
public class CreativeComponentStruct {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("component_name")
  private String componentName = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("component_type")
  private CreativeComponentType componentType = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("promoted_object_name")
  private String promotedObjectName = null;

  @SerializedName("status")
  private AdStatus status = null;

  @SerializedName("audit_status")
  private CreativeComponentAuditStatus auditStatus = null;

  @SerializedName("audit_msg")
  private String auditMsg = null;

  @SerializedName("component_spec")
  private CreativeComponentSpecStruct componentSpec = null;

  @SerializedName("promoted_object_spec")
  private PromotedObjectSpec promotedObjectSpec = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("is_publish_enabled")
  private Boolean isPublishEnabled = null;

  public CreativeComponentStruct accountId(Long accountId) {
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

  public CreativeComponentStruct componentName(String componentName) {
    this.componentName = componentName;
    return this;
  }

  /**
   * Get componentName
   *
   * @return componentName
   */
  @ApiModelProperty(value = "")
  public String getComponentName() {
    return componentName;
  }

  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  public CreativeComponentStruct componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public CreativeComponentStruct componentType(CreativeComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   *
   * @return componentType
   */
  @ApiModelProperty(value = "")
  public CreativeComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(CreativeComponentType componentType) {
    this.componentType = componentType;
  }

  public CreativeComponentStruct promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public CreativeComponentStruct promotedObjectId(String promotedObjectId) {
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

  public CreativeComponentStruct promotedObjectName(String promotedObjectName) {
    this.promotedObjectName = promotedObjectName;
    return this;
  }

  /**
   * Get promotedObjectName
   *
   * @return promotedObjectName
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectName() {
    return promotedObjectName;
  }

  public void setPromotedObjectName(String promotedObjectName) {
    this.promotedObjectName = promotedObjectName;
  }

  public CreativeComponentStruct status(AdStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public AdStatus getStatus() {
    return status;
  }

  public void setStatus(AdStatus status) {
    this.status = status;
  }

  public CreativeComponentStruct auditStatus(CreativeComponentAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
    return this;
  }

  /**
   * Get auditStatus
   *
   * @return auditStatus
   */
  @ApiModelProperty(value = "")
  public CreativeComponentAuditStatus getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(CreativeComponentAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }

  public CreativeComponentStruct auditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
    return this;
  }

  /**
   * Get auditMsg
   *
   * @return auditMsg
   */
  @ApiModelProperty(value = "")
  public String getAuditMsg() {
    return auditMsg;
  }

  public void setAuditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
  }

  public CreativeComponentStruct componentSpec(CreativeComponentSpecStruct componentSpec) {
    this.componentSpec = componentSpec;
    return this;
  }

  /**
   * Get componentSpec
   *
   * @return componentSpec
   */
  @ApiModelProperty(value = "")
  public CreativeComponentSpecStruct getComponentSpec() {
    return componentSpec;
  }

  public void setComponentSpec(CreativeComponentSpecStruct componentSpec) {
    this.componentSpec = componentSpec;
  }

  public CreativeComponentStruct promotedObjectSpec(PromotedObjectSpec promotedObjectSpec) {
    this.promotedObjectSpec = promotedObjectSpec;
    return this;
  }

  /**
   * Get promotedObjectSpec
   *
   * @return promotedObjectSpec
   */
  @ApiModelProperty(value = "")
  public PromotedObjectSpec getPromotedObjectSpec() {
    return promotedObjectSpec;
  }

  public void setPromotedObjectSpec(PromotedObjectSpec promotedObjectSpec) {
    this.promotedObjectSpec = promotedObjectSpec;
  }

  public CreativeComponentStruct createdTime(Long createdTime) {
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

  public CreativeComponentStruct lastModifiedTime(Long lastModifiedTime) {
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

  public CreativeComponentStruct isPublishEnabled(Boolean isPublishEnabled) {
    this.isPublishEnabled = isPublishEnabled;
    return this;
  }

  /**
   * Get isPublishEnabled
   *
   * @return isPublishEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isIsPublishEnabled() {
    return isPublishEnabled;
  }

  public void setIsPublishEnabled(Boolean isPublishEnabled) {
    this.isPublishEnabled = isPublishEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeComponentStruct creativeComponentStruct = (CreativeComponentStruct) o;
    return Objects.equals(this.accountId, creativeComponentStruct.accountId)
        && Objects.equals(this.componentName, creativeComponentStruct.componentName)
        && Objects.equals(this.componentId, creativeComponentStruct.componentId)
        && Objects.equals(this.componentType, creativeComponentStruct.componentType)
        && Objects.equals(this.promotedObjectType, creativeComponentStruct.promotedObjectType)
        && Objects.equals(this.promotedObjectId, creativeComponentStruct.promotedObjectId)
        && Objects.equals(this.promotedObjectName, creativeComponentStruct.promotedObjectName)
        && Objects.equals(this.status, creativeComponentStruct.status)
        && Objects.equals(this.auditStatus, creativeComponentStruct.auditStatus)
        && Objects.equals(this.auditMsg, creativeComponentStruct.auditMsg)
        && Objects.equals(this.componentSpec, creativeComponentStruct.componentSpec)
        && Objects.equals(this.promotedObjectSpec, creativeComponentStruct.promotedObjectSpec)
        && Objects.equals(this.createdTime, creativeComponentStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, creativeComponentStruct.lastModifiedTime)
        && Objects.equals(this.isPublishEnabled, creativeComponentStruct.isPublishEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        componentName,
        componentId,
        componentType,
        promotedObjectType,
        promotedObjectId,
        promotedObjectName,
        status,
        auditStatus,
        auditMsg,
        componentSpec,
        promotedObjectSpec,
        createdTime,
        lastModifiedTime,
        isPublishEnabled);
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
