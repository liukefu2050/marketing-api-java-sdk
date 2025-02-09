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
import com.tencent.ads.api.XijingTemplateListApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingTemplateListGetResponse;
import com.tencent.ads.model.XijingTemplateListGetResponseData;
import java.util.List;

public class XijingTemplateListApiContainer extends ApiContainer {

  @Inject XijingTemplateListApi api;

  /**
   * 获取蹊径落地页模板列表
   *
   * @param accountId (required)
   * @param pageTemplateId (required)
   * @param isInteraction (optional)
   * @param isPublic (optional)
   * @param templateSource (optional)
   * @param pageSize (optional)
   * @param page (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return XijingTemplateListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingTemplateListGetResponseData xijingTemplateListGet(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    XijingTemplateListGetResponse resp =
        api.xijingTemplateListGet(
            accountId,
            pageTemplateId,
            isInteraction,
            isPublic,
            templateSource,
            pageSize,
            page,
            fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
