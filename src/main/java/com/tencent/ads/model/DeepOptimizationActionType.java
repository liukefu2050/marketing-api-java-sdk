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
 * oCPC/oCPM深度优化方式配置。仅当深度优化类型&#x3D;优化深度转化行为时，支持选择“优化方式”。优化方式选择后不可更改，但可以取消使用深度优化。
 */
@JsonAdapter(DeepOptimizationActionType.Adapter.class)
public enum DeepOptimizationActionType {

  DOUBLE_GOAL_BID("DEEP_OPTIMIZATION_ACTION_TYPE_DOUBLE_GOAL_BID"),

  TWO_STAGE_BID("DEEP_OPTIMIZATION_ACTION_TYPE_TWO_STAGE_BID");

  private String value;

  DeepOptimizationActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeepOptimizationActionType fromValue(String text) {
    for (DeepOptimizationActionType b : DeepOptimizationActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeepOptimizationActionType> {

    @Override
    public void write(final JsonWriter jsonWriter, final DeepOptimizationActionType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeepOptimizationActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeepOptimizationActionType.fromValue(String.valueOf(value));
    }
  }
}

