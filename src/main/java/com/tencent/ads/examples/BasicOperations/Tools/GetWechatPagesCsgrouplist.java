package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetWechatPagesCsgrouplist {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long page = null;

  public Long pageSize = null;

  public String corpId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public WechatPagesCsgrouplistGetResponseData getWechatPagesCsgrouplist() throws Exception {
    WechatPagesCsgrouplistGetResponseData response =
        tencentAds
            .wechatPagesCsgrouplist()
            .wechatPagesCsgrouplistGet(accountId, page, pageSize, corpId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatPagesCsgrouplist getWechatPagesCsgrouplist = new GetWechatPagesCsgrouplist();
      getWechatPagesCsgrouplist.init();
      WechatPagesCsgrouplistGetResponseData response =
          getWechatPagesCsgrouplist.getWechatPagesCsgrouplist();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
