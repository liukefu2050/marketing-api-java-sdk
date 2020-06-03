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
 * 按钮信息
 */
@ApiModel(description = "按钮信息")

public class ShelfButtonSpec {

  @SerializedName("link_spec")
  private LinkSpec linkSpec = null;

  @SerializedName("app_download_spec")
  private AppDownloadSpec appDownloadSpec = null;

  @SerializedName("mini_program_spec")
  private MiniProgramSpec miniProgramSpec = null;

  public ShelfButtonSpec linkSpec(LinkSpec linkSpec) {
    this.linkSpec = linkSpec;
    return this;
  }

  /**
   * Get linkSpec
   *
   * @return linkSpec
   **/
  @ApiModelProperty(value = "")
  public LinkSpec getLinkSpec() {
    return linkSpec;
  }

  public void setLinkSpec(LinkSpec linkSpec) {
    this.linkSpec = linkSpec;
  }

  public ShelfButtonSpec appDownloadSpec(AppDownloadSpec appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
    return this;
  }

  /**
   * Get appDownloadSpec
   *
   * @return appDownloadSpec
   **/
  @ApiModelProperty(value = "")
  public AppDownloadSpec getAppDownloadSpec() {
    return appDownloadSpec;
  }

  public void setAppDownloadSpec(AppDownloadSpec appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
  }

  public ShelfButtonSpec miniProgramSpec(MiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   **/
  @ApiModelProperty(value = "")
  public MiniProgramSpec getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(MiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShelfButtonSpec shelfButtonSpec = (ShelfButtonSpec) o;
    return Objects.equals(this.linkSpec, shelfButtonSpec.linkSpec) &&
        Objects.equals(this.appDownloadSpec, shelfButtonSpec.appDownloadSpec) &&
        Objects.equals(this.miniProgramSpec, shelfButtonSpec.miniProgramSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSpec, appDownloadSpec, miniProgramSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShelfButtonSpec {\n");

    sb.append("    linkSpec: ").append(toIndentedString(linkSpec)).append("\n");
    sb.append("    appDownloadSpec: ").append(toIndentedString(appDownloadSpec)).append("\n");
    sb.append("    miniProgramSpec: ").append(toIndentedString(miniProgramSpec)).append("\n");
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

