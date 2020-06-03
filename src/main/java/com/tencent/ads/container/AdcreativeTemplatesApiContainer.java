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
import com.tencent.ads.api.AdcreativeTemplatesApi;
import com.tencent.ads.model.AdcreativeTemplatesGetResponse;
import com.tencent.ads.model.AdcreativeTemplatesGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;


public class AdcreativeTemplatesApiContainer extends ApiContainer {

  @Inject
  AdcreativeTemplatesApi api;


  /**
   * 获取创意规格信息
   *
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativeTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativeTemplatesGetResponseData adcreativeTemplatesGet(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields)
      throws ApiException {
    AdcreativeTemplatesGetResponse resp = api
        .adcreativeTemplatesGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
