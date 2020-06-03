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
 * 线索状态
 */
@JsonAdapter(LeadCluesLeadsConvertType.Adapter.class)
public enum LeadCluesLeadsConvertType {

  DEPRECATED("LEADS_CONVERT_STATUS_DEPRECATED"),

  POTENTIAL_CUSTOMER("LEADS_CONVERT_STATUS_POTENTIAL_CUSTOMER"),

  HIGH_INTENTION_CUSTOMER("LEADS_CONVERT_STATUS_HIGH_INTENTION_CUSTOMER"),

  TRANS_COMPLETED("LEADS_CONVERT_STATUS_TRANS_COMPLETED");

  private String value;

  LeadCluesLeadsConvertType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LeadCluesLeadsConvertType fromValue(String text) {
    for (LeadCluesLeadsConvertType b : LeadCluesLeadsConvertType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LeadCluesLeadsConvertType> {

    @Override
    public void write(final JsonWriter jsonWriter, final LeadCluesLeadsConvertType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LeadCluesLeadsConvertType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LeadCluesLeadsConvertType.fromValue(String.valueOf(value));
    }
  }
}

