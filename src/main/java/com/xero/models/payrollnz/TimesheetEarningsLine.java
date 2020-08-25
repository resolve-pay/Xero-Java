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
import java.util.UUID;

/** TimesheetEarningsLine */
public class TimesheetEarningsLine {
  StringUtil util = new StringUtil();

  @JsonProperty("earningsLineID")
  private UUID earningsLineID;

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;

  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("isLinkedToTimesheet")
  private Boolean isLinkedToTimesheet;

  @JsonProperty("isAverageDailyPayRate")
  private Boolean isAverageDailyPayRate;

  @JsonProperty("isSystemGenerated")
  private Boolean isSystemGenerated;

  public TimesheetEarningsLine earningsLineID(UUID earningsLineID) {
    this.earningsLineID = earningsLineID;
    return this;
  }

  /**
   * Xero identifier for payroll earnings line
   *
   * @return earningsLineID
   */
  @ApiModelProperty(value = "Xero identifier for payroll earnings line")
  public UUID getEarningsLineID() {
    return earningsLineID;
  }

  public void setEarningsLineID(UUID earningsLineID) {
    this.earningsLineID = earningsLineID;
  }

  public TimesheetEarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero identifier for payroll leave earnings rate
   *
   * @return earningsRateID
   */
  @ApiModelProperty(value = "Xero identifier for payroll leave earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public TimesheetEarningsLine displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * name of earnings rate for display in UI
   *
   * @return displayName
   */
  @ApiModelProperty(value = "name of earnings rate for display in UI")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TimesheetEarningsLine ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * Rate per unit for leave earnings line
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(value = "Rate per unit for leave earnings line")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public TimesheetEarningsLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Leave earnings number of units
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(value = "Leave earnings number of units")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public TimesheetEarningsLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Leave earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed
   *
   * @return fixedAmount
   */
  @ApiModelProperty(
      value = "Leave earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public TimesheetEarningsLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the earnings line.
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the earnings line.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TimesheetEarningsLine isLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
    return this;
  }

  /**
   * Identifies if the leave earnings is taken from the timesheet. False for leave earnings line
   *
   * @return isLinkedToTimesheet
   */
  @ApiModelProperty(
      value =
          "Identifies if the leave earnings is taken from the timesheet. False for leave earnings"
              + " line")
  public Boolean getIsLinkedToTimesheet() {
    return isLinkedToTimesheet;
  }

  public void setIsLinkedToTimesheet(Boolean isLinkedToTimesheet) {
    this.isLinkedToTimesheet = isLinkedToTimesheet;
  }

  public TimesheetEarningsLine isAverageDailyPayRate(Boolean isAverageDailyPayRate) {
    this.isAverageDailyPayRate = isAverageDailyPayRate;
    return this;
  }

  /**
   * Identifies if the earnings is using an average daily pay rate
   *
   * @return isAverageDailyPayRate
   */
  @ApiModelProperty(value = "Identifies if the earnings is using an average daily pay rate")
  public Boolean getIsAverageDailyPayRate() {
    return isAverageDailyPayRate;
  }

  public void setIsAverageDailyPayRate(Boolean isAverageDailyPayRate) {
    this.isAverageDailyPayRate = isAverageDailyPayRate;
  }

  public TimesheetEarningsLine isSystemGenerated(Boolean isSystemGenerated) {
    this.isSystemGenerated = isSystemGenerated;
    return this;
  }

  /**
   * Flag to indentify whether the earnings line is system generated or not.
   *
   * @return isSystemGenerated
   */
  @ApiModelProperty(
      value = "Flag to indentify whether the earnings line is system generated or not.")
  public Boolean getIsSystemGenerated() {
    return isSystemGenerated;
  }

  public void setIsSystemGenerated(Boolean isSystemGenerated) {
    this.isSystemGenerated = isSystemGenerated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetEarningsLine timesheetEarningsLine = (TimesheetEarningsLine) o;
    return Objects.equals(this.earningsLineID, timesheetEarningsLine.earningsLineID)
        && Objects.equals(this.earningsRateID, timesheetEarningsLine.earningsRateID)
        && Objects.equals(this.displayName, timesheetEarningsLine.displayName)
        && Objects.equals(this.ratePerUnit, timesheetEarningsLine.ratePerUnit)
        && Objects.equals(this.numberOfUnits, timesheetEarningsLine.numberOfUnits)
        && Objects.equals(this.fixedAmount, timesheetEarningsLine.fixedAmount)
        && Objects.equals(this.amount, timesheetEarningsLine.amount)
        && Objects.equals(this.isLinkedToTimesheet, timesheetEarningsLine.isLinkedToTimesheet)
        && Objects.equals(this.isAverageDailyPayRate, timesheetEarningsLine.isAverageDailyPayRate)
        && Objects.equals(this.isSystemGenerated, timesheetEarningsLine.isSystemGenerated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        earningsLineID,
        earningsRateID,
        displayName,
        ratePerUnit,
        numberOfUnits,
        fixedAmount,
        amount,
        isLinkedToTimesheet,
        isAverageDailyPayRate,
        isSystemGenerated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetEarningsLine {\n");
    sb.append("    earningsLineID: ").append(toIndentedString(earningsLineID)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isLinkedToTimesheet: ")
        .append(toIndentedString(isLinkedToTimesheet))
        .append("\n");
    sb.append("    isAverageDailyPayRate: ")
        .append(toIndentedString(isAverageDailyPayRate))
        .append("\n");
    sb.append("    isSystemGenerated: ").append(toIndentedString(isSystemGenerated)).append("\n");
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
