package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.XijingDeriveClickEffectGetRequest;

public class GetXijingDeriveClickEffect {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public XijingDeriveClickEffectGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public XijingDeriveClickEffectGetResponseData getXijingDeriveClickEffect() throws Exception {
    XijingDeriveClickEffectGetResponseData response =
        tencentAds.xijingDeriveClickEffect().xijingDeriveClickEffectGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetXijingDeriveClickEffect getXijingDeriveClickEffect = new GetXijingDeriveClickEffect();
      getXijingDeriveClickEffect.init();
      XijingDeriveClickEffectGetResponseData response =
          getXijingDeriveClickEffect.getXijingDeriveClickEffect();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
