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
 * 优化内容
 */
@ApiModel(description = "优化内容")

public class OptimizeSubContentStruct {

  @SerializedName("targeting")
  private OptTargetingStruct targeting = null;

  @SerializedName("bid")
  private OptBidStruct bid = null;

  @SerializedName("budget")
  private OptBudgetStruct budget = null;

  public OptimizeSubContentStruct targeting(OptTargetingStruct targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   **/
  @ApiModelProperty(value = "")
  public OptTargetingStruct getTargeting() {
    return targeting;
  }

  public void setTargeting(OptTargetingStruct targeting) {
    this.targeting = targeting;
  }

  public OptimizeSubContentStruct bid(OptBidStruct bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   *
   * @return bid
   **/
  @ApiModelProperty(value = "")
  public OptBidStruct getBid() {
    return bid;
  }

  public void setBid(OptBidStruct bid) {
    this.bid = bid;
  }

  public OptimizeSubContentStruct budget(OptBudgetStruct budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   *
   * @return budget
   **/
  @ApiModelProperty(value = "")
  public OptBudgetStruct getBudget() {
    return budget;
  }

  public void setBudget(OptBudgetStruct budget) {
    this.budget = budget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizeSubContentStruct optimizeSubContentStruct = (OptimizeSubContentStruct) o;
    return Objects.equals(this.targeting, optimizeSubContentStruct.targeting) &&
        Objects.equals(this.bid, optimizeSubContentStruct.bid) &&
        Objects.equals(this.budget, optimizeSubContentStruct.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targeting, bid, budget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizeSubContentStruct {\n");

    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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

