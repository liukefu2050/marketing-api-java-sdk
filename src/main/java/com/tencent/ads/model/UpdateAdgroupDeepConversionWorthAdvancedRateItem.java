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

/** 修改广告组深度优化价值的强化 ROI */
@ApiModel(description = "修改广告组深度优化价值的强化 ROI")
public class UpdateAdgroupDeepConversionWorthAdvancedRateItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("deep_conversion_worth_advanced_rate")
  private Double deepConversionWorthAdvancedRate = null;

  public UpdateAdgroupDeepConversionWorthAdvancedRateItem adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public UpdateAdgroupDeepConversionWorthAdvancedRateItem deepConversionWorthAdvancedRate(
      Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
    return this;
  }

  /**
   * Get deepConversionWorthAdvancedRate
   *
   * @return deepConversionWorthAdvancedRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthAdvancedRate() {
    return deepConversionWorthAdvancedRate;
  }

  public void setDeepConversionWorthAdvancedRate(Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdgroupDeepConversionWorthAdvancedRateItem
        updateAdgroupDeepConversionWorthAdvancedRateItem =
            (UpdateAdgroupDeepConversionWorthAdvancedRateItem) o;
    return Objects.equals(
            this.adgroupId, updateAdgroupDeepConversionWorthAdvancedRateItem.adgroupId)
        && Objects.equals(
            this.deepConversionWorthAdvancedRate,
            updateAdgroupDeepConversionWorthAdvancedRateItem.deepConversionWorthAdvancedRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, deepConversionWorthAdvancedRate);
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
