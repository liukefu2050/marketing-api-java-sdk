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

package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.XijingTemplateListGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XijingTemplateListApi {
  private ApiClient apiClient;

  public XijingTemplateListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public XijingTemplateListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for xijingTemplateListGet
   *
   * @param accountId (required)
   * @param pageTemplateId (required)
   * @param isInteraction (optional)
   * @param isPublic (optional)
   * @param templateSource (optional)
   * @param pageSize (optional)
   * @param page (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call xijingTemplateListGetCall(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/xijing_template_list/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (pageTemplateId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_template_id", pageTemplateId));
    if (isInteraction != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("is_interaction", isInteraction));
    if (isPublic != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("is_public", isPublic));
    if (templateSource != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("template_source", templateSource));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"text/plain"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {"accessToken", "nonce", "timestamp"};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call xijingTemplateListGetValidateBeforeCall(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling xijingTemplateListGet(Async)");
    }

    // verify the required parameter 'pageTemplateId' is set
    if (pageTemplateId == null) {
      throw new ApiException(
          "Missing the required parameter 'pageTemplateId' when calling xijingTemplateListGet(Async)");
    }

    com.squareup.okhttp.Call call =
        xijingTemplateListGetCall(
            accountId,
            pageTemplateId,
            isInteraction,
            isPublic,
            templateSource,
            pageSize,
            page,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

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
  public XijingTemplateListGetResponse xijingTemplateListGet(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields)
      throws ApiException {
    ApiResponse<XijingTemplateListGetResponse> resp =
        xijingTemplateListGetWithHttpInfo(
            accountId,
            pageTemplateId,
            isInteraction,
            isPublic,
            templateSource,
            pageSize,
            page,
            fields);
    return resp.getData();
  }

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
   * @return ApiResponse&lt;XijingTemplateListGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<XijingTemplateListGetResponse> xijingTemplateListGetWithHttpInfo(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        xijingTemplateListGetValidateBeforeCall(
            accountId,
            pageTemplateId,
            isInteraction,
            isPublic,
            templateSource,
            pageSize,
            page,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<XijingTemplateListGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取蹊径落地页模板列表 (asynchronously)
   *
   * @param accountId (required)
   * @param pageTemplateId (required)
   * @param isInteraction (optional)
   * @param isPublic (optional)
   * @param templateSource (optional)
   * @param pageSize (optional)
   * @param page (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call xijingTemplateListGetAsync(
      Long accountId,
      String pageTemplateId,
      Boolean isInteraction,
      Boolean isPublic,
      String templateSource,
      Long pageSize,
      Long page,
      List<String> fields,
      final ApiCallback<XijingTemplateListGetResponse> callback)
      throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        xijingTemplateListGetValidateBeforeCall(
            accountId,
            pageTemplateId,
            isInteraction,
            isPublic,
            templateSource,
            pageSize,
            page,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<XijingTemplateListGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
