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
import com.tencent.ads.api.AdvertiserApi;
import com.tencent.ads.model.AdvertiserAddRequest;
import com.tencent.ads.model.AdvertiserAddResponse;
import com.tencent.ads.model.AdvertiserAddResponseData;
import com.tencent.ads.model.AdvertiserGetResponse;
import com.tencent.ads.model.AdvertiserGetResponseData;
import com.tencent.ads.model.AdvertiserUpdateDailyBudgetRequest;
import com.tencent.ads.model.AdvertiserUpdateDailyBudgetResponse;
import com.tencent.ads.model.AdvertiserUpdateDailyBudgetResponseData;
import com.tencent.ads.model.AdvertiserUpdateRequest;
import com.tencent.ads.model.AdvertiserUpdateResponse;
import com.tencent.ads.model.AdvertiserUpdateResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;


public class AdvertiserApiContainer extends ApiContainer {

  @Inject
  AdvertiserApi api;


  /**
   * 添加服务商子客户
   *
   * @param data (required)
   * @return AdvertiserAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdvertiserAddResponseData advertiserAdd(AdvertiserAddRequest data) throws ApiException {
    AdvertiserAddResponse resp = api.advertiserAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 获取广告主信息
   *
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdvertiserGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdvertiserGetResponseData advertiserGet(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, List<String> fields) throws ApiException {
    AdvertiserGetResponse resp = api.advertiserGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 更新广告主信息
   *
   * @param data (required)
   * @return AdvertiserUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdvertiserUpdateResponseData advertiserUpdate(AdvertiserUpdateRequest data)
      throws ApiException {
    AdvertiserUpdateResponse resp = api.advertiserUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 更新广告主日限额信息
   *
   * @param data (required)
   * @return AdvertiserUpdateDailyBudgetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdvertiserUpdateDailyBudgetResponseData advertiserUpdateDailyBudget(
      AdvertiserUpdateDailyBudgetRequest data) throws ApiException {
    AdvertiserUpdateDailyBudgetResponse resp = api.advertiserUpdateDailyBudget(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
