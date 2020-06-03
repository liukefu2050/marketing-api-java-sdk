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
 * 订单状态
 */
@JsonAdapter(EcommerceOrderStatus.Adapter.class)
public enum EcommerceOrderStatus {

  AWAITING_ORDER("AWAITING_ORDER"),

  SHIPPING_SOON("SHIPPING_SOON"),

  SHIPPED("SHIPPED"),

  DELIVERED("DELIVERED"),

  RETURNED("RETURNED");

  private String value;

  EcommerceOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EcommerceOrderStatus fromValue(String text) {
    for (EcommerceOrderStatus b : EcommerceOrderStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EcommerceOrderStatus> {

    @Override
    public void write(final JsonWriter jsonWriter, final EcommerceOrderStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EcommerceOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EcommerceOrderStatus.fromValue(String.valueOf(value));
    }
  }
}

