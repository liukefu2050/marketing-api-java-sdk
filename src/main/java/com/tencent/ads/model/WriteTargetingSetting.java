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

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 定向详细设置 */
@ApiModel(description = "定向详细设置")
public class WriteTargetingSetting {
  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("education")
  private List<String> education = null;

  @SerializedName("marital_status")
  private List<String> maritalStatus = null;

  @SerializedName("working_status")
  private List<String> workingStatus = null;

  @SerializedName("geo_location")
  private GeoLocations geoLocation = null;

  @SerializedName("user_os")
  private List<String> userOs = null;

  @SerializedName("new_device")
  private List<String> newDevice = null;

  @SerializedName("device_price")
  private List<String> devicePrice = null;

  @SerializedName("device_brand_model")
  private DeviceBrandModel deviceBrandModel = null;

  @SerializedName("network_type")
  private List<String> networkType = null;

  @SerializedName("network_operator")
  private List<String> networkOperator = null;

  @SerializedName("network_scene")
  private List<String> networkScene = null;

  @SerializedName("dressing_index")
  private List<String> dressingIndex = null;

  @SerializedName("uv_index")
  private List<String> uvIndex = null;

  @SerializedName("makeup_index")
  private List<String> makeupIndex = null;

  @SerializedName("climate")
  private List<String> climate = null;

  @SerializedName("temperature")
  private List<TemperatureStruct> temperature = null;

  @SerializedName("air_quality_index")
  private List<String> airQualityIndex = null;

  @SerializedName("app_install_status")
  private List<String> appInstallStatus = null;

  @SerializedName("mini_game_qq_status")
  private List<String> miniGameQqStatus = null;

  @SerializedName("consumption_status")
  private List<String> consumptionStatus = null;

  @SerializedName("game_consumption_level")
  private List<String> gameConsumptionLevel = null;

  @SerializedName("residential_community_price")
  private List<ResidentialCommunityPriceStruct> residentialCommunityPrice = null;

  @SerializedName("financial_situation")
  private List<String> financialSituation = null;

  @SerializedName("consumption_type")
  private List<String> consumptionType = null;

  @SerializedName("wechat_ad_behavior")
  private WechatAdBehavior wechatAdBehavior = null;

  @SerializedName("custom_audience")
  private List<Long> customAudience = null;

  @SerializedName("excluded_custom_audience")
  private List<Long> excludedCustomAudience = null;

  @SerializedName("behavior_or_interest")
  private BehaviorOrInterest behaviorOrInterest = null;

  @SerializedName("wechat_official_account_category")
  private List<Long> wechatOfficialAccountCategory = null;

  @SerializedName("mobile_union_category")
  private List<Long> mobileUnionCategory = null;

  @SerializedName("excluded_converted_audience")
  private ExcludedConvertedAudienceStruct excludedConvertedAudience = null;

  public WriteTargetingSetting age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public WriteTargetingSetting addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  @ApiModelProperty(value = "")
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public WriteTargetingSetting gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public WriteTargetingSetting addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  @ApiModelProperty(value = "")
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public WriteTargetingSetting education(List<String> education) {
    this.education = education;
    return this;
  }

  public WriteTargetingSetting addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  @ApiModelProperty(value = "")
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public WriteTargetingSetting maritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public WriteTargetingSetting addMaritalStatusItem(String maritalStatusItem) {
    if (this.maritalStatus == null) {
      this.maritalStatus = new ArrayList<String>();
    }
    this.maritalStatus.add(maritalStatusItem);
    return this;
  }

  /**
   * Get maritalStatus
   *
   * @return maritalStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public WriteTargetingSetting workingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
    return this;
  }

  public WriteTargetingSetting addWorkingStatusItem(String workingStatusItem) {
    if (this.workingStatus == null) {
      this.workingStatus = new ArrayList<String>();
    }
    this.workingStatus.add(workingStatusItem);
    return this;
  }

  /**
   * Get workingStatus
   *
   * @return workingStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getWorkingStatus() {
    return workingStatus;
  }

  public void setWorkingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
  }

  public WriteTargetingSetting geoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   *
   * @return geoLocation
   */
  @ApiModelProperty(value = "")
  public GeoLocations getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
  }

  public WriteTargetingSetting userOs(List<String> userOs) {
    this.userOs = userOs;
    return this;
  }

  public WriteTargetingSetting addUserOsItem(String userOsItem) {
    if (this.userOs == null) {
      this.userOs = new ArrayList<String>();
    }
    this.userOs.add(userOsItem);
    return this;
  }

  /**
   * Get userOs
   *
   * @return userOs
   */
  @ApiModelProperty(value = "")
  public List<String> getUserOs() {
    return userOs;
  }

  public void setUserOs(List<String> userOs) {
    this.userOs = userOs;
  }

  public WriteTargetingSetting newDevice(List<String> newDevice) {
    this.newDevice = newDevice;
    return this;
  }

  public WriteTargetingSetting addNewDeviceItem(String newDeviceItem) {
    if (this.newDevice == null) {
      this.newDevice = new ArrayList<String>();
    }
    this.newDevice.add(newDeviceItem);
    return this;
  }

  /**
   * Get newDevice
   *
   * @return newDevice
   */
  @ApiModelProperty(value = "")
  public List<String> getNewDevice() {
    return newDevice;
  }

  public void setNewDevice(List<String> newDevice) {
    this.newDevice = newDevice;
  }

  public WriteTargetingSetting devicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public WriteTargetingSetting addDevicePriceItem(String devicePriceItem) {
    if (this.devicePrice == null) {
      this.devicePrice = new ArrayList<String>();
    }
    this.devicePrice.add(devicePriceItem);
    return this;
  }

  /**
   * Get devicePrice
   *
   * @return devicePrice
   */
  @ApiModelProperty(value = "")
  public List<String> getDevicePrice() {
    return devicePrice;
  }

  public void setDevicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
  }

  public WriteTargetingSetting deviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
    return this;
  }

  /**
   * Get deviceBrandModel
   *
   * @return deviceBrandModel
   */
  @ApiModelProperty(value = "")
  public DeviceBrandModel getDeviceBrandModel() {
    return deviceBrandModel;
  }

  public void setDeviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
  }

  public WriteTargetingSetting networkType(List<String> networkType) {
    this.networkType = networkType;
    return this;
  }

  public WriteTargetingSetting addNetworkTypeItem(String networkTypeItem) {
    if (this.networkType == null) {
      this.networkType = new ArrayList<String>();
    }
    this.networkType.add(networkTypeItem);
    return this;
  }

  /**
   * Get networkType
   *
   * @return networkType
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkType() {
    return networkType;
  }

  public void setNetworkType(List<String> networkType) {
    this.networkType = networkType;
  }

  public WriteTargetingSetting networkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  public WriteTargetingSetting addNetworkOperatorItem(String networkOperatorItem) {
    if (this.networkOperator == null) {
      this.networkOperator = new ArrayList<String>();
    }
    this.networkOperator.add(networkOperatorItem);
    return this;
  }

  /**
   * Get networkOperator
   *
   * @return networkOperator
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkOperator() {
    return networkOperator;
  }

  public void setNetworkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
  }

  public WriteTargetingSetting networkScene(List<String> networkScene) {
    this.networkScene = networkScene;
    return this;
  }

  public WriteTargetingSetting addNetworkSceneItem(String networkSceneItem) {
    if (this.networkScene == null) {
      this.networkScene = new ArrayList<String>();
    }
    this.networkScene.add(networkSceneItem);
    return this;
  }

  /**
   * Get networkScene
   *
   * @return networkScene
   */
  @ApiModelProperty(value = "")
  public List<String> getNetworkScene() {
    return networkScene;
  }

  public void setNetworkScene(List<String> networkScene) {
    this.networkScene = networkScene;
  }

  public WriteTargetingSetting dressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
    return this;
  }

  public WriteTargetingSetting addDressingIndexItem(String dressingIndexItem) {
    if (this.dressingIndex == null) {
      this.dressingIndex = new ArrayList<String>();
    }
    this.dressingIndex.add(dressingIndexItem);
    return this;
  }

  /**
   * Get dressingIndex
   *
   * @return dressingIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getDressingIndex() {
    return dressingIndex;
  }

  public void setDressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
  }

  public WriteTargetingSetting uvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
    return this;
  }

  public WriteTargetingSetting addUvIndexItem(String uvIndexItem) {
    if (this.uvIndex == null) {
      this.uvIndex = new ArrayList<String>();
    }
    this.uvIndex.add(uvIndexItem);
    return this;
  }

  /**
   * Get uvIndex
   *
   * @return uvIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getUvIndex() {
    return uvIndex;
  }

  public void setUvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
  }

  public WriteTargetingSetting makeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
    return this;
  }

  public WriteTargetingSetting addMakeupIndexItem(String makeupIndexItem) {
    if (this.makeupIndex == null) {
      this.makeupIndex = new ArrayList<String>();
    }
    this.makeupIndex.add(makeupIndexItem);
    return this;
  }

  /**
   * Get makeupIndex
   *
   * @return makeupIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getMakeupIndex() {
    return makeupIndex;
  }

  public void setMakeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
  }

  public WriteTargetingSetting climate(List<String> climate) {
    this.climate = climate;
    return this;
  }

  public WriteTargetingSetting addClimateItem(String climateItem) {
    if (this.climate == null) {
      this.climate = new ArrayList<String>();
    }
    this.climate.add(climateItem);
    return this;
  }

  /**
   * Get climate
   *
   * @return climate
   */
  @ApiModelProperty(value = "")
  public List<String> getClimate() {
    return climate;
  }

  public void setClimate(List<String> climate) {
    this.climate = climate;
  }

  public WriteTargetingSetting temperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
    return this;
  }

  public WriteTargetingSetting addTemperatureItem(TemperatureStruct temperatureItem) {
    if (this.temperature == null) {
      this.temperature = new ArrayList<TemperatureStruct>();
    }
    this.temperature.add(temperatureItem);
    return this;
  }

  /**
   * Get temperature
   *
   * @return temperature
   */
  @ApiModelProperty(value = "")
  public List<TemperatureStruct> getTemperature() {
    return temperature;
  }

  public void setTemperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
  }

  public WriteTargetingSetting airQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
    return this;
  }

  public WriteTargetingSetting addAirQualityIndexItem(String airQualityIndexItem) {
    if (this.airQualityIndex == null) {
      this.airQualityIndex = new ArrayList<String>();
    }
    this.airQualityIndex.add(airQualityIndexItem);
    return this;
  }

  /**
   * Get airQualityIndex
   *
   * @return airQualityIndex
   */
  @ApiModelProperty(value = "")
  public List<String> getAirQualityIndex() {
    return airQualityIndex;
  }

  public void setAirQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
  }

  public WriteTargetingSetting appInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
    return this;
  }

  public WriteTargetingSetting addAppInstallStatusItem(String appInstallStatusItem) {
    if (this.appInstallStatus == null) {
      this.appInstallStatus = new ArrayList<String>();
    }
    this.appInstallStatus.add(appInstallStatusItem);
    return this;
  }

  /**
   * Get appInstallStatus
   *
   * @return appInstallStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getAppInstallStatus() {
    return appInstallStatus;
  }

  public void setAppInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
  }

  public WriteTargetingSetting miniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
    return this;
  }

  public WriteTargetingSetting addMiniGameQqStatusItem(String miniGameQqStatusItem) {
    if (this.miniGameQqStatus == null) {
      this.miniGameQqStatus = new ArrayList<String>();
    }
    this.miniGameQqStatus.add(miniGameQqStatusItem);
    return this;
  }

  /**
   * Get miniGameQqStatus
   *
   * @return miniGameQqStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getMiniGameQqStatus() {
    return miniGameQqStatus;
  }

  public void setMiniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
  }

  public WriteTargetingSetting consumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
    return this;
  }

  public WriteTargetingSetting addConsumptionStatusItem(String consumptionStatusItem) {
    if (this.consumptionStatus == null) {
      this.consumptionStatus = new ArrayList<String>();
    }
    this.consumptionStatus.add(consumptionStatusItem);
    return this;
  }

  /**
   * Get consumptionStatus
   *
   * @return consumptionStatus
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionStatus() {
    return consumptionStatus;
  }

  public void setConsumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
  }

  public WriteTargetingSetting gameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
    return this;
  }

  public WriteTargetingSetting addGameConsumptionLevelItem(String gameConsumptionLevelItem) {
    if (this.gameConsumptionLevel == null) {
      this.gameConsumptionLevel = new ArrayList<String>();
    }
    this.gameConsumptionLevel.add(gameConsumptionLevelItem);
    return this;
  }

  /**
   * Get gameConsumptionLevel
   *
   * @return gameConsumptionLevel
   */
  @ApiModelProperty(value = "")
  public List<String> getGameConsumptionLevel() {
    return gameConsumptionLevel;
  }

  public void setGameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
  }

  public WriteTargetingSetting residentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
    return this;
  }

  public WriteTargetingSetting addResidentialCommunityPriceItem(
      ResidentialCommunityPriceStruct residentialCommunityPriceItem) {
    if (this.residentialCommunityPrice == null) {
      this.residentialCommunityPrice = new ArrayList<ResidentialCommunityPriceStruct>();
    }
    this.residentialCommunityPrice.add(residentialCommunityPriceItem);
    return this;
  }

  /**
   * Get residentialCommunityPrice
   *
   * @return residentialCommunityPrice
   */
  @ApiModelProperty(value = "")
  public List<ResidentialCommunityPriceStruct> getResidentialCommunityPrice() {
    return residentialCommunityPrice;
  }

  public void setResidentialCommunityPrice(
      List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
  }

  public WriteTargetingSetting financialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
    return this;
  }

  public WriteTargetingSetting addFinancialSituationItem(String financialSituationItem) {
    if (this.financialSituation == null) {
      this.financialSituation = new ArrayList<String>();
    }
    this.financialSituation.add(financialSituationItem);
    return this;
  }

  /**
   * Get financialSituation
   *
   * @return financialSituation
   */
  @ApiModelProperty(value = "")
  public List<String> getFinancialSituation() {
    return financialSituation;
  }

  public void setFinancialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
  }

  public WriteTargetingSetting consumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
    return this;
  }

  public WriteTargetingSetting addConsumptionTypeItem(String consumptionTypeItem) {
    if (this.consumptionType == null) {
      this.consumptionType = new ArrayList<String>();
    }
    this.consumptionType.add(consumptionTypeItem);
    return this;
  }

  /**
   * Get consumptionType
   *
   * @return consumptionType
   */
  @ApiModelProperty(value = "")
  public List<String> getConsumptionType() {
    return consumptionType;
  }

  public void setConsumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
  }

  public WriteTargetingSetting wechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
    return this;
  }

  /**
   * Get wechatAdBehavior
   *
   * @return wechatAdBehavior
   */
  @ApiModelProperty(value = "")
  public WechatAdBehavior getWechatAdBehavior() {
    return wechatAdBehavior;
  }

  public void setWechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
  }

  public WriteTargetingSetting customAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
    return this;
  }

  public WriteTargetingSetting addCustomAudienceItem(Long customAudienceItem) {
    if (this.customAudience == null) {
      this.customAudience = new ArrayList<Long>();
    }
    this.customAudience.add(customAudienceItem);
    return this;
  }

  /**
   * Get customAudience
   *
   * @return customAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getCustomAudience() {
    return customAudience;
  }

  public void setCustomAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
  }

  public WriteTargetingSetting excludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
    return this;
  }

  public WriteTargetingSetting addExcludedCustomAudienceItem(Long excludedCustomAudienceItem) {
    if (this.excludedCustomAudience == null) {
      this.excludedCustomAudience = new ArrayList<Long>();
    }
    this.excludedCustomAudience.add(excludedCustomAudienceItem);
    return this;
  }

  /**
   * Get excludedCustomAudience
   *
   * @return excludedCustomAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getExcludedCustomAudience() {
    return excludedCustomAudience;
  }

  public void setExcludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
  }

  public WriteTargetingSetting behaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
    return this;
  }

  /**
   * Get behaviorOrInterest
   *
   * @return behaviorOrInterest
   */
  @ApiModelProperty(value = "")
  public BehaviorOrInterest getBehaviorOrInterest() {
    return behaviorOrInterest;
  }

  public void setBehaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
  }

  public WriteTargetingSetting wechatOfficialAccountCategory(
      List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
    return this;
  }

  public WriteTargetingSetting addWechatOfficialAccountCategoryItem(
      Long wechatOfficialAccountCategoryItem) {
    if (this.wechatOfficialAccountCategory == null) {
      this.wechatOfficialAccountCategory = new ArrayList<Long>();
    }
    this.wechatOfficialAccountCategory.add(wechatOfficialAccountCategoryItem);
    return this;
  }

  /**
   * Get wechatOfficialAccountCategory
   *
   * @return wechatOfficialAccountCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getWechatOfficialAccountCategory() {
    return wechatOfficialAccountCategory;
  }

  public void setWechatOfficialAccountCategory(List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
  }

  public WriteTargetingSetting mobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
    return this;
  }

  public WriteTargetingSetting addMobileUnionCategoryItem(Long mobileUnionCategoryItem) {
    if (this.mobileUnionCategory == null) {
      this.mobileUnionCategory = new ArrayList<Long>();
    }
    this.mobileUnionCategory.add(mobileUnionCategoryItem);
    return this;
  }

  /**
   * Get mobileUnionCategory
   *
   * @return mobileUnionCategory
   */
  @ApiModelProperty(value = "")
  public List<Long> getMobileUnionCategory() {
    return mobileUnionCategory;
  }

  public void setMobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
  }

  public WriteTargetingSetting excludedConvertedAudience(
      ExcludedConvertedAudienceStruct excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
    return this;
  }

  /**
   * Get excludedConvertedAudience
   *
   * @return excludedConvertedAudience
   */
  @ApiModelProperty(value = "")
  public ExcludedConvertedAudienceStruct getExcludedConvertedAudience() {
    return excludedConvertedAudience;
  }

  public void setExcludedConvertedAudience(
      ExcludedConvertedAudienceStruct excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteTargetingSetting writeTargetingSetting = (WriteTargetingSetting) o;
    return Objects.equals(this.age, writeTargetingSetting.age)
        && Objects.equals(this.gender, writeTargetingSetting.gender)
        && Objects.equals(this.education, writeTargetingSetting.education)
        && Objects.equals(this.maritalStatus, writeTargetingSetting.maritalStatus)
        && Objects.equals(this.workingStatus, writeTargetingSetting.workingStatus)
        && Objects.equals(this.geoLocation, writeTargetingSetting.geoLocation)
        && Objects.equals(this.userOs, writeTargetingSetting.userOs)
        && Objects.equals(this.newDevice, writeTargetingSetting.newDevice)
        && Objects.equals(this.devicePrice, writeTargetingSetting.devicePrice)
        && Objects.equals(this.deviceBrandModel, writeTargetingSetting.deviceBrandModel)
        && Objects.equals(this.networkType, writeTargetingSetting.networkType)
        && Objects.equals(this.networkOperator, writeTargetingSetting.networkOperator)
        && Objects.equals(this.networkScene, writeTargetingSetting.networkScene)
        && Objects.equals(this.dressingIndex, writeTargetingSetting.dressingIndex)
        && Objects.equals(this.uvIndex, writeTargetingSetting.uvIndex)
        && Objects.equals(this.makeupIndex, writeTargetingSetting.makeupIndex)
        && Objects.equals(this.climate, writeTargetingSetting.climate)
        && Objects.equals(this.temperature, writeTargetingSetting.temperature)
        && Objects.equals(this.airQualityIndex, writeTargetingSetting.airQualityIndex)
        && Objects.equals(this.appInstallStatus, writeTargetingSetting.appInstallStatus)
        && Objects.equals(this.miniGameQqStatus, writeTargetingSetting.miniGameQqStatus)
        && Objects.equals(this.consumptionStatus, writeTargetingSetting.consumptionStatus)
        && Objects.equals(this.gameConsumptionLevel, writeTargetingSetting.gameConsumptionLevel)
        && Objects.equals(
            this.residentialCommunityPrice, writeTargetingSetting.residentialCommunityPrice)
        && Objects.equals(this.financialSituation, writeTargetingSetting.financialSituation)
        && Objects.equals(this.consumptionType, writeTargetingSetting.consumptionType)
        && Objects.equals(this.wechatAdBehavior, writeTargetingSetting.wechatAdBehavior)
        && Objects.equals(this.customAudience, writeTargetingSetting.customAudience)
        && Objects.equals(this.excludedCustomAudience, writeTargetingSetting.excludedCustomAudience)
        && Objects.equals(this.behaviorOrInterest, writeTargetingSetting.behaviorOrInterest)
        && Objects.equals(
            this.wechatOfficialAccountCategory, writeTargetingSetting.wechatOfficialAccountCategory)
        && Objects.equals(this.mobileUnionCategory, writeTargetingSetting.mobileUnionCategory)
        && Objects.equals(
            this.excludedConvertedAudience, writeTargetingSetting.excludedConvertedAudience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        age,
        gender,
        education,
        maritalStatus,
        workingStatus,
        geoLocation,
        userOs,
        newDevice,
        devicePrice,
        deviceBrandModel,
        networkType,
        networkOperator,
        networkScene,
        dressingIndex,
        uvIndex,
        makeupIndex,
        climate,
        temperature,
        airQualityIndex,
        appInstallStatus,
        miniGameQqStatus,
        consumptionStatus,
        gameConsumptionLevel,
        residentialCommunityPrice,
        financialSituation,
        consumptionType,
        wechatAdBehavior,
        customAudience,
        excludedCustomAudience,
        behaviorOrInterest,
        wechatOfficialAccountCategory,
        mobileUnionCategory,
        excludedConvertedAudience);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
