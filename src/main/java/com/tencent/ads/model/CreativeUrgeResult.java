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

/** 创意催审结果 */
@JsonAdapter(CreativeUrgeResult.Adapter.class)
public enum CreativeUrgeResult {
  SUCCESS("SUCCESS"),

  SYSTEM_ERROR("SYSTEM_ERROR"),

  ACCOUNT_NO_PERMISSION("ACCOUNT_NO_PERMISSION"),

  ACCOUNT_REACH_URGE_UPPER_LIMIT("ACCOUNT_REACH_URGE_UPPER_LIMIT"),

  AD_ID_NOT_EXIST("AD_ID_NOT_EXIST"),

  AD_ID_ALREADY_URGED("AD_ID_ALREADY_URGED"),

  AD_ID_NOT_REACH_URGE_TIME("AD_ID_NOT_REACH_URGE_TIME"),

  ACCOUNT_NO_BALANCE("ACCOUNT_NO_BALANCE"),

  ACCOUNT_PENDING("ACCOUNT_PENDING");

  private String value;

  CreativeUrgeResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeUrgeResult fromValue(String text) {
    for (CreativeUrgeResult b : CreativeUrgeResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeUrgeResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeUrgeResult enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeUrgeResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeUrgeResult.fromValue(String.valueOf(value));
    }
  }
}
