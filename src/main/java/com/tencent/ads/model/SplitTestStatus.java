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
 * 拆分对比实验状态
 */
@JsonAdapter(SplitTestStatus.Adapter.class)
public enum SplitTestStatus {

  NORMAL("SPLIT_TEST_STATUS_NORMAL"),

  SUSPEND("SPLIT_TEST_STATUS_SUSPEND"),

  PUBLISH("SPLIT_TEST_STATUS_PUBLISH");

  private String value;

  SplitTestStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SplitTestStatus fromValue(String text) {
    for (SplitTestStatus b : SplitTestStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SplitTestStatus> {

    @Override
    public void write(final JsonWriter jsonWriter, final SplitTestStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SplitTestStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SplitTestStatus.fromValue(String.valueOf(value));
    }
  }
}

