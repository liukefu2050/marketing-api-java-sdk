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
import com.tencent.ads.api.XijingComplexTemplateApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingComplexTemplateGetResponse;
import com.tencent.ads.model.XijingComplexTemplateGetResponseData;
import java.util.List;

public class XijingComplexTemplateApiContainer extends ApiContainer {

  @Inject XijingComplexTemplateApi api;

  /**
   * 获取蹊径落地页互动模板配置
   *
   * @param accountId (required)
   * @param pageTemplateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return XijingComplexTemplateGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingComplexTemplateGetResponseData xijingComplexTemplateGet(
      Long accountId, String pageTemplateId, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    XijingComplexTemplateGetResponse resp =
        api.xijingComplexTemplateGet(accountId, pageTemplateId, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
