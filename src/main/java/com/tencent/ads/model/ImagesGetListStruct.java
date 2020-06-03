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

public class ImagesGetListStruct {

  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("source_signature")
  private String sourceSignature = null;

  @SerializedName("preview_url")
  private String previewUrl = null;

  @SerializedName("source_type")
  private ImageSourceType sourceType = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("type")
  private ImageType type = null;

  @SerializedName("signature")
  private String signature = null;

  public ImagesGetListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   **/
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImagesGetListStruct sourceSignature(String sourceSignature) {
    this.sourceSignature = sourceSignature;
    return this;
  }

  /**
   * Get sourceSignature
   *
   * @return sourceSignature
   **/
  @ApiModelProperty(value = "")
  public String getSourceSignature() {
    return sourceSignature;
  }

  public void setSourceSignature(String sourceSignature) {
    this.sourceSignature = sourceSignature;
  }

  public ImagesGetListStruct previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * Get previewUrl
   *
   * @return previewUrl
   **/
  @ApiModelProperty(value = "")
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public ImagesGetListStruct sourceType(ImageSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   *
   * @return sourceType
   **/
  @ApiModelProperty(value = "")
  public ImageSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(ImageSourceType sourceType) {
    this.sourceType = sourceType;
  }

  public ImagesGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public ImagesGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   **/
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public ImagesGetListStruct width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   **/
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public ImagesGetListStruct height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   **/
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public ImagesGetListStruct fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   *
   * @return fileSize
   **/
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public ImagesGetListStruct type(ImageType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   **/
  @ApiModelProperty(value = "")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public ImagesGetListStruct signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   *
   * @return signature
   **/
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesGetListStruct imagesGetListStruct = (ImagesGetListStruct) o;
    return Objects.equals(this.imageId, imagesGetListStruct.imageId) &&
        Objects.equals(this.sourceSignature, imagesGetListStruct.sourceSignature) &&
        Objects.equals(this.previewUrl, imagesGetListStruct.previewUrl) &&
        Objects.equals(this.sourceType, imagesGetListStruct.sourceType) &&
        Objects.equals(this.createdTime, imagesGetListStruct.createdTime) &&
        Objects.equals(this.lastModifiedTime, imagesGetListStruct.lastModifiedTime) &&
        Objects.equals(this.width, imagesGetListStruct.width) &&
        Objects.equals(this.height, imagesGetListStruct.height) &&
        Objects.equals(this.fileSize, imagesGetListStruct.fileSize) &&
        Objects.equals(this.type, imagesGetListStruct.type) &&
        Objects.equals(this.signature, imagesGetListStruct.signature);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(imageId, sourceSignature, previewUrl, sourceType, createdTime, lastModifiedTime,
            width, height, fileSize, type, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesGetListStruct {\n");

    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sourceSignature: ").append(toIndentedString(sourceSignature)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

