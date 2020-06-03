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
import com.tencent.ads.model.AdsAddRequest;
import com.tencent.ads.model.AdsAddResponse;
import com.tencent.ads.model.AdsDeleteRequest;
import com.tencent.ads.model.AdsDeleteResponse;
import com.tencent.ads.model.AdsGetResponse;
import com.tencent.ads.model.AdsUpdateConfiguredStatusRequest;
import com.tencent.ads.model.AdsUpdateConfiguredStatusResponse;
import com.tencent.ads.model.AdsUpdateRequest;
import com.tencent.ads.model.AdsUpdateResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdsApi {

  private ApiClient apiClient;

  public AdsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adsAddCall(AdsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/ads/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        "application/json", "application/xml"
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
        .buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call adsAddValidateBeforeCall(AdsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException("Missing the required parameter 'data' when calling adsAdd(Async)");
    }

    com.squareup.okhttp.Call call = adsAddCall(data, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 创建广告
   *
   * @param data (required)
   * @return AdsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdsAddResponse adsAdd(AdsAddRequest data) throws ApiException {
    ApiResponse<AdsAddResponse> resp = adsAddWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 创建广告
   *
   * @param data (required)
   * @return ApiResponse&lt;AdsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdsAddResponse> adsAddWithHttpInfo(AdsAddRequest data) throws ApiException {
    com.squareup.okhttp.Call call = adsAddValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdsAddResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建广告 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adsAddAsync(AdsAddRequest data,
      final ApiCallback<AdsAddResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adsAddValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdsAddResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adsDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adsDeleteCall(AdsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/ads/delete";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        "application/json", "application/xml"
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
        .buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call adsDeleteValidateBeforeCall(AdsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException("Missing the required parameter 'data' when calling adsDelete(Async)");
    }

    com.squareup.okhttp.Call call = adsDeleteCall(data, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 删除广告
   *
   * @param data (required)
   * @return AdsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdsDeleteResponse adsDelete(AdsDeleteRequest data) throws ApiException {
    ApiResponse<AdsDeleteResponse> resp = adsDeleteWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 删除广告
   *
   * @param data (required)
   * @return ApiResponse&lt;AdsDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdsDeleteResponse> adsDeleteWithHttpInfo(AdsDeleteRequest data)
      throws ApiException {
    com.squareup.okhttp.Call call = adsDeleteValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdsDeleteResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除广告 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adsDeleteAsync(AdsDeleteRequest data,
      final ApiCallback<AdsDeleteResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adsDeleteValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdsDeleteResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adsGet
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adsGetCall(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/ads/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
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
    if (isDeleted != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_deleted", isDeleted));
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
  private com.squareup.okhttp.Call adsGetValidateBeforeCall(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adsGet(Async)");
    }

    com.squareup.okhttp.Call call = adsGetCall(accountId, filtering, page, pageSize, isDeleted,
        fields, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 获取广告
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdsGetResponse adsGet(Long accountId, List<FilteringStruct> filtering, Long page,
      Long pageSize, Boolean isDeleted, List<String> fields) throws ApiException {
    ApiResponse<AdsGetResponse> resp = adsGetWithHttpInfo(accountId, filtering, page, pageSize,
        isDeleted, fields);
    return resp.getData();
  }

  /**
   * 获取广告
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdsGetResponse> adsGetWithHttpInfo(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = adsGetValidateBeforeCall(accountId, filtering, page, pageSize,
        isDeleted, fields, null, null);
    Type localVarReturnType = new TypeToken<AdsGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告 (asynchronously)
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adsGetAsync(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields,
      final ApiCallback<AdsGetResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adsGetValidateBeforeCall(accountId, filtering, page, pageSize,
        isDeleted, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdsGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adsUpdateCall(AdsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/ads/update";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        "application/json", "application/xml"
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
        .buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call adsUpdateValidateBeforeCall(AdsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException("Missing the required parameter 'data' when calling adsUpdate(Async)");
    }

    com.squareup.okhttp.Call call = adsUpdateCall(data, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 更新广告
   *
   * @param data (required)
   * @return AdsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdsUpdateResponse adsUpdate(AdsUpdateRequest data) throws ApiException {
    ApiResponse<AdsUpdateResponse> resp = adsUpdateWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 更新广告
   *
   * @param data (required)
   * @return ApiResponse&lt;AdsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdsUpdateResponse> adsUpdateWithHttpInfo(AdsUpdateRequest data)
      throws ApiException {
    com.squareup.okhttp.Call call = adsUpdateValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdsUpdateResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新广告 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adsUpdateAsync(AdsUpdateRequest data,
      final ApiCallback<AdsUpdateResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adsUpdateValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdsUpdateResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adsUpdateConfiguredStatus
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adsUpdateConfiguredStatusCall(
      AdsUpdateConfiguredStatusRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/ads/update_configured_status";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        "application/json", "application/xml"
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
        .buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call adsUpdateConfiguredStatusValidateBeforeCall(
      AdsUpdateConfiguredStatusRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adsUpdateConfiguredStatus(Async)");
    }

    com.squareup.okhttp.Call call = adsUpdateConfiguredStatusCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新广告状态
   *
   * @param data (required)
   * @return AdsUpdateConfiguredStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdsUpdateConfiguredStatusResponse adsUpdateConfiguredStatus(
      AdsUpdateConfiguredStatusRequest data) throws ApiException {
    ApiResponse<AdsUpdateConfiguredStatusResponse> resp = adsUpdateConfiguredStatusWithHttpInfo(
        data);
    return resp.getData();
  }

  /**
   * 更新广告状态
   *
   * @param data (required)
   * @return ApiResponse&lt;AdsUpdateConfiguredStatusResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdsUpdateConfiguredStatusResponse> adsUpdateConfiguredStatusWithHttpInfo(
      AdsUpdateConfiguredStatusRequest data) throws ApiException {
    com.squareup.okhttp.Call call = adsUpdateConfiguredStatusValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdsUpdateConfiguredStatusResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新广告状态 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adsUpdateConfiguredStatusAsync(
      AdsUpdateConfiguredStatusRequest data,
      final ApiCallback<AdsUpdateConfiguredStatusResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adsUpdateConfiguredStatusValidateBeforeCall(data,
        progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdsUpdateConfiguredStatusResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
