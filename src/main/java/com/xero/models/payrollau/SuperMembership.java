/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** SuperMembership */
public class SuperMembership {
  StringUtil util = new StringUtil();

  @JsonProperty("SuperMembershipID")
  private UUID superMembershipID;

  @JsonProperty("SuperFundID")
  private UUID superFundID;

  @JsonProperty("EmployeeNumber")
  private String employeeNumber;

  public SuperMembership superMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
    return this;
  }

  /**
   * Xero unique identifier for Super membership
   *
   * @return superMembershipID
   */
  @ApiModelProperty(
      example = "4333d5cd-53a5-4c31-98e5-a8b4e5676b0b",
      value = "Xero unique identifier for Super membership")
  public UUID getSuperMembershipID() {
    return superMembershipID;
  }

  public void setSuperMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
  }

  public SuperMembership superFundID(UUID superFundID) {
    this.superFundID = superFundID;
    return this;
  }

  /**
   * Xero identifier for super fund
   *
   * @return superFundID
   */
  @ApiModelProperty(
      example = "2187a42b-639a-45cb-9eed-cd4ae488306a",
      required = true,
      value = "Xero identifier for super fund")
  public UUID getSuperFundID() {
    return superFundID;
  }

  public void setSuperFundID(UUID superFundID) {
    this.superFundID = superFundID;
  }

  public SuperMembership employeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

  /**
   * The membership number assigned to the employee by the super fund.
   *
   * @return employeeNumber
   */
  @ApiModelProperty(
      example = "1234",
      required = true,
      value = "The membership number assigned to the employee by the super fund.")
  public String getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperMembership superMembership = (SuperMembership) o;
    return Objects.equals(this.superMembershipID, superMembership.superMembershipID)
        && Objects.equals(this.superFundID, superMembership.superFundID)
        && Objects.equals(this.employeeNumber, superMembership.employeeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superMembershipID, superFundID, employeeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperMembership {\n");
    sb.append("    superMembershipID: ").append(toIndentedString(superMembershipID)).append("\n");
    sb.append("    superFundID: ").append(toIndentedString(superFundID)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
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
