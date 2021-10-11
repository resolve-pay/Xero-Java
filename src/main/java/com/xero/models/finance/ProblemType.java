/*
 * Xero Finance API
 * The Finance API is a collection of endpoints which customers can use in the course of a loan application, which may assist lenders to gain the confidence they need to provide capital.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.finance;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets ProblemType */
public enum ProblemType {

  /** NOTSET */
  NOTSET("NotSet"),

  /** INVALID_REQUEST */
  INVALID_REQUEST("invalid-request"),

  /** INVALID_APPLICATION */
  INVALID_APPLICATION("invalid-application"),

  /** SERVICE_UNAVAILABLE */
  SERVICE_UNAVAILABLE("service-unavailable"),

  /** INTERNAL_ERROR */
  INTERNAL_ERROR("internal-error");

  private String value;

  ProblemType(String value) {
    this.value = value;
  }

  /** @return String value */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * toString
   *
   * @return String value
   */
  @Override
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * fromValue
   *
   * @param value String
   */
  @JsonCreator
  public static ProblemType fromValue(String value) {
    for (ProblemType b : ProblemType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}