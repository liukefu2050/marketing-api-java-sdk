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
 * 推荐方式
 */
@ApiModel(description = "推荐方式")

public class RecommendMethod {

  @SerializedName("method_id")
  private Long methodId = null;

  @SerializedName("method_name")
  private String methodName = null;

  @SerializedName("method_description")
  private String methodDescription = null;

  @SerializedName("sub_method_operators")
  private List<String> subMethodOperators = null;

  @SerializedName("sub_methods")
  private List<SubMethod> subMethods = null;

  public RecommendMethod methodId(Long methodId) {
    this.methodId = methodId;
    return this;
  }

  /**
   * Get methodId
   *
   * @return methodId
   **/
  @ApiModelProperty(value = "")
  public Long getMethodId() {
    return methodId;
  }

  public void setMethodId(Long methodId) {
    this.methodId = methodId;
  }

  public RecommendMethod methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Get methodName
   *
   * @return methodName
   **/
  @ApiModelProperty(value = "")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public RecommendMethod methodDescription(String methodDescription) {
    this.methodDescription = methodDescription;
    return this;
  }

  /**
   * Get methodDescription
   *
   * @return methodDescription
   **/
  @ApiModelProperty(value = "")
  public String getMethodDescription() {
    return methodDescription;
  }

  public void setMethodDescription(String methodDescription) {
    this.methodDescription = methodDescription;
  }

  public RecommendMethod subMethodOperators(List<String> subMethodOperators) {
    this.subMethodOperators = subMethodOperators;
    return this;
  }

  public RecommendMethod addSubMethodOperatorsItem(String subMethodOperatorsItem) {
    if (this.subMethodOperators == null) {
      this.subMethodOperators = new ArrayList<String>();
    }
    this.subMethodOperators.add(subMethodOperatorsItem);
    return this;
  }

  /**
   * Get subMethodOperators
   *
   * @return subMethodOperators
   **/
  @ApiModelProperty(value = "")
  public List<String> getSubMethodOperators() {
    return subMethodOperators;
  }

  public void setSubMethodOperators(List<String> subMethodOperators) {
    this.subMethodOperators = subMethodOperators;
  }

  public RecommendMethod subMethods(List<SubMethod> subMethods) {
    this.subMethods = subMethods;
    return this;
  }

  public RecommendMethod addSubMethodsItem(SubMethod subMethodsItem) {
    if (this.subMethods == null) {
      this.subMethods = new ArrayList<SubMethod>();
    }
    this.subMethods.add(subMethodsItem);
    return this;
  }

  /**
   * Get subMethods
   *
   * @return subMethods
   **/
  @ApiModelProperty(value = "")
  public List<SubMethod> getSubMethods() {
    return subMethods;
  }

  public void setSubMethods(List<SubMethod> subMethods) {
    this.subMethods = subMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendMethod recommendMethod = (RecommendMethod) o;
    return Objects.equals(this.methodId, recommendMethod.methodId) &&
        Objects.equals(this.methodName, recommendMethod.methodName) &&
        Objects.equals(this.methodDescription, recommendMethod.methodDescription) &&
        Objects.equals(this.subMethodOperators, recommendMethod.subMethodOperators) &&
        Objects.equals(this.subMethods, recommendMethod.subMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodId, methodName, methodDescription, subMethodOperators, subMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendMethod {\n");

    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    methodDescription: ").append(toIndentedString(methodDescription)).append("\n");
    sb.append("    subMethodOperators: ").append(toIndentedString(subMethodOperators)).append("\n");
    sb.append("    subMethods: ").append(toIndentedString(subMethods)).append("\n");
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

