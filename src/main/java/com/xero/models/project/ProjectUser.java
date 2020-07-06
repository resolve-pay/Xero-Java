/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.project;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ProjectUser
 */

public class ProjectUser {
  StringUtil util = new StringUtil();

  @JsonProperty("userId")
  private UUID userId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;
  public ProjectUser userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifier of the user of the project.
   * @return userId
  **/
  @ApiModelProperty(example = "254553fa-2be8-4991-bd5e-70a97ea12ef8", value = "Identifier of the user of the project.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public ProjectUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of the user.
   * @return name
  **/
  @ApiModelProperty(example = "Sidney Allen", value = "Full name of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the user.
   * @return email
  **/
  @ApiModelProperty(example = "sidneyallen@xero.com", value = "Email address of the user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUser projectUser = (ProjectUser) o;
    return Objects.equals(this.userId, projectUser.userId) &&
        Objects.equals(this.name, projectUser.name) &&
        Objects.equals(this.email, projectUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

