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
 * 效果数据（曝光）
 */
@ApiModel(description = "效果数据（曝光）")

public class EffectDataStruct {

  @SerializedName("count")
  private Long count = null;

  @SerializedName("ratio")
  private Double ratio = null;

  @SerializedName("category_win")
  private Double categoryWin = null;

  @SerializedName("category_avg")
  private Double categoryAvg = null;

  public EffectDataStruct count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   *
   * @return count
   **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public EffectDataStruct ratio(Double ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   *
   * @return ratio
   **/
  @ApiModelProperty(value = "")
  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  public EffectDataStruct categoryWin(Double categoryWin) {
    this.categoryWin = categoryWin;
    return this;
  }

  /**
   * Get categoryWin
   *
   * @return categoryWin
   **/
  @ApiModelProperty(value = "")
  public Double getCategoryWin() {
    return categoryWin;
  }

  public void setCategoryWin(Double categoryWin) {
    this.categoryWin = categoryWin;
  }

  public EffectDataStruct categoryAvg(Double categoryAvg) {
    this.categoryAvg = categoryAvg;
    return this;
  }

  /**
   * Get categoryAvg
   *
   * @return categoryAvg
   **/
  @ApiModelProperty(value = "")
  public Double getCategoryAvg() {
    return categoryAvg;
  }

  public void setCategoryAvg(Double categoryAvg) {
    this.categoryAvg = categoryAvg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectDataStruct effectDataStruct = (EffectDataStruct) o;
    return Objects.equals(this.count, effectDataStruct.count) &&
        Objects.equals(this.ratio, effectDataStruct.ratio) &&
        Objects.equals(this.categoryWin, effectDataStruct.categoryWin) &&
        Objects.equals(this.categoryAvg, effectDataStruct.categoryAvg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, ratio, categoryWin, categoryAvg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectDataStruct {\n");

    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    categoryWin: ").append(toIndentedString(categoryWin)).append("\n");
    sb.append("    categoryAvg: ").append(toIndentedString(categoryAvg)).append("\n");
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

