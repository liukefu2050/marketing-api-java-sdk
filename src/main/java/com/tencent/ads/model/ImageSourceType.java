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
 * 图片来源
 */
@JsonAdapter(ImageSourceType.Adapter.class)
public enum ImageSourceType {

  UNSUPPORTED("SOURCE_TYPE_UNSUPPORTED"),

  LOCAL("SOURCE_TYPE_LOCAL"),

  MUSE("SOURCE_TYPE_MUSE"),

  API("SOURCE_TYPE_API"),

  QUICK_DRAW("SOURCE_TYPE_QUICK_DRAW"),

  VIDEO_SNAPSHOTS("SOURCE_TYPE_VIDEO_SNAPSHOTS");

  private String value;

  ImageSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageSourceType fromValue(String text) {
    for (ImageSourceType b : ImageSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageSourceType> {

    @Override
    public void write(final JsonWriter jsonWriter, final ImageSourceType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageSourceType.fromValue(String.valueOf(value));
    }
  }
}

