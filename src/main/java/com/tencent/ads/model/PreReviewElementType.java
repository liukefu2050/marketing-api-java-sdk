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

/** 元素类型 */
@JsonAdapter(PreReviewElementType.Adapter.class)
public enum PreReviewElementType {
  IMAGE("IMAGE"),

  VIDEO("VIDEO"),

  TXT("TXT"),

  DEST_URL("DEST_URL");

  private String value;

  PreReviewElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PreReviewElementType fromValue(String text) {
    for (PreReviewElementType b : PreReviewElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PreReviewElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PreReviewElementType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PreReviewElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PreReviewElementType.fromValue(String.valueOf(value));
    }
  }
}
