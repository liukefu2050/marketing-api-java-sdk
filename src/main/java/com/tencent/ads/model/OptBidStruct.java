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
 * 出价优化
 */
@ApiModel(description = "出价优化")

public class OptBidStruct {

  @SerializedName("adjust_bid_strategy_flag")
  private Boolean adjustBidStrategyFlag = null;

  @SerializedName("adjust_bid_strategy_selected_flag")
  private Boolean adjustBidStrategySelectedFlag = null;

  @SerializedName("current_bid_strategy")
  private String currentBidStrategy = null;

  @SerializedName("optimize_bid_strategy")
  private String optimizeBidStrategy = null;

  @SerializedName("open_deep_optimization_action_type_flag")
  private Boolean openDeepOptimizationActionTypeFlag = null;

  @SerializedName("open_deep_optimization_action_type_selected_flag")
  private Boolean openDeepOptimizationActionTypeSelectedFlag = null;

  @SerializedName("deep_optimization_action_type")
  private String deepOptimizationActionType = null;

  @SerializedName("deep_optimization_goal")
  private Long deepOptimizationGoal = null;

  @SerializedName("deep_optimization_target_cpa")
  private Long deepOptimizationTargetCpa = null;

  @SerializedName("adjust_bid_amount_flag")
  private Boolean adjustBidAmountFlag = null;

  @SerializedName("adjust_bid_amount_selected_flag")
  private Boolean adjustBidAmountSelectedFlag = null;

  @SerializedName("current_bid_amount")
  private Long currentBidAmount = null;

  @SerializedName("optimize_bid_amount")
  private Long optimizeBidAmount = null;

  @SerializedName("adjust_deep_bid_amount_flag")
  private Boolean adjustDeepBidAmountFlag = null;

  @SerializedName("current_deep_bid_amount")
  private Long currentDeepBidAmount = null;

  @SerializedName("optimize_deep_bid_amount")
  private Long optimizeDeepBidAmount = null;

  public OptBidStruct adjustBidStrategyFlag(Boolean adjustBidStrategyFlag) {
    this.adjustBidStrategyFlag = adjustBidStrategyFlag;
    return this;
  }

  /**
   * Get adjustBidStrategyFlag
   *
   * @return adjustBidStrategyFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustBidStrategyFlag() {
    return adjustBidStrategyFlag;
  }

  public void setAdjustBidStrategyFlag(Boolean adjustBidStrategyFlag) {
    this.adjustBidStrategyFlag = adjustBidStrategyFlag;
  }

  public OptBidStruct adjustBidStrategySelectedFlag(Boolean adjustBidStrategySelectedFlag) {
    this.adjustBidStrategySelectedFlag = adjustBidStrategySelectedFlag;
    return this;
  }

  /**
   * Get adjustBidStrategySelectedFlag
   *
   * @return adjustBidStrategySelectedFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustBidStrategySelectedFlag() {
    return adjustBidStrategySelectedFlag;
  }

  public void setAdjustBidStrategySelectedFlag(Boolean adjustBidStrategySelectedFlag) {
    this.adjustBidStrategySelectedFlag = adjustBidStrategySelectedFlag;
  }

  public OptBidStruct currentBidStrategy(String currentBidStrategy) {
    this.currentBidStrategy = currentBidStrategy;
    return this;
  }

  /**
   * Get currentBidStrategy
   *
   * @return currentBidStrategy
   **/
  @ApiModelProperty(value = "")
  public String getCurrentBidStrategy() {
    return currentBidStrategy;
  }

  public void setCurrentBidStrategy(String currentBidStrategy) {
    this.currentBidStrategy = currentBidStrategy;
  }

  public OptBidStruct optimizeBidStrategy(String optimizeBidStrategy) {
    this.optimizeBidStrategy = optimizeBidStrategy;
    return this;
  }

  /**
   * Get optimizeBidStrategy
   *
   * @return optimizeBidStrategy
   **/
  @ApiModelProperty(value = "")
  public String getOptimizeBidStrategy() {
    return optimizeBidStrategy;
  }

  public void setOptimizeBidStrategy(String optimizeBidStrategy) {
    this.optimizeBidStrategy = optimizeBidStrategy;
  }

  public OptBidStruct openDeepOptimizationActionTypeFlag(
      Boolean openDeepOptimizationActionTypeFlag) {
    this.openDeepOptimizationActionTypeFlag = openDeepOptimizationActionTypeFlag;
    return this;
  }

  /**
   * Get openDeepOptimizationActionTypeFlag
   *
   * @return openDeepOptimizationActionTypeFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isOpenDeepOptimizationActionTypeFlag() {
    return openDeepOptimizationActionTypeFlag;
  }

  public void setOpenDeepOptimizationActionTypeFlag(Boolean openDeepOptimizationActionTypeFlag) {
    this.openDeepOptimizationActionTypeFlag = openDeepOptimizationActionTypeFlag;
  }

  public OptBidStruct openDeepOptimizationActionTypeSelectedFlag(
      Boolean openDeepOptimizationActionTypeSelectedFlag) {
    this.openDeepOptimizationActionTypeSelectedFlag = openDeepOptimizationActionTypeSelectedFlag;
    return this;
  }

  /**
   * Get openDeepOptimizationActionTypeSelectedFlag
   *
   * @return openDeepOptimizationActionTypeSelectedFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isOpenDeepOptimizationActionTypeSelectedFlag() {
    return openDeepOptimizationActionTypeSelectedFlag;
  }

  public void setOpenDeepOptimizationActionTypeSelectedFlag(
      Boolean openDeepOptimizationActionTypeSelectedFlag) {
    this.openDeepOptimizationActionTypeSelectedFlag = openDeepOptimizationActionTypeSelectedFlag;
  }

  public OptBidStruct deepOptimizationActionType(String deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
    return this;
  }

  /**
   * Get deepOptimizationActionType
   *
   * @return deepOptimizationActionType
   **/
  @ApiModelProperty(value = "")
  public String getDeepOptimizationActionType() {
    return deepOptimizationActionType;
  }

  public void setDeepOptimizationActionType(String deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
  }

  public OptBidStruct deepOptimizationGoal(Long deepOptimizationGoal) {
    this.deepOptimizationGoal = deepOptimizationGoal;
    return this;
  }

  /**
   * Get deepOptimizationGoal
   *
   * @return deepOptimizationGoal
   **/
  @ApiModelProperty(value = "")
  public Long getDeepOptimizationGoal() {
    return deepOptimizationGoal;
  }

  public void setDeepOptimizationGoal(Long deepOptimizationGoal) {
    this.deepOptimizationGoal = deepOptimizationGoal;
  }

  public OptBidStruct deepOptimizationTargetCpa(Long deepOptimizationTargetCpa) {
    this.deepOptimizationTargetCpa = deepOptimizationTargetCpa;
    return this;
  }

  /**
   * Get deepOptimizationTargetCpa
   *
   * @return deepOptimizationTargetCpa
   **/
  @ApiModelProperty(value = "")
  public Long getDeepOptimizationTargetCpa() {
    return deepOptimizationTargetCpa;
  }

  public void setDeepOptimizationTargetCpa(Long deepOptimizationTargetCpa) {
    this.deepOptimizationTargetCpa = deepOptimizationTargetCpa;
  }

  public OptBidStruct adjustBidAmountFlag(Boolean adjustBidAmountFlag) {
    this.adjustBidAmountFlag = adjustBidAmountFlag;
    return this;
  }

  /**
   * Get adjustBidAmountFlag
   *
   * @return adjustBidAmountFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustBidAmountFlag() {
    return adjustBidAmountFlag;
  }

  public void setAdjustBidAmountFlag(Boolean adjustBidAmountFlag) {
    this.adjustBidAmountFlag = adjustBidAmountFlag;
  }

  public OptBidStruct adjustBidAmountSelectedFlag(Boolean adjustBidAmountSelectedFlag) {
    this.adjustBidAmountSelectedFlag = adjustBidAmountSelectedFlag;
    return this;
  }

  /**
   * Get adjustBidAmountSelectedFlag
   *
   * @return adjustBidAmountSelectedFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustBidAmountSelectedFlag() {
    return adjustBidAmountSelectedFlag;
  }

  public void setAdjustBidAmountSelectedFlag(Boolean adjustBidAmountSelectedFlag) {
    this.adjustBidAmountSelectedFlag = adjustBidAmountSelectedFlag;
  }

  public OptBidStruct currentBidAmount(Long currentBidAmount) {
    this.currentBidAmount = currentBidAmount;
    return this;
  }

  /**
   * Get currentBidAmount
   *
   * @return currentBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getCurrentBidAmount() {
    return currentBidAmount;
  }

  public void setCurrentBidAmount(Long currentBidAmount) {
    this.currentBidAmount = currentBidAmount;
  }

  public OptBidStruct optimizeBidAmount(Long optimizeBidAmount) {
    this.optimizeBidAmount = optimizeBidAmount;
    return this;
  }

  /**
   * Get optimizeBidAmount
   *
   * @return optimizeBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getOptimizeBidAmount() {
    return optimizeBidAmount;
  }

  public void setOptimizeBidAmount(Long optimizeBidAmount) {
    this.optimizeBidAmount = optimizeBidAmount;
  }

  public OptBidStruct adjustDeepBidAmountFlag(Boolean adjustDeepBidAmountFlag) {
    this.adjustDeepBidAmountFlag = adjustDeepBidAmountFlag;
    return this;
  }

  /**
   * Get adjustDeepBidAmountFlag
   *
   * @return adjustDeepBidAmountFlag
   **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustDeepBidAmountFlag() {
    return adjustDeepBidAmountFlag;
  }

  public void setAdjustDeepBidAmountFlag(Boolean adjustDeepBidAmountFlag) {
    this.adjustDeepBidAmountFlag = adjustDeepBidAmountFlag;
  }

  public OptBidStruct currentDeepBidAmount(Long currentDeepBidAmount) {
    this.currentDeepBidAmount = currentDeepBidAmount;
    return this;
  }

  /**
   * Get currentDeepBidAmount
   *
   * @return currentDeepBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getCurrentDeepBidAmount() {
    return currentDeepBidAmount;
  }

  public void setCurrentDeepBidAmount(Long currentDeepBidAmount) {
    this.currentDeepBidAmount = currentDeepBidAmount;
  }

  public OptBidStruct optimizeDeepBidAmount(Long optimizeDeepBidAmount) {
    this.optimizeDeepBidAmount = optimizeDeepBidAmount;
    return this;
  }

  /**
   * Get optimizeDeepBidAmount
   *
   * @return optimizeDeepBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getOptimizeDeepBidAmount() {
    return optimizeDeepBidAmount;
  }

  public void setOptimizeDeepBidAmount(Long optimizeDeepBidAmount) {
    this.optimizeDeepBidAmount = optimizeDeepBidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptBidStruct optBidStruct = (OptBidStruct) o;
    return Objects.equals(this.adjustBidStrategyFlag, optBidStruct.adjustBidStrategyFlag) &&
        Objects
            .equals(this.adjustBidStrategySelectedFlag, optBidStruct.adjustBidStrategySelectedFlag)
        &&
        Objects.equals(this.currentBidStrategy, optBidStruct.currentBidStrategy) &&
        Objects.equals(this.optimizeBidStrategy, optBidStruct.optimizeBidStrategy) &&
        Objects.equals(this.openDeepOptimizationActionTypeFlag,
            optBidStruct.openDeepOptimizationActionTypeFlag) &&
        Objects.equals(this.openDeepOptimizationActionTypeSelectedFlag,
            optBidStruct.openDeepOptimizationActionTypeSelectedFlag) &&
        Objects.equals(this.deepOptimizationActionType, optBidStruct.deepOptimizationActionType) &&
        Objects.equals(this.deepOptimizationGoal, optBidStruct.deepOptimizationGoal) &&
        Objects.equals(this.deepOptimizationTargetCpa, optBidStruct.deepOptimizationTargetCpa) &&
        Objects.equals(this.adjustBidAmountFlag, optBidStruct.adjustBidAmountFlag) &&
        Objects.equals(this.adjustBidAmountSelectedFlag, optBidStruct.adjustBidAmountSelectedFlag)
        &&
        Objects.equals(this.currentBidAmount, optBidStruct.currentBidAmount) &&
        Objects.equals(this.optimizeBidAmount, optBidStruct.optimizeBidAmount) &&
        Objects.equals(this.adjustDeepBidAmountFlag, optBidStruct.adjustDeepBidAmountFlag) &&
        Objects.equals(this.currentDeepBidAmount, optBidStruct.currentDeepBidAmount) &&
        Objects.equals(this.optimizeDeepBidAmount, optBidStruct.optimizeDeepBidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustBidStrategyFlag, adjustBidStrategySelectedFlag, currentBidStrategy,
        optimizeBidStrategy, openDeepOptimizationActionTypeFlag,
        openDeepOptimizationActionTypeSelectedFlag, deepOptimizationActionType,
        deepOptimizationGoal, deepOptimizationTargetCpa, adjustBidAmountFlag,
        adjustBidAmountSelectedFlag, currentBidAmount, optimizeBidAmount, adjustDeepBidAmountFlag,
        currentDeepBidAmount, optimizeDeepBidAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptBidStruct {\n");

    sb.append("    adjustBidStrategyFlag: ").append(toIndentedString(adjustBidStrategyFlag))
        .append("\n");
    sb.append("    adjustBidStrategySelectedFlag: ")
        .append(toIndentedString(adjustBidStrategySelectedFlag)).append("\n");
    sb.append("    currentBidStrategy: ").append(toIndentedString(currentBidStrategy)).append("\n");
    sb.append("    optimizeBidStrategy: ").append(toIndentedString(optimizeBidStrategy))
        .append("\n");
    sb.append("    openDeepOptimizationActionTypeFlag: ")
        .append(toIndentedString(openDeepOptimizationActionTypeFlag)).append("\n");
    sb.append("    openDeepOptimizationActionTypeSelectedFlag: ")
        .append(toIndentedString(openDeepOptimizationActionTypeSelectedFlag)).append("\n");
    sb.append("    deepOptimizationActionType: ")
        .append(toIndentedString(deepOptimizationActionType)).append("\n");
    sb.append("    deepOptimizationGoal: ").append(toIndentedString(deepOptimizationGoal))
        .append("\n");
    sb.append("    deepOptimizationTargetCpa: ").append(toIndentedString(deepOptimizationTargetCpa))
        .append("\n");
    sb.append("    adjustBidAmountFlag: ").append(toIndentedString(adjustBidAmountFlag))
        .append("\n");
    sb.append("    adjustBidAmountSelectedFlag: ")
        .append(toIndentedString(adjustBidAmountSelectedFlag)).append("\n");
    sb.append("    currentBidAmount: ").append(toIndentedString(currentBidAmount)).append("\n");
    sb.append("    optimizeBidAmount: ").append(toIndentedString(optimizeBidAmount)).append("\n");
    sb.append("    adjustDeepBidAmountFlag: ").append(toIndentedString(adjustDeepBidAmountFlag))
        .append("\n");
    sb.append("    currentDeepBidAmount: ").append(toIndentedString(currentDeepBidAmount))
        .append("\n");
    sb.append("    optimizeDeepBidAmount: ").append(toIndentedString(optimizeDeepBidAmount))
        .append("\n");
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

