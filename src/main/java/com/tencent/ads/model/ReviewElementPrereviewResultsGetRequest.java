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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReviewElementPrereviewResultsGetRequest */
public class ReviewElementPrereviewResultsGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("elements")
  private List<ElementStruct> elements = null;

  @SerializedName("supplement")
  private List<SupplementStruct> supplement = null;

  public ReviewElementPrereviewResultsGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ReviewElementPrereviewResultsGetRequest adgroupId(Long adgroupId) {
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

  public ReviewElementPrereviewResultsGetRequest elements(List<ElementStruct> elements) {
    this.elements = elements;
    return this;
  }

  public ReviewElementPrereviewResultsGetRequest addElementsItem(ElementStruct elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<ElementStruct>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   *
   * @return elements
   */
  @ApiModelProperty(value = "")
  public List<ElementStruct> getElements() {
    return elements;
  }

  public void setElements(List<ElementStruct> elements) {
    this.elements = elements;
  }

  public ReviewElementPrereviewResultsGetRequest supplement(List<SupplementStruct> supplement) {
    this.supplement = supplement;
    return this;
  }

  public ReviewElementPrereviewResultsGetRequest addSupplementItem(
      SupplementStruct supplementItem) {
    if (this.supplement == null) {
      this.supplement = new ArrayList<SupplementStruct>();
    }
    this.supplement.add(supplementItem);
    return this;
  }

  /**
   * Get supplement
   *
   * @return supplement
   */
  @ApiModelProperty(value = "")
  public List<SupplementStruct> getSupplement() {
    return supplement;
  }

  public void setSupplement(List<SupplementStruct> supplement) {
    this.supplement = supplement;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewElementPrereviewResultsGetRequest reviewElementPrereviewResultsGetRequest =
        (ReviewElementPrereviewResultsGetRequest) o;
    return Objects.equals(this.accountId, reviewElementPrereviewResultsGetRequest.accountId)
        && Objects.equals(this.adgroupId, reviewElementPrereviewResultsGetRequest.adgroupId)
        && Objects.equals(this.elements, reviewElementPrereviewResultsGetRequest.elements)
        && Objects.equals(this.supplement, reviewElementPrereviewResultsGetRequest.supplement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adgroupId, elements, supplement);
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
