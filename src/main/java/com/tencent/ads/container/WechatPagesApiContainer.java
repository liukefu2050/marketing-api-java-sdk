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
import com.tencent.ads.api.WechatPagesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.WechatPagesAddRequest;
import com.tencent.ads.model.WechatPagesAddResponse;
import com.tencent.ads.model.WechatPagesAddResponseData;
import com.tencent.ads.model.WechatPagesDeleteRequest;
import com.tencent.ads.model.WechatPagesDeleteResponse;
import com.tencent.ads.model.WechatPagesDeleteResponseData;
import com.tencent.ads.model.WechatPagesGetResponse;
import com.tencent.ads.model.WechatPagesGetResponseData;
import java.util.List;

public class WechatPagesApiContainer extends ApiContainer {

  @Inject WechatPagesApi api;

  /**
   * 创建微信落地页
   *
   * @param data (required)
   * @return WechatPagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesAddResponseData wechatPagesAdd(WechatPagesAddRequest data)
      throws ApiException, TencentAdsResponseException {
    WechatPagesAddResponse resp = api.wechatPagesAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除微信落地页
   *
   * @param data (required)
   * @return WechatPagesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesDeleteResponseData wechatPagesDelete(WechatPagesDeleteRequest data)
      throws ApiException, TencentAdsResponseException {
    WechatPagesDeleteResponse resp = api.wechatPagesDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取微信落地页列表
   *
   * @param accountId (required)
   * @param ownerUid (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatPagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesGetResponseData wechatPagesGet(
      Long accountId,
      Long ownerUid,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    WechatPagesGetResponse resp =
        api.wechatPagesGet(accountId, ownerUid, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
