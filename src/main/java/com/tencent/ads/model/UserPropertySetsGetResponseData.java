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
 * UserPropertySetsGetResponseData
 */

public class UserPropertySetsGetResponseData {

  @SerializedName("list")
  private List<UserPropertySet> list = null;

  public UserPropertySetsGetResponseData list(List<UserPropertySet> list) {
    this.list = list;
    return this;
  }

  public UserPropertySetsGetResponseData addListItem(UserPropertySet listItem) {
    if (this.list == null) {
      this.list = new ArrayList<UserPropertySet>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   **/
  @ApiModelProperty(value = "")
  public List<UserPropertySet> getList() {
    return list;
  }

  public void setList(List<UserPropertySet> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPropertySetsGetResponseData userPropertySetsGetResponseData = (UserPropertySetsGetResponseData) o;
    return Objects.equals(this.list, userPropertySetsGetResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPropertySetsGetResponseData {\n");

    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

