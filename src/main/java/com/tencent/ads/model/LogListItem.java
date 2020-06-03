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
 * 单条日志
 */
@ApiModel(description = "单条日志")

public class LogListItem {

  @SerializedName("name")
  private String name = null;

  @SerializedName("before")
  private String before = null;

  @SerializedName("after")
  private String after = null;

  public LogListItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogListItem before(String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   *
   * @return before
   **/
  @ApiModelProperty(value = "")
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public LogListItem after(String after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   *
   * @return after
   **/
  @ApiModelProperty(value = "")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogListItem logListItem = (LogListItem) o;
    return Objects.equals(this.name, logListItem.name) &&
        Objects.equals(this.before, logListItem.before) &&
        Objects.equals(this.after, logListItem.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, before, after);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogListItem {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

