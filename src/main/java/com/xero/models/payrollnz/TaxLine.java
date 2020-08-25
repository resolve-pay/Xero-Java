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

/** TaxLine */
public class TaxLine {
  StringUtil util = new StringUtil();

  @JsonProperty("taxLineID")
  private UUID taxLineID;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("globalTaxTypeID")
  private String globalTaxTypeID;

  @JsonProperty("manualAdjustment")
  private Boolean manualAdjustment;

  public TaxLine taxLineID(UUID taxLineID) {
    this.taxLineID = taxLineID;
    return this;
  }

  /**
   * Xero identifier for payroll tax line
   *
   * @return taxLineID
   */
  @ApiModelProperty(value = "Xero identifier for payroll tax line")
  public UUID getTaxLineID() {
    return taxLineID;
  }

  public void setTaxLineID(UUID taxLineID) {
    this.taxLineID = taxLineID;
  }

  public TaxLine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Tax line description
   *
   * @return description
   */
  @ApiModelProperty(value = "Tax line description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaxLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the tax line
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the tax line")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public TaxLine globalTaxTypeID(String globalTaxTypeID) {
    this.globalTaxTypeID = globalTaxTypeID;
    return this;
  }

  /**
   * Tax type ID
   *
   * @return globalTaxTypeID
   */
  @ApiModelProperty(value = "Tax type ID")
  public String getGlobalTaxTypeID() {
    return globalTaxTypeID;
  }

  public void setGlobalTaxTypeID(String globalTaxTypeID) {
    this.globalTaxTypeID = globalTaxTypeID;
  }

  public TaxLine manualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
    return this;
  }

  /**
   * Identifies if the tax line is a manual adjustment
   *
   * @return manualAdjustment
   */
  @ApiModelProperty(value = "Identifies if the tax line is a manual adjustment")
  public Boolean getManualAdjustment() {
    return manualAdjustment;
  }

  public void setManualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxLine taxLine = (TaxLine) o;
    return Objects.equals(this.taxLineID, taxLine.taxLineID)
        && Objects.equals(this.description, taxLine.description)
        && Objects.equals(this.amount, taxLine.amount)
        && Objects.equals(this.globalTaxTypeID, taxLine.globalTaxTypeID)
        && Objects.equals(this.manualAdjustment, taxLine.manualAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLineID, description, amount, globalTaxTypeID, manualAdjustment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLine {\n");
    sb.append("    taxLineID: ").append(toIndentedString(taxLineID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    globalTaxTypeID: ").append(toIndentedString(globalTaxTypeID)).append("\n");
    sb.append("    manualAdjustment: ").append(toIndentedString(manualAdjustment)).append("\n");
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
