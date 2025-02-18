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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BidwordRptGetRequest */
public class BidwordRptGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("filtering")
  private List<BidwordFilteringStruct> filtering = null;

  @SerializedName("group_by")
  private List<String> groupBy = null;

  @SerializedName("order_by")
  private List<OrderByReportStruct> orderBy = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  @SerializedName("rpt_filter")
  private RptFilter rptFilter = null;

  @SerializedName("biz_filter")
  private BizFilter bizFilter = null;

  @SerializedName("query_type")
  private List<Long> queryType = null;

  public BidwordRptGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public BidwordRptGetRequest filtering(List<BidwordFilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public BidwordRptGetRequest addFilteringItem(BidwordFilteringStruct filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<BidwordFilteringStruct>();
    }
    this.filtering.add(filteringItem);
    return this;
  }

  /**
   * Get filtering
   *
   * @return filtering
   */
  @ApiModelProperty(value = "")
  public List<BidwordFilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<BidwordFilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public BidwordRptGetRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public BidwordRptGetRequest addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<String>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Get groupBy
   *
   * @return groupBy
   */
  @ApiModelProperty(value = "")
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public BidwordRptGetRequest orderBy(List<OrderByReportStruct> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public BidwordRptGetRequest addOrderByItem(OrderByReportStruct orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<OrderByReportStruct>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * Get orderBy
   *
   * @return orderBy
   */
  @ApiModelProperty(value = "")
  public List<OrderByReportStruct> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<OrderByReportStruct> orderBy) {
    this.orderBy = orderBy;
  }

  public BidwordRptGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @ApiModelProperty(value = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public BidwordRptGetRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @ApiModelProperty(value = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public BidwordRptGetRequest rptFilter(RptFilter rptFilter) {
    this.rptFilter = rptFilter;
    return this;
  }

  /**
   * Get rptFilter
   *
   * @return rptFilter
   */
  @ApiModelProperty(value = "")
  public RptFilter getRptFilter() {
    return rptFilter;
  }

  public void setRptFilter(RptFilter rptFilter) {
    this.rptFilter = rptFilter;
  }

  public BidwordRptGetRequest bizFilter(BizFilter bizFilter) {
    this.bizFilter = bizFilter;
    return this;
  }

  /**
   * Get bizFilter
   *
   * @return bizFilter
   */
  @ApiModelProperty(value = "")
  public BizFilter getBizFilter() {
    return bizFilter;
  }

  public void setBizFilter(BizFilter bizFilter) {
    this.bizFilter = bizFilter;
  }

  public BidwordRptGetRequest queryType(List<Long> queryType) {
    this.queryType = queryType;
    return this;
  }

  public BidwordRptGetRequest addQueryTypeItem(Long queryTypeItem) {
    if (this.queryType == null) {
      this.queryType = new ArrayList<Long>();
    }
    this.queryType.add(queryTypeItem);
    return this;
  }

  /**
   * Get queryType
   *
   * @return queryType
   */
  @ApiModelProperty(value = "")
  public List<Long> getQueryType() {
    return queryType;
  }

  public void setQueryType(List<Long> queryType) {
    this.queryType = queryType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidwordRptGetRequest bidwordRptGetRequest = (BidwordRptGetRequest) o;
    return Objects.equals(this.accountId, bidwordRptGetRequest.accountId)
        && Objects.equals(this.filtering, bidwordRptGetRequest.filtering)
        && Objects.equals(this.groupBy, bidwordRptGetRequest.groupBy)
        && Objects.equals(this.orderBy, bidwordRptGetRequest.orderBy)
        && Objects.equals(this.page, bidwordRptGetRequest.page)
        && Objects.equals(this.pageSize, bidwordRptGetRequest.pageSize)
        && Objects.equals(this.rptFilter, bidwordRptGetRequest.rptFilter)
        && Objects.equals(this.bizFilter, bidwordRptGetRequest.bizFilter)
        && Objects.equals(this.queryType, bidwordRptGetRequest.queryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, filtering, groupBy, orderBy, page, pageSize, rptFilter, bizFilter, queryType);
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
