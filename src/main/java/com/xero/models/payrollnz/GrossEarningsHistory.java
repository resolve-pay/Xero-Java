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
import java.math.BigDecimal;
import java.util.Objects;

/** GrossEarningsHistory */
public class GrossEarningsHistory {
  StringUtil util = new StringUtil();

  @JsonProperty("daysPaid")
  private BigDecimal daysPaid;

  @JsonProperty("unpaidWeeks")
  private BigDecimal unpaidWeeks;

  public GrossEarningsHistory daysPaid(BigDecimal daysPaid) {
    this.daysPaid = daysPaid;
    return this;
  }

  /**
   * Number of days the employee worked in the pay period (0 - 365)
   *
   * @return daysPaid
   */
  @ApiModelProperty(value = "Number of days the employee worked in the pay period (0 - 365)")
  public BigDecimal getDaysPaid() {
    return daysPaid;
  }

  public void setDaysPaid(BigDecimal daysPaid) {
    this.daysPaid = daysPaid;
  }

  public GrossEarningsHistory unpaidWeeks(BigDecimal unpaidWeeks) {
    this.unpaidWeeks = unpaidWeeks;
    return this;
  }

  /**
   * Number of full weeks the employee didn&#39;t work in the pay period (0 - 52)
   *
   * @return unpaidWeeks
   */
  @ApiModelProperty(
      value = "Number of full weeks the employee didn't work in the pay period (0 - 52)")
  public BigDecimal getUnpaidWeeks() {
    return unpaidWeeks;
  }

  public void setUnpaidWeeks(BigDecimal unpaidWeeks) {
    this.unpaidWeeks = unpaidWeeks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossEarningsHistory grossEarningsHistory = (GrossEarningsHistory) o;
    return Objects.equals(this.daysPaid, grossEarningsHistory.daysPaid)
        && Objects.equals(this.unpaidWeeks, grossEarningsHistory.unpaidWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysPaid, unpaidWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossEarningsHistory {\n");
    sb.append("    daysPaid: ").append(toIndentedString(daysPaid)).append("\n");
    sb.append("    unpaidWeeks: ").append(toIndentedString(unpaidWeeks)).append("\n");
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
