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

public class AdcreativePreviewsGetListStruct {

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("user_id_type")
  private ViewerIdType userIdType = null;

  public AdcreativePreviewsGetListStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   *
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AdcreativePreviewsGetListStruct userIdType(ViewerIdType userIdType) {
    this.userIdType = userIdType;
    return this;
  }

  /**
   * Get userIdType
   *
   * @return userIdType
   **/
  @ApiModelProperty(value = "")
  public ViewerIdType getUserIdType() {
    return userIdType;
  }

  public void setUserIdType(ViewerIdType userIdType) {
    this.userIdType = userIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativePreviewsGetListStruct adcreativePreviewsGetListStruct = (AdcreativePreviewsGetListStruct) o;
    return Objects.equals(this.userId, adcreativePreviewsGetListStruct.userId) &&
        Objects.equals(this.userIdType, adcreativePreviewsGetListStruct.userIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userIdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreativePreviewsGetListStruct {\n");

    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userIdType: ").append(toIndentedString(userIdType)).append("\n");
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

