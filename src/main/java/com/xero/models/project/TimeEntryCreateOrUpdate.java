/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.2.4
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
import org.threeten.bp.OffsetDateTime;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TimeEntryCreateOrUpdate
 */

public class TimeEntryCreateOrUpdate {
  StringUtil util = new StringUtil();

  @JsonProperty("userId")
  private UUID userId;

  @JsonProperty("taskId")
  private UUID taskId;

  @JsonProperty("dateUtc")
  private OffsetDateTime dateUtc;

  @JsonProperty("duration")
  private Integer duration;

  @JsonProperty("description")
  private String description;
  public TimeEntryCreateOrUpdate userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The xero user identifier of the person logging the time.
   * @return userId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The xero user identifier of the person logging the time.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public TimeEntryCreateOrUpdate taskId(UUID taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Identifier of the task that time entry is logged against.
   * @return taskId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "Identifier of the task that time entry is logged against.")
  public UUID getTaskId() {
    return taskId;
  }

  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }

  public TimeEntryCreateOrUpdate dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

   /**
   * Date time entry is logged on. UTC Date Time in ISO-8601 format.
   * @return dateUtc
  **/
  @ApiModelProperty(required = true, value = "Date time entry is logged on. UTC Date Time in ISO-8601 format.")
  public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }

  public TimeEntryCreateOrUpdate duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Number of minutes to be logged. Duration is between 1 and 59940 inclusively.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "Number of minutes to be logged. Duration is between 1 and 59940 inclusively.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public TimeEntryCreateOrUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the time entry, will be set to null if not provided during update.
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the time entry, will be set to null if not provided during update.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeEntryCreateOrUpdate timeEntryCreateOrUpdate = (TimeEntryCreateOrUpdate) o;
    return Objects.equals(this.userId, timeEntryCreateOrUpdate.userId) &&
        Objects.equals(this.taskId, timeEntryCreateOrUpdate.taskId) &&
        Objects.equals(this.dateUtc, timeEntryCreateOrUpdate.dateUtc) &&
        Objects.equals(this.duration, timeEntryCreateOrUpdate.duration) &&
        Objects.equals(this.description, timeEntryCreateOrUpdate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, taskId, dateUtc, duration, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeEntryCreateOrUpdate {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

