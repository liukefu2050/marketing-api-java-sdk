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
 * 查询条件
 */
@ApiModel(description = "查询条件")

public class QuerySpec {

  @SerializedName("wechat_link_ad")
  private WechatLinkAd wechatLinkAd = null;

  @SerializedName("wechat_ocpa")
  private WechatOcpa wechatOcpa = null;

  public QuerySpec wechatLinkAd(WechatLinkAd wechatLinkAd) {
    this.wechatLinkAd = wechatLinkAd;
    return this;
  }

  /**
   * Get wechatLinkAd
   *
   * @return wechatLinkAd
   **/
  @ApiModelProperty(value = "")
  public WechatLinkAd getWechatLinkAd() {
    return wechatLinkAd;
  }

  public void setWechatLinkAd(WechatLinkAd wechatLinkAd) {
    this.wechatLinkAd = wechatLinkAd;
  }

  public QuerySpec wechatOcpa(WechatOcpa wechatOcpa) {
    this.wechatOcpa = wechatOcpa;
    return this;
  }

  /**
   * Get wechatOcpa
   *
   * @return wechatOcpa
   **/
  @ApiModelProperty(value = "")
  public WechatOcpa getWechatOcpa() {
    return wechatOcpa;
  }

  public void setWechatOcpa(WechatOcpa wechatOcpa) {
    this.wechatOcpa = wechatOcpa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySpec querySpec = (QuerySpec) o;
    return Objects.equals(this.wechatLinkAd, querySpec.wechatLinkAd) &&
        Objects.equals(this.wechatOcpa, querySpec.wechatOcpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wechatLinkAd, wechatOcpa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySpec {\n");

    sb.append("    wechatLinkAd: ").append(toIndentedString(wechatLinkAd)).append("\n");
    sb.append("    wechatOcpa: ").append(toIndentedString(wechatOcpa)).append("\n");
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

