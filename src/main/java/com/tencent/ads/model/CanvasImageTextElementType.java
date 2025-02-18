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

/** 图文复合组件转化类型 */
@JsonAdapter(CanvasImageTextElementType.Adapter.class)
public enum CanvasImageTextElementType {
  GH("GH"),

  ENTERPRISE_WX("ENTERPRISE_WX");

  private String value;

  CanvasImageTextElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CanvasImageTextElementType fromValue(String text) {
    for (CanvasImageTextElementType b : CanvasImageTextElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CanvasImageTextElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CanvasImageTextElementType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CanvasImageTextElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CanvasImageTextElementType.fromValue(String.valueOf(value));
    }
  }
}
