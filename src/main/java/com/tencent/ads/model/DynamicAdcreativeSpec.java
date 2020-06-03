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
 * 动态商品广告属性
 */
@ApiModel(description = "动态商品广告属性")

public class DynamicAdcreativeSpec {

  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("product_mode")
  private ProductMode productMode = null;

  @SerializedName("product_source")
  private String productSource = null;

  public DynamicAdcreativeSpec productCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   **/
  @ApiModelProperty(value = "")
  public Long getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public DynamicAdcreativeSpec productMode(ProductMode productMode) {
    this.productMode = productMode;
    return this;
  }

  /**
   * Get productMode
   *
   * @return productMode
   **/
  @ApiModelProperty(value = "")
  public ProductMode getProductMode() {
    return productMode;
  }

  public void setProductMode(ProductMode productMode) {
    this.productMode = productMode;
  }

  public DynamicAdcreativeSpec productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

  /**
   * Get productSource
   *
   * @return productSource
   **/
  @ApiModelProperty(value = "")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdcreativeSpec dynamicAdcreativeSpec = (DynamicAdcreativeSpec) o;
    return Objects.equals(this.productCatalogId, dynamicAdcreativeSpec.productCatalogId) &&
        Objects.equals(this.productMode, dynamicAdcreativeSpec.productMode) &&
        Objects.equals(this.productSource, dynamicAdcreativeSpec.productSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCatalogId, productMode, productSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicAdcreativeSpec {\n");

    sb.append("    productCatalogId: ").append(toIndentedString(productCatalogId)).append("\n");
    sb.append("    productMode: ").append(toIndentedString(productMode)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
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

