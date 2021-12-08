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

/** 落地页制作平台 */
@JsonAdapter(LandingPagePlatform.Adapter.class)
public enum LandingPagePlatform {
  UNKNOWN("LANDING_PAGE_PLATFORM_UNKNOWN"),

  TSA("LANDING_PAGE_PLATFORM_TSA"),

  FENGYE_EC("LANDING_PAGE_PLATFORM_FENGYE_EC"),

  FENGYE_DEFAULT("LANDING_PAGE_PLATFORM_FENGYE_DEFAULT"),

  XIJING("LANDING_PAGE_PLATFORM_XIJING"),

  YOUZAN("LANDING_PAGE_PLATFORM_YOUZAN"),

  MP("LANDING_PAGE_PLATFORM_MP"),

  APP_STORE("LANDING_PAGE_PLATFORM_APP_STORE"),

  YIYE("LANDING_PAGE_PLATFORM_YIYE"),

  JINSHUJU("LANDING_PAGE_PLATFORM_JINSHUJU"),

  WEIMOB("LANDING_PAGE_PLATFORM_WEIMOB"),

  QQ_MOBILE("LANDING_PAGE_PLATFORM_QQ_MOBILE"),

  QQ_BROWSER("LANDING_PAGE_PLATFORM_QQ_BROWSER"),

  PLAY("LANDING_PAGE_PLATFORM_PLAY"),

  YUEBAO("LANDING_PAGE_PLATFORM_YUEBAO"),

  WEIMOB_2("LANDING_PAGE_PLATFORM_wEIMOB");

  private String value;

  LandingPagePlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LandingPagePlatform fromValue(String text) {
    for (LandingPagePlatform b : LandingPagePlatform.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LandingPagePlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final LandingPagePlatform enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LandingPagePlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LandingPagePlatform.fromValue(String.valueOf(value));
    }
  }
}
