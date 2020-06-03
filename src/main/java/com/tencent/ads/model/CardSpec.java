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
import java.util.Objects;

/**
 * 卡券信息
 */
@ApiModel(description = "卡券信息")

public class CardSpec {

  @SerializedName("title")
  private String title = null;

  @SerializedName("card_id")
  private String cardId = null;

  public CardSpec title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CardSpec cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   *
   * @return cardId
   **/
  @ApiModelProperty(value = "")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardSpec cardSpec = (CardSpec) o;
    return Objects.equals(this.title, cardSpec.title) &&
        Objects.equals(this.cardId, cardSpec.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, cardId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardSpec {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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

