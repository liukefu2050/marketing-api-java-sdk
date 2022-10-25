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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 喝彩图详情 */
@ApiModel(description = "喝彩图详情")
public class LiveCheerIconStruct {
  @SerializedName("icon_url")
  private String iconUrl = null;

  @SerializedName("icon_img_id")
  private String iconImgId = null;

  @SerializedName("samp_rate")
  private Long sampRate = null;

  public LiveCheerIconStruct iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Get iconUrl
   *
   * @return iconUrl
   */
  @ApiModelProperty(value = "")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public LiveCheerIconStruct iconImgId(String iconImgId) {
    this.iconImgId = iconImgId;
    return this;
  }

  /**
   * Get iconImgId
   *
   * @return iconImgId
   */
  @ApiModelProperty(value = "")
  public String getIconImgId() {
    return iconImgId;
  }

  public void setIconImgId(String iconImgId) {
    this.iconImgId = iconImgId;
  }

  public LiveCheerIconStruct sampRate(Long sampRate) {
    this.sampRate = sampRate;
    return this;
  }

  /**
   * Get sampRate
   *
   * @return sampRate
   */
  @ApiModelProperty(value = "")
  public Long getSampRate() {
    return sampRate;
  }

  public void setSampRate(Long sampRate) {
    this.sampRate = sampRate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveCheerIconStruct liveCheerIconStruct = (LiveCheerIconStruct) o;
    return Objects.equals(this.iconUrl, liveCheerIconStruct.iconUrl)
        && Objects.equals(this.iconImgId, liveCheerIconStruct.iconImgId)
        && Objects.equals(this.sampRate, liveCheerIconStruct.sampRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconUrl, iconImgId, sampRate);
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
