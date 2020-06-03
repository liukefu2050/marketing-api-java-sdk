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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 效果数据变化趋势节点
 */
@ApiModel(description = "效果数据变化趋势节点")

public class EffectDataTrendsListItem {

  @SerializedName("date")
  private String date = null;

  @SerializedName("trends")
  private List<PointStruct> trends = null;

  public EffectDataTrendsListItem date(String date) {
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

  public EffectDataTrendsListItem trends(List<PointStruct> trends) {
    this.trends = trends;
    return this;
  }

  public EffectDataTrendsListItem addTrendsItem(PointStruct trendsItem) {
    if (this.trends == null) {
      this.trends = new ArrayList<PointStruct>();
    }
    this.trends.add(trendsItem);
    return this;
  }

  /**
   * Get trends
   *
   * @return trends
   **/
  @ApiModelProperty(value = "")
  public List<PointStruct> getTrends() {
    return trends;
  }

  public void setTrends(List<PointStruct> trends) {
    this.trends = trends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectDataTrendsListItem effectDataTrendsListItem = (EffectDataTrendsListItem) o;
    return Objects.equals(this.date, effectDataTrendsListItem.date) &&
        Objects.equals(this.trends, effectDataTrendsListItem.trends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, trends);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectDataTrendsListItem {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    trends: ").append(toIndentedString(trends)).append("\n");
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

