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
 * 异步报表粒度
 */
@JsonAdapter(TimeGranularity.Adapter.class)
public enum TimeGranularity {

  DAILY("DAILY"),

  HOURLY("HOURLY");

  private String value;

  TimeGranularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeGranularity fromValue(String text) {
    for (TimeGranularity b : TimeGranularity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TimeGranularity> {

    @Override
    public void write(final JsonWriter jsonWriter, final TimeGranularity enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeGranularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimeGranularity.fromValue(String.valueOf(value));
    }
  }
}

