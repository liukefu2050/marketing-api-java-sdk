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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UnionPositionPackagesGetResponse
 */

public class UnionPositionPackagesGetResponse {

  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  @SerializedName("errors")
  private List<ApiErrorStruct> errors = null;

  @SerializedName("data")
  private UnionPositionPackagesGetResponseData data = null;

  public UnionPositionPackagesGetResponse code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   **/
  @ApiModelProperty(value = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public UnionPositionPackagesGetResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UnionPositionPackagesGetResponse messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }

  /**
   * Get messageCn
   *
   * @return messageCn
   **/
  @ApiModelProperty(value = "")
  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }

  public UnionPositionPackagesGetResponse errors(List<ApiErrorStruct> errors) {
    this.errors = errors;
    return this;
  }

  public UnionPositionPackagesGetResponse addErrorsItem(ApiErrorStruct errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ApiErrorStruct>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   *
   * @return errors
   **/
  @ApiModelProperty(value = "")
  public List<ApiErrorStruct> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiErrorStruct> errors) {
    this.errors = errors;
  }

  public UnionPositionPackagesGetResponse data(UnionPositionPackagesGetResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   **/
  @ApiModelProperty(value = "")
  public UnionPositionPackagesGetResponseData getData() {
    return data;
  }

  public void setData(UnionPositionPackagesGetResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionPositionPackagesGetResponse unionPositionPackagesGetResponse = (UnionPositionPackagesGetResponse) o;
    return Objects.equals(this.code, unionPositionPackagesGetResponse.code) &&
        Objects.equals(this.message, unionPositionPackagesGetResponse.message) &&
        Objects.equals(this.messageCn, unionPositionPackagesGetResponse.messageCn) &&
        Objects.equals(this.errors, unionPositionPackagesGetResponse.errors) &&
        Objects.equals(this.data, unionPositionPackagesGetResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageCn, errors, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnionPositionPackagesGetResponse {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageCn: ").append(toIndentedString(messageCn)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

