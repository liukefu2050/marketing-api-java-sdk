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
 * 图片需满足的限制条件，仅当element_type是ELEMENT_TYPE_IMAGE_ARRAY或ELEMENT_TYPE_IMAGE时返回
 */
@ApiModel(description = "图片需满足的限制条件，仅当element_type是ELEMENT_TYPE_IMAGE_ARRAY或ELEMENT_TYPE_IMAGE时返回")

public class ImageRestriction {

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("file_format")
  private List<String> fileFormat = null;

  public ImageRestriction width(Long width) {
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

  public ImageRestriction height(Long height) {
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

  public ImageRestriction fileSize(Long fileSize) {
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

  public ImageRestriction fileFormat(List<String> fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  public ImageRestriction addFileFormatItem(String fileFormatItem) {
    if (this.fileFormat == null) {
      this.fileFormat = new ArrayList<String>();
    }
    this.fileFormat.add(fileFormatItem);
    return this;
  }

  /**
   * Get fileFormat
   *
   * @return fileFormat
   **/
  @ApiModelProperty(value = "")
  public List<String> getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(List<String> fileFormat) {
    this.fileFormat = fileFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRestriction imageRestriction = (ImageRestriction) o;
    return Objects.equals(this.width, imageRestriction.width) &&
        Objects.equals(this.height, imageRestriction.height) &&
        Objects.equals(this.fileSize, imageRestriction.fileSize) &&
        Objects.equals(this.fileFormat, imageRestriction.fileFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, fileSize, fileFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRestriction {\n");

    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
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

