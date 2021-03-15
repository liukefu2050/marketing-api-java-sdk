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

/** 资产类型 */
@JsonAdapter(AssetType.Adapter.class)
public enum AssetType {
  NDMP("ASSET_TYPE_NDMP"),

  XIJING("ASSET_TYPE_XIJING"),

  CANVAS_WECHAT("ASSET_TYPE_CANVAS_WECHAT"),

  CANVAS_IMAGE("ASSET_TYPE_CANVAS_IMAGE"),

  CANVAS_VIDEO("ASSET_TYPE_CANVAS_VIDEO"),

  FENGYE("ASSET_TYPE_FENGYE"),

  DYNAMIC_AD_TEMPLATE("ASSET_TYPE_DYNAMIC_AD_TEMPLATE"),

  AD_QUALIFICATION("ASSET_TYPE_AD_QUALIFICATION"),

  CATALOG("ASSET_TYPE_CATALOG"),

  ACTION_SET("ASSET_TYPE_ACTION_SET"),

  CONVERSION_SPEC("ASSET_TYPE_CONVERSION_SPEC"),

  UNION_PACKAGE("ASSET_TYPE_UNION_PACKAGE"),

  ACCOUNT_WECHAT_CANVAS("ASSET_TYPE_ACCOUNT_WECHAT_CANVAS");

  private String value;

  AssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetType fromValue(String text) {
    for (AssetType b : AssetType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetType.fromValue(String.valueOf(value));
    }
  }
}
