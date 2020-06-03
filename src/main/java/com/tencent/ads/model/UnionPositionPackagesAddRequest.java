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
 * UnionPositionPackagesAddRequest
 */

public class UnionPositionPackagesAddRequest {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("union_package_name")
  private String unionPackageName = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("union_package_type")
  private UnionPackageType unionPackageType = null;

  @SerializedName("union_position_id_list")
  private List<Long> unionPositionIdList = null;

  public UnionPositionPackagesAddRequest accountId(Long accountId) {
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

  public UnionPositionPackagesAddRequest unionPackageName(String unionPackageName) {
    this.unionPackageName = unionPackageName;
    return this;
  }

  /**
   * Get unionPackageName
   *
   * @return unionPackageName
   **/
  @ApiModelProperty(value = "")
  public String getUnionPackageName() {
    return unionPackageName;
  }

  public void setUnionPackageName(String unionPackageName) {
    this.unionPackageName = unionPackageName;
  }

  public UnionPositionPackagesAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   **/
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public UnionPositionPackagesAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   **/
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public UnionPositionPackagesAddRequest unionPackageType(UnionPackageType unionPackageType) {
    this.unionPackageType = unionPackageType;
    return this;
  }

  /**
   * Get unionPackageType
   *
   * @return unionPackageType
   **/
  @ApiModelProperty(value = "")
  public UnionPackageType getUnionPackageType() {
    return unionPackageType;
  }

  public void setUnionPackageType(UnionPackageType unionPackageType) {
    this.unionPackageType = unionPackageType;
  }

  public UnionPositionPackagesAddRequest unionPositionIdList(List<Long> unionPositionIdList) {
    this.unionPositionIdList = unionPositionIdList;
    return this;
  }

  public UnionPositionPackagesAddRequest addUnionPositionIdListItem(Long unionPositionIdListItem) {
    if (this.unionPositionIdList == null) {
      this.unionPositionIdList = new ArrayList<Long>();
    }
    this.unionPositionIdList.add(unionPositionIdListItem);
    return this;
  }

  /**
   * Get unionPositionIdList
   *
   * @return unionPositionIdList
   **/
  @ApiModelProperty(value = "")
  public List<Long> getUnionPositionIdList() {
    return unionPositionIdList;
  }

  public void setUnionPositionIdList(List<Long> unionPositionIdList) {
    this.unionPositionIdList = unionPositionIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionPositionPackagesAddRequest unionPositionPackagesAddRequest = (UnionPositionPackagesAddRequest) o;
    return Objects.equals(this.accountId, unionPositionPackagesAddRequest.accountId) &&
        Objects.equals(this.unionPackageName, unionPositionPackagesAddRequest.unionPackageName) &&
        Objects.equals(this.promotedObjectType, unionPositionPackagesAddRequest.promotedObjectType)
        &&
        Objects.equals(this.promotedObjectId, unionPositionPackagesAddRequest.promotedObjectId) &&
        Objects.equals(this.unionPackageType, unionPositionPackagesAddRequest.unionPackageType) &&
        Objects
            .equals(this.unionPositionIdList, unionPositionPackagesAddRequest.unionPositionIdList);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(accountId, unionPackageName, promotedObjectType, promotedObjectId, unionPackageType,
            unionPositionIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnionPositionPackagesAddRequest {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    unionPackageName: ").append(toIndentedString(unionPackageName)).append("\n");
    sb.append("    promotedObjectType: ").append(toIndentedString(promotedObjectType)).append("\n");
    sb.append("    promotedObjectId: ").append(toIndentedString(promotedObjectId)).append("\n");
    sb.append("    unionPackageType: ").append(toIndentedString(unionPackageType)).append("\n");
    sb.append("    unionPositionIdList: ").append(toIndentedString(unionPositionIdList))
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

