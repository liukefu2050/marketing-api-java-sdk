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
import com.tencent.ads.api.XijingDeriveTempTokenApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingDeriveTempTokenGetRequest;
import com.tencent.ads.model.XijingDeriveTempTokenGetResponse;
import com.tencent.ads.model.XijingDeriveTempTokenGetResponseData;

public class XijingDeriveTempTokenApiContainer extends ApiContainer {

  @Inject XijingDeriveTempTokenApi api;

  /**
   * 生成预览token
   *
   * @param data (required)
   * @return XijingDeriveTempTokenGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingDeriveTempTokenGetResponseData xijingDeriveTempTokenGet(
      XijingDeriveTempTokenGetRequest data) throws ApiException, TencentAdsResponseException {
    XijingDeriveTempTokenGetResponse resp = api.xijingDeriveTempTokenGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
