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

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 创意标签，灰度开放中,请填写推广产品属于该行业分类下哪个细分服务，或者创意上描述的产品特点，标签描述越详细全面将越有助于点击率和转化率的预估。
 */
@ApiModel(description = "创意标签，灰度开放中,请填写推广产品属于该行业分类下哪个细分服务，或者创意上描述的产品特点，标签描述越详细全面将越有助于点击率和转化率的预估。")

public class Label extends ArrayList<String> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

