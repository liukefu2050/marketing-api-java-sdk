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
 * ProductItemsGetResponseData
 */

public class ProductItemsGetResponseData {

  @SerializedName("list")
  private List<ProductItemsGetListStruct> list = null;

  public ProductItemsGetResponseData list(List<ProductItemsGetListStruct> list) {
    this.list = list;
    return this;
  }

  public ProductItemsGetResponseData addListItem(ProductItemsGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ProductItemsGetListStruct>();
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
  public List<ProductItemsGetListStruct> getList() {
    return list;
  }

  public void setList(List<ProductItemsGetListStruct> list) {
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
    ProductItemsGetResponseData productItemsGetResponseData = (ProductItemsGetResponseData) o;
    return Objects.equals(this.list, productItemsGetResponseData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductItemsGetResponseData {\n");

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

