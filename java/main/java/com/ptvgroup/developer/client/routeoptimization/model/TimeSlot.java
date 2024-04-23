/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routeoptimization.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a possibility to schedule an appointment to execute tasks at a location. 
 */
@ApiModel(description = "Describes a possibility to schedule an appointment to execute tasks at a location. ")
@JsonPropertyOrder({
  TimeSlot.JSON_PROPERTY_ID,
  TimeSlot.JSON_PROPERTY_EARLIEST_START,
  TimeSlot.JSON_PROPERTY_LATEST_START,
  TimeSlot.JSON_PROPERTY_LATEST_END,
  TimeSlot.JSON_PROPERTY_MAXIMUM_APPOINTMENTS,
  TimeSlot.JSON_PROPERTY_PREPARATION_DURATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class TimeSlot {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EARLIEST_START = "earliestStart";
  private OffsetDateTime earliestStart;

  public static final String JSON_PROPERTY_LATEST_START = "latestStart";
  private OffsetDateTime latestStart;

  public static final String JSON_PROPERTY_LATEST_END = "latestEnd";
  private OffsetDateTime latestEnd;

  public static final String JSON_PROPERTY_MAXIMUM_APPOINTMENTS = "maximumAppointments";
  private Integer maximumAppointments;

  public static final String JSON_PROPERTY_PREPARATION_DURATION = "preparationDuration";
  private Integer preparationDuration = 0;

  public TimeSlot() { 
  }

  public TimeSlot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the time slot. Must be unique within each location. 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MORNING", required = true, value = "A unique identifier of the time slot. Must be unique within each location. ")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public TimeSlot earliestStart(OffsetDateTime earliestStart) {
    this.earliestStart = earliestStart;
    return this;
  }

   /**
   * The earliest point in time an appointment may start in this time slot. When omitted the appointment may start as early as desired.    When used in conjunction with a latest start time, the earliest start time of a time slot must not be later than its latest start time. When used in conjunction with a latest end time, the earliest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
   * @return earliestStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T08:00Z", value = "The earliest point in time an appointment may start in this time slot. When omitted the appointment may start as early as desired.    When used in conjunction with a latest start time, the earliest start time of a time slot must not be later than its latest start time. When used in conjunction with a latest end time, the earliest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC. ")
  @JsonProperty(JSON_PROPERTY_EARLIEST_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEarliestStart() {
    return earliestStart;
  }


  @JsonProperty(JSON_PROPERTY_EARLIEST_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarliestStart(OffsetDateTime earliestStart) {
    this.earliestStart = earliestStart;
  }


  public TimeSlot latestStart(OffsetDateTime latestStart) {
    this.latestStart = latestStart;
    return this;
  }

   /**
   * The latest point in time an appointment may start in this time slot. When omitted the appointment may start as late as desired.  When used in conjunction with an earliest start time, the latest start time of a time slot must not be earlier than its earliest start time. When used in conjunction with a latest end time, the latest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
   * @return latestStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T12:00Z", value = "The latest point in time an appointment may start in this time slot. When omitted the appointment may start as late as desired.  When used in conjunction with an earliest start time, the latest start time of a time slot must not be earlier than its earliest start time. When used in conjunction with a latest end time, the latest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC. ")
  @JsonProperty(JSON_PROPERTY_LATEST_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLatestStart() {
    return latestStart;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestStart(OffsetDateTime latestStart) {
    this.latestStart = latestStart;
  }


  public TimeSlot latestEnd(OffsetDateTime latestEnd) {
    this.latestEnd = latestEnd;
    return this;
  }

   /**
   * The latest point in time an appointment may end in this time slot. When omitted the appointment may end as late as desired.  When used in conjunction with an earliest start time, the latest end time of a time slot must not be earlier than its earliest start time. When used in conjunction with an latest start time, the latest end time of a time slot must not be earlier than its latest start time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
   * @return latestEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T18:00Z", value = "The latest point in time an appointment may end in this time slot. When omitted the appointment may end as late as desired.  When used in conjunction with an earliest start time, the latest end time of a time slot must not be earlier than its earliest start time. When used in conjunction with an latest start time, the latest end time of a time slot must not be earlier than its latest start time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC. ")
  @JsonProperty(JSON_PROPERTY_LATEST_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLatestEnd() {
    return latestEnd;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestEnd(OffsetDateTime latestEnd) {
    this.latestEnd = latestEnd;
  }


  public TimeSlot maximumAppointments(Integer maximumAppointments) {
    this.maximumAppointments = maximumAppointments;
    return this;
  }

   /**
   * Describes how many appointments may be assigned to this time slot. When omitted, an unlimited number of appointments may be assigned to this time slot. 
   * minimum: 1
   * @return maximumAppointments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "Describes how many appointments may be assigned to this time slot. When omitted, an unlimited number of appointments may be assigned to this time slot. ")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_APPOINTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumAppointments() {
    return maximumAppointments;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_APPOINTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumAppointments(Integer maximumAppointments) {
    this.maximumAppointments = maximumAppointments;
  }


  public TimeSlot preparationDuration(Integer preparationDuration) {
    this.preparationDuration = preparationDuration;
    return this;
  }

   /**
   * Describes how long [s] it takes before the first task can be executed after starting the appointment.
   * minimum: 0
   * @return preparationDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "900", value = "Describes how long [s] it takes before the first task can be executed after starting the appointment.")
  @JsonProperty(JSON_PROPERTY_PREPARATION_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPreparationDuration() {
    return preparationDuration;
  }


  @JsonProperty(JSON_PROPERTY_PREPARATION_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreparationDuration(Integer preparationDuration) {
    this.preparationDuration = preparationDuration;
  }


  /**
   * Return true if this TimeSlot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.id, timeSlot.id) &&
        Objects.equals(this.earliestStart, timeSlot.earliestStart) &&
        Objects.equals(this.latestStart, timeSlot.latestStart) &&
        Objects.equals(this.latestEnd, timeSlot.latestEnd) &&
        Objects.equals(this.maximumAppointments, timeSlot.maximumAppointments) &&
        Objects.equals(this.preparationDuration, timeSlot.preparationDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, earliestStart, latestStart, latestEnd, maximumAppointments, preparationDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    earliestStart: ").append(toIndentedString(earliestStart)).append("\n");
    sb.append("    latestStart: ").append(toIndentedString(latestStart)).append("\n");
    sb.append("    latestEnd: ").append(toIndentedString(latestEnd)).append("\n");
    sb.append("    maximumAppointments: ").append(toIndentedString(maximumAppointments)).append("\n");
    sb.append("    preparationDuration: ").append(toIndentedString(preparationDuration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

