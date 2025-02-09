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
import com.tencent.ads.model.BusinessManagerRelationsGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessManagerRelationsApi {
  private ApiClient apiClient;

  public BusinessManagerRelationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessManagerRelationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for businessManagerRelationsGet
   *
   * @param page (optional)
   * @param pageSize (optional)
   * @param advertiserType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call businessManagerRelationsGetCall(
      Long page,
      Long pageSize,
      Long advertiserType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/business_manager_relations/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (advertiserType != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("advertiser_type", advertiserType));
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
  private com.squareup.okhttp.Call businessManagerRelationsGetValidateBeforeCall(
      Long page,
      Long pageSize,
      Long advertiserType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    com.squareup.okhttp.Call call =
        businessManagerRelationsGetCall(
            page, pageSize, advertiserType, fields, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 查询商务管家账号下广告主信息
   *
   * @param page (optional)
   * @param pageSize (optional)
   * @param advertiserType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BusinessManagerRelationsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BusinessManagerRelationsGetResponse businessManagerRelationsGet(
      Long page, Long pageSize, Long advertiserType, List<String> fields) throws ApiException {
    ApiResponse<BusinessManagerRelationsGetResponse> resp =
        businessManagerRelationsGetWithHttpInfo(page, pageSize, advertiserType, fields);
    return resp.getData();
  }

  /**
   * 查询商务管家账号下广告主信息
   *
   * @param page (optional)
   * @param pageSize (optional)
   * @param advertiserType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;BusinessManagerRelationsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<BusinessManagerRelationsGetResponse> businessManagerRelationsGetWithHttpInfo(
      Long page, Long pageSize, Long advertiserType, List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call =
        businessManagerRelationsGetValidateBeforeCall(
            page, pageSize, advertiserType, fields, null, null);
    Type localVarReturnType = new TypeToken<BusinessManagerRelationsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询商务管家账号下广告主信息 (asynchronously)
   *
   * @param page (optional)
   * @param pageSize (optional)
   * @param advertiserType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call businessManagerRelationsGetAsync(
      Long page,
      Long pageSize,
      Long advertiserType,
      List<String> fields,
      final ApiCallback<BusinessManagerRelationsGetResponse> callback)
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
        businessManagerRelationsGetValidateBeforeCall(
            page, pageSize, advertiserType, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<BusinessManagerRelationsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
