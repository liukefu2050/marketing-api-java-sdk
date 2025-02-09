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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 元素key */
@JsonAdapter(PreReviewElementKey.Adapter.class)
public enum PreReviewElementKey {
  IMG("IMG"),

  TXT("TXT"),

  CORPORATE_NAME("CORPORATE_NAME"),

  CORPORATE_IMG("CORPORATE_IMG"),

  BRAND_CORPORATE_NAME("BRAND_CORPORATE_NAME"),

  BRAND_CORPORATE_IMG("BRAND_CORPORATE_IMG"),

  BRAND_CORPORATE_DESC("BRAND_CORPORATE_DESC"),

  BUTTON_TXT("BUTTON_TXT"),

  BUTTON_URL("BUTTON_URL"),

  VIDEO_POPUP_BUTTON_TXT("VIDEO_POPUP_BUTTON_TXT"),

  VIDEO_POPUP_BUTTON_URL("VIDEO_POPUP_BUTTON_URL"),

  DESC("DESC"),

  URL("URL"),

  LEFT_BOTTOM_TXT("LEFT_BOTTOM_TXT"),

  BOTTOM_TXT("BOTTOM_TXT"),

  GIF("GIF"),

  VIDEO("VIDEO"),

  LEFT_UPPER_TXT("LEFT_UPPER_TXT"),

  SHARE_DESC("SHARE_DESC"),

  SHARE_IMG("SHARE_IMG");

  private String value;

  PreReviewElementKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PreReviewElementKey fromValue(String text) {
    for (PreReviewElementKey b : PreReviewElementKey.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PreReviewElementKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final PreReviewElementKey enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PreReviewElementKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PreReviewElementKey.fromValue(String.valueOf(value));
    }
  }
}
