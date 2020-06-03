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
 * OauthTokenResponseData
 */

public class OauthTokenResponseData {

  @SerializedName("authorizer_info")
  private AuthorizerStruct authorizerInfo = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("access_token_expires_in")
  private Long accessTokenExpiresIn = null;

  @SerializedName("refresh_token_expires_in")
  private Long refreshTokenExpiresIn = null;

  public OauthTokenResponseData authorizerInfo(AuthorizerStruct authorizerInfo) {
    this.authorizerInfo = authorizerInfo;
    return this;
  }

  /**
   * Get authorizerInfo
   *
   * @return authorizerInfo
   **/
  @ApiModelProperty(value = "")
  public AuthorizerStruct getAuthorizerInfo() {
    return authorizerInfo;
  }

  public void setAuthorizerInfo(AuthorizerStruct authorizerInfo) {
    this.authorizerInfo = authorizerInfo;
  }

  public OauthTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   *
   * @return accessToken
   **/
  @ApiModelProperty(value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthTokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   *
   * @return refreshToken
   **/
  @ApiModelProperty(value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthTokenResponseData accessTokenExpiresIn(Long accessTokenExpiresIn) {
    this.accessTokenExpiresIn = accessTokenExpiresIn;
    return this;
  }

  /**
   * Get accessTokenExpiresIn
   *
   * @return accessTokenExpiresIn
   **/
  @ApiModelProperty(value = "")
  public Long getAccessTokenExpiresIn() {
    return accessTokenExpiresIn;
  }

  public void setAccessTokenExpiresIn(Long accessTokenExpiresIn) {
    this.accessTokenExpiresIn = accessTokenExpiresIn;
  }

  public OauthTokenResponseData refreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  /**
   * Get refreshTokenExpiresIn
   *
   * @return refreshTokenExpiresIn
   **/
  @ApiModelProperty(value = "")
  public Long getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthTokenResponseData oauthTokenResponseData = (OauthTokenResponseData) o;
    return Objects.equals(this.authorizerInfo, oauthTokenResponseData.authorizerInfo) &&
        Objects.equals(this.accessToken, oauthTokenResponseData.accessToken) &&
        Objects.equals(this.refreshToken, oauthTokenResponseData.refreshToken) &&
        Objects.equals(this.accessTokenExpiresIn, oauthTokenResponseData.accessTokenExpiresIn) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthTokenResponseData.refreshTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizerInfo, accessToken, refreshToken, accessTokenExpiresIn,
        refreshTokenExpiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthTokenResponseData {\n");

    sb.append("    authorizerInfo: ").append(toIndentedString(authorizerInfo)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    accessTokenExpiresIn: ").append(toIndentedString(accessTokenExpiresIn))
        .append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn))
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

