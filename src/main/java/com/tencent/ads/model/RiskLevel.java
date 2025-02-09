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

/** 元素风险级别 */
@JsonAdapter(RiskLevel.Adapter.class)
public enum RiskLevel {
  PASS("PASS"),

  PROBABLE_PASS("PROBABLE_PASS"),

  PROBABLE_PART_REJECT("PROBABLE_PART_REJECT"),

  PROBABLE_REJECT("PROBABLE_REJECT"),

  PART_REJECT("PART_REJECT"),

  REJECT("REJECT");

  private String value;

  RiskLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskLevel fromValue(String text) {
    for (RiskLevel b : RiskLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RiskLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskLevel.fromValue(String.valueOf(value));
    }
  }
}
