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
 * ComplianceValidationGetResponseData
 */

public class ComplianceValidationGetResponseData {

  @SerializedName("suggestion_list")
  private List<String> suggestionList = null;

  public ComplianceValidationGetResponseData suggestionList(List<String> suggestionList) {
    this.suggestionList = suggestionList;
    return this;
  }

  public ComplianceValidationGetResponseData addSuggestionListItem(String suggestionListItem) {
    if (this.suggestionList == null) {
      this.suggestionList = new ArrayList<String>();
    }
    this.suggestionList.add(suggestionListItem);
    return this;
  }

  /**
   * Get suggestionList
   *
   * @return suggestionList
   **/
  @ApiModelProperty(value = "")
  public List<String> getSuggestionList() {
    return suggestionList;
  }

  public void setSuggestionList(List<String> suggestionList) {
    this.suggestionList = suggestionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceValidationGetResponseData complianceValidationGetResponseData = (ComplianceValidationGetResponseData) o;
    return Objects.equals(this.suggestionList, complianceValidationGetResponseData.suggestionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceValidationGetResponseData {\n");

    sb.append("    suggestionList: ").append(toIndentedString(suggestionList)).append("\n");
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

