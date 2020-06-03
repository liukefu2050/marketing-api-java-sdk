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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 日志明细
 */
@ApiModel(description = "日志明细")

public class DetailOperationLogListItem {

  @SerializedName("uid")
  private Long uid = null;

  @SerializedName("created_time")
  private String createdTime = null;

  @SerializedName("operation_action")
  private String operationAction = null;

  @SerializedName("operation_log")
  private List<LogListItem> operationLog = null;

  public DetailOperationLogListItem uid(Long uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   *
   * @return uid
   **/
  @ApiModelProperty(value = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public DetailOperationLogListItem createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   **/
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public DetailOperationLogListItem operationAction(String operationAction) {
    this.operationAction = operationAction;
    return this;
  }

  /**
   * Get operationAction
   *
   * @return operationAction
   **/
  @ApiModelProperty(value = "")
  public String getOperationAction() {
    return operationAction;
  }

  public void setOperationAction(String operationAction) {
    this.operationAction = operationAction;
  }

  public DetailOperationLogListItem operationLog(List<LogListItem> operationLog) {
    this.operationLog = operationLog;
    return this;
  }

  public DetailOperationLogListItem addOperationLogItem(LogListItem operationLogItem) {
    if (this.operationLog == null) {
      this.operationLog = new ArrayList<LogListItem>();
    }
    this.operationLog.add(operationLogItem);
    return this;
  }

  /**
   * Get operationLog
   *
   * @return operationLog
   **/
  @ApiModelProperty(value = "")
  public List<LogListItem> getOperationLog() {
    return operationLog;
  }

  public void setOperationLog(List<LogListItem> operationLog) {
    this.operationLog = operationLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailOperationLogListItem detailOperationLogListItem = (DetailOperationLogListItem) o;
    return Objects.equals(this.uid, detailOperationLogListItem.uid) &&
        Objects.equals(this.createdTime, detailOperationLogListItem.createdTime) &&
        Objects.equals(this.operationAction, detailOperationLogListItem.operationAction) &&
        Objects.equals(this.operationLog, detailOperationLogListItem.operationLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, createdTime, operationAction, operationLog);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailOperationLogListItem {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    operationAction: ").append(toIndentedString(operationAction)).append("\n");
    sb.append("    operationLog: ").append(toIndentedString(operationLog)).append("\n");
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

