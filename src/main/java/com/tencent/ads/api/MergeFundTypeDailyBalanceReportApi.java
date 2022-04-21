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
import com.tencent.ads.model.DateRangeTransaction;
import com.tencent.ads.model.MergeFundTypeDailyBalanceReportGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeFundTypeDailyBalanceReportApi {
  private ApiClient apiClient;

  public MergeFundTypeDailyBalanceReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MergeFundTypeDailyBalanceReportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for mergeFundTypeDailyBalanceReportGet
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call mergeFundTypeDailyBalanceReportGetCall(
      Long accountId,
      DateRangeTransaction dateRange,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/merge_fund_type_daily_balance_report/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (dateRange != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
  private com.squareup.okhttp.Call mergeFundTypeDailyBalanceReportGetValidateBeforeCall(
      Long accountId,
      DateRangeTransaction dateRange,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling mergeFundTypeDailyBalanceReportGet(Async)");
    }

    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(
          "Missing the required parameter 'dateRange' when calling mergeFundTypeDailyBalanceReportGet(Async)");
    }

    com.squareup.okhttp.Call call =
        mergeFundTypeDailyBalanceReportGetCall(
            accountId,
            dateRange,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取资金合并类资金账户日结明细
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MergeFundTypeDailyBalanceReportGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MergeFundTypeDailyBalanceReportGetResponse mergeFundTypeDailyBalanceReportGet(
      Long accountId, DateRangeTransaction dateRange, Long page, Long pageSize, List<String> fields)
      throws ApiException {
    ApiResponse<MergeFundTypeDailyBalanceReportGetResponse> resp =
        mergeFundTypeDailyBalanceReportGetWithHttpInfo(
            accountId, dateRange, page, pageSize, fields);
    return resp.getData();
  }

  /**
   * 获取资金合并类资金账户日结明细
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;MergeFundTypeDailyBalanceReportGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MergeFundTypeDailyBalanceReportGetResponse>
      mergeFundTypeDailyBalanceReportGetWithHttpInfo(
          Long accountId,
          DateRangeTransaction dateRange,
          Long page,
          Long pageSize,
          List<String> fields)
          throws ApiException {
    com.squareup.okhttp.Call call =
        mergeFundTypeDailyBalanceReportGetValidateBeforeCall(
            accountId, dateRange, page, pageSize, fields, null, null);
    Type localVarReturnType =
        new TypeToken<MergeFundTypeDailyBalanceReportGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取资金合并类资金账户日结明细 (asynchronously)
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call mergeFundTypeDailyBalanceReportGetAsync(
      Long accountId,
      DateRangeTransaction dateRange,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<MergeFundTypeDailyBalanceReportGetResponse> callback)
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
        mergeFundTypeDailyBalanceReportGetValidateBeforeCall(
            accountId,
            dateRange,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType =
        new TypeToken<MergeFundTypeDailyBalanceReportGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
