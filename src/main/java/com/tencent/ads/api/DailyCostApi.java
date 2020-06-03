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
import com.tencent.ads.model.DailyCostGetResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyCostApi {

  private ApiClient apiClient;

  public DailyCostApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DailyCostApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for dailyCostGet
   *
   * @param dateRange (required)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call dailyCostGetCall(Map<String, Object> dateRange, Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/daily_cost/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    }
    if (dateRange != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    }
    if (filtering != null) {
      localVarCollectionQueryParams
          .addAll(apiClient.parameterToPairs("multi", "filtering", filtering));
    }
    if (page != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    }
    if (pageSize != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    }
    if (fields != null) {
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
        "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
        @Override
        public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
            throws IOException {
          com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
          return originalResponse.newBuilder()
              .body(new ProgressResponseBody(originalResponse.body(), progressListener))
              .build();
        }
      });
    }

    String[] localVarAuthNames = new String[]{"accessToken", "nonce", "timestamp"};
    return apiClient
        .buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call dailyCostGetValidateBeforeCall(Map<String, Object> dateRange,
      Long accountId, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(
          "Missing the required parameter 'dateRange' when calling dailyCostGet(Async)");
    }

    com.squareup.okhttp.Call call = dailyCostGetCall(dateRange, accountId, filtering, page,
        pageSize, fields, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 【待废弃，请使用新接口wechat_daily_cost/get】获取微信账户实时消耗
   *
   * @param dateRange (required)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DailyCostGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public DailyCostGetResponse dailyCostGet(Map<String, Object> dateRange, Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields)
      throws ApiException {
    ApiResponse<DailyCostGetResponse> resp = dailyCostGetWithHttpInfo(dateRange, accountId,
        filtering, page, pageSize, fields);
    return resp.getData();
  }

  /**
   * 【待废弃，请使用新接口wechat_daily_cost/get】获取微信账户实时消耗
   *
   * @param dateRange (required)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;DailyCostGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<DailyCostGetResponse> dailyCostGetWithHttpInfo(Map<String, Object> dateRange,
      Long accountId, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = dailyCostGetValidateBeforeCall(dateRange, accountId, filtering,
        page, pageSize, fields, null, null);
    Type localVarReturnType = new TypeToken<DailyCostGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 【待废弃，请使用新接口wechat_daily_cost/get】获取微信账户实时消耗 (asynchronously)
   *
   * @param dateRange (required)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call dailyCostGetAsync(Map<String, Object> dateRange, Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields,
      final ApiCallback<DailyCostGetResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    com.squareup.okhttp.Call call = dailyCostGetValidateBeforeCall(dateRange, accountId, filtering,
        page, pageSize, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DailyCostGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
