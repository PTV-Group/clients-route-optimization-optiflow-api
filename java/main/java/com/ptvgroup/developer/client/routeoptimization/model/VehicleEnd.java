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
 * Describes the end of a route assigned to the vehicle.
 */
@ApiModel(description = "Describes the end of a route assigned to the vehicle.")
@JsonPropertyOrder({
  VehicleEnd.JSON_PROPERTY_LOCATION_ID,
  VehicleEnd.JSON_PROPERTY_LATEST_END_TIME,
  VehicleEnd.JSON_PROPERTY_DURATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class VehicleEnd {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_LATEST_END_TIME = "latestEndTime";
  private OffsetDateTime latestEndTime;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration = 0;

  public VehicleEnd() { 
  }

  public VehicleEnd locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier of the location where a route assigned to the vehicle must end.
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRUSSELS", required = true, value = "The unique identifier of the location where a route assigned to the vehicle must end.")
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


  public VehicleEnd latestEndTime(OffsetDateTime latestEndTime) {
    this.latestEndTime = latestEndTime;
    return this;
  }

   /**
   * The latest point in time a route assigned to the vehicle may end. This must not be earlier than the vehicle&#39;s earliest start time. When used in conjunction with a latest start time, the latest end time must not be earlier than the latest start time.  Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
   * @return latestEndTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-10-03T16:00Z", required = true, value = "The latest point in time a route assigned to the vehicle may end. This must not be earlier than the vehicle's earliest start time. When used in conjunction with a latest start time, the latest end time must not be earlier than the latest start time.  Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC. ")
  @JsonProperty(JSON_PROPERTY_LATEST_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLatestEndTime() {
    return latestEndTime;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatestEndTime(OffsetDateTime latestEndTime) {
    this.latestEndTime = latestEndTime;
  }


  public VehicleEnd duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Describes how long [s] it takes for the vehicle to wrap up at its end location before the route ends.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "Describes how long [s] it takes for the vehicle to wrap up at its end location before the route ends.")
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
   * Return true if this VehicleEnd object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleEnd vehicleEnd = (VehicleEnd) o;
    return Objects.equals(this.locationId, vehicleEnd.locationId) &&
        Objects.equals(this.latestEndTime, vehicleEnd.latestEndTime) &&
        Objects.equals(this.duration, vehicleEnd.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, latestEndTime, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleEnd {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    latestEndTime: ").append(toIndentedString(latestEndTime)).append("\n");
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

}

