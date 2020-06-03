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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.api.ProductItemsDetailApi;
import com.tencent.ads.model.ProductItemsDetailGetResponse;
import com.tencent.ads.model.ProductItemsDetailGetResponseData;
import java.util.List;


public class ProductItemsDetailApiContainer extends ApiContainer {

  @Inject
  ProductItemsDetailApi api;


  /**
   * 获取商品详情
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductItemsDetailGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ProductItemsDetailGetResponseData productItemsDetailGet(Long accountId,
      Long productCatalogId, String productOuterId, List<String> fields) throws ApiException {
    ProductItemsDetailGetResponse resp = api
        .productItemsDetailGet(accountId, productCatalogId, productOuterId, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
