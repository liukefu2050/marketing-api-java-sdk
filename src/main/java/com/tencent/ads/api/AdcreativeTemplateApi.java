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
import com.tencent.ads.model.AdcreativeTemplateGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativeTemplateApi {
  private ApiClient apiClient;

  public AdcreativeTemplateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativeTemplateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativeTemplateGet
   *
   * @param accountId (required)
   * @param promotedObjectType (required)
   * @param siteSet (optional)
   * @param automaticSiteEnabled (optional)
   * @param isDynamicCreative (optional)
   * @param adcreativeTemplateId (optional)
   * @param dynamicCreativeType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call adcreativeTemplateGetCall(
      Long accountId,
      String promotedObjectType,
      List<String> siteSet,
      Boolean automaticSiteEnabled,
      Boolean isDynamicCreative,
      Long adcreativeTemplateId,
      String dynamicCreativeType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adcreative_template/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (siteSet != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "site_set", siteSet));
    if (promotedObjectType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("promoted_object_type", promotedObjectType));
    if (automaticSiteEnabled != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("automatic_site_enabled", automaticSiteEnabled));
    if (isDynamicCreative != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("is_dynamic_creative", isDynamicCreative));
    if (adcreativeTemplateId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("adcreative_template_id", adcreativeTemplateId));
    if (dynamicCreativeType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_creative_type", dynamicCreativeType));
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
  private com.squareup.okhttp.Call adcreativeTemplateGetValidateBeforeCall(
      Long accountId,
      String promotedObjectType,
      List<String> siteSet,
      Boolean automaticSiteEnabled,
      Boolean isDynamicCreative,
      Long adcreativeTemplateId,
      String dynamicCreativeType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adcreativeTemplateGet(Async)");
    }

    // verify the required parameter 'promotedObjectType' is set
    if (promotedObjectType == null) {
      throw new ApiException(
          "Missing the required parameter 'promotedObjectType' when calling adcreativeTemplateGet(Async)");
    }

    com.squareup.okhttp.Call call =
        adcreativeTemplateGetCall(
            accountId,
            promotedObjectType,
            siteSet,
            automaticSiteEnabled,
            isDynamicCreative,
            adcreativeTemplateId,
            dynamicCreativeType,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取创意规格详情
   *
   * @param accountId (required)
   * @param promotedObjectType (required)
   * @param siteSet (optional)
   * @param automaticSiteEnabled (optional)
   * @param isDynamicCreative (optional)
   * @param adcreativeTemplateId (optional)
   * @param dynamicCreativeType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativeTemplateGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativeTemplateGetResponse adcreativeTemplateGet(
      Long accountId,
      String promotedObjectType,
      List<String> siteSet,
      Boolean automaticSiteEnabled,
      Boolean isDynamicCreative,
      Long adcreativeTemplateId,
      String dynamicCreativeType,
      List<String> fields)
      throws ApiException {
    ApiResponse<AdcreativeTemplateGetResponse> resp =
        adcreativeTemplateGetWithHttpInfo(
            accountId,
            promotedObjectType,
            siteSet,
            automaticSiteEnabled,
            isDynamicCreative,
            adcreativeTemplateId,
            dynamicCreativeType,
            fields);
    return resp.getData();
  }

  /**
   * 获取创意规格详情
   *
   * @param accountId (required)
   * @param promotedObjectType (required)
   * @param siteSet (optional)
   * @param automaticSiteEnabled (optional)
   * @param isDynamicCreative (optional)
   * @param adcreativeTemplateId (optional)
   * @param dynamicCreativeType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdcreativeTemplateGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdcreativeTemplateGetResponse> adcreativeTemplateGetWithHttpInfo(
      Long accountId,
      String promotedObjectType,
      List<String> siteSet,
      Boolean automaticSiteEnabled,
      Boolean isDynamicCreative,
      Long adcreativeTemplateId,
      String dynamicCreativeType,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        adcreativeTemplateGetValidateBeforeCall(
            accountId,
            promotedObjectType,
            siteSet,
            automaticSiteEnabled,
            isDynamicCreative,
            adcreativeTemplateId,
            dynamicCreativeType,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<AdcreativeTemplateGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取创意规格详情 (asynchronously)
   *
   * @param accountId (required)
   * @param promotedObjectType (required)
   * @param siteSet (optional)
   * @param automaticSiteEnabled (optional)
   * @param isDynamicCreative (optional)
   * @param adcreativeTemplateId (optional)
   * @param dynamicCreativeType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call adcreativeTemplateGetAsync(
      Long accountId,
      String promotedObjectType,
      List<String> siteSet,
      Boolean automaticSiteEnabled,
      Boolean isDynamicCreative,
      Long adcreativeTemplateId,
      String dynamicCreativeType,
      List<String> fields,
      final ApiCallback<AdcreativeTemplateGetResponse> callback)
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
        adcreativeTemplateGetValidateBeforeCall(
            accountId,
            promotedObjectType,
            siteSet,
            automaticSiteEnabled,
            isDynamicCreative,
            adcreativeTemplateId,
            dynamicCreativeType,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativeTemplateGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
