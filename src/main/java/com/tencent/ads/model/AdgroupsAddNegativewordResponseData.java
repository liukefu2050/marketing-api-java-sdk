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
import java.util.Objects;

/** AdgroupsAddNegativewordResponseData */
public class AdgroupsAddNegativewordResponseData {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("status")
  private NegativeWordOperStatus status = null;

  @SerializedName("duplicate_words")
  private DuplicateNegativeWordStruct duplicateWords = null;

  @SerializedName("exceed_length_words")
  private ExceedLengthNegativeWordStruct exceedLengthWords = null;

  @SerializedName("exceed_limit_words")
  private ExceedLimitNegativeWordStruct exceedLimitWords = null;

  @SerializedName("has_special_words")
  private HasSpecialNegativeWordStruct hasSpecialWords = null;

  @SerializedName("success_words")
  private SuccessNegativeWordStruct successWords = null;

  public AdgroupsAddNegativewordResponseData adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdgroupsAddNegativewordResponseData status(NegativeWordOperStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public NegativeWordOperStatus getStatus() {
    return status;
  }

  public void setStatus(NegativeWordOperStatus status) {
    this.status = status;
  }

  public AdgroupsAddNegativewordResponseData duplicateWords(
      DuplicateNegativeWordStruct duplicateWords) {
    this.duplicateWords = duplicateWords;
    return this;
  }

  /**
   * Get duplicateWords
   *
   * @return duplicateWords
   */
  @ApiModelProperty(value = "")
  public DuplicateNegativeWordStruct getDuplicateWords() {
    return duplicateWords;
  }

  public void setDuplicateWords(DuplicateNegativeWordStruct duplicateWords) {
    this.duplicateWords = duplicateWords;
  }

  public AdgroupsAddNegativewordResponseData exceedLengthWords(
      ExceedLengthNegativeWordStruct exceedLengthWords) {
    this.exceedLengthWords = exceedLengthWords;
    return this;
  }

  /**
   * Get exceedLengthWords
   *
   * @return exceedLengthWords
   */
  @ApiModelProperty(value = "")
  public ExceedLengthNegativeWordStruct getExceedLengthWords() {
    return exceedLengthWords;
  }

  public void setExceedLengthWords(ExceedLengthNegativeWordStruct exceedLengthWords) {
    this.exceedLengthWords = exceedLengthWords;
  }

  public AdgroupsAddNegativewordResponseData exceedLimitWords(
      ExceedLimitNegativeWordStruct exceedLimitWords) {
    this.exceedLimitWords = exceedLimitWords;
    return this;
  }

  /**
   * Get exceedLimitWords
   *
   * @return exceedLimitWords
   */
  @ApiModelProperty(value = "")
  public ExceedLimitNegativeWordStruct getExceedLimitWords() {
    return exceedLimitWords;
  }

  public void setExceedLimitWords(ExceedLimitNegativeWordStruct exceedLimitWords) {
    this.exceedLimitWords = exceedLimitWords;
  }

  public AdgroupsAddNegativewordResponseData hasSpecialWords(
      HasSpecialNegativeWordStruct hasSpecialWords) {
    this.hasSpecialWords = hasSpecialWords;
    return this;
  }

  /**
   * Get hasSpecialWords
   *
   * @return hasSpecialWords
   */
  @ApiModelProperty(value = "")
  public HasSpecialNegativeWordStruct getHasSpecialWords() {
    return hasSpecialWords;
  }

  public void setHasSpecialWords(HasSpecialNegativeWordStruct hasSpecialWords) {
    this.hasSpecialWords = hasSpecialWords;
  }

  public AdgroupsAddNegativewordResponseData successWords(SuccessNegativeWordStruct successWords) {
    this.successWords = successWords;
    return this;
  }

  /**
   * Get successWords
   *
   * @return successWords
   */
  @ApiModelProperty(value = "")
  public SuccessNegativeWordStruct getSuccessWords() {
    return successWords;
  }

  public void setSuccessWords(SuccessNegativeWordStruct successWords) {
    this.successWords = successWords;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsAddNegativewordResponseData adgroupsAddNegativewordResponseData =
        (AdgroupsAddNegativewordResponseData) o;
    return Objects.equals(this.adgroupId, adgroupsAddNegativewordResponseData.adgroupId)
        && Objects.equals(this.status, adgroupsAddNegativewordResponseData.status)
        && Objects.equals(this.duplicateWords, adgroupsAddNegativewordResponseData.duplicateWords)
        && Objects.equals(
            this.exceedLengthWords, adgroupsAddNegativewordResponseData.exceedLengthWords)
        && Objects.equals(
            this.exceedLimitWords, adgroupsAddNegativewordResponseData.exceedLimitWords)
        && Objects.equals(this.hasSpecialWords, adgroupsAddNegativewordResponseData.hasSpecialWords)
        && Objects.equals(this.successWords, adgroupsAddNegativewordResponseData.successWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupId,
        status,
        duplicateWords,
        exceedLengthWords,
        exceedLimitWords,
        hasSpecialWords,
        successWords);
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
