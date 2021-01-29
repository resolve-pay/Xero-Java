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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** Employee */
public class Employee {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;
  /** Current status of an employee – see contact status types */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

    ARCHIVED("ARCHIVED"),

    GDPRREQUEST("GDPRREQUEST"),

    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("ExternalLink")
  private ExternalLink externalLink;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public Employee employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for an employee e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9
   *
   * @return employeeID
   */
  @ApiModelProperty(
      value = "The Xero identifier for an employee e.g. 297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Employee status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of an employee – see contact status types
   *
   * @return status
   */
  @ApiModelProperty(value = "Current status of an employee – see contact status types")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of an employee (max length &#x3D; 255)
   *
   * @return firstName
   */
  @ApiModelProperty(value = "First name of an employee (max length = 255)")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of an employee (max length &#x3D; 255)
   *
   * @return lastName
   */
  @ApiModelProperty(value = "Last name of an employee (max length = 255)")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee externalLink(ExternalLink externalLink) {
    this.externalLink = externalLink;
    return this;
  }

  /**
   * Get externalLink
   *
   * @return externalLink
   */
  @ApiModelProperty(value = "")
  public ExternalLink getExternalLink() {
    return externalLink;
  }

  public void setExternalLink(ExternalLink externalLink) {
    this.externalLink = externalLink;
  }

  /**
   * Get updatedDateUTC
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public Employee statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(example = "ERROR", value = "A string to indicate if a invoice status")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public Employee validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Employee addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.employeeID, employee.employeeID)
        && Objects.equals(this.status, employee.status)
        && Objects.equals(this.firstName, employee.firstName)
        && Objects.equals(this.lastName, employee.lastName)
        && Objects.equals(this.externalLink, employee.externalLink)
        && Objects.equals(this.updatedDateUTC, employee.updatedDateUTC)
        && Objects.equals(this.statusAttributeString, employee.statusAttributeString)
        && Objects.equals(this.validationErrors, employee.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        status,
        firstName,
        lastName,
        externalLink,
        updatedDateUTC,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    externalLink: ").append(toIndentedString(externalLink)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
