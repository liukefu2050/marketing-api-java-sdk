package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAds {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public Long page = null;

  public Long pageSize = null;

  public Boolean isDeleted = null;

  public Boolean weixinOfficialAccountsUpgradeEnabled = null;

  public List<String> fields =
      Arrays.asList("ad_id", "campaign_id", "adgroup_id", "adcreative_id", "ad_name");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String field = "configured_status";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "EQUALS";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("AD_STATUS_NORMAL");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public AdsGetResponseData getAds() throws Exception {
    AdsGetResponseData response =
        tencentAds
            .ads()
            .adsGet(
                accountId,
                filtering,
                page,
                pageSize,
                isDeleted,
                weixinOfficialAccountsUpgradeEnabled,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAds getAds = new GetAds();
      getAds.init();
      AdsGetResponseData response = getAds.getAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
