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
import com.tencent.ads.api.CreativeComponentsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CreativeComponentsAddRequest;
import com.tencent.ads.model.CreativeComponentsAddResponse;
import com.tencent.ads.model.CreativeComponentsAddResponseData;
import com.tencent.ads.model.CreativeComponentsDeleteRequest;
import com.tencent.ads.model.CreativeComponentsDeleteResponse;
import com.tencent.ads.model.CreativeComponentsDeleteResponseData;
import com.tencent.ads.model.CreativeComponentsGetResponse;
import com.tencent.ads.model.CreativeComponentsGetResponseData;
import com.tencent.ads.model.CreativeComponentsUpdateRequest;
import com.tencent.ads.model.CreativeComponentsUpdateResponse;
import com.tencent.ads.model.CreativeComponentsUpdateResponseData;
import com.tencent.ads.model.CreativeComponentsUpdateStatusRequest;
import com.tencent.ads.model.CreativeComponentsUpdateStatusResponse;
import com.tencent.ads.model.CreativeComponentsUpdateStatusResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class CreativeComponentsApiContainer extends ApiContainer {

  @Inject CreativeComponentsApi api;

  /**
   * 创建创意组件
   *
   * @param data (required)
   * @return CreativeComponentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeComponentsAddResponseData creativeComponentsAdd(CreativeComponentsAddRequest data)
      throws ApiException, TencentAdsResponseException {
    CreativeComponentsAddResponse resp = api.creativeComponentsAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除创意组件
   *
   * @param data (required)
   * @return CreativeComponentsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeComponentsDeleteResponseData creativeComponentsDelete(
      CreativeComponentsDeleteRequest data) throws ApiException, TencentAdsResponseException {
    CreativeComponentsDeleteResponse resp = api.creativeComponentsDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 查询创意组件信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CreativeComponentsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeComponentsGetResponseData creativeComponentsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    CreativeComponentsGetResponse resp =
        api.creativeComponentsGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新创意组件
   *
   * @param data (required)
   * @return CreativeComponentsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeComponentsUpdateResponseData creativeComponentsUpdate(
      CreativeComponentsUpdateRequest data) throws ApiException, TencentAdsResponseException {
    CreativeComponentsUpdateResponse resp = api.creativeComponentsUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新创意组件状态
   *
   * @param data (required)
   * @return CreativeComponentsUpdateStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeComponentsUpdateStatusResponseData creativeComponentsUpdateStatus(
      CreativeComponentsUpdateStatusRequest data) throws ApiException, TencentAdsResponseException {
    CreativeComponentsUpdateStatusResponse resp = api.creativeComponentsUpdateStatus(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
