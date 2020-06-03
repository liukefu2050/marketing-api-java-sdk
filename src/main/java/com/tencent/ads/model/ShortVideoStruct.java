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
 * 短视频结构
 */
@ApiModel(description = "短视频结构")

public class ShortVideoStruct {

  @SerializedName("short_video1")
  private Long shortVideo1 = null;

  @SerializedName("short_video2")
  private Long shortVideo2 = null;

  public ShortVideoStruct shortVideo1(Long shortVideo1) {
    this.shortVideo1 = shortVideo1;
    return this;
  }

  /**
   * Get shortVideo1
   *
   * @return shortVideo1
   **/
  @ApiModelProperty(value = "")
  public Long getShortVideo1() {
    return shortVideo1;
  }

  public void setShortVideo1(Long shortVideo1) {
    this.shortVideo1 = shortVideo1;
  }

  public ShortVideoStruct shortVideo2(Long shortVideo2) {
    this.shortVideo2 = shortVideo2;
    return this;
  }

  /**
   * Get shortVideo2
   *
   * @return shortVideo2
   **/
  @ApiModelProperty(value = "")
  public Long getShortVideo2() {
    return shortVideo2;
  }

  public void setShortVideo2(Long shortVideo2) {
    this.shortVideo2 = shortVideo2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortVideoStruct shortVideoStruct = (ShortVideoStruct) o;
    return Objects.equals(this.shortVideo1, shortVideoStruct.shortVideo1) &&
        Objects.equals(this.shortVideo2, shortVideoStruct.shortVideo2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortVideo1, shortVideo2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortVideoStruct {\n");

    sb.append("    shortVideo1: ").append(toIndentedString(shortVideo1)).append("\n");
    sb.append("    shortVideo2: ").append(toIndentedString(shortVideo2)).append("\n");
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

