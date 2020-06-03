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
import com.tencent.ads.api.EstimationApi;
import com.tencent.ads.model.EstimationGetRequest;
import com.tencent.ads.model.EstimationGetResponse;
import com.tencent.ads.model.EstimationGetResponseData;


public class EstimationApiContainer extends ApiContainer {

  @Inject
  EstimationApi api;


  /**
   * 预估覆盖人数
   *
   * @param data (required)
   * @return EstimationGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public EstimationGetResponseData estimationGet(EstimationGetRequest data) throws ApiException {
    EstimationGetResponse resp = api.estimationGet(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
