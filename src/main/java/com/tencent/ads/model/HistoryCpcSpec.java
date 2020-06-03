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
 *
 */
@ApiModel(description = "")

public class HistoryCpcSpec {

  @SerializedName("date")
  private String date = null;

  @SerializedName("actual_cpc")
  private Long actualCpc = null;

  @SerializedName("target_cpc")
  private Long targetCpc = null;

  public HistoryCpcSpec date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public HistoryCpcSpec actualCpc(Long actualCpc) {
    this.actualCpc = actualCpc;
    return this;
  }

  /**
   * Get actualCpc
   *
   * @return actualCpc
   **/
  @ApiModelProperty(value = "")
  public Long getActualCpc() {
    return actualCpc;
  }

  public void setActualCpc(Long actualCpc) {
    this.actualCpc = actualCpc;
  }

  public HistoryCpcSpec targetCpc(Long targetCpc) {
    this.targetCpc = targetCpc;
    return this;
  }

  /**
   * Get targetCpc
   *
   * @return targetCpc
   **/
  @ApiModelProperty(value = "")
  public Long getTargetCpc() {
    return targetCpc;
  }

  public void setTargetCpc(Long targetCpc) {
    this.targetCpc = targetCpc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryCpcSpec historyCpcSpec = (HistoryCpcSpec) o;
    return Objects.equals(this.date, historyCpcSpec.date) &&
        Objects.equals(this.actualCpc, historyCpcSpec.actualCpc) &&
        Objects.equals(this.targetCpc, historyCpcSpec.targetCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, actualCpc, targetCpc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryCpcSpec {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    actualCpc: ").append(toIndentedString(actualCpc)).append("\n");
    sb.append("    targetCpc: ").append(toIndentedString(targetCpc)).append("\n");
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

