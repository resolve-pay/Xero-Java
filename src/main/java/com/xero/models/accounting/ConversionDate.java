/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The date when the organisation starts using Xero */
@ApiModel(description = "The date when the organisation starts using Xero")
public class ConversionDate {
  StringUtil util = new StringUtil();

  @JsonProperty("Month")
  private Integer month;

  @JsonProperty("Year")
  private Integer year;

  public ConversionDate month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * The month the organisation starts using Xero. Value is an integer between 1 and 12
   *
   * @return month
   */
  @ApiModelProperty(
      example = "1",
      value = "The month the organisation starts using Xero. Value is an integer between 1 and 12")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public ConversionDate year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * The year the organisation starts using Xero. Value is an integer greater than 2006
   *
   * @return year
   */
  @ApiModelProperty(
      example = "2020",
      value = "The year the organisation starts using Xero. Value is an integer greater than 2006")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDate conversionDate = (ConversionDate) o;
    return Objects.equals(this.month, conversionDate.month)
        && Objects.equals(this.year, conversionDate.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDate {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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