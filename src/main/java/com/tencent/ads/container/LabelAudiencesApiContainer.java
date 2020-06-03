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
import com.tencent.ads.api.LabelAudiencesApi;
import com.tencent.ads.model.LabelAudiencesAddRequest;
import com.tencent.ads.model.LabelAudiencesAddResponse;
import com.tencent.ads.model.LabelAudiencesAddResponseData;


public class LabelAudiencesApiContainer extends ApiContainer {

  @Inject
  LabelAudiencesApi api;


  /**
   * 标签添加到人群列表
   *
   * @param data (required)
   * @return LabelAudiencesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public LabelAudiencesAddResponseData labelAudiencesAdd(LabelAudiencesAddRequest data)
      throws ApiException {
    LabelAudiencesAddResponse resp = api.labelAudiencesAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}
