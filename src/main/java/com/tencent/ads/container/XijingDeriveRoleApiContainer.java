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
import com.tencent.ads.api.XijingDeriveRoleApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingDeriveRoleGetRequest;
import com.tencent.ads.model.XijingDeriveRoleGetResponse;
import com.tencent.ads.model.XijingDeriveRoleGetResponseData;

public class XijingDeriveRoleApiContainer extends ApiContainer {

  @Inject XijingDeriveRoleApi api;

  /**
   * 生成虚拟人
   *
   * @param data (required)
   * @return XijingDeriveRoleGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingDeriveRoleGetResponseData xijingDeriveRoleGet(XijingDeriveRoleGetRequest data)
      throws ApiException, TencentAdsResponseException {
    XijingDeriveRoleGetResponse resp = api.xijingDeriveRoleGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
