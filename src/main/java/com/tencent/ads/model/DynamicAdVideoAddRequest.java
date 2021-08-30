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

/** DynamicAdVideoAddRequest */
public class DynamicAdVideoAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("product_mode")
  private AdNum productMode = null;

  @SerializedName("product_source")
  private String productSource = null;

  @SerializedName("video_max_duration")
  private Long videoMaxDuration = null;

  @SerializedName("dynamic_ad_template_id")
  private Long dynamicAdTemplateId = null;

  public DynamicAdVideoAddRequest accountId(Long accountId) {
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

  public DynamicAdVideoAddRequest productCatalogId(Long productCatalogId) {
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

  public DynamicAdVideoAddRequest productMode(AdNum productMode) {
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

  public DynamicAdVideoAddRequest productSource(String productSource) {
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

  public DynamicAdVideoAddRequest videoMaxDuration(Long videoMaxDuration) {
    this.videoMaxDuration = videoMaxDuration;
    return this;
  }

  /**
   * Get videoMaxDuration
   *
   * @return videoMaxDuration
   */
  @ApiModelProperty(value = "")
  public Long getVideoMaxDuration() {
    return videoMaxDuration;
  }

  public void setVideoMaxDuration(Long videoMaxDuration) {
    this.videoMaxDuration = videoMaxDuration;
  }

  public DynamicAdVideoAddRequest dynamicAdTemplateId(Long dynamicAdTemplateId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdVideoAddRequest dynamicAdVideoAddRequest = (DynamicAdVideoAddRequest) o;
    return Objects.equals(this.accountId, dynamicAdVideoAddRequest.accountId)
        && Objects.equals(this.productCatalogId, dynamicAdVideoAddRequest.productCatalogId)
        && Objects.equals(this.productMode, dynamicAdVideoAddRequest.productMode)
        && Objects.equals(this.productSource, dynamicAdVideoAddRequest.productSource)
        && Objects.equals(this.videoMaxDuration, dynamicAdVideoAddRequest.videoMaxDuration)
        && Objects.equals(this.dynamicAdTemplateId, dynamicAdVideoAddRequest.dynamicAdTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        productCatalogId,
        productMode,
        productSource,
        videoMaxDuration,
        dynamicAdTemplateId);
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
