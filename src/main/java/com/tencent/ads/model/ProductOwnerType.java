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
 * 商品所有者类型,”自营“，”商家“
 */
@JsonAdapter(ProductOwnerType.Adapter.class)
public enum ProductOwnerType {

  SOP("PRODUCT_OWNER_TYPE_SOP"),

  POP("PRODUCT_OWNER_TYPE_POP");

  private String value;

  ProductOwnerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductOwnerType fromValue(String text) {
    for (ProductOwnerType b : ProductOwnerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductOwnerType> {

    @Override
    public void write(final JsonWriter jsonWriter, final ProductOwnerType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductOwnerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductOwnerType.fromValue(String.valueOf(value));
    }
  }
}

