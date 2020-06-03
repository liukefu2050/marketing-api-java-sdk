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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * AdgroupsUpdateResponseData
 */

public class AdgroupsUpdateResponseData {

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  public AdgroupsUpdateResponseData adgroupId(Long adgroupId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateResponseData adgroupsUpdateResponseData = (AdgroupsUpdateResponseData) o;
    return Objects.equals(this.adgroupId, adgroupsUpdateResponseData.adgroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupsUpdateResponseData {\n");

    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
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

