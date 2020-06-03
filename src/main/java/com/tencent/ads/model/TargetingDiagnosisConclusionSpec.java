/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.tencent.ads.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 定向维度的曝光评估结果
 */
@ApiModel(description = "定向维度的曝光评估结果")

public class TargetingDiagnosisConclusionSpec {

  @SerializedName("targeting_diagnosis_score")
  private Long targetingDiagnosisScore = null;

  @SerializedName("contract_occupied_score")
  private Long contractOccupiedScore = null;

  @SerializedName("contract_occupied_spec_list")
  private List<ContractOccupiedSpec> contractOccupiedSpecList = null;

  @SerializedName("compitition_score")
  private Long compititionScore = null;

  @SerializedName("compitition_spec_list")
  private List<CompititionSpec> compititionSpecList = null;

  @SerializedName("conclusion")
  private String conclusion = null;

  public TargetingDiagnosisConclusionSpec targetingDiagnosisScore(Long targetingDiagnosisScore) {
    this.targetingDiagnosisScore = targetingDiagnosisScore;
    return this;
  }

  /**
   * Get targetingDiagnosisScore
   *
   * @return targetingDiagnosisScore
   **/
  @ApiModelProperty(value = "")
  public Long getTargetingDiagnosisScore() {
    return targetingDiagnosisScore;
  }

  public void setTargetingDiagnosisScore(Long targetingDiagnosisScore) {
    this.targetingDiagnosisScore = targetingDiagnosisScore;
  }

  public TargetingDiagnosisConclusionSpec contractOccupiedScore(Long contractOccupiedScore) {
    this.contractOccupiedScore = contractOccupiedScore;
    return this;
  }

  /**
   * Get contractOccupiedScore
   *
   * @return contractOccupiedScore
   **/
  @ApiModelProperty(value = "")
  public Long getContractOccupiedScore() {
    return contractOccupiedScore;
  }

  public void setContractOccupiedScore(Long contractOccupiedScore) {
    this.contractOccupiedScore = contractOccupiedScore;
  }

  public TargetingDiagnosisConclusionSpec contractOccupiedSpecList(
      List<ContractOccupiedSpec> contractOccupiedSpecList) {
    this.contractOccupiedSpecList = contractOccupiedSpecList;
    return this;
  }

  public TargetingDiagnosisConclusionSpec addContractOccupiedSpecListItem(
      ContractOccupiedSpec contractOccupiedSpecListItem) {
    if (this.contractOccupiedSpecList == null) {
      this.contractOccupiedSpecList = new ArrayList<ContractOccupiedSpec>();
    }
    this.contractOccupiedSpecList.add(contractOccupiedSpecListItem);
    return this;
  }

  /**
   * Get contractOccupiedSpecList
   *
   * @return contractOccupiedSpecList
   **/
  @ApiModelProperty(value = "")
  public List<ContractOccupiedSpec> getContractOccupiedSpecList() {
    return contractOccupiedSpecList;
  }

  public void setContractOccupiedSpecList(List<ContractOccupiedSpec> contractOccupiedSpecList) {
    this.contractOccupiedSpecList = contractOccupiedSpecList;
  }

  public TargetingDiagnosisConclusionSpec compititionScore(Long compititionScore) {
    this.compititionScore = compititionScore;
    return this;
  }

  /**
   * Get compititionScore
   *
   * @return compititionScore
   **/
  @ApiModelProperty(value = "")
  public Long getCompititionScore() {
    return compititionScore;
  }

  public void setCompititionScore(Long compititionScore) {
    this.compititionScore = compititionScore;
  }

  public TargetingDiagnosisConclusionSpec compititionSpecList(
      List<CompititionSpec> compititionSpecList) {
    this.compititionSpecList = compititionSpecList;
    return this;
  }

  public TargetingDiagnosisConclusionSpec addCompititionSpecListItem(
      CompititionSpec compititionSpecListItem) {
    if (this.compititionSpecList == null) {
      this.compititionSpecList = new ArrayList<CompititionSpec>();
    }
    this.compititionSpecList.add(compititionSpecListItem);
    return this;
  }

  /**
   * Get compititionSpecList
   *
   * @return compititionSpecList
   **/
  @ApiModelProperty(value = "")
  public List<CompititionSpec> getCompititionSpecList() {
    return compititionSpecList;
  }

  public void setCompititionSpecList(List<CompititionSpec> compititionSpecList) {
    this.compititionSpecList = compititionSpecList;
  }

  public TargetingDiagnosisConclusionSpec conclusion(String conclusion) {
    this.conclusion = conclusion;
    return this;
  }

  /**
   * Get conclusion
   *
   * @return conclusion
   **/
  @ApiModelProperty(value = "")
  public String getConclusion() {
    return conclusion;
  }

  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingDiagnosisConclusionSpec targetingDiagnosisConclusionSpec = (TargetingDiagnosisConclusionSpec) o;
    return Objects.equals(this.targetingDiagnosisScore,
        targetingDiagnosisConclusionSpec.targetingDiagnosisScore) &&
        Objects.equals(this.contractOccupiedScore,
            targetingDiagnosisConclusionSpec.contractOccupiedScore) &&
        Objects.equals(this.contractOccupiedSpecList,
            targetingDiagnosisConclusionSpec.contractOccupiedSpecList) &&
        Objects.equals(this.compititionScore, targetingDiagnosisConclusionSpec.compititionScore) &&
        Objects
            .equals(this.compititionSpecList, targetingDiagnosisConclusionSpec.compititionSpecList)
        &&
        Objects.equals(this.conclusion, targetingDiagnosisConclusionSpec.conclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingDiagnosisScore, contractOccupiedScore, contractOccupiedSpecList,
        compititionScore, compititionSpecList, conclusion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingDiagnosisConclusionSpec {\n");

    sb.append("    targetingDiagnosisScore: ").append(toIndentedString(targetingDiagnosisScore))
        .append("\n");
    sb.append("    contractOccupiedScore: ").append(toIndentedString(contractOccupiedScore))
        .append("\n");
    sb.append("    contractOccupiedSpecList: ").append(toIndentedString(contractOccupiedSpecList))
        .append("\n");
    sb.append("    compititionScore: ").append(toIndentedString(compititionScore)).append("\n");
    sb.append("    compititionSpecList: ").append(toIndentedString(compititionSpecList))
        .append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

