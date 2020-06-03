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
 * 更新单个广告组客户设置的状态条件
 */
@ApiModel(description = "更新单个广告组客户设置的状态条件")

public class AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct {

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  public AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct adgroupId(Long adgroupId) {
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

  public AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct configuredStatus(
      AdStatus configuredStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct adgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct = (AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct) o;
    return Objects.equals(this.adgroupId,
        adgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct.adgroupId) &&
        Objects.equals(this.configuredStatus,
            adgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct.configuredStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, configuredStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupsUpdateConfiguredStatusUpdateConfiguredStatusStruct {\n");

    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    configuredStatus: ").append(toIndentedString(configuredStatus)).append("\n");
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

