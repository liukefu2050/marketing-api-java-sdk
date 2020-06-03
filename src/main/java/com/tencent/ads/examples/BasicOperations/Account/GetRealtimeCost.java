package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.RealtimeCostGetResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取实时消耗(Realtime cost)列表的简单示例
 */
public class GetRealtimeCost {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 广告主级别
   */
  public String LEVEL = "ADVERTISER";
  /**
   * 查询日期
   */
  public String DATE = "YOUR DATE";

  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public RealtimeCostGetResponseData getRealtimeCost() throws Exception {
    Long accountId = ACCOUNT_ID;
    String level = LEVEL;
    String date = DATE;
    List<FilteringStruct> filtering = null;
    Long page = null;
    Long pageSize = null;
    List<String> fields = Arrays.asList("campaign_id", "adgroup_id", "cost");
    RealtimeCostGetResponseData response = tencentAds.realtimeCost()
        .realtimeCostGet(accountId, level, date, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetRealtimeCost getRealtimeCost = new GetRealtimeCost();
      getRealtimeCost.init();
      RealtimeCostGetResponseData responseData = getRealtimeCost.getRealtimeCost();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}