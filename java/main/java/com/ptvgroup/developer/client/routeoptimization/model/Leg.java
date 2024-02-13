/*
 * Route Optimization OptiFlow
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
import com.ptvgroup.developer.client.routeoptimization.model.ModelBreak;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A section of a route where a vehicle travels from one location to another.
 */
@ApiModel(description = "A section of a route where a vehicle travels from one location to another.")
@JsonPropertyOrder({
  Leg.JSON_PROPERTY_START_LOCATION_ID,
  Leg.JSON_PROPERTY_DEPARTURE,
  Leg.JSON_PROPERTY_END_LOCATION_ID,
  Leg.JSON_PROPERTY_ARRIVAL,
  Leg.JSON_PROPERTY_BREAKS,
  Leg.JSON_PROPERTY_DISTANCE,
  Leg.JSON_PROPERTY_DRIVING_DURATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T09:16:08.739853Z[Etc/UTC]")
public class Leg {
  public static final String JSON_PROPERTY_START_LOCATION_ID = "startLocationId";
  private String startLocationId;

  public static final String JSON_PROPERTY_DEPARTURE = "departure";
  private OffsetDateTime departure;

  public static final String JSON_PROPERTY_END_LOCATION_ID = "endLocationId";
  private String endLocationId;

  public static final String JSON_PROPERTY_ARRIVAL = "arrival";
  private OffsetDateTime arrival;

  public static final String JSON_PROPERTY_BREAKS = "breaks";
  private List<ModelBreak> breaks = null;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_DRIVING_DURATION = "drivingDuration";
  private Integer drivingDuration;

  public Leg() { 
  }

  public Leg startLocationId(String startLocationId) {
    this.startLocationId = startLocationId;
    return this;
  }

   /**
   * The unique identifier of the location where the vehicle departs.
   * @return startLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GHENT", value = "The unique identifier of the location where the vehicle departs.")
  @JsonProperty(JSON_PROPERTY_START_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartLocationId() {
    return startLocationId;
  }


  @JsonProperty(JSON_PROPERTY_START_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartLocationId(String startLocationId) {
    this.startLocationId = startLocationId;
  }


  public Leg departure(OffsetDateTime departure) {
    this.departure = departure;
    return this;
  }

   /**
   * The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return departure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T12:00Z", value = "The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
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


  public Leg endLocationId(String endLocationId) {
    this.endLocationId = endLocationId;
    return this;
  }

   /**
   * The unique identifier of the location where the vehicle arrives.
   * @return endLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRUSSELS", value = "The unique identifier of the location where the vehicle arrives.")
  @JsonProperty(JSON_PROPERTY_END_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndLocationId() {
    return endLocationId;
  }


  @JsonProperty(JSON_PROPERTY_END_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndLocationId(String endLocationId) {
    this.endLocationId = endLocationId;
  }


  public Leg arrival(OffsetDateTime arrival) {
    this.arrival = arrival;
    return this;
  }

   /**
   * The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return arrival
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T13:00Z", value = "The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
  @JsonProperty(JSON_PROPERTY_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getArrival() {
    return arrival;
  }


  @JsonProperty(JSON_PROPERTY_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrival(OffsetDateTime arrival) {
    this.arrival = arrival;
  }


  public Leg breaks(List<ModelBreak> breaks) {
    this.breaks = breaks;
    return this;
  }

  public Leg addBreaksItem(ModelBreak breaksItem) {
    if (this.breaks == null) {
      this.breaks = new ArrayList<>();
    }
    this.breaks.add(breaksItem);
    return this;
  }

   /**
   * A list of breaks taken while travelling from the start location to the end location.
   * @return breaks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of breaks taken while travelling from the start location to the end location.")
  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModelBreak> getBreaks() {
    return breaks;
  }


  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreaks(List<ModelBreak> breaks) {
    this.breaks = breaks;
  }


  public Leg distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance [m] travelled between the start location and end location.
   * minimum: 0
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "The distance [m] travelled between the start location and end location.")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public Leg drivingDuration(Integer drivingDuration) {
    this.drivingDuration = drivingDuration;
    return this;
  }

   /**
   * The duration [s] it takes to drive from the start location to the end location.
   * minimum: 0
   * @return drivingDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2700", value = "The duration [s] it takes to drive from the start location to the end location.")
  @JsonProperty(JSON_PROPERTY_DRIVING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDrivingDuration() {
    return drivingDuration;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivingDuration(Integer drivingDuration) {
    this.drivingDuration = drivingDuration;
  }


  /**
   * Return true if this Leg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leg leg = (Leg) o;
    return Objects.equals(this.startLocationId, leg.startLocationId) &&
        Objects.equals(this.departure, leg.departure) &&
        Objects.equals(this.endLocationId, leg.endLocationId) &&
        Objects.equals(this.arrival, leg.arrival) &&
        Objects.equals(this.breaks, leg.breaks) &&
        Objects.equals(this.distance, leg.distance) &&
        Objects.equals(this.drivingDuration, leg.drivingDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startLocationId, departure, endLocationId, arrival, breaks, distance, drivingDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");
    sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    drivingDuration: ").append(toIndentedString(drivingDuration)).append("\n");
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

