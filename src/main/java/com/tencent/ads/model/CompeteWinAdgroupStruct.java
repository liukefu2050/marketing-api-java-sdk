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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 账户内部竞争激烈度
 */
@ApiModel(description = "账户内部竞争激烈度")

public class CompeteWinAdgroupStruct {

  @SerializedName("score")
  private Long score = null;

  @SerializedName("list")
  private List<CompeteWinAdgroupListItem> list = null;

  public CompeteWinAdgroupStruct score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   **/
  @ApiModelProperty(value = "")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public CompeteWinAdgroupStruct list(List<CompeteWinAdgroupListItem> list) {
    this.list = list;
    return this;
  }

  public CompeteWinAdgroupStruct addListItem(CompeteWinAdgroupListItem listItem) {
    if (this.list == null) {
      this.list = new ArrayList<CompeteWinAdgroupListItem>();
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
  public List<CompeteWinAdgroupListItem> getList() {
    return list;
  }

  public void setList(List<CompeteWinAdgroupListItem> list) {
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
    CompeteWinAdgroupStruct competeWinAdgroupStruct = (CompeteWinAdgroupStruct) o;
    return Objects.equals(this.score, competeWinAdgroupStruct.score) &&
        Objects.equals(this.list, competeWinAdgroupStruct.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompeteWinAdgroupStruct {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

