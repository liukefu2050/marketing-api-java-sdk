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
 * 创建应用宝渠道包接口任务所需条件
 */
@ApiModel(description = "创建应用宝渠道包接口任务所需条件")

public class CreateAndroidChannelPackageSpec {

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  public CreateAndroidChannelPackageSpec packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   **/
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public CreateAndroidChannelPackageSpec downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   *
   * @return downloadUrl
   **/
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAndroidChannelPackageSpec createAndroidChannelPackageSpec = (CreateAndroidChannelPackageSpec) o;
    return Objects.equals(this.packageName, createAndroidChannelPackageSpec.packageName) &&
        Objects.equals(this.downloadUrl, createAndroidChannelPackageSpec.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageName, downloadUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAndroidChannelPackageSpec {\n");

    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

