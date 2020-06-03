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
 * 裁剪信息
 */
@ApiModel(description = "裁剪信息")

public class CropCustomizedSpec {

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("axis_x")
  private Long axisX = null;

  @SerializedName("axis_y")
  private Long axisY = null;

  public CropCustomizedSpec width(Long width) {
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

  public CropCustomizedSpec height(Long height) {
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

  public CropCustomizedSpec axisX(Long axisX) {
    this.axisX = axisX;
    return this;
  }

  /**
   * Get axisX
   *
   * @return axisX
   **/
  @ApiModelProperty(value = "")
  public Long getAxisX() {
    return axisX;
  }

  public void setAxisX(Long axisX) {
    this.axisX = axisX;
  }

  public CropCustomizedSpec axisY(Long axisY) {
    this.axisY = axisY;
    return this;
  }

  /**
   * Get axisY
   *
   * @return axisY
   **/
  @ApiModelProperty(value = "")
  public Long getAxisY() {
    return axisY;
  }

  public void setAxisY(Long axisY) {
    this.axisY = axisY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CropCustomizedSpec cropCustomizedSpec = (CropCustomizedSpec) o;
    return Objects.equals(this.width, cropCustomizedSpec.width) &&
        Objects.equals(this.height, cropCustomizedSpec.height) &&
        Objects.equals(this.axisX, cropCustomizedSpec.axisX) &&
        Objects.equals(this.axisY, cropCustomizedSpec.axisY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, axisX, axisY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CropCustomizedSpec {\n");

    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    axisX: ").append(toIndentedString(axisX)).append("\n");
    sb.append("    axisY: ").append(toIndentedString(axisY)).append("\n");
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

