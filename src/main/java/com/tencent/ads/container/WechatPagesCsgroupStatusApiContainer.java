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
import com.tencent.ads.api.WechatPagesCsgroupStatusApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.WechatPagesCsgroupStatusUpdateRequest;
import com.tencent.ads.model.WechatPagesCsgroupStatusUpdateResponse;

public class WechatPagesCsgroupStatusApiContainer extends ApiContainer {

  @Inject WechatPagesCsgroupStatusApi api;

  /**
   * 更新企业微信组件客服状态
   *
   * @param data (required)
   * @return WechatPagesCsgroupStatusUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesCsgroupStatusUpdateResponse wechatPagesCsgroupStatusUpdate(
      WechatPagesCsgroupStatusUpdateRequest data) throws ApiException, TencentAdsResponseException {
    WechatPagesCsgroupStatusUpdateResponse resp = api.wechatPagesCsgroupStatusUpdate(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
