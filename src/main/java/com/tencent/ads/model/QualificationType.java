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
 * 资质类型
 */
@JsonAdapter(QualificationType.Adapter.class)
public enum QualificationType {

  INDUSTRY_QUALIFICATION("INDUSTRY_QUALIFICATION"),

  AD_QUALIFICATION("AD_QUALIFICATION"),

  ADDITIONAL_INDUSTRY_QUALIFICATION("ADDITIONAL_INDUSTRY_QUALIFICATION"),

  INDUSTRY_QUALIFICATION_WECHAT("INDUSTRY_QUALIFICATION_WECHAT"),

  AD_QUALIFICATION_WECHAT("AD_QUALIFICATION_WECHAT");

  private String value;

  QualificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QualificationType fromValue(String text) {
    for (QualificationType b : QualificationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QualificationType> {

    @Override
    public void write(final JsonWriter jsonWriter, final QualificationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QualificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QualificationType.fromValue(String.valueOf(value));
    }
  }
}

