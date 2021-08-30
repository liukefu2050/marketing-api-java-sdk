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
import java.util.Objects;

/** DynamicAdImagesAddRequest */
public class DynamicAdImagesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("product_mode")
  private AdNum productMode = null;

  @SerializedName("product_source")
  private String productSource = null;

  @SerializedName("dynamic_ad_template_size")
  private DynamicAdTemplateSize dynamicAdTemplateSize = null;

  @SerializedName("dynamic_ad_template_id")
  private Long dynamicAdTemplateId = null;

  @SerializedName("image_matting_enabled")
  private Boolean imageMattingEnabled = null;

  public DynamicAdImagesAddRequest accountId(Long accountId) {
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

  public DynamicAdImagesAddRequest productCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   */
  @ApiModelProperty(value = "")
  public Long getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public DynamicAdImagesAddRequest productMode(AdNum productMode) {
    this.productMode = productMode;
    return this;
  }

  /**
   * Get productMode
   *
   * @return productMode
   */
  @ApiModelProperty(value = "")
  public AdNum getProductMode() {
    return productMode;
  }

  public void setProductMode(AdNum productMode) {
    this.productMode = productMode;
  }

  public DynamicAdImagesAddRequest productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

  /**
   * Get productSource
   *
   * @return productSource
   */
  @ApiModelProperty(value = "")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }

  public DynamicAdImagesAddRequest dynamicAdTemplateSize(
      DynamicAdTemplateSize dynamicAdTemplateSize) {
    this.dynamicAdTemplateSize = dynamicAdTemplateSize;
    return this;
  }

  /**
   * Get dynamicAdTemplateSize
   *
   * @return dynamicAdTemplateSize
   */
  @ApiModelProperty(value = "")
  public DynamicAdTemplateSize getDynamicAdTemplateSize() {
    return dynamicAdTemplateSize;
  }

  public void setDynamicAdTemplateSize(DynamicAdTemplateSize dynamicAdTemplateSize) {
    this.dynamicAdTemplateSize = dynamicAdTemplateSize;
  }

  public DynamicAdImagesAddRequest dynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
    return this;
  }

  /**
   * Get dynamicAdTemplateId
   *
   * @return dynamicAdTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateId() {
    return dynamicAdTemplateId;
  }

  public void setDynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
  }

  public DynamicAdImagesAddRequest imageMattingEnabled(Boolean imageMattingEnabled) {
    this.imageMattingEnabled = imageMattingEnabled;
    return this;
  }

  /**
   * Get imageMattingEnabled
   *
   * @return imageMattingEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isImageMattingEnabled() {
    return imageMattingEnabled;
  }

  public void setImageMattingEnabled(Boolean imageMattingEnabled) {
    this.imageMattingEnabled = imageMattingEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdImagesAddRequest dynamicAdImagesAddRequest = (DynamicAdImagesAddRequest) o;
    return Objects.equals(this.accountId, dynamicAdImagesAddRequest.accountId)
        && Objects.equals(this.productCatalogId, dynamicAdImagesAddRequest.productCatalogId)
        && Objects.equals(this.productMode, dynamicAdImagesAddRequest.productMode)
        && Objects.equals(this.productSource, dynamicAdImagesAddRequest.productSource)
        && Objects.equals(
            this.dynamicAdTemplateSize, dynamicAdImagesAddRequest.dynamicAdTemplateSize)
        && Objects.equals(this.dynamicAdTemplateId, dynamicAdImagesAddRequest.dynamicAdTemplateId)
        && Objects.equals(this.imageMattingEnabled, dynamicAdImagesAddRequest.imageMattingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        productCatalogId,
        productMode,
        productSource,
        dynamicAdTemplateSize,
        dynamicAdTemplateId,
        imageMattingEnabled);
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
