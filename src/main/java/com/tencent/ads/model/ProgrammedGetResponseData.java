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

/** ProgrammedGetResponseData */
public class ProgrammedGetResponseData {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("material_derive_id")
  private Long materialDeriveId = null;

  @SerializedName("ad_metadata")
  private AdMetadataStruct adMetadata = null;

  @SerializedName("material_groups")
  private List<MaterialGroupStruct> materialGroups = null;

  public ProgrammedGetResponseData accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ProgrammedGetResponseData materialDeriveId(Long materialDeriveId) {
    this.materialDeriveId = materialDeriveId;
    return this;
  }

  /**
   * Get materialDeriveId
   *
   * @return materialDeriveId
   */
  @ApiModelProperty(value = "")
  public Long getMaterialDeriveId() {
    return materialDeriveId;
  }

  public void setMaterialDeriveId(Long materialDeriveId) {
    this.materialDeriveId = materialDeriveId;
  }

  public ProgrammedGetResponseData adMetadata(AdMetadataStruct adMetadata) {
    this.adMetadata = adMetadata;
    return this;
  }

  /**
   * Get adMetadata
   *
   * @return adMetadata
   */
  @ApiModelProperty(value = "")
  public AdMetadataStruct getAdMetadata() {
    return adMetadata;
  }

  public void setAdMetadata(AdMetadataStruct adMetadata) {
    this.adMetadata = adMetadata;
  }

  public ProgrammedGetResponseData materialGroups(List<MaterialGroupStruct> materialGroups) {
    this.materialGroups = materialGroups;
    return this;
  }

  public ProgrammedGetResponseData addMaterialGroupsItem(MaterialGroupStruct materialGroupsItem) {
    if (this.materialGroups == null) {
      this.materialGroups = new ArrayList<MaterialGroupStruct>();
    }
    this.materialGroups.add(materialGroupsItem);
    return this;
  }

  /**
   * Get materialGroups
   *
   * @return materialGroups
   */
  @ApiModelProperty(value = "")
  public List<MaterialGroupStruct> getMaterialGroups() {
    return materialGroups;
  }

  public void setMaterialGroups(List<MaterialGroupStruct> materialGroups) {
    this.materialGroups = materialGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammedGetResponseData programmedGetResponseData = (ProgrammedGetResponseData) o;
    return Objects.equals(this.accountId, programmedGetResponseData.accountId)
        && Objects.equals(this.materialDeriveId, programmedGetResponseData.materialDeriveId)
        && Objects.equals(this.adMetadata, programmedGetResponseData.adMetadata)
        && Objects.equals(this.materialGroups, programmedGetResponseData.materialGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, materialDeriveId, adMetadata, materialGroups);
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
