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
 * 人群信息
 */
@ApiModel(description = "人群信息")

public class EstimationAudienceSpec {

  @SerializedName("combine_spec")
  private CombineSpec combineSpec = null;

  public EstimationAudienceSpec combineSpec(CombineSpec combineSpec) {
    this.combineSpec = combineSpec;
    return this;
  }

  /**
   * Get combineSpec
   *
   * @return combineSpec
   **/
  @ApiModelProperty(value = "")
  public CombineSpec getCombineSpec() {
    return combineSpec;
  }

  public void setCombineSpec(CombineSpec combineSpec) {
    this.combineSpec = combineSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationAudienceSpec estimationAudienceSpec = (EstimationAudienceSpec) o;
    return Objects.equals(this.combineSpec, estimationAudienceSpec.combineSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combineSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimationAudienceSpec {\n");

    sb.append("    combineSpec: ").append(toIndentedString(combineSpec)).append("\n");
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

