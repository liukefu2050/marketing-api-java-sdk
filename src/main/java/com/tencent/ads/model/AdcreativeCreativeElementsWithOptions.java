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

/** 创意元素 */
@ApiModel(description = "创意元素")
public class AdcreativeCreativeElementsWithOptions {
  @SerializedName("image")
  private String image = null;

  @SerializedName("image2")
  private String image2 = null;

  @SerializedName("image3")
  private String image3 = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("corporate")
  private AdcreativeCorporate corporate = null;

  @SerializedName("video")
  private String video = null;

  @SerializedName("image_options")
  private List<String> imageOptions = null;

  @SerializedName("title_options")
  private List<String> titleOptions = null;

  @SerializedName("description_options")
  private List<String> descriptionOptions = null;

  @SerializedName("video_options")
  private List<String> videoOptions = null;

  @SerializedName("link_name_type")
  private LinkNameTypeMP linkNameType = null;

  @SerializedName("image_list")
  private List<String> imageList = null;

  @SerializedName("element_story")
  private List<AdcreativeElementStoryArrayItem> elementStory = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("bottom_text")
  private String bottomText = null;

  @SerializedName("mini_program_id")
  private String miniProgramId = null;

  @SerializedName("mini_program_path")
  private String miniProgramPath = null;

  @SerializedName("label")
  private List<CreativeLabel> label = null;

  @SerializedName("product_tags")
  private List<String> productTags = null;

  @SerializedName("logo_description")
  private String logoDescription = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("left_bottom_txt")
  private String leftBottomTxt = null;

  @SerializedName("animation_effect")
  private String animationEffect = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("short_video_struct")
  private ShortVideoStruct shortVideoStruct = null;

  @SerializedName("long_video_struct")
  private LongVideoStruct longVideoStruct = null;

  @SerializedName("banner_content")
  private AdcreativeBannerContent bannerContent = null;

  @SerializedName("card_content")
  private AdcreativeCardContent cardContent = null;

  @SerializedName("video_popup_url")
  private String videoPopupUrl = null;

  @SerializedName("video_popup_button")
  private AdcreativeVideoPopupButton videoPopupButton = null;

  @SerializedName("brand")
  private AdCreativeBrand brand = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("labelled_img")
  private AdcreativeLabelledImg labelledImg = null;

  @SerializedName("full_screen_image")
  private String fullScreenImage = null;

  @SerializedName("zip_url")
  private String zipUrl = null;

  @SerializedName("end_page")
  private AdCreativeEndPage endPage = null;

  @SerializedName("shop_image")
  private String shopImage = null;

  @SerializedName("head_line")
  private String headLine = null;

  @SerializedName("countdown_expiring_timestamp")
  private Long countdownExpiringTimestamp = null;

  public AdcreativeCreativeElementsWithOptions image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AdcreativeCreativeElementsWithOptions image2(String image2) {
    this.image2 = image2;
    return this;
  }

  /**
   * Get image2
   *
   * @return image2
   */
  @ApiModelProperty(value = "")
  public String getImage2() {
    return image2;
  }

  public void setImage2(String image2) {
    this.image2 = image2;
  }

  public AdcreativeCreativeElementsWithOptions image3(String image3) {
    this.image3 = image3;
    return this;
  }

  /**
   * Get image3
   *
   * @return image3
   */
  @ApiModelProperty(value = "")
  public String getImage3() {
    return image3;
  }

  public void setImage3(String image3) {
    this.image3 = image3;
  }

  public AdcreativeCreativeElementsWithOptions title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdcreativeCreativeElementsWithOptions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdcreativeCreativeElementsWithOptions corporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
    return this;
  }

  /**
   * Get corporate
   *
   * @return corporate
   */
  @ApiModelProperty(value = "")
  public AdcreativeCorporate getCorporate() {
    return corporate;
  }

  public void setCorporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
  }

  public AdcreativeCreativeElementsWithOptions video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   *
   * @return video
   */
  @ApiModelProperty(value = "")
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public AdcreativeCreativeElementsWithOptions imageOptions(List<String> imageOptions) {
    this.imageOptions = imageOptions;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addImageOptionsItem(String imageOptionsItem) {
    if (this.imageOptions == null) {
      this.imageOptions = new ArrayList<String>();
    }
    this.imageOptions.add(imageOptionsItem);
    return this;
  }

  /**
   * Get imageOptions
   *
   * @return imageOptions
   */
  @ApiModelProperty(value = "")
  public List<String> getImageOptions() {
    return imageOptions;
  }

  public void setImageOptions(List<String> imageOptions) {
    this.imageOptions = imageOptions;
  }

  public AdcreativeCreativeElementsWithOptions titleOptions(List<String> titleOptions) {
    this.titleOptions = titleOptions;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addTitleOptionsItem(String titleOptionsItem) {
    if (this.titleOptions == null) {
      this.titleOptions = new ArrayList<String>();
    }
    this.titleOptions.add(titleOptionsItem);
    return this;
  }

  /**
   * Get titleOptions
   *
   * @return titleOptions
   */
  @ApiModelProperty(value = "")
  public List<String> getTitleOptions() {
    return titleOptions;
  }

  public void setTitleOptions(List<String> titleOptions) {
    this.titleOptions = titleOptions;
  }

  public AdcreativeCreativeElementsWithOptions descriptionOptions(List<String> descriptionOptions) {
    this.descriptionOptions = descriptionOptions;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addDescriptionOptionsItem(
      String descriptionOptionsItem) {
    if (this.descriptionOptions == null) {
      this.descriptionOptions = new ArrayList<String>();
    }
    this.descriptionOptions.add(descriptionOptionsItem);
    return this;
  }

  /**
   * Get descriptionOptions
   *
   * @return descriptionOptions
   */
  @ApiModelProperty(value = "")
  public List<String> getDescriptionOptions() {
    return descriptionOptions;
  }

  public void setDescriptionOptions(List<String> descriptionOptions) {
    this.descriptionOptions = descriptionOptions;
  }

  public AdcreativeCreativeElementsWithOptions videoOptions(List<String> videoOptions) {
    this.videoOptions = videoOptions;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addVideoOptionsItem(String videoOptionsItem) {
    if (this.videoOptions == null) {
      this.videoOptions = new ArrayList<String>();
    }
    this.videoOptions.add(videoOptionsItem);
    return this;
  }

  /**
   * Get videoOptions
   *
   * @return videoOptions
   */
  @ApiModelProperty(value = "")
  public List<String> getVideoOptions() {
    return videoOptions;
  }

  public void setVideoOptions(List<String> videoOptions) {
    this.videoOptions = videoOptions;
  }

  public AdcreativeCreativeElementsWithOptions linkNameType(LinkNameTypeMP linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkNameTypeMP getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkNameTypeMP linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativeCreativeElementsWithOptions imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addImageListItem(String imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<String>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

  /**
   * Get imageList
   *
   * @return imageList
   */
  @ApiModelProperty(value = "")
  public List<String> getImageList() {
    return imageList;
  }

  public void setImageList(List<String> imageList) {
    this.imageList = imageList;
  }

  public AdcreativeCreativeElementsWithOptions elementStory(
      List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addElementStoryItem(
      AdcreativeElementStoryArrayItem elementStoryItem) {
    if (this.elementStory == null) {
      this.elementStory = new ArrayList<AdcreativeElementStoryArrayItem>();
    }
    this.elementStory.add(elementStoryItem);
    return this;
  }

  /**
   * Get elementStory
   *
   * @return elementStory
   */
  @ApiModelProperty(value = "")
  public List<AdcreativeElementStoryArrayItem> getElementStory() {
    return elementStory;
  }

  public void setElementStory(List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
  }

  public AdcreativeCreativeElementsWithOptions url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdcreativeCreativeElementsWithOptions buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   *
   * @return buttonText
   */
  @ApiModelProperty(value = "")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public AdcreativeCreativeElementsWithOptions bottomText(String bottomText) {
    this.bottomText = bottomText;
    return this;
  }

  /**
   * Get bottomText
   *
   * @return bottomText
   */
  @ApiModelProperty(value = "")
  public String getBottomText() {
    return bottomText;
  }

  public void setBottomText(String bottomText) {
    this.bottomText = bottomText;
  }

  public AdcreativeCreativeElementsWithOptions miniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
    return this;
  }

  /**
   * Get miniProgramId
   *
   * @return miniProgramId
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramId() {
    return miniProgramId;
  }

  public void setMiniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
  }

  public AdcreativeCreativeElementsWithOptions miniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
    return this;
  }

  /**
   * Get miniProgramPath
   *
   * @return miniProgramPath
   */
  @ApiModelProperty(value = "")
  public String getMiniProgramPath() {
    return miniProgramPath;
  }

  public void setMiniProgramPath(String miniProgramPath) {
    this.miniProgramPath = miniProgramPath;
  }

  public AdcreativeCreativeElementsWithOptions label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addLabelItem(CreativeLabel labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<CreativeLabel>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public List<CreativeLabel> getLabel() {
    return label;
  }

  public void setLabel(List<CreativeLabel> label) {
    this.label = label;
  }

  public AdcreativeCreativeElementsWithOptions productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public AdcreativeCreativeElementsWithOptions addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<String>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * Get productTags
   *
   * @return productTags
   */
  @ApiModelProperty(value = "")
  public List<String> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }

  public AdcreativeCreativeElementsWithOptions logoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
    return this;
  }

  /**
   * Get logoDescription
   *
   * @return logoDescription
   */
  @ApiModelProperty(value = "")
  public String getLogoDescription() {
    return logoDescription;
  }

  public void setLogoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
  }

  public AdcreativeCreativeElementsWithOptions logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   *
   * @return logo
   */
  @ApiModelProperty(value = "")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AdcreativeCreativeElementsWithOptions leftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
    return this;
  }

  /**
   * Get leftBottomTxt
   *
   * @return leftBottomTxt
   */
  @ApiModelProperty(value = "")
  public String getLeftBottomTxt() {
    return leftBottomTxt;
  }

  public void setLeftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
  }

  public AdcreativeCreativeElementsWithOptions animationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
    return this;
  }

  /**
   * Get animationEffect
   *
   * @return animationEffect
   */
  @ApiModelProperty(value = "")
  public String getAnimationEffect() {
    return animationEffect;
  }

  public void setAnimationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
  }

  public AdcreativeCreativeElementsWithOptions phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   *
   * @return phone
   */
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AdcreativeCreativeElementsWithOptions shortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
    return this;
  }

  /**
   * Get shortVideoStruct
   *
   * @return shortVideoStruct
   */
  @ApiModelProperty(value = "")
  public ShortVideoStruct getShortVideoStruct() {
    return shortVideoStruct;
  }

  public void setShortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
  }

  public AdcreativeCreativeElementsWithOptions longVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
    return this;
  }

  /**
   * Get longVideoStruct
   *
   * @return longVideoStruct
   */
  @ApiModelProperty(value = "")
  public LongVideoStruct getLongVideoStruct() {
    return longVideoStruct;
  }

  public void setLongVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
  }

  public AdcreativeCreativeElementsWithOptions bannerContent(
      AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
    return this;
  }

  /**
   * Get bannerContent
   *
   * @return bannerContent
   */
  @ApiModelProperty(value = "")
  public AdcreativeBannerContent getBannerContent() {
    return bannerContent;
  }

  public void setBannerContent(AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
  }

  public AdcreativeCreativeElementsWithOptions cardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
    return this;
  }

  /**
   * Get cardContent
   *
   * @return cardContent
   */
  @ApiModelProperty(value = "")
  public AdcreativeCardContent getCardContent() {
    return cardContent;
  }

  public void setCardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
  }

  public AdcreativeCreativeElementsWithOptions videoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
    return this;
  }

  /**
   * Get videoPopupUrl
   *
   * @return videoPopupUrl
   */
  @ApiModelProperty(value = "")
  public String getVideoPopupUrl() {
    return videoPopupUrl;
  }

  public void setVideoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
  }

  public AdcreativeCreativeElementsWithOptions videoPopupButton(
      AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
    return this;
  }

  /**
   * Get videoPopupButton
   *
   * @return videoPopupButton
   */
  @ApiModelProperty(value = "")
  public AdcreativeVideoPopupButton getVideoPopupButton() {
    return videoPopupButton;
  }

  public void setVideoPopupButton(AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
  }

  public AdcreativeCreativeElementsWithOptions brand(AdCreativeBrand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   *
   * @return brand
   */
  @ApiModelProperty(value = "")
  public AdCreativeBrand getBrand() {
    return brand;
  }

  public void setBrand(AdCreativeBrand brand) {
    this.brand = brand;
  }

  public AdcreativeCreativeElementsWithOptions caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   *
   * @return caption
   */
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AdcreativeCreativeElementsWithOptions labelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
    return this;
  }

  /**
   * Get labelledImg
   *
   * @return labelledImg
   */
  @ApiModelProperty(value = "")
  public AdcreativeLabelledImg getLabelledImg() {
    return labelledImg;
  }

  public void setLabelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
  }

  public AdcreativeCreativeElementsWithOptions fullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
    return this;
  }

  /**
   * Get fullScreenImage
   *
   * @return fullScreenImage
   */
  @ApiModelProperty(value = "")
  public String getFullScreenImage() {
    return fullScreenImage;
  }

  public void setFullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
  }

  public AdcreativeCreativeElementsWithOptions zipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
    return this;
  }

  /**
   * Get zipUrl
   *
   * @return zipUrl
   */
  @ApiModelProperty(value = "")
  public String getZipUrl() {
    return zipUrl;
  }

  public void setZipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
  }

  public AdcreativeCreativeElementsWithOptions endPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
    return this;
  }

  /**
   * Get endPage
   *
   * @return endPage
   */
  @ApiModelProperty(value = "")
  public AdCreativeEndPage getEndPage() {
    return endPage;
  }

  public void setEndPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
  }

  public AdcreativeCreativeElementsWithOptions shopImage(String shopImage) {
    this.shopImage = shopImage;
    return this;
  }

  /**
   * Get shopImage
   *
   * @return shopImage
   */
  @ApiModelProperty(value = "")
  public String getShopImage() {
    return shopImage;
  }

  public void setShopImage(String shopImage) {
    this.shopImage = shopImage;
  }

  public AdcreativeCreativeElementsWithOptions headLine(String headLine) {
    this.headLine = headLine;
    return this;
  }

  /**
   * Get headLine
   *
   * @return headLine
   */
  @ApiModelProperty(value = "")
  public String getHeadLine() {
    return headLine;
  }

  public void setHeadLine(String headLine) {
    this.headLine = headLine;
  }

  public AdcreativeCreativeElementsWithOptions countdownExpiringTimestamp(
      Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
    return this;
  }

  /**
   * Get countdownExpiringTimestamp
   *
   * @return countdownExpiringTimestamp
   */
  @ApiModelProperty(value = "")
  public Long getCountdownExpiringTimestamp() {
    return countdownExpiringTimestamp;
  }

  public void setCountdownExpiringTimestamp(Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeCreativeElementsWithOptions adcreativeCreativeElementsWithOptions =
        (AdcreativeCreativeElementsWithOptions) o;
    return Objects.equals(this.image, adcreativeCreativeElementsWithOptions.image)
        && Objects.equals(this.image2, adcreativeCreativeElementsWithOptions.image2)
        && Objects.equals(this.image3, adcreativeCreativeElementsWithOptions.image3)
        && Objects.equals(this.title, adcreativeCreativeElementsWithOptions.title)
        && Objects.equals(this.description, adcreativeCreativeElementsWithOptions.description)
        && Objects.equals(this.corporate, adcreativeCreativeElementsWithOptions.corporate)
        && Objects.equals(this.video, adcreativeCreativeElementsWithOptions.video)
        && Objects.equals(this.imageOptions, adcreativeCreativeElementsWithOptions.imageOptions)
        && Objects.equals(this.titleOptions, adcreativeCreativeElementsWithOptions.titleOptions)
        && Objects.equals(
            this.descriptionOptions, adcreativeCreativeElementsWithOptions.descriptionOptions)
        && Objects.equals(this.videoOptions, adcreativeCreativeElementsWithOptions.videoOptions)
        && Objects.equals(this.linkNameType, adcreativeCreativeElementsWithOptions.linkNameType)
        && Objects.equals(this.imageList, adcreativeCreativeElementsWithOptions.imageList)
        && Objects.equals(this.elementStory, adcreativeCreativeElementsWithOptions.elementStory)
        && Objects.equals(this.url, adcreativeCreativeElementsWithOptions.url)
        && Objects.equals(this.buttonText, adcreativeCreativeElementsWithOptions.buttonText)
        && Objects.equals(this.bottomText, adcreativeCreativeElementsWithOptions.bottomText)
        && Objects.equals(this.miniProgramId, adcreativeCreativeElementsWithOptions.miniProgramId)
        && Objects.equals(
            this.miniProgramPath, adcreativeCreativeElementsWithOptions.miniProgramPath)
        && Objects.equals(this.label, adcreativeCreativeElementsWithOptions.label)
        && Objects.equals(this.productTags, adcreativeCreativeElementsWithOptions.productTags)
        && Objects.equals(
            this.logoDescription, adcreativeCreativeElementsWithOptions.logoDescription)
        && Objects.equals(this.logo, adcreativeCreativeElementsWithOptions.logo)
        && Objects.equals(this.leftBottomTxt, adcreativeCreativeElementsWithOptions.leftBottomTxt)
        && Objects.equals(
            this.animationEffect, adcreativeCreativeElementsWithOptions.animationEffect)
        && Objects.equals(this.phone, adcreativeCreativeElementsWithOptions.phone)
        && Objects.equals(
            this.shortVideoStruct, adcreativeCreativeElementsWithOptions.shortVideoStruct)
        && Objects.equals(
            this.longVideoStruct, adcreativeCreativeElementsWithOptions.longVideoStruct)
        && Objects.equals(this.bannerContent, adcreativeCreativeElementsWithOptions.bannerContent)
        && Objects.equals(this.cardContent, adcreativeCreativeElementsWithOptions.cardContent)
        && Objects.equals(this.videoPopupUrl, adcreativeCreativeElementsWithOptions.videoPopupUrl)
        && Objects.equals(
            this.videoPopupButton, adcreativeCreativeElementsWithOptions.videoPopupButton)
        && Objects.equals(this.brand, adcreativeCreativeElementsWithOptions.brand)
        && Objects.equals(this.caption, adcreativeCreativeElementsWithOptions.caption)
        && Objects.equals(this.labelledImg, adcreativeCreativeElementsWithOptions.labelledImg)
        && Objects.equals(
            this.fullScreenImage, adcreativeCreativeElementsWithOptions.fullScreenImage)
        && Objects.equals(this.zipUrl, adcreativeCreativeElementsWithOptions.zipUrl)
        && Objects.equals(this.endPage, adcreativeCreativeElementsWithOptions.endPage)
        && Objects.equals(this.shopImage, adcreativeCreativeElementsWithOptions.shopImage)
        && Objects.equals(this.headLine, adcreativeCreativeElementsWithOptions.headLine)
        && Objects.equals(
            this.countdownExpiringTimestamp,
            adcreativeCreativeElementsWithOptions.countdownExpiringTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        image,
        image2,
        image3,
        title,
        description,
        corporate,
        video,
        imageOptions,
        titleOptions,
        descriptionOptions,
        videoOptions,
        linkNameType,
        imageList,
        elementStory,
        url,
        buttonText,
        bottomText,
        miniProgramId,
        miniProgramPath,
        label,
        productTags,
        logoDescription,
        logo,
        leftBottomTxt,
        animationEffect,
        phone,
        shortVideoStruct,
        longVideoStruct,
        bannerContent,
        cardContent,
        videoPopupUrl,
        videoPopupButton,
        brand,
        caption,
        labelledImg,
        fullScreenImage,
        zipUrl,
        endPage,
        shopImage,
        headLine,
        countdownExpiringTimestamp);
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
