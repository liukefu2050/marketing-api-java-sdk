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
import com.tencent.ads.api.AdcreativeTemplatePreviewApi;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetRequest;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetResponse;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetResponseData;


public class AdcreativeTemplatePreviewApiContainer extends ApiContainer {

  @Inject
  AdcreativeTemplatePreviewApi api;


  /**
   * 获取广告创意预览（待废弃）
   *
   * @param data (required)
   * @return AdcreativeTemplatePreviewGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativeTemplatePreviewGetResponseData adcreativeTemplatePreviewGet(
      AdcreativeTemplatePreviewGetRequest data) throws ApiException {
    AdcreativeTemplatePreviewGetResponse resp = api.adcreativeTemplatePreviewGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
