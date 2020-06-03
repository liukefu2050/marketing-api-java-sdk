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
import com.tencent.ads.model.CampaignsAddRequest;
import com.tencent.ads.model.CampaignsAddResponse;
import com.tencent.ads.model.CampaignsDeleteRequest;
import com.tencent.ads.model.CampaignsDeleteResponse;
import com.tencent.ads.model.CampaignsGetResponse;
import com.tencent.ads.model.CampaignsUpdateConfiguredStatusRequest;
import com.tencent.ads.model.CampaignsUpdateConfiguredStatusResponse;
import com.tencent.ads.model.CampaignsUpdateDailyBudgetRequest;
import com.tencent.ads.model.CampaignsUpdateDailyBudgetResponse;
import com.tencent.ads.model.CampaignsUpdateRequest;
import com.tencent.ads.model.CampaignsUpdateResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampaignsApi {

  private ApiClient apiClient;

  public CampaignsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CampaignsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for campaignsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call campaignsAddCall(CampaignsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/campaigns/add";

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
  private com.squareup.okhttp.Call campaignsAddValidateBeforeCall(CampaignsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling campaignsAdd(Async)");
    }

    com.squareup.okhttp.Call call = campaignsAddCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 创建推广计划
   *
   * @param data (required)
   * @return CampaignsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsAddResponse campaignsAdd(CampaignsAddRequest data) throws ApiException {
    ApiResponse<CampaignsAddResponse> resp = campaignsAddWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 创建推广计划
   *
   * @param data (required)
   * @return ApiResponse&lt;CampaignsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsAddResponse> campaignsAddWithHttpInfo(CampaignsAddRequest data)
      throws ApiException {
    com.squareup.okhttp.Call call = campaignsAddValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<CampaignsAddResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建推广计划 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call campaignsAddAsync(CampaignsAddRequest data,
      final ApiCallback<CampaignsAddResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsAddValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsAddResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for campaignsDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call campaignsDeleteCall(CampaignsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/campaigns/delete";

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
  private com.squareup.okhttp.Call campaignsDeleteValidateBeforeCall(CampaignsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling campaignsDelete(Async)");
    }

    com.squareup.okhttp.Call call = campaignsDeleteCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 删除推广计划
   *
   * @param data (required)
   * @return CampaignsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsDeleteResponse campaignsDelete(CampaignsDeleteRequest data) throws ApiException {
    ApiResponse<CampaignsDeleteResponse> resp = campaignsDeleteWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 删除推广计划
   *
   * @param data (required)
   * @return ApiResponse&lt;CampaignsDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsDeleteResponse> campaignsDeleteWithHttpInfo(
      CampaignsDeleteRequest data) throws ApiException {
    com.squareup.okhttp.Call call = campaignsDeleteValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<CampaignsDeleteResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除推广计划 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call campaignsDeleteAsync(CampaignsDeleteRequest data,
      final ApiCallback<CampaignsDeleteResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsDeleteValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsDeleteResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for campaignsGet
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
  public com.squareup.okhttp.Call campaignsGetCall(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/campaigns/get";

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
  private com.squareup.okhttp.Call campaignsGetValidateBeforeCall(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling campaignsGet(Async)");
    }

    com.squareup.okhttp.Call call = campaignsGetCall(accountId, filtering, page, pageSize,
        isDeleted, fields, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 获取推广计划
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CampaignsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsGetResponse campaignsGet(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields) throws ApiException {
    ApiResponse<CampaignsGetResponse> resp = campaignsGetWithHttpInfo(accountId, filtering, page,
        pageSize, isDeleted, fields);
    return resp.getData();
  }

  /**
   * 获取推广计划
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;CampaignsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsGetResponse> campaignsGetWithHttpInfo(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = campaignsGetValidateBeforeCall(accountId, filtering, page,
        pageSize, isDeleted, fields, null, null);
    Type localVarReturnType = new TypeToken<CampaignsGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取推广计划 (asynchronously)
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
  public com.squareup.okhttp.Call campaignsGetAsync(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields,
      final ApiCallback<CampaignsGetResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsGetValidateBeforeCall(accountId, filtering, page,
        pageSize, isDeleted, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for campaignsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateCall(CampaignsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/campaigns/update";

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
  private com.squareup.okhttp.Call campaignsUpdateValidateBeforeCall(CampaignsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling campaignsUpdate(Async)");
    }

    com.squareup.okhttp.Call call = campaignsUpdateCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新推广计划
   *
   * @param data (required)
   * @return CampaignsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsUpdateResponse campaignsUpdate(CampaignsUpdateRequest data) throws ApiException {
    ApiResponse<CampaignsUpdateResponse> resp = campaignsUpdateWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 更新推广计划
   *
   * @param data (required)
   * @return ApiResponse&lt;CampaignsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsUpdateResponse> campaignsUpdateWithHttpInfo(
      CampaignsUpdateRequest data) throws ApiException {
    com.squareup.okhttp.Call call = campaignsUpdateValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<CampaignsUpdateResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新推广计划 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateAsync(CampaignsUpdateRequest data,
      final ApiCallback<CampaignsUpdateResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsUpdateValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsUpdateResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for campaignsUpdateConfiguredStatus
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateConfiguredStatusCall(
      CampaignsUpdateConfiguredStatusRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/campaigns/update_configured_status";

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
  private com.squareup.okhttp.Call campaignsUpdateConfiguredStatusValidateBeforeCall(
      CampaignsUpdateConfiguredStatusRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling campaignsUpdateConfiguredStatus(Async)");
    }

    com.squareup.okhttp.Call call = campaignsUpdateConfiguredStatusCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新推广计划状态
   *
   * @param data (required)
   * @return CampaignsUpdateConfiguredStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsUpdateConfiguredStatusResponse campaignsUpdateConfiguredStatus(
      CampaignsUpdateConfiguredStatusRequest data) throws ApiException {
    ApiResponse<CampaignsUpdateConfiguredStatusResponse> resp = campaignsUpdateConfiguredStatusWithHttpInfo(
        data);
    return resp.getData();
  }

  /**
   * 更新推广计划状态
   *
   * @param data (required)
   * @return ApiResponse&lt;CampaignsUpdateConfiguredStatusResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsUpdateConfiguredStatusResponse> campaignsUpdateConfiguredStatusWithHttpInfo(
      CampaignsUpdateConfiguredStatusRequest data) throws ApiException {
    com.squareup.okhttp.Call call = campaignsUpdateConfiguredStatusValidateBeforeCall(data, null,
        null);
    Type localVarReturnType = new TypeToken<CampaignsUpdateConfiguredStatusResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新推广计划状态 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateConfiguredStatusAsync(
      CampaignsUpdateConfiguredStatusRequest data,
      final ApiCallback<CampaignsUpdateConfiguredStatusResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsUpdateConfiguredStatusValidateBeforeCall(data,
        progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsUpdateConfiguredStatusResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for campaignsUpdateDailyBudget
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateDailyBudgetCall(
      CampaignsUpdateDailyBudgetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/campaigns/update_daily_budget";

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
  private com.squareup.okhttp.Call campaignsUpdateDailyBudgetValidateBeforeCall(
      CampaignsUpdateDailyBudgetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling campaignsUpdateDailyBudget(Async)");
    }

    com.squareup.okhttp.Call call = campaignsUpdateDailyBudgetCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新推广计划日限额信息
   *
   * @param data (required)
   * @return CampaignsUpdateDailyBudgetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public CampaignsUpdateDailyBudgetResponse campaignsUpdateDailyBudget(
      CampaignsUpdateDailyBudgetRequest data) throws ApiException {
    ApiResponse<CampaignsUpdateDailyBudgetResponse> resp = campaignsUpdateDailyBudgetWithHttpInfo(
        data);
    return resp.getData();
  }

  /**
   * 更新推广计划日限额信息
   *
   * @param data (required)
   * @return ApiResponse&lt;CampaignsUpdateDailyBudgetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<CampaignsUpdateDailyBudgetResponse> campaignsUpdateDailyBudgetWithHttpInfo(
      CampaignsUpdateDailyBudgetRequest data) throws ApiException {
    com.squareup.okhttp.Call call = campaignsUpdateDailyBudgetValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<CampaignsUpdateDailyBudgetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新推广计划日限额信息 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call campaignsUpdateDailyBudgetAsync(
      CampaignsUpdateDailyBudgetRequest data,
      final ApiCallback<CampaignsUpdateDailyBudgetResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = campaignsUpdateDailyBudgetValidateBeforeCall(data,
        progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<CampaignsUpdateDailyBudgetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
