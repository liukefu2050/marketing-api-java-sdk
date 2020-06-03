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
 * 竞争激烈度明细数据
 */
@ApiModel(description = "竞争激烈度明细数据")

public class CompititionSpec {

  @SerializedName("date")
  private String date = null;

  @SerializedName("hour")
  private Long hour = null;

  @SerializedName("compitition_score")
  private Long compititionScore = null;

  public CompititionSpec date(String date) {
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

  public CompititionSpec hour(Long hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   *
   * @return hour
   **/
  @ApiModelProperty(value = "")
  public Long getHour() {
    return hour;
  }

  public void setHour(Long hour) {
    this.hour = hour;
  }

  public CompititionSpec compititionScore(Long compititionScore) {
    this.compititionScore = compititionScore;
    return this;
  }

  /**
   * Get compititionScore
   *
   * @return compititionScore
   **/
  @ApiModelProperty(value = "")
  public Long getCompititionScore() {
    return compititionScore;
  }

  public void setCompititionScore(Long compititionScore) {
    this.compititionScore = compititionScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompititionSpec compititionSpec = (CompititionSpec) o;
    return Objects.equals(this.date, compititionSpec.date) &&
        Objects.equals(this.hour, compititionSpec.hour) &&
        Objects.equals(this.compititionScore, compititionSpec.compititionScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hour, compititionScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompititionSpec {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    compititionScore: ").append(toIndentedString(compititionScore)).append("\n");
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

