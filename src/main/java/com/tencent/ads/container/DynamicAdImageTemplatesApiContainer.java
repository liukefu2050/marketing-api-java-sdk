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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.DynamicAdImageTemplatesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DynamicAdImageTemplatesGetResponse;
import com.tencent.ads.model.DynamicAdImageTemplatesGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class DynamicAdImageTemplatesApiContainer extends ApiContainer {

  @Inject DynamicAdImageTemplatesApi api;

  /**
   * 获取动态商品图片模板
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productMode (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdImageTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdImageTemplatesGetResponseData dynamicAdImageTemplatesGet(
      Long accountId,
      Long productCatalogId,
      String productMode,
      Long dynamicAdTemplateWidth,
      Long dynamicAdTemplateHeight,
      String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    DynamicAdImageTemplatesGetResponse resp =
        api.dynamicAdImageTemplatesGet(
            accountId,
            productCatalogId,
            productMode,
            dynamicAdTemplateWidth,
            dynamicAdTemplateHeight,
            dynamicAdTemplateOwnershipType,
            filtering,
            page,
            pageSize,
            fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
