/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.2.12
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EmployeeLeaveSetup */
public class EmployeeLeaveSetup {
  StringUtil util = new StringUtil();

  @JsonProperty("includeHolidayPay")
  private Boolean includeHolidayPay;

  @JsonProperty("holidayPayOpeningBalance")
  private Double holidayPayOpeningBalance;

  @JsonProperty("annualLeaveOpeningBalance")
  private Double annualLeaveOpeningBalance;

  @JsonProperty("negativeAnnualLeaveBalancePaidAmount")
  private Double negativeAnnualLeaveBalancePaidAmount;

  @JsonProperty("sickLeaveHoursToAccrueAnnually")
  private Double sickLeaveHoursToAccrueAnnually;

  @JsonProperty("sickLeaveMaximumHoursToAccrue")
  private Double sickLeaveMaximumHoursToAccrue;

  @JsonProperty("sickLeaveOpeningBalance")
  private Double sickLeaveOpeningBalance;

  public EmployeeLeaveSetup includeHolidayPay(Boolean includeHolidayPay) {
    this.includeHolidayPay = includeHolidayPay;
    return this;
  }

  /**
   * Identifier if holiday pay will be included in each payslip
   *
   * @return includeHolidayPay
   */
  @ApiModelProperty(
      example = "false",
      value = "Identifier if holiday pay will be included in each payslip")
  public Boolean getIncludeHolidayPay() {
    return includeHolidayPay;
  }

  public void setIncludeHolidayPay(Boolean includeHolidayPay) {
    this.includeHolidayPay = includeHolidayPay;
  }

  public EmployeeLeaveSetup holidayPayOpeningBalance(Double holidayPayOpeningBalance) {
    this.holidayPayOpeningBalance = holidayPayOpeningBalance;
    return this;
  }

  /**
   * Initial holiday pay balance. A percentage — usually 8% — of gross earnings since their last
   * work anniversary.
   *
   * @return holidayPayOpeningBalance
   */
  @ApiModelProperty(
      example = "10.5",
      value =
          "Initial holiday pay balance. A percentage — usually 8% — of gross earnings since their"
              + " last work anniversary.")
  public Double getHolidayPayOpeningBalance() {
    return holidayPayOpeningBalance;
  }

  public void setHolidayPayOpeningBalance(Double holidayPayOpeningBalance) {
    this.holidayPayOpeningBalance = holidayPayOpeningBalance;
  }

  public EmployeeLeaveSetup annualLeaveOpeningBalance(Double annualLeaveOpeningBalance) {
    this.annualLeaveOpeningBalance = annualLeaveOpeningBalance;
    return this;
  }

  /**
   * Initial annual leave balance. The balance at their last anniversary, less any leave taken since
   * then and excluding accrued annual leave.
   *
   * @return annualLeaveOpeningBalance
   */
  @ApiModelProperty(
      example = "25.89",
      value =
          "Initial annual leave balance. The balance at their last anniversary, less any leave"
              + " taken since then and excluding accrued annual leave.")
  public Double getAnnualLeaveOpeningBalance() {
    return annualLeaveOpeningBalance;
  }

  public void setAnnualLeaveOpeningBalance(Double annualLeaveOpeningBalance) {
    this.annualLeaveOpeningBalance = annualLeaveOpeningBalance;
  }

  public EmployeeLeaveSetup negativeAnnualLeaveBalancePaidAmount(
      Double negativeAnnualLeaveBalancePaidAmount) {
    this.negativeAnnualLeaveBalancePaidAmount = negativeAnnualLeaveBalancePaidAmount;
    return this;
  }

  /**
   * The dollar value of annual leave opening balance if negative.
   *
   * @return negativeAnnualLeaveBalancePaidAmount
   */
  @ApiModelProperty(
      example = "10.0",
      value = "The dollar value of annual leave opening balance if negative.")
  public Double getNegativeAnnualLeaveBalancePaidAmount() {
    return negativeAnnualLeaveBalancePaidAmount;
  }

  public void setNegativeAnnualLeaveBalancePaidAmount(Double negativeAnnualLeaveBalancePaidAmount) {
    this.negativeAnnualLeaveBalancePaidAmount = negativeAnnualLeaveBalancePaidAmount;
  }

  public EmployeeLeaveSetup sickLeaveHoursToAccrueAnnually(Double sickLeaveHoursToAccrueAnnually) {
    this.sickLeaveHoursToAccrueAnnually = sickLeaveHoursToAccrueAnnually;
    return this;
  }

  /**
   * Number of hours accrued annually for sick leave. Multiply the number of days they&#39;re
   * entitled to by the hours worked per day
   *
   * @return sickLeaveHoursToAccrueAnnually
   */
  @ApiModelProperty(
      example = "100.5",
      value =
          "Number of hours accrued annually for sick leave. Multiply the number of days they're"
              + " entitled to by the hours worked per day")
  public Double getSickLeaveHoursToAccrueAnnually() {
    return sickLeaveHoursToAccrueAnnually;
  }

  public void setSickLeaveHoursToAccrueAnnually(Double sickLeaveHoursToAccrueAnnually) {
    this.sickLeaveHoursToAccrueAnnually = sickLeaveHoursToAccrueAnnually;
  }

  public EmployeeLeaveSetup sickLeaveMaximumHoursToAccrue(Double sickLeaveMaximumHoursToAccrue) {
    this.sickLeaveMaximumHoursToAccrue = sickLeaveMaximumHoursToAccrue;
    return this;
  }

  /**
   * Maximum number of hours accrued annually for sick leave. Multiply the maximum days they can
   * accrue by the hours worked per day
   *
   * @return sickLeaveMaximumHoursToAccrue
   */
  @ApiModelProperty(
      example = "200.5",
      value =
          "Maximum number of hours accrued annually for sick leave. Multiply the maximum days they"
              + " can accrue by the hours worked per day")
  public Double getSickLeaveMaximumHoursToAccrue() {
    return sickLeaveMaximumHoursToAccrue;
  }

  public void setSickLeaveMaximumHoursToAccrue(Double sickLeaveMaximumHoursToAccrue) {
    this.sickLeaveMaximumHoursToAccrue = sickLeaveMaximumHoursToAccrue;
  }

  public EmployeeLeaveSetup sickLeaveOpeningBalance(Double sickLeaveOpeningBalance) {
    this.sickLeaveOpeningBalance = sickLeaveOpeningBalance;
    return this;
  }

  /**
   * Initial sick leave balance. This will be positive unless they&#39;ve taken sick leave in
   * advance
   *
   * @return sickLeaveOpeningBalance
   */
  @ApiModelProperty(
      example = "10.5",
      value =
          "Initial sick leave balance. This will be positive unless they've taken sick leave in"
              + " advance")
  public Double getSickLeaveOpeningBalance() {
    return sickLeaveOpeningBalance;
  }

  public void setSickLeaveOpeningBalance(Double sickLeaveOpeningBalance) {
    this.sickLeaveOpeningBalance = sickLeaveOpeningBalance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaveSetup employeeLeaveSetup = (EmployeeLeaveSetup) o;
    return Objects.equals(this.includeHolidayPay, employeeLeaveSetup.includeHolidayPay)
        && Objects.equals(
            this.holidayPayOpeningBalance, employeeLeaveSetup.holidayPayOpeningBalance)
        && Objects.equals(
            this.annualLeaveOpeningBalance, employeeLeaveSetup.annualLeaveOpeningBalance)
        && Objects.equals(
            this.negativeAnnualLeaveBalancePaidAmount,
            employeeLeaveSetup.negativeAnnualLeaveBalancePaidAmount)
        && Objects.equals(
            this.sickLeaveHoursToAccrueAnnually, employeeLeaveSetup.sickLeaveHoursToAccrueAnnually)
        && Objects.equals(
            this.sickLeaveMaximumHoursToAccrue, employeeLeaveSetup.sickLeaveMaximumHoursToAccrue)
        && Objects.equals(this.sickLeaveOpeningBalance, employeeLeaveSetup.sickLeaveOpeningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        includeHolidayPay,
        holidayPayOpeningBalance,
        annualLeaveOpeningBalance,
        negativeAnnualLeaveBalancePaidAmount,
        sickLeaveHoursToAccrueAnnually,
        sickLeaveMaximumHoursToAccrue,
        sickLeaveOpeningBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveSetup {\n");
    sb.append("    includeHolidayPay: ").append(toIndentedString(includeHolidayPay)).append("\n");
    sb.append("    holidayPayOpeningBalance: ")
        .append(toIndentedString(holidayPayOpeningBalance))
        .append("\n");
    sb.append("    annualLeaveOpeningBalance: ")
        .append(toIndentedString(annualLeaveOpeningBalance))
        .append("\n");
    sb.append("    negativeAnnualLeaveBalancePaidAmount: ")
        .append(toIndentedString(negativeAnnualLeaveBalancePaidAmount))
        .append("\n");
    sb.append("    sickLeaveHoursToAccrueAnnually: ")
        .append(toIndentedString(sickLeaveHoursToAccrueAnnually))
        .append("\n");
    sb.append("    sickLeaveMaximumHoursToAccrue: ")
        .append(toIndentedString(sickLeaveMaximumHoursToAccrue))
        .append("\n");
    sb.append("    sickLeaveOpeningBalance: ")
        .append(toIndentedString(sickLeaveOpeningBalance))
        .append("\n");
    sb.append("}");
    return sb.toString();
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
