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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CampaignsUpdateDailyBudgetRequest
 */

public class CampaignsUpdateDailyBudgetRequest {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_daily_budget_spec")
  private List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec = null;

  public CampaignsUpdateDailyBudgetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   **/
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignsUpdateDailyBudgetRequest updateDailyBudgetSpec(
      List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
    return this;
  }

  public CampaignsUpdateDailyBudgetRequest addUpdateDailyBudgetSpecItem(
      CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct updateDailyBudgetSpecItem) {
    if (this.updateDailyBudgetSpec == null) {
      this.updateDailyBudgetSpec = new ArrayList<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct>();
    }
    this.updateDailyBudgetSpec.add(updateDailyBudgetSpecItem);
    return this;
  }

  /**
   * Get updateDailyBudgetSpec
   *
   * @return updateDailyBudgetSpec
   **/
  @ApiModelProperty(value = "")
  public List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> getUpdateDailyBudgetSpec() {
    return updateDailyBudgetSpec;
  }

  public void setUpdateDailyBudgetSpec(
      List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsUpdateDailyBudgetRequest campaignsUpdateDailyBudgetRequest = (CampaignsUpdateDailyBudgetRequest) o;
    return Objects.equals(this.accountId, campaignsUpdateDailyBudgetRequest.accountId) &&
        Objects.equals(this.updateDailyBudgetSpec,
            campaignsUpdateDailyBudgetRequest.updateDailyBudgetSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, updateDailyBudgetSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsUpdateDailyBudgetRequest {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    updateDailyBudgetSpec: ").append(toIndentedString(updateDailyBudgetSpec))
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

