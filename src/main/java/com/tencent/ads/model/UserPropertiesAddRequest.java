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
 * UserPropertiesAddRequest
 */

public class UserPropertiesAddRequest {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("user_property_set_id")
  private Long userPropertySetId = null;

  @SerializedName("wechat_app_id")
  private String wechatAppId = null;

  @SerializedName("property")
  private List<Property> property = null;

  public UserPropertiesAddRequest accountId(Long accountId) {
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

  public UserPropertiesAddRequest userPropertySetId(Long userPropertySetId) {
    this.userPropertySetId = userPropertySetId;
    return this;
  }

  /**
   * Get userPropertySetId
   *
   * @return userPropertySetId
   **/
  @ApiModelProperty(value = "")
  public Long getUserPropertySetId() {
    return userPropertySetId;
  }

  public void setUserPropertySetId(Long userPropertySetId) {
    this.userPropertySetId = userPropertySetId;
  }

  public UserPropertiesAddRequest wechatAppId(String wechatAppId) {
    this.wechatAppId = wechatAppId;
    return this;
  }

  /**
   * Get wechatAppId
   *
   * @return wechatAppId
   **/
  @ApiModelProperty(value = "")
  public String getWechatAppId() {
    return wechatAppId;
  }

  public void setWechatAppId(String wechatAppId) {
    this.wechatAppId = wechatAppId;
  }

  public UserPropertiesAddRequest property(List<Property> property) {
    this.property = property;
    return this;
  }

  public UserPropertiesAddRequest addPropertyItem(Property propertyItem) {
    if (this.property == null) {
      this.property = new ArrayList<Property>();
    }
    this.property.add(propertyItem);
    return this;
  }

  /**
   * Get property
   *
   * @return property
   **/
  @ApiModelProperty(value = "")
  public List<Property> getProperty() {
    return property;
  }

  public void setProperty(List<Property> property) {
    this.property = property;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPropertiesAddRequest userPropertiesAddRequest = (UserPropertiesAddRequest) o;
    return Objects.equals(this.accountId, userPropertiesAddRequest.accountId) &&
        Objects.equals(this.userPropertySetId, userPropertiesAddRequest.userPropertySetId) &&
        Objects.equals(this.wechatAppId, userPropertiesAddRequest.wechatAppId) &&
        Objects.equals(this.property, userPropertiesAddRequest.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, userPropertySetId, wechatAppId, property);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPropertiesAddRequest {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userPropertySetId: ").append(toIndentedString(userPropertySetId)).append("\n");
    sb.append("    wechatAppId: ").append(toIndentedString(wechatAppId)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

