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
import com.tencent.ads.model.ProductSeriesAddRequest;
import com.tencent.ads.model.ProductSeriesAddResponse;
import com.tencent.ads.model.ProductSeriesGetResponse;
import com.tencent.ads.model.ProductSeriesSearchFilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSeriesApi {
  private ApiClient apiClient;

  public ProductSeriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductSeriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for productSeriesAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call productSeriesAddCall(
      ProductSeriesAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/product_series/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call productSeriesAddValidateBeforeCall(
      ProductSeriesAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling productSeriesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        productSeriesAddCall(data, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 创建商品系列
   *
   * @param data (required)
   * @return ProductSeriesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductSeriesAddResponse productSeriesAdd(ProductSeriesAddRequest data)
      throws ApiException {
    ApiResponse<ProductSeriesAddResponse> resp = productSeriesAddWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 创建商品系列
   *
   * @param data (required)
   * @return ApiResponse&lt;ProductSeriesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<ProductSeriesAddResponse> productSeriesAddWithHttpInfo(
      ProductSeriesAddRequest data) throws ApiException {
    com.squareup.okhttp.Call call = productSeriesAddValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<ProductSeriesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建商品系列 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call productSeriesAddAsync(
      ProductSeriesAddRequest data, final ApiCallback<ProductSeriesAddResponse> callback)
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
        productSeriesAddValidateBeforeCall(data, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ProductSeriesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for productSeriesGet
   *
   * @param accountId (required)
   * @param catalogId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call productSeriesGetCall(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/product_series/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (catalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("catalog_id", catalogId));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
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
  private com.squareup.okhttp.Call productSeriesGetValidateBeforeCall(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling productSeriesGet(Async)");
    }

    // verify the required parameter 'catalogId' is set
    if (catalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'catalogId' when calling productSeriesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        productSeriesGetCall(
            accountId,
            catalogId,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取商品系列
   *
   * @param accountId (required)
   * @param catalogId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductSeriesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductSeriesGetResponse productSeriesGet(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    ApiResponse<ProductSeriesGetResponse> resp =
        productSeriesGetWithHttpInfo(accountId, catalogId, filtering, page, pageSize, fields);
    return resp.getData();
  }

  /**
   * 获取商品系列
   *
   * @param accountId (required)
   * @param catalogId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;ProductSeriesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<ProductSeriesGetResponse> productSeriesGetWithHttpInfo(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        productSeriesGetValidateBeforeCall(
            accountId, catalogId, filtering, page, pageSize, fields, null, null);
    Type localVarReturnType = new TypeToken<ProductSeriesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取商品系列 (asynchronously)
   *
   * @param accountId (required)
   * @param catalogId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call productSeriesGetAsync(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<ProductSeriesGetResponse> callback)
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
        productSeriesGetValidateBeforeCall(
            accountId,
            catalogId,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<ProductSeriesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
