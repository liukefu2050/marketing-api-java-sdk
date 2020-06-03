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
import java.util.Objects;

/**
 * WechatAgencyGetResponseData
 */

public class WechatAgencyGetResponseData {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  @SerializedName("wechat_account_name")
  private String wechatAccountName = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("admin_name")
  private String adminName = null;

  @SerializedName("admin_phone_number")
  private String adminPhoneNumber = null;

  @SerializedName("admin_wechat_id")
  private String adminWechatId = null;

  @SerializedName("certification_image")
  private String certificationImage = null;

  @SerializedName("corporation_licence")
  private String corporationLicence = null;

  @SerializedName("advertiser_info_spec")
  private AdvertiserInfoSpecStruct advertiserInfoSpec = null;

  public WechatAgencyGetResponseData accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   **/
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public WechatAgencyGetResponseData wechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  /**
   * Get wechatAccountId
   *
   * @return wechatAccountId
   **/
  @ApiModelProperty(value = "")
  public String getWechatAccountId() {
    return wechatAccountId;
  }

  public void setWechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
  }

  public WechatAgencyGetResponseData wechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
    return this;
  }

  /**
   * Get wechatAccountName
   *
   * @return wechatAccountName
   **/
  @ApiModelProperty(value = "")
  public String getWechatAccountName() {
    return wechatAccountName;
  }

  public void setWechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
  }

  public WechatAgencyGetResponseData corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   *
   * @return corporationName
   **/
  @ApiModelProperty(value = "")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public WechatAgencyGetResponseData adminName(String adminName) {
    this.adminName = adminName;
    return this;
  }

  /**
   * Get adminName
   *
   * @return adminName
   **/
  @ApiModelProperty(value = "")
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public WechatAgencyGetResponseData adminPhoneNumber(String adminPhoneNumber) {
    this.adminPhoneNumber = adminPhoneNumber;
    return this;
  }

  /**
   * Get adminPhoneNumber
   *
   * @return adminPhoneNumber
   **/
  @ApiModelProperty(value = "")
  public String getAdminPhoneNumber() {
    return adminPhoneNumber;
  }

  public void setAdminPhoneNumber(String adminPhoneNumber) {
    this.adminPhoneNumber = adminPhoneNumber;
  }

  public WechatAgencyGetResponseData adminWechatId(String adminWechatId) {
    this.adminWechatId = adminWechatId;
    return this;
  }

  /**
   * Get adminWechatId
   *
   * @return adminWechatId
   **/
  @ApiModelProperty(value = "")
  public String getAdminWechatId() {
    return adminWechatId;
  }

  public void setAdminWechatId(String adminWechatId) {
    this.adminWechatId = adminWechatId;
  }

  public WechatAgencyGetResponseData certificationImage(String certificationImage) {
    this.certificationImage = certificationImage;
    return this;
  }

  /**
   * Get certificationImage
   *
   * @return certificationImage
   **/
  @ApiModelProperty(value = "")
  public String getCertificationImage() {
    return certificationImage;
  }

  public void setCertificationImage(String certificationImage) {
    this.certificationImage = certificationImage;
  }

  public WechatAgencyGetResponseData corporationLicence(String corporationLicence) {
    this.corporationLicence = corporationLicence;
    return this;
  }

  /**
   * Get corporationLicence
   *
   * @return corporationLicence
   **/
  @ApiModelProperty(value = "")
  public String getCorporationLicence() {
    return corporationLicence;
  }

  public void setCorporationLicence(String corporationLicence) {
    this.corporationLicence = corporationLicence;
  }

  public WechatAgencyGetResponseData advertiserInfoSpec(
      AdvertiserInfoSpecStruct advertiserInfoSpec) {
    this.advertiserInfoSpec = advertiserInfoSpec;
    return this;
  }

  /**
   * Get advertiserInfoSpec
   *
   * @return advertiserInfoSpec
   **/
  @ApiModelProperty(value = "")
  public AdvertiserInfoSpecStruct getAdvertiserInfoSpec() {
    return advertiserInfoSpec;
  }

  public void setAdvertiserInfoSpec(AdvertiserInfoSpecStruct advertiserInfoSpec) {
    this.advertiserInfoSpec = advertiserInfoSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatAgencyGetResponseData wechatAgencyGetResponseData = (WechatAgencyGetResponseData) o;
    return Objects.equals(this.accountId, wechatAgencyGetResponseData.accountId) &&
        Objects.equals(this.wechatAccountId, wechatAgencyGetResponseData.wechatAccountId) &&
        Objects.equals(this.wechatAccountName, wechatAgencyGetResponseData.wechatAccountName) &&
        Objects.equals(this.corporationName, wechatAgencyGetResponseData.corporationName) &&
        Objects.equals(this.adminName, wechatAgencyGetResponseData.adminName) &&
        Objects.equals(this.adminPhoneNumber, wechatAgencyGetResponseData.adminPhoneNumber) &&
        Objects.equals(this.adminWechatId, wechatAgencyGetResponseData.adminWechatId) &&
        Objects.equals(this.certificationImage, wechatAgencyGetResponseData.certificationImage) &&
        Objects.equals(this.corporationLicence, wechatAgencyGetResponseData.corporationLicence) &&
        Objects.equals(this.advertiserInfoSpec, wechatAgencyGetResponseData.advertiserInfoSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, wechatAccountId, wechatAccountName, corporationName, adminName,
        adminPhoneNumber, adminWechatId, certificationImage, corporationLicence,
        advertiserInfoSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WechatAgencyGetResponseData {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    wechatAccountId: ").append(toIndentedString(wechatAccountId)).append("\n");
    sb.append("    wechatAccountName: ").append(toIndentedString(wechatAccountName)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    adminPhoneNumber: ").append(toIndentedString(adminPhoneNumber)).append("\n");
    sb.append("    adminWechatId: ").append(toIndentedString(adminWechatId)).append("\n");
    sb.append("    certificationImage: ").append(toIndentedString(certificationImage)).append("\n");
    sb.append("    corporationLicence: ").append(toIndentedString(corporationLicence)).append("\n");
    sb.append("    advertiserInfoSpec: ").append(toIndentedString(advertiserInfoSpec)).append("\n");
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

