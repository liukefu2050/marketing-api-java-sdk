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
 * 特征规则
 */
@ApiModel(description = "特征规则")

public class FeatureSpec {

  @SerializedName("data_source_type")
  private FeatureDataSourceType dataSourceType = null;

  @SerializedName("property_data_feature_spec")
  private PropertyDataFeatureSpec propertyDataFeatureSpec = null;

  @SerializedName("custom_file_feature_spec")
  private CustomFileFeatureSpec customFileFeatureSpec = null;

  public FeatureSpec dataSourceType(FeatureDataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
    return this;
  }

  /**
   * Get dataSourceType
   *
   * @return dataSourceType
   **/
  @ApiModelProperty(value = "")
  public FeatureDataSourceType getDataSourceType() {
    return dataSourceType;
  }

  public void setDataSourceType(FeatureDataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
  }

  public FeatureSpec propertyDataFeatureSpec(PropertyDataFeatureSpec propertyDataFeatureSpec) {
    this.propertyDataFeatureSpec = propertyDataFeatureSpec;
    return this;
  }

  /**
   * Get propertyDataFeatureSpec
   *
   * @return propertyDataFeatureSpec
   **/
  @ApiModelProperty(value = "")
  public PropertyDataFeatureSpec getPropertyDataFeatureSpec() {
    return propertyDataFeatureSpec;
  }

  public void setPropertyDataFeatureSpec(PropertyDataFeatureSpec propertyDataFeatureSpec) {
    this.propertyDataFeatureSpec = propertyDataFeatureSpec;
  }

  public FeatureSpec customFileFeatureSpec(CustomFileFeatureSpec customFileFeatureSpec) {
    this.customFileFeatureSpec = customFileFeatureSpec;
    return this;
  }

  /**
   * Get customFileFeatureSpec
   *
   * @return customFileFeatureSpec
   **/
  @ApiModelProperty(value = "")
  public CustomFileFeatureSpec getCustomFileFeatureSpec() {
    return customFileFeatureSpec;
  }

  public void setCustomFileFeatureSpec(CustomFileFeatureSpec customFileFeatureSpec) {
    this.customFileFeatureSpec = customFileFeatureSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSpec featureSpec = (FeatureSpec) o;
    return Objects.equals(this.dataSourceType, featureSpec.dataSourceType) &&
        Objects.equals(this.propertyDataFeatureSpec, featureSpec.propertyDataFeatureSpec) &&
        Objects.equals(this.customFileFeatureSpec, featureSpec.customFileFeatureSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceType, propertyDataFeatureSpec, customFileFeatureSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpec {\n");

    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    propertyDataFeatureSpec: ").append(toIndentedString(propertyDataFeatureSpec))
        .append("\n");
    sb.append("    customFileFeatureSpec: ").append(toIndentedString(customFileFeatureSpec))
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

