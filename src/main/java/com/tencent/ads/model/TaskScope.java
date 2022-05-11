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

/** 任务操作业务对象范围 */
@JsonAdapter(TaskScope.Adapter.class)
public enum TaskScope {
  UNKNOWN("TASK_SCOPE_UNKNOWN"),

  CAMPAIGN("TASK_SCOPE_CAMPAIGN"),

  ADGROUP("TASK_SCOPE_ADGROUP"),

  ADVERTISER("TASK_SCOPE_ADVERTISER"),

  SCHEDULED_TASK("TASK_SCOPE_SCHEDULED_TASK"),

  AD("TASK_SCOPE_AD"),

  ADCREATIVE("TASK_SCOPE_ADCREATIVE"),

  PROJECT("TASK_SCOPE_PROJECT");

  private String value;

  TaskScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskScope fromValue(String text) {
    for (TaskScope b : TaskScope.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskScope.fromValue(String.valueOf(value));
    }
  }
}
