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
 * 返回结构
 */
@ApiModel(description = "返回结构")

public class DynamicAdTemplatesGetListStruct {

  @SerializedName("dynamic_ad_template_id")
  private Long dynamicAdTemplateId = null;

  @SerializedName("dynamic_ad_template_name")
  private String dynamicAdTemplateName = null;

  @SerializedName("dynamic_ad_template_type")
  private DynamicAdTemplateType dynamicAdTemplateType = null;

  @SerializedName("product_item_display_quantity")
  private ProductItemDisplayQuantity productItemDisplayQuantity = null;

  @SerializedName("dynamic_ad_template_width")
  private Long dynamicAdTemplateWidth = null;

  @SerializedName("dynamic_ad_template_height")
  private Long dynamicAdTemplateHeight = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("video_url")
  private String videoUrl = null;

  public DynamicAdTemplatesGetListStruct dynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
    return this;
  }

  /**
   * Get dynamicAdTemplateId
   *
   * @return dynamicAdTemplateId
   **/
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateId() {
    return dynamicAdTemplateId;
  }

  public void setDynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
  }

  public DynamicAdTemplatesGetListStruct dynamicAdTemplateName(String dynamicAdTemplateName) {
    this.dynamicAdTemplateName = dynamicAdTemplateName;
    return this;
  }

  /**
   * Get dynamicAdTemplateName
   *
   * @return dynamicAdTemplateName
   **/
  @ApiModelProperty(value = "")
  public String getDynamicAdTemplateName() {
    return dynamicAdTemplateName;
  }

  public void setDynamicAdTemplateName(String dynamicAdTemplateName) {
    this.dynamicAdTemplateName = dynamicAdTemplateName;
  }

  public DynamicAdTemplatesGetListStruct dynamicAdTemplateType(
      DynamicAdTemplateType dynamicAdTemplateType) {
    this.dynamicAdTemplateType = dynamicAdTemplateType;
    return this;
  }

  /**
   * Get dynamicAdTemplateType
   *
   * @return dynamicAdTemplateType
   **/
  @ApiModelProperty(value = "")
  public DynamicAdTemplateType getDynamicAdTemplateType() {
    return dynamicAdTemplateType;
  }

  public void setDynamicAdTemplateType(DynamicAdTemplateType dynamicAdTemplateType) {
    this.dynamicAdTemplateType = dynamicAdTemplateType;
  }

  public DynamicAdTemplatesGetListStruct productItemDisplayQuantity(
      ProductItemDisplayQuantity productItemDisplayQuantity) {
    this.productItemDisplayQuantity = productItemDisplayQuantity;
    return this;
  }

  /**
   * Get productItemDisplayQuantity
   *
   * @return productItemDisplayQuantity
   **/
  @ApiModelProperty(value = "")
  public ProductItemDisplayQuantity getProductItemDisplayQuantity() {
    return productItemDisplayQuantity;
  }

  public void setProductItemDisplayQuantity(ProductItemDisplayQuantity productItemDisplayQuantity) {
    this.productItemDisplayQuantity = productItemDisplayQuantity;
  }

  public DynamicAdTemplatesGetListStruct dynamicAdTemplateWidth(Long dynamicAdTemplateWidth) {
    this.dynamicAdTemplateWidth = dynamicAdTemplateWidth;
    return this;
  }

  /**
   * Get dynamicAdTemplateWidth
   *
   * @return dynamicAdTemplateWidth
   **/
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateWidth() {
    return dynamicAdTemplateWidth;
  }

  public void setDynamicAdTemplateWidth(Long dynamicAdTemplateWidth) {
    this.dynamicAdTemplateWidth = dynamicAdTemplateWidth;
  }

  public DynamicAdTemplatesGetListStruct dynamicAdTemplateHeight(Long dynamicAdTemplateHeight) {
    this.dynamicAdTemplateHeight = dynamicAdTemplateHeight;
    return this;
  }

  /**
   * Get dynamicAdTemplateHeight
   *
   * @return dynamicAdTemplateHeight
   **/
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateHeight() {
    return dynamicAdTemplateHeight;
  }

  public void setDynamicAdTemplateHeight(Long dynamicAdTemplateHeight) {
    this.dynamicAdTemplateHeight = dynamicAdTemplateHeight;
  }

  public DynamicAdTemplatesGetListStruct imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   *
   * @return imageUrl
   **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public DynamicAdTemplatesGetListStruct videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Get videoUrl
   *
   * @return videoUrl
   **/
  @ApiModelProperty(value = "")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdTemplatesGetListStruct dynamicAdTemplatesGetListStruct = (DynamicAdTemplatesGetListStruct) o;
    return Objects
        .equals(this.dynamicAdTemplateId, dynamicAdTemplatesGetListStruct.dynamicAdTemplateId) &&
        Objects.equals(this.dynamicAdTemplateName,
            dynamicAdTemplatesGetListStruct.dynamicAdTemplateName) &&
        Objects.equals(this.dynamicAdTemplateType,
            dynamicAdTemplatesGetListStruct.dynamicAdTemplateType) &&
        Objects.equals(this.productItemDisplayQuantity,
            dynamicAdTemplatesGetListStruct.productItemDisplayQuantity) &&
        Objects.equals(this.dynamicAdTemplateWidth,
            dynamicAdTemplatesGetListStruct.dynamicAdTemplateWidth) &&
        Objects.equals(this.dynamicAdTemplateHeight,
            dynamicAdTemplatesGetListStruct.dynamicAdTemplateHeight) &&
        Objects.equals(this.imageUrl, dynamicAdTemplatesGetListStruct.imageUrl) &&
        Objects.equals(this.videoUrl, dynamicAdTemplatesGetListStruct.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicAdTemplateId, dynamicAdTemplateName, dynamicAdTemplateType,
        productItemDisplayQuantity, dynamicAdTemplateWidth, dynamicAdTemplateHeight, imageUrl,
        videoUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicAdTemplatesGetListStruct {\n");

    sb.append("    dynamicAdTemplateId: ").append(toIndentedString(dynamicAdTemplateId))
        .append("\n");
    sb.append("    dynamicAdTemplateName: ").append(toIndentedString(dynamicAdTemplateName))
        .append("\n");
    sb.append("    dynamicAdTemplateType: ").append(toIndentedString(dynamicAdTemplateType))
        .append("\n");
    sb.append("    productItemDisplayQuantity: ")
        .append(toIndentedString(productItemDisplayQuantity)).append("\n");
    sb.append("    dynamicAdTemplateWidth: ").append(toIndentedString(dynamicAdTemplateWidth))
        .append("\n");
    sb.append("    dynamicAdTemplateHeight: ").append(toIndentedString(dynamicAdTemplateHeight))
        .append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

