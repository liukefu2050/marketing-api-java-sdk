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
import com.tencent.ads.api.AdcreativePreviewsApi;
import com.tencent.ads.model.AdcreativePreviewsAddRequest;
import com.tencent.ads.model.AdcreativePreviewsAddResponse;
import com.tencent.ads.model.AdcreativePreviewsGetResponse;
import com.tencent.ads.model.AdcreativePreviewsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;


public class AdcreativePreviewsApiContainer extends ApiContainer {

  @Inject
  AdcreativePreviewsApi api;


  /**
   * 创建预览
   *
   * @param data (required)
   * @return AdcreativePreviewsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativePreviewsAddResponse adcreativePreviewsAdd(AdcreativePreviewsAddRequest data)
      throws ApiException {
    AdcreativePreviewsAddResponse resp = api.adcreativePreviewsAdd(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }


  /**
   * 获取预览受众
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativePreviewsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativePreviewsGetResponseData adcreativePreviewsGet(Long accountId,
      List<FilteringStruct> filtering, List<String> fields) throws ApiException {
    AdcreativePreviewsGetResponse resp = api.adcreativePreviewsGet(accountId, filtering, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
