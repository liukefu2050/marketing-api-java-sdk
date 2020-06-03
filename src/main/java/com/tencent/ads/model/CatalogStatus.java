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
 * 商品目录状态，详见 &lt;a href&#x3D;&#39;catalog_status&#39; target&#x3D;&#39;_blank&#39;&gt;[商品目录状态]&lt;/a&gt;
 */
@JsonAdapter(CatalogStatus.Adapter.class)
public enum CatalogStatus {

  PREPARE("PRODUCT_CATALOG_STATUS_PREPARE"),

  NORMAL("PRODUCT_CATALOG_STATUS_NORMAL"),

  SUSPEND("PRODUCT_CATALOG_STATUS_SUSPEND"),

  DELETED("PRODUCT_CATALOG_STATUS_DELETED");

  private String value;

  CatalogStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogStatus fromValue(String text) {
    for (CatalogStatus b : CatalogStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogStatus> {

    @Override
    public void write(final JsonWriter jsonWriter, final CatalogStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogStatus.fromValue(String.valueOf(value));
    }
  }
}

