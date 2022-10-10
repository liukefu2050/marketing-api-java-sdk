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

/** 推广目标类型 */
@JsonAdapter(PromotedObjectType.Adapter.class)
public enum PromotedObjectType {
  APP_ANDROID("PROMOTED_OBJECT_TYPE_APP_ANDROID"),

  APP_ANDROID_GOOGLE_PLAY("PROMOTED_OBJECT_TYPE_APP_ANDROID_GOOGLE_PLAY"),

  APP_IOS("PROMOTED_OBJECT_TYPE_APP_IOS"),

  DIANPING_SHOP("PROMOTED_OBJECT_TYPE_DIANPING_SHOP"),

  ECOMMERCE("PROMOTED_OBJECT_TYPE_ECOMMERCE"),

  LINK_WECHAT("PROMOTED_OBJECT_TYPE_LINK_WECHAT"),

  APP_ANDROID_MYAPP("PROMOTED_OBJECT_TYPE_APP_ANDROID_MYAPP"),

  APP_ANDROID_UNION("PROMOTED_OBJECT_TYPE_APP_ANDROID_UNION"),

  LOCAL_ADS_WECHAT("PROMOTED_OBJECT_TYPE_LOCAL_ADS_WECHAT"),

  QQ_BROWSER_MINI_PROGRAM("PROMOTED_OBJECT_TYPE_QQ_BROWSER_MINI_PROGRAM"),

  LINK("PROMOTED_OBJECT_TYPE_LINK"),

  QQ_MESSAGE("PROMOTED_OBJECT_TYPE_QQ_MESSAGE"),

  QZONE_VIDEO_PAGE("PROMOTED_OBJECT_TYPE_QZONE_VIDEO_PAGE"),

  LOCAL_ADS("PROMOTED_OBJECT_TYPE_LOCAL_ADS"),

  ARTICLE("PROMOTED_OBJECT_TYPE_ARTICLE"),

  LEAD_AD("PROMOTED_OBJECT_TYPE_LEAD_AD"),

  TENCENT_KE("PROMOTED_OBJECT_TYPE_TENCENT_KE"),

  EXCHANGE_APP_ANDROID_MYAPP("PROMOTED_OBJECT_TYPE_EXCHANGE_APP_ANDROID_MYAPP"),

  QZONE_PAGE_ARTICLE("PROMOTED_OBJECT_TYPE_QZONE_PAGE_ARTICLE"),

  QZONE_PAGE_IFRAMED("PROMOTED_OBJECT_TYPE_QZONE_PAGE_IFRAMED"),

  QZONE_PAGE("PROMOTED_OBJECT_TYPE_QZONE_PAGE"),

  APP_PC("PROMOTED_OBJECT_TYPE_APP_PC"),

  MINI_GAME_WECHAT("PROMOTED_OBJECT_TYPE_MINI_GAME_WECHAT"),

  JD("PROMOTED_OBJECT_TYPE_JD"),

  MINI_GAME_QQ("PROMOTED_OBJECT_TYPE_MINI_GAME_QQ"),

  COUPON_WECHAT("PROMOTED_OBJECT_TYPE_COUPON_WECHAT"),

  APP_PROMOTION("PROMOTED_OBJECT_TYPE_APP_PROMOTION"),

  WECHAT_CHANNELS("PROMOTED_OBJECT_TYPE_WECHAT_CHANNELS"),

  WECHAT_OFFICIAL_ACCOUNT("PROMOTED_OBJECT_TYPE_WECHAT_OFFICIAL_ACCOUNT"),

  MINI_PROGRAM_WECHAT("PROMOTED_OBJECT_TYPE_MINI_PROGRAM_WECHAT"),

  APP_QUICK_APP("PROMOTED_OBJECT_TYPE_APP_QUICK_APP"),

  WECHAT_ARTICLE("PROMOTED_OBJECT_TYPE_WECHAT_ARTICLE"),

  WECHAT_PAY_COUPON("PROMOTED_OBJECT_TYPE_WECHAT_PAY_COUPON");

  private String value;

  PromotedObjectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotedObjectType fromValue(String text) {
    for (PromotedObjectType b : PromotedObjectType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotedObjectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotedObjectType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotedObjectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotedObjectType.fromValue(String.valueOf(value));
    }
  }
}
