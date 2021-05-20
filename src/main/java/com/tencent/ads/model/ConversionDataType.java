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

/** 数据展示的数据类型 */
@JsonAdapter(ConversionDataType.Adapter.class)
public enum ConversionDataType {
  DEFAULT("CONVERSION_DATA_DEFAULT"),

  FRIEND_PLAY("CONVERSION_DATA_FRIEND_PLAY"),

  APP_DOWNLOAD("CONVERSION_DATA_APP_DOWNLOAD"),

  ONSHOP("CONVERSION_DATA_ONSHOP"),

  ADMETRIC("CONVERSION_DATA_ADMETRIC"),

  FRIEND_FOLLOW("CONVERSION_DATA_FRIEND_FOLLOW");

  private String value;

  ConversionDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionDataType fromValue(String text) {
    for (ConversionDataType b : ConversionDataType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConversionDataType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionDataType.fromValue(String.valueOf(value));
    }
  }
}
