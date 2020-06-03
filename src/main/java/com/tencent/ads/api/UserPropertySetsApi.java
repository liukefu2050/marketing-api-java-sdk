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
import com.tencent.ads.model.UserPropertySetsAddRequest;
import com.tencent.ads.model.UserPropertySetsAddResponse;
import com.tencent.ads.model.UserPropertySetsGetResponse;
import com.tencent.ads.model.UserPropertySetsUpdateRequest;
import com.tencent.ads.model.UserPropertySetsUpdateResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPropertySetsApi {

  private ApiClient apiClient;

  public UserPropertySetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserPropertySetsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for userPropertySetsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsAddCall(UserPropertySetsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/user_property_sets/add";

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
  private com.squareup.okhttp.Call userPropertySetsAddValidateBeforeCall(
      UserPropertySetsAddRequest data, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling userPropertySetsAdd(Async)");
    }

    com.squareup.okhttp.Call call = userPropertySetsAddCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 创建用户属性数据源
   *
   * @param data (required)
   * @return UserPropertySetsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public UserPropertySetsAddResponse userPropertySetsAdd(UserPropertySetsAddRequest data)
      throws ApiException {
    ApiResponse<UserPropertySetsAddResponse> resp = userPropertySetsAddWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 创建用户属性数据源
   *
   * @param data (required)
   * @return ApiResponse&lt;UserPropertySetsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<UserPropertySetsAddResponse> userPropertySetsAddWithHttpInfo(
      UserPropertySetsAddRequest data) throws ApiException {
    com.squareup.okhttp.Call call = userPropertySetsAddValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<UserPropertySetsAddResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建用户属性数据源 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsAddAsync(UserPropertySetsAddRequest data,
      final ApiCallback<UserPropertySetsAddResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = userPropertySetsAddValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<UserPropertySetsAddResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for userPropertySetsGet
   *
   * @param accountId (required)
   * @param userPropertySetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsGetCall(Long accountId, Long userPropertySetId,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/user_property_sets/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    }
    if (userPropertySetId != null) {
      localVarQueryParams
          .addAll(apiClient.parameterToPair("user_property_set_id", userPropertySetId));
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
  private com.squareup.okhttp.Call userPropertySetsGetValidateBeforeCall(Long accountId,
      Long userPropertySetId, List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling userPropertySetsGet(Async)");
    }

    com.squareup.okhttp.Call call = userPropertySetsGetCall(accountId, userPropertySetId, fields,
        progressListener, progressRequestListener);
    return call;

  }

  /**
   * 获取用户属性数据源
   *
   * @param accountId (required)
   * @param userPropertySetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return UserPropertySetsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public UserPropertySetsGetResponse userPropertySetsGet(Long accountId, Long userPropertySetId,
      List<String> fields) throws ApiException {
    ApiResponse<UserPropertySetsGetResponse> resp = userPropertySetsGetWithHttpInfo(accountId,
        userPropertySetId, fields);
    return resp.getData();
  }

  /**
   * 获取用户属性数据源
   *
   * @param accountId (required)
   * @param userPropertySetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;UserPropertySetsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<UserPropertySetsGetResponse> userPropertySetsGetWithHttpInfo(Long accountId,
      Long userPropertySetId, List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = userPropertySetsGetValidateBeforeCall(accountId,
        userPropertySetId, fields, null, null);
    Type localVarReturnType = new TypeToken<UserPropertySetsGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取用户属性数据源 (asynchronously)
   *
   * @param accountId (required)
   * @param userPropertySetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsGetAsync(Long accountId, Long userPropertySetId,
      List<String> fields, final ApiCallback<UserPropertySetsGetResponse> callback)
      throws ApiException {

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

    com.squareup.okhttp.Call call = userPropertySetsGetValidateBeforeCall(accountId,
        userPropertySetId, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<UserPropertySetsGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }

  /**
   * Build call for userPropertySetsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsUpdateCall(UserPropertySetsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/user_property_sets/update";

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
  private com.squareup.okhttp.Call userPropertySetsUpdateValidateBeforeCall(
      UserPropertySetsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling userPropertySetsUpdate(Async)");
    }

    com.squareup.okhttp.Call call = userPropertySetsUpdateCall(data, progressListener,
        progressRequestListener);
    return call;

  }

  /**
   * 更新用户属性数据源
   *
   * @param data (required)
   * @return UserPropertySetsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public UserPropertySetsUpdateResponse userPropertySetsUpdate(UserPropertySetsUpdateRequest data)
      throws ApiException {
    ApiResponse<UserPropertySetsUpdateResponse> resp = userPropertySetsUpdateWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 更新用户属性数据源
   *
   * @param data (required)
   * @return ApiResponse&lt;UserPropertySetsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<UserPropertySetsUpdateResponse> userPropertySetsUpdateWithHttpInfo(
      UserPropertySetsUpdateRequest data) throws ApiException {
    com.squareup.okhttp.Call call = userPropertySetsUpdateValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<UserPropertySetsUpdateResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新用户属性数据源 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call userPropertySetsUpdateAsync(UserPropertySetsUpdateRequest data,
      final ApiCallback<UserPropertySetsUpdateResponse> callback) throws ApiException {

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

    com.squareup.okhttp.Call call = userPropertySetsUpdateValidateBeforeCall(data, progressListener,
        progressRequestListener);
    Type localVarReturnType = new TypeToken<UserPropertySetsUpdateResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
