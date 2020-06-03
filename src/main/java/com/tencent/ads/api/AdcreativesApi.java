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
import com.tencent.ads.model.AdcreativesAddRequest;
import com.tencent.ads.model.AdcreativesAddResponse;
import com.tencent.ads.model.AdcreativesDeleteRequest;
import com.tencent.ads.model.AdcreativesDeleteResponse;
import com.tencent.ads.model.AdcreativesGetResponse;
import com.tencent.ads.model.AdcreativesUpdateRequest;
import com.tencent.ads.model.AdcreativesUpdateResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativesApi {

  private ApiClient apiClient;

  public AdcreativesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativesAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adcreativesAddCall(AdcreativesAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adcreatives/add";

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
  private com.squareup.okhttp.Call adcreativesAddValidateBeforeCall(AdcreativesAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adcreativesAdd(Async)");
    }

    com.squareup.okhttp.Call call = adcreativesAddCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 创建广告创意
   *
   * @param data (required)
   * @return AdcreativesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativesAddResponse adcreativesAdd(AdcreativesAddRequest data) throws ApiException {
    ApiResponse<AdcreativesAddResponse> resp = adcreativesAddWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 创建广告创意
   *
   * @param data (required)
   * @return ApiResponse&lt;AdcreativesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdcreativesAddResponse> adcreativesAddWithHttpInfo(AdcreativesAddRequest data)
      throws ApiException {
    com.squareup.okhttp.Call call = adcreativesAddValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdcreativesAddResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建广告创意 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adcreativesAddAsync(AdcreativesAddRequest data,
      final ApiCallback<AdcreativesAddResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adcreativesAddValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativesAddResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adcreativesDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adcreativesDeleteCall(AdcreativesDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adcreatives/delete";

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
  private com.squareup.okhttp.Call adcreativesDeleteValidateBeforeCall(
      AdcreativesDeleteRequest data, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adcreativesDelete(Async)");
    }

    com.squareup.okhttp.Call call = adcreativesDeleteCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 删除广告创意
   *
   * @param data (required)
   * @return AdcreativesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativesDeleteResponse adcreativesDelete(AdcreativesDeleteRequest data)
      throws ApiException {
    ApiResponse<AdcreativesDeleteResponse> resp = adcreativesDeleteWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 删除广告创意
   *
   * @param data (required)
   * @return ApiResponse&lt;AdcreativesDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdcreativesDeleteResponse> adcreativesDeleteWithHttpInfo(
      AdcreativesDeleteRequest data) throws ApiException {
    com.squareup.okhttp.Call call = adcreativesDeleteValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdcreativesDeleteResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除广告创意 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adcreativesDeleteAsync(AdcreativesDeleteRequest data,
      final ApiCallback<AdcreativesDeleteResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adcreativesDeleteValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativesDeleteResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adcreativesGet
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
  public com.squareup.okhttp.Call adcreativesGetCall(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adcreatives/get";

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
  private com.squareup.okhttp.Call adcreativesGetValidateBeforeCall(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adcreativesGet(Async)");
    }

    com.squareup.okhttp.Call call = adcreativesGetCall(accountId, filtering, page, pageSize,
        isDeleted, fields, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 获取广告创意
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativesGetResponse adcreativesGet(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, Boolean isDeleted, List<String> fields) throws ApiException {
    ApiResponse<AdcreativesGetResponse> resp = adcreativesGetWithHttpInfo(accountId, filtering,
        page, pageSize, isDeleted, fields);
    return resp.getData();
  }

  /**
   * 获取广告创意
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdcreativesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdcreativesGetResponse> adcreativesGetWithHttpInfo(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = adcreativesGetValidateBeforeCall(accountId, filtering, page,
        pageSize, isDeleted, fields, null, null);
    Type localVarReturnType = new TypeToken<AdcreativesGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告创意 (asynchronously)
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
  public com.squareup.okhttp.Call adcreativesGetAsync(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, Boolean isDeleted,
      List<String> fields, final ApiCallback<AdcreativesGetResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adcreativesGetValidateBeforeCall(accountId, filtering, page,
        pageSize, isDeleted, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativesGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for adcreativesUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adcreativesUpdateCall(AdcreativesUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adcreatives/update";

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
  private com.squareup.okhttp.Call adcreativesUpdateValidateBeforeCall(
      AdcreativesUpdateRequest data, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adcreativesUpdate(Async)");
    }

    com.squareup.okhttp.Call call = adcreativesUpdateCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新广告创意
   *
   * @param data (required)
   * @return AdcreativesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativesUpdateResponse adcreativesUpdate(AdcreativesUpdateRequest data)
      throws ApiException {
    ApiResponse<AdcreativesUpdateResponse> resp = adcreativesUpdateWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 更新广告创意
   *
   * @param data (required)
   * @return ApiResponse&lt;AdcreativesUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<AdcreativesUpdateResponse> adcreativesUpdateWithHttpInfo(
      AdcreativesUpdateRequest data) throws ApiException {
    com.squareup.okhttp.Call call = adcreativesUpdateValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdcreativesUpdateResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新广告创意 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adcreativesUpdateAsync(AdcreativesUpdateRequest data,
      final ApiCallback<AdcreativesUpdateResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = adcreativesUpdateValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativesUpdateResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
