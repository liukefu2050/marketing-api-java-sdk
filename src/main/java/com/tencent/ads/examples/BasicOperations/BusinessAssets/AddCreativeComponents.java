package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CreativeComponentsAddRequest;

public class AddCreativeComponents {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public CreativeComponentsAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public CreativeComponentsAddResponseData addCreativeComponents() throws Exception {
    CreativeComponentsAddResponseData response =
        tencentAds.creativeComponents().creativeComponentsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCreativeComponents addCreativeComponents = new AddCreativeComponents();
      addCreativeComponents.init();
      CreativeComponentsAddResponseData response = addCreativeComponents.addCreativeComponents();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
