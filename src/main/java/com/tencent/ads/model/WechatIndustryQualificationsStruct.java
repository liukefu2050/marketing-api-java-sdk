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
 * 微信行业资质信息
 */
@ApiModel(description = "微信行业资质信息")

public class WechatIndustryQualificationsStruct {

  @SerializedName("qualification_id")
  private Long qualificationId = null;

  @SerializedName("qualification_name")
  private String qualificationName = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("expired_date")
  private String expiredDate = null;

  @SerializedName("qualification_status")
  private QualificationStatus qualificationStatus = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  public WechatIndustryQualificationsStruct qualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
    return this;
  }

  /**
   * Get qualificationId
   *
   * @return qualificationId
   **/
  @ApiModelProperty(value = "")
  public Long getQualificationId() {
    return qualificationId;
  }

  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }

  public WechatIndustryQualificationsStruct qualificationName(String qualificationName) {
    this.qualificationName = qualificationName;
    return this;
  }

  /**
   * Get qualificationName
   *
   * @return qualificationName
   **/
  @ApiModelProperty(value = "")
  public String getQualificationName() {
    return qualificationName;
  }

  public void setQualificationName(String qualificationName) {
    this.qualificationName = qualificationName;
  }

  public WechatIndustryQualificationsStruct imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   *
   * @return imageUrl
   **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public WechatIndustryQualificationsStruct expiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
    return this;
  }

  /**
   * Get expiredDate
   *
   * @return expiredDate
   **/
  @ApiModelProperty(value = "")
  public String getExpiredDate() {
    return expiredDate;
  }

  public void setExpiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
  }

  public WechatIndustryQualificationsStruct qualificationStatus(
      QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
    return this;
  }

  /**
   * Get qualificationStatus
   *
   * @return qualificationStatus
   **/
  @ApiModelProperty(value = "")
  public QualificationStatus getQualificationStatus() {
    return qualificationStatus;
  }

  public void setQualificationStatus(QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
  }

  public WechatIndustryQualificationsStruct rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   **/
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatIndustryQualificationsStruct wechatIndustryQualificationsStruct = (WechatIndustryQualificationsStruct) o;
    return Objects.equals(this.qualificationId, wechatIndustryQualificationsStruct.qualificationId)
        &&
        Objects.equals(this.qualificationName, wechatIndustryQualificationsStruct.qualificationName)
        &&
        Objects.equals(this.imageUrl, wechatIndustryQualificationsStruct.imageUrl) &&
        Objects.equals(this.expiredDate, wechatIndustryQualificationsStruct.expiredDate) &&
        Objects.equals(this.qualificationStatus,
            wechatIndustryQualificationsStruct.qualificationStatus) &&
        Objects.equals(this.rejectMessage, wechatIndustryQualificationsStruct.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(qualificationId, qualificationName, imageUrl, expiredDate, qualificationStatus,
            rejectMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WechatIndustryQualificationsStruct {\n");

    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
    sb.append("    qualificationName: ").append(toIndentedString(qualificationName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
    sb.append("    qualificationStatus: ").append(toIndentedString(qualificationStatus))
        .append("\n");
    sb.append("    rejectMessage: ").append(toIndentedString(rejectMessage)).append("\n");
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

