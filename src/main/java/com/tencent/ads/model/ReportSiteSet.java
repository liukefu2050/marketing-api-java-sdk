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
 * 投放站点集
 */
@JsonAdapter(ReportSiteSet.Adapter.class)
public enum ReportSiteSet {

  QZONE("SITE_SET_QZONE"),

  QQCLIENT("SITE_SET_QQCLIENT"),

  MUSIC("SITE_SET_MUSIC"),

  MOBILE_UNION("SITE_SET_MOBILE_UNION"),

  QQCOM("SITE_SET_QQCOM"),

  WECHAT("SITE_SET_WECHAT"),

  MOBILE_MYAPP("SITE_SET_MOBILE_MYAPP"),

  MOBILE_INNER("SITE_SET_MOBILE_INNER"),

  TENCENT_NEWS("SITE_SET_TENCENT_NEWS"),

  TENCENT_VIDEO("SITE_SET_TENCENT_VIDEO"),

  TENCENT_KUAIBAO("SITE_SET_TENCENT_KUAIBAO"),

  PENGYOU("SITE_SET_PENGYOU"),

  TUAN("SITE_SET_TUAN"),

  MEISHI("SITE_SET_MEISHI"),

  PIAO("SITE_SET_PIAO"),

  MAIL("SITE_SET_MAIL"),

  PC_UNION("SITE_SET_PC_UNION"),

  YINGYONGBAO_PC("SITE_SET_YINGYONGBAO_PC"),

  PAIPAISEARCH("SITE_SET_PAIPAISEARCH"),

  QQSHOP("SITE_SET_QQSHOP"),

  PAIPAIDAOGOU("SITE_SET_PAIPAIDAOGOU"),

  QZONESEARCH("SITE_SET_QZONESEARCH"),

  WEBUNION_DELETED("SITE_SET_WEBUNION_DELETED"),

  EXPRESSPORTAL("SITE_SET_EXPRESSPORTAL"),

  WEIBO("SITE_SET_WEIBO"),

  WANGGOU("SITE_SET_WANGGOU"),

  MOBILE_UNION_DELETED("SITE_SET_MOBILE_UNION_DELETED"),

  THIRDPARTY("SITE_SET_THIRDPARTY"),

  JD_WAICAI("SITE_SET_JD_WAICAI"),

  PCQQ("SITE_SET_PCQQ"),

  KANDIAN("SITE_SET_KANDIAN"),

  QQ_MUSIC_GAME("SITE_SET_QQ_MUSIC_GAME"),

  MOMENTS("SITE_SET_MOMENTS"),

  KUAISHOU("SITE_SET_KUAISHOU"),

  PC_TENCENT_NEWS("SITE_SET_PC_TENCENT_NEWS");

  private String value;

  ReportSiteSet(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportSiteSet fromValue(String text) {
    for (ReportSiteSet b : ReportSiteSet.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportSiteSet> {

    @Override
    public void write(final JsonWriter jsonWriter, final ReportSiteSet enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportSiteSet read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportSiteSet.fromValue(String.valueOf(value));
    }
  }
}

