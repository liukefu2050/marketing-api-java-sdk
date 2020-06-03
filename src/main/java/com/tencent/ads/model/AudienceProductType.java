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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * 推广目标类型
 */
@JsonAdapter(AudienceProductType.Adapter.class)
public enum AudienceProductType {

  PAIPAI_ITEM("PRODUCT_TYPE_PAIPAI_ITEM"),

  PAIPAI_SHOP("PRODUCT_TYPE_PAIPAI_SHOP"),

  QZONE_PAGE_INDEX("PRODUCT_TYPE_QZONE_PAGE_INDEX"),

  APP_PC("PRODUCT_TYPE_APP_PC"),

  MYAPP("PRODUCT_TYPE_MYAPP"),

  QQ_GROUP("PRODUCT_TYPE_QQ_GROUP"),

  QQ_BUSINESS("PRODUCT_TYPE_QQ_BUSINESS"),

  B_QQ("PRODUCT_TYPE_B_QQ"),

  _51BUY("PRODUCT_TYPE_51BUY"),

  QQ_TUAN("PRODUCT_TYPE_QQ_TUAN"),

  TASK("PRODUCT_TYPE_TASK"),

  APP_ANDROID_OPEN_PLATFORM("PRODUCT_TYPE_APP_ANDROID_OPEN_PLATFORM"),

  FEEDS("PRODUCT_TYPE_FEEDS"),

  PAIPAI_SHOP_URL("PRODUCT_TYPE_PAIPAI_SHOP_URL"),

  LIVE_VIDEO_ROOM("PRODUCT_TYPE_LIVE_VIDEO_ROOM"),

  QZONE_GIFT("PRODUCT_TYPE_QZONE_GIFT"),

  QZONE_SIGN("PRODUCT_TYPE_QZONE_SIGN"),

  APP_IOS("PRODUCT_TYPE_APP_IOS"),

  EXCHANGE_APP_FOR_MYAPP("PRODUCT_TYPE_EXCHANGE_APP_FOR_MYAPP"),

  QZONE_PAGE_ARTICLE("PRODUCT_TYPE_QZONE_PAGE_ARTICLE"),

  QZONE_PAGE_IFRAMED("PRODUCT_TYPE_QZONE_PAGE_IFRAMED"),

  WECHAT("PRODUCT_TYPE_WECHAT"),

  OPEN_PLATFORM_APP_MOB_TASK("PRODUCT_TYPE_OPEN_PLATFORM_APP_MOB_TASK"),

  LINK_JD("PRODUCT_TYPE_LINK_JD"),

  DIANPING_SHOP("PRODUCT_TYPE_DIANPING_SHOP"),

  DIANPING_COUPON("PRODUCT_TYPE_DIANPING_COUPON"),

  DIANPING_TUAN("PRODUCT_TYPE_DIANPING_TUAN"),

  WECHAT_ARTICLE("PRODUCT_TYPE_WECHAT_ARTICLE"),

  SHOP_WECHAT("PRODUCT_TYPE_SHOP_WECHAT"),

  ECOMMERCE("PRODUCT_TYPE_ECOMMERCE"),

  LINK_WECHAT("PRODUCT_TYPE_LINK_WECHAT"),

  JD_ITEM("PRODUCT_TYPE_JD_ITEM"),

  JD_SHOP("PRODUCT_TYPE_JD_SHOP"),

  TENCENT_KE("PRODUCT_TYPE_TENCENT_KE"),

  MYAPP_PROMOTION("PRODUCT_TYPE_MYAPP_PROMOTION"),

  LINK_MOBILE_QQ_MP("PRODUCT_TYPE_LINK_MOBILE_QQ_MP"),

  APP_ANDROID_UNION("PRODUCT_TYPE_APP_ANDROID_UNION"),

  LBS_WECHAT("PRODUCT_TYPE_LBS_WECHAT"),

  QZONE_PAGE_VIDEO("PRODUCT_TYPE_QZONE_PAGE_VIDEO"),

  LINK("PRODUCT_TYPE_LINK"),

  URL_INNER_TENCENT_DOMAIN("PRODUCT_TYPE_URL_INNER_TENCENT_DOMAIN");

  private String value;

  AudienceProductType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceProductType fromValue(String text) {
    for (AudienceProductType b : AudienceProductType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudienceProductType> {

    @Override
    public void write(final JsonWriter jsonWriter, final AudienceProductType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudienceProductType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudienceProductType.fromValue(String.valueOf(value));
    }
  }
}

