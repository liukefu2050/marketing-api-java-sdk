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
 * LBS兴趣点类型
 */
@JsonAdapter(LbsPOIType.Adapter.class)
public enum LbsPOIType {

  ALL("ALL"),

  TRAVEL_IN("TRAVEL_IN");

  private String value;

  LbsPOIType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LbsPOIType fromValue(String text) {
    for (LbsPOIType b : LbsPOIType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LbsPOIType> {

    @Override
    public void write(final JsonWriter jsonWriter, final LbsPOIType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LbsPOIType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LbsPOIType.fromValue(String.valueOf(value));
    }
  }
}

