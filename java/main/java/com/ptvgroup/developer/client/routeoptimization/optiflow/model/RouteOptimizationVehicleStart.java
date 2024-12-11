/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routeoptimization.optiflow.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the start of a route assigned to the vehicle.
 */
@JsonPropertyOrder({
  RouteOptimizationVehicleStart.JSON_PROPERTY_LOCATION_ID,
  RouteOptimizationVehicleStart.JSON_PROPERTY_EARLIEST_START_TIME,
  RouteOptimizationVehicleStart.JSON_PROPERTY_LATEST_START_TIME,
  RouteOptimizationVehicleStart.JSON_PROPERTY_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:41:02.727616123Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationVehicleStart {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_EARLIEST_START_TIME = "earliestStartTime";
  private OffsetDateTime earliestStartTime;

  public static final String JSON_PROPERTY_LATEST_START_TIME = "latestStartTime";
  private OffsetDateTime latestStartTime;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration = 0;

  public RouteOptimizationVehicleStart() { 
  }

  public RouteOptimizationVehicleStart locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier of the location where a route assigned to the vehicle must start.
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public RouteOptimizationVehicleStart earliestStartTime(OffsetDateTime earliestStartTime) {
    this.earliestStartTime = earliestStartTime;
    return this;
  }

   /**
   * The earliest point in time a route assigned to the vehicle may start. This must be not be later than the vehicle&#39;s latest end time. When used in conjunction with a latest start time, the earliest start time must not be later than the latest start time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). The date must not be before &#x60;1970-01-01T00:00:00+00:00&#x60; nor after &#x60;2037-12-31T23:59:59+00:00&#x60;. The date must provide an offset to UTC.
   * @return earliestStartTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EARLIEST_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEarliestStartTime() {
    return earliestStartTime;
  }


  @JsonProperty(JSON_PROPERTY_EARLIEST_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEarliestStartTime(OffsetDateTime earliestStartTime) {
    this.earliestStartTime = earliestStartTime;
  }


  public RouteOptimizationVehicleStart latestStartTime(OffsetDateTime latestStartTime) {
    this.latestStartTime = latestStartTime;
    return this;
  }

   /**
   * The latest point in time a route assigned to the vehicle may start. This must not be earlier than the vehicle&#39;s earliest start time nor later than the vehicle&#39;s earliest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). The date must not be before &#x60;1970-01-01T00:00:00+00:00&#x60; nor after &#x60;2037-12-31T23:59:59+00:00&#x60;. The date must provide an offset to UTC.
   * @return latestStartTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLatestStartTime() {
    return latestStartTime;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestStartTime(OffsetDateTime latestStartTime) {
    this.latestStartTime = latestStartTime;
  }


  public RouteOptimizationVehicleStart duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Describes how long [s] it takes for the vehicle to depart at its start location after the route starts.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
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


  /**
   * Return true if this VehicleStart object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationVehicleStart vehicleStart = (RouteOptimizationVehicleStart) o;
    return Objects.equals(this.locationId, vehicleStart.locationId) &&
        Objects.equals(this.earliestStartTime, vehicleStart.earliestStartTime) &&
        Objects.equals(this.latestStartTime, vehicleStart.latestStartTime) &&
        Objects.equals(this.duration, vehicleStart.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, earliestStartTime, latestStartTime, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationVehicleStart {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    earliestStartTime: ").append(toIndentedString(earliestStartTime)).append("\n");
    sb.append("    latestStartTime: ").append(toIndentedString(latestStartTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `locationId` to the URL query string
    if (getLocationId() != null) {
      joiner.add(String.format("%slocationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `earliestStartTime` to the URL query string
    if (getEarliestStartTime() != null) {
      joiner.add(String.format("%searliestStartTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEarliestStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `latestStartTime` to the URL query string
    if (getLatestStartTime() != null) {
      joiner.add(String.format("%slatestStartTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLatestStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format("%sduration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

