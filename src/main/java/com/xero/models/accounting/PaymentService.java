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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** PaymentService */
public class PaymentService {
  StringUtil util = new StringUtil();

  @JsonProperty("PaymentServiceID")
  private UUID paymentServiceID;

  @JsonProperty("PaymentServiceName")
  private String paymentServiceName;

  @JsonProperty("PaymentServiceUrl")
  private String paymentServiceUrl;

  @JsonProperty("PayNowText")
  private String payNowText;

  @JsonProperty("PaymentServiceType")
  private String paymentServiceType;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public PaymentService paymentServiceID(UUID paymentServiceID) {
    this.paymentServiceID = paymentServiceID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return paymentServiceID
   */
  @ApiModelProperty(value = "Xero identifier")
  public UUID getPaymentServiceID() {
    return paymentServiceID;
  }

  public void setPaymentServiceID(UUID paymentServiceID) {
    this.paymentServiceID = paymentServiceID;
  }

  public PaymentService paymentServiceName(String paymentServiceName) {
    this.paymentServiceName = paymentServiceName;
    return this;
  }

  /**
   * Name of payment service
   *
   * @return paymentServiceName
   */
  @ApiModelProperty(value = "Name of payment service")
  public String getPaymentServiceName() {
    return paymentServiceName;
  }

  public void setPaymentServiceName(String paymentServiceName) {
    this.paymentServiceName = paymentServiceName;
  }

  public PaymentService paymentServiceUrl(String paymentServiceUrl) {
    this.paymentServiceUrl = paymentServiceUrl;
    return this;
  }

  /**
   * The custom payment URL
   *
   * @return paymentServiceUrl
   */
  @ApiModelProperty(value = "The custom payment URL")
  public String getPaymentServiceUrl() {
    return paymentServiceUrl;
  }

  public void setPaymentServiceUrl(String paymentServiceUrl) {
    this.paymentServiceUrl = paymentServiceUrl;
  }

  public PaymentService payNowText(String payNowText) {
    this.payNowText = payNowText;
    return this;
  }

  /**
   * The text displayed on the Pay Now button in Xero Online Invoicing. If this is not set it will
   * default to Pay by credit card
   *
   * @return payNowText
   */
  @ApiModelProperty(
      value =
          "The text displayed on the Pay Now button in Xero Online Invoicing. If this is not set"
              + " it will default to Pay by credit card")
  public String getPayNowText() {
    return payNowText;
  }

  public void setPayNowText(String payNowText) {
    this.payNowText = payNowText;
  }

  public PaymentService paymentServiceType(String paymentServiceType) {
    this.paymentServiceType = paymentServiceType;
    return this;
  }

  /**
   * This will always be CUSTOM for payment services created via the API.
   *
   * @return paymentServiceType
   */
  @ApiModelProperty(value = "This will always be CUSTOM for payment services created via the API.")
  public String getPaymentServiceType() {
    return paymentServiceType;
  }

  public void setPaymentServiceType(String paymentServiceType) {
    this.paymentServiceType = paymentServiceType;
  }

  public PaymentService validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PaymentService addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PaymentService paymentService = (PaymentService) o;
    return Objects.equals(this.paymentServiceID, paymentService.paymentServiceID)
        && Objects.equals(this.paymentServiceName, paymentService.paymentServiceName)
        && Objects.equals(this.paymentServiceUrl, paymentService.paymentServiceUrl)
        && Objects.equals(this.payNowText, paymentService.payNowText)
        && Objects.equals(this.paymentServiceType, paymentService.paymentServiceType)
        && Objects.equals(this.validationErrors, paymentService.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        paymentServiceID,
        paymentServiceName,
        paymentServiceUrl,
        payNowText,
        paymentServiceType,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentService {\n");
    sb.append("    paymentServiceID: ").append(toIndentedString(paymentServiceID)).append("\n");
    sb.append("    paymentServiceName: ").append(toIndentedString(paymentServiceName)).append("\n");
    sb.append("    paymentServiceUrl: ").append(toIndentedString(paymentServiceUrl)).append("\n");
    sb.append("    payNowText: ").append(toIndentedString(payNowText)).append("\n");
    sb.append("    paymentServiceType: ").append(toIndentedString(paymentServiceType)).append("\n");
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
