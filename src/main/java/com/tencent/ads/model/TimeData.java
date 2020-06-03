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
 * TimeData返回结构
 */
@ApiModel(description = "TimeData返回结构")

public class TimeData {

  @SerializedName("date")
  private String date = null;

  @SerializedName("hour")
  private Long hour = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("action_type")
  private ActionType actionType = null;

  @SerializedName("custom_action")
  private String customAction = null;

  @SerializedName("raw_action_count")
  private Long rawActionCount = null;

  @SerializedName("identified_action_count")
  private Long identifiedActionCount = null;

  @SerializedName("identified_user_count")
  private Long identifiedUserCount = null;

  public TimeData date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TimeData hour(Long hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   *
   * @return hour
   **/
  @ApiModelProperty(value = "")
  public Long getHour() {
    return hour;
  }

  public void setHour(Long hour) {
    this.hour = hour;
  }

  public TimeData domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   *
   * @return domain
   **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public TimeData actionType(ActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   *
   * @return actionType
   **/
  @ApiModelProperty(value = "")
  public ActionType getActionType() {
    return actionType;
  }

  public void setActionType(ActionType actionType) {
    this.actionType = actionType;
  }

  public TimeData customAction(String customAction) {
    this.customAction = customAction;
    return this;
  }

  /**
   * Get customAction
   *
   * @return customAction
   **/
  @ApiModelProperty(value = "")
  public String getCustomAction() {
    return customAction;
  }

  public void setCustomAction(String customAction) {
    this.customAction = customAction;
  }

  public TimeData rawActionCount(Long rawActionCount) {
    this.rawActionCount = rawActionCount;
    return this;
  }

  /**
   * Get rawActionCount
   *
   * @return rawActionCount
   **/
  @ApiModelProperty(value = "")
  public Long getRawActionCount() {
    return rawActionCount;
  }

  public void setRawActionCount(Long rawActionCount) {
    this.rawActionCount = rawActionCount;
  }

  public TimeData identifiedActionCount(Long identifiedActionCount) {
    this.identifiedActionCount = identifiedActionCount;
    return this;
  }

  /**
   * Get identifiedActionCount
   *
   * @return identifiedActionCount
   **/
  @ApiModelProperty(value = "")
  public Long getIdentifiedActionCount() {
    return identifiedActionCount;
  }

  public void setIdentifiedActionCount(Long identifiedActionCount) {
    this.identifiedActionCount = identifiedActionCount;
  }

  public TimeData identifiedUserCount(Long identifiedUserCount) {
    this.identifiedUserCount = identifiedUserCount;
    return this;
  }

  /**
   * Get identifiedUserCount
   *
   * @return identifiedUserCount
   **/
  @ApiModelProperty(value = "")
  public Long getIdentifiedUserCount() {
    return identifiedUserCount;
  }

  public void setIdentifiedUserCount(Long identifiedUserCount) {
    this.identifiedUserCount = identifiedUserCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeData timeData = (TimeData) o;
    return Objects.equals(this.date, timeData.date) &&
        Objects.equals(this.hour, timeData.hour) &&
        Objects.equals(this.domain, timeData.domain) &&
        Objects.equals(this.actionType, timeData.actionType) &&
        Objects.equals(this.customAction, timeData.customAction) &&
        Objects.equals(this.rawActionCount, timeData.rawActionCount) &&
        Objects.equals(this.identifiedActionCount, timeData.identifiedActionCount) &&
        Objects.equals(this.identifiedUserCount, timeData.identifiedUserCount);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(date, hour, domain, actionType, customAction, rawActionCount, identifiedActionCount,
            identifiedUserCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeData {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    customAction: ").append(toIndentedString(customAction)).append("\n");
    sb.append("    rawActionCount: ").append(toIndentedString(rawActionCount)).append("\n");
    sb.append("    identifiedActionCount: ").append(toIndentedString(identifiedActionCount))
        .append("\n");
    sb.append("    identifiedUserCount: ").append(toIndentedString(identifiedUserCount))
        .append("\n");
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

