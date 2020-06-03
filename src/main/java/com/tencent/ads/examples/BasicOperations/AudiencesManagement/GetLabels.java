package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.LabelsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取标签(Label)列表的简单示例
 */
public class GetLabels {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public LabelsGetResponseData getLabels() throws Exception {
    LabelsGetResponseData response = tencentAds.labels()
        .labelsGet(ACCOUNT_ID, null, null, null, Arrays
            .asList("label_id", "audience_id", "display_label_name", "description", "user_count"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetLabels getLabels = new GetLabels();
      getLabels.init();
      LabelsGetResponseData response = getLabels.getLabels();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
