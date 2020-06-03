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
 * 视频组件元素
 */
@ApiModel(description = "视频组件元素")

public class ElementVideo {

  @SerializedName("video_id")
  private Long videoId = null;

  public ElementVideo videoId(Long videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   **/
  @ApiModelProperty(value = "")
  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementVideo elementVideo = (ElementVideo) o;
    return Objects.equals(this.videoId, elementVideo.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementVideo {\n");

    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

