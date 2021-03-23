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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 回传信息结构 */
@ApiModel(description = "回传信息结构")
public class LeadsContactInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_user_type")
  private LeadsUserType leadsUserType = null;

  @SerializedName("leads_user_wechat_appid")
  private String leadsUserWechatAppid = null;

  @SerializedName("leads_user_id")
  private String leadsUserId = null;

  @SerializedName("leads_tel")
  private String leadsTel = null;

  @SerializedName("leads_qq")
  private Long leadsQq = null;

  @SerializedName("leads_wechat")
  private String leadsWechat = null;

  @SerializedName("leads_name")
  private String leadsName = null;

  @SerializedName("leads_gender")
  private LeadCluesGenderType leadsGender = null;

  @SerializedName("leads_email")
  private String leadsEmail = null;

  @SerializedName("leads_area")
  private String leadsArea = null;

  @SerializedName("bundle")
  private String bundle = null;

  public LeadsContactInfoStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public LeadsContactInfoStruct leadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
    return this;
  }

  /**
   * Get leadsUserType
   *
   * @return leadsUserType
   */
  @ApiModelProperty(value = "")
  public LeadsUserType getLeadsUserType() {
    return leadsUserType;
  }

  public void setLeadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
  }

  public LeadsContactInfoStruct leadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
    return this;
  }

  /**
   * Get leadsUserWechatAppid
   *
   * @return leadsUserWechatAppid
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserWechatAppid() {
    return leadsUserWechatAppid;
  }

  public void setLeadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
  }

  public LeadsContactInfoStruct leadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
    return this;
  }

  /**
   * Get leadsUserId
   *
   * @return leadsUserId
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserId() {
    return leadsUserId;
  }

  public void setLeadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
  }

  public LeadsContactInfoStruct leadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
    return this;
  }

  /**
   * Get leadsTel
   *
   * @return leadsTel
   */
  @ApiModelProperty(value = "")
  public String getLeadsTel() {
    return leadsTel;
  }

  public void setLeadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
  }

  public LeadsContactInfoStruct leadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
    return this;
  }

  /**
   * Get leadsQq
   *
   * @return leadsQq
   */
  @ApiModelProperty(value = "")
  public Long getLeadsQq() {
    return leadsQq;
  }

  public void setLeadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
  }

  public LeadsContactInfoStruct leadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
    return this;
  }

  /**
   * Get leadsWechat
   *
   * @return leadsWechat
   */
  @ApiModelProperty(value = "")
  public String getLeadsWechat() {
    return leadsWechat;
  }

  public void setLeadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
  }

  public LeadsContactInfoStruct leadsName(String leadsName) {
    this.leadsName = leadsName;
    return this;
  }

  /**
   * Get leadsName
   *
   * @return leadsName
   */
  @ApiModelProperty(value = "")
  public String getLeadsName() {
    return leadsName;
  }

  public void setLeadsName(String leadsName) {
    this.leadsName = leadsName;
  }

  public LeadsContactInfoStruct leadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
    return this;
  }

  /**
   * Get leadsGender
   *
   * @return leadsGender
   */
  @ApiModelProperty(value = "")
  public LeadCluesGenderType getLeadsGender() {
    return leadsGender;
  }

  public void setLeadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
  }

  public LeadsContactInfoStruct leadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
    return this;
  }

  /**
   * Get leadsEmail
   *
   * @return leadsEmail
   */
  @ApiModelProperty(value = "")
  public String getLeadsEmail() {
    return leadsEmail;
  }

  public void setLeadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
  }

  public LeadsContactInfoStruct leadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
    return this;
  }

  /**
   * Get leadsArea
   *
   * @return leadsArea
   */
  @ApiModelProperty(value = "")
  public String getLeadsArea() {
    return leadsArea;
  }

  public void setLeadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
  }

  public LeadsContactInfoStruct bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   *
   * @return bundle
   */
  @ApiModelProperty(value = "")
  public String getBundle() {
    return bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsContactInfoStruct leadsContactInfoStruct = (LeadsContactInfoStruct) o;
    return Objects.equals(this.outerLeadsId, leadsContactInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsUserType, leadsContactInfoStruct.leadsUserType)
        && Objects.equals(this.leadsUserWechatAppid, leadsContactInfoStruct.leadsUserWechatAppid)
        && Objects.equals(this.leadsUserId, leadsContactInfoStruct.leadsUserId)
        && Objects.equals(this.leadsTel, leadsContactInfoStruct.leadsTel)
        && Objects.equals(this.leadsQq, leadsContactInfoStruct.leadsQq)
        && Objects.equals(this.leadsWechat, leadsContactInfoStruct.leadsWechat)
        && Objects.equals(this.leadsName, leadsContactInfoStruct.leadsName)
        && Objects.equals(this.leadsGender, leadsContactInfoStruct.leadsGender)
        && Objects.equals(this.leadsEmail, leadsContactInfoStruct.leadsEmail)
        && Objects.equals(this.leadsArea, leadsContactInfoStruct.leadsArea)
        && Objects.equals(this.bundle, leadsContactInfoStruct.bundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsUserType,
        leadsUserWechatAppid,
        leadsUserId,
        leadsTel,
        leadsQq,
        leadsWechat,
        leadsName,
        leadsGender,
        leadsEmail,
        leadsArea,
        bundle);
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
