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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BidwordAddResponse */
public class BidwordAddResponse {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  @SerializedName("errors")
  private List<ApiErrorStruct> errors = null;

  @SerializedName("data")
  private BidwordAddResponseData data = null;

  public BidwordAddResponse code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  @ApiModelProperty(value = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public BidwordAddResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BidwordAddResponse messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }

  /**
   * Get messageCn
   *
   * @return messageCn
   */
  @ApiModelProperty(value = "")
  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }

  public BidwordAddResponse errors(List<ApiErrorStruct> errors) {
    this.errors = errors;
    return this;
  }

  public BidwordAddResponse addErrorsItem(ApiErrorStruct errorsItem) {
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
   */
  @ApiModelProperty(value = "")
  public List<ApiErrorStruct> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiErrorStruct> errors) {
    this.errors = errors;
  }

  public BidwordAddResponse data(BidwordAddResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @ApiModelProperty(value = "")
  public BidwordAddResponseData getData() {
    return data;
  }

  public void setData(BidwordAddResponseData data) {
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
    BidwordAddResponse bidwordAddResponse = (BidwordAddResponse) o;
    return Objects.equals(this.code, bidwordAddResponse.code)
        && Objects.equals(this.message, bidwordAddResponse.message)
        && Objects.equals(this.messageCn, bidwordAddResponse.messageCn)
        && Objects.equals(this.errors, bidwordAddResponse.errors)
        && Objects.equals(this.data, bidwordAddResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageCn, errors, data);
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
