/*
 * OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.0
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
 * A description of the location and time the route starts.
 */
@ApiModel(description = "A description of the location and time the route starts.")
@JsonPropertyOrder({
  RouteStart.JSON_PROPERTY_LOCATION_ID,
  RouteStart.JSON_PROPERTY_START,
  RouteStart.JSON_PROPERTY_DURATION,
  RouteStart.JSON_PROPERTY_DEPARTURE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T13:34:30.390729Z[Etc/UTC]")
public class RouteStart {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_DEPARTURE = "departure";
  private OffsetDateTime departure;

  public RouteStart() { 
  }

  public RouteStart locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier of the start location of the route. This is the start location of the assigned vehicle. 
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GHENT", value = "The unique identifier of the start location of the route. This is the start location of the assigned vehicle. ")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public RouteStart start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The point in time when the route starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T12:00Z", value = "The point in time when the route starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public RouteStart duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration [s] between the start of the route and the departure at the start location.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "The duration [s] between the start of the route and the departure at the start location.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public RouteStart departure(OffsetDateTime departure) {
    this.departure = departure;
    return this;
  }

   /**
   * The point in time when the vehicle departs at its start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return departure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T12:30Z", value = "The point in time when the vehicle departs at its start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
  @JsonProperty(JSON_PROPERTY_DEPARTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeparture() {
    return departure;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeparture(OffsetDateTime departure) {
    this.departure = departure;
  }


  /**
   * Return true if this RouteStart object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteStart routeStart = (RouteStart) o;
    return Objects.equals(this.locationId, routeStart.locationId) &&
        Objects.equals(this.start, routeStart.start) &&
        Objects.equals(this.duration, routeStart.duration) &&
        Objects.equals(this.departure, routeStart.departure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, start, duration, departure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteStart {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
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

