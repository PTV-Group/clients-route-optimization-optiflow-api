/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.6
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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationAppointment;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationLeg;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A location visit on a route where one or more tasks are scheduled. 
 */
@JsonPropertyOrder({
  RouteOptimizationStop.JSON_PROPERTY_LOCATION_ID,
  RouteOptimizationStop.JSON_PROPERTY_APPROACH,
  RouteOptimizationStop.JSON_PROPERTY_ARRIVAL,
  RouteOptimizationStop.JSON_PROPERTY_PREPARATION_DURATION,
  RouteOptimizationStop.JSON_PROPERTY_APPOINTMENTS,
  RouteOptimizationStop.JSON_PROPERTY_VEHICLE_SLOT_INDEX,
  RouteOptimizationStop.JSON_PROPERTY_DEPARTURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationStop {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_APPROACH = "approach";
  private RouteOptimizationLeg approach;

  public static final String JSON_PROPERTY_ARRIVAL = "arrival";
  private OffsetDateTime arrival;

  public static final String JSON_PROPERTY_PREPARATION_DURATION = "preparationDuration";
  private Integer preparationDuration;

  public static final String JSON_PROPERTY_APPOINTMENTS = "appointments";
  private List<RouteOptimizationAppointment> appointments = new ArrayList<>();

  public static final String JSON_PROPERTY_VEHICLE_SLOT_INDEX = "vehicleSlotIndex";
  private Integer vehicleSlotIndex;

  public static final String JSON_PROPERTY_DEPARTURE = "departure";
  private OffsetDateTime departure;

  public RouteOptimizationStop() { 
  }

  public RouteOptimizationStop locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier of the location where this stop is taking place.
   * @return locationId
  **/
  @javax.annotation.Nullable
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


  public RouteOptimizationStop approach(RouteOptimizationLeg approach) {
    this.approach = approach;
    return this;
  }

   /**
   * Get approach
   * @return approach
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationLeg getApproach() {
    return approach;
  }


  @JsonProperty(JSON_PROPERTY_APPROACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApproach(RouteOptimizationLeg approach) {
    this.approach = approach;
  }


  public RouteOptimizationStop arrival(OffsetDateTime arrival) {
    this.arrival = arrival;
    return this;
  }

   /**
   * The point in time when the vehicle arrives at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return arrival
  **/
  @javax.annotation.Nullable
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


  public RouteOptimizationStop preparationDuration(Integer preparationDuration) {
    this.preparationDuration = preparationDuration;
    return this;
  }

   /**
   * A period of time [s] that is required between the arrival at the location and the start of the first appointment. The preparation duration is scheduled before tasks can be executed at the stop.
   * minimum: 0
   * @return preparationDuration
  **/
  @javax.annotation.Nullable
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


  public RouteOptimizationStop appointments(List<RouteOptimizationAppointment> appointments) {
    this.appointments = appointments;
    return this;
  }

  public RouteOptimizationStop addAppointmentsItem(RouteOptimizationAppointment appointmentsItem) {
    if (this.appointments == null) {
      this.appointments = new ArrayList<>();
    }
    this.appointments.add(appointmentsItem);
    return this;
  }

   /**
   * A list of appointments that describe the tasks that are scheduled for execution at this stop. Consecutive tasks are grouped into an appointment if they have been assigned to the same time slot. 
   * @return appointments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPOINTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationAppointment> getAppointments() {
    return appointments;
  }


  @JsonProperty(JSON_PROPERTY_APPOINTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppointments(List<RouteOptimizationAppointment> appointments) {
    this.appointments = appointments;
  }


  public RouteOptimizationStop vehicleSlotIndex(Integer vehicleSlotIndex) {
    this.vehicleSlotIndex = vehicleSlotIndex;
    return this;
  }

   /**
   * Describes the index of the vehicle slot this stop is assigned to. If there is no vehicle slot provided for this index, the stop is assigned to an extra vehicle slot. 
   * @return vehicleSlotIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEHICLE_SLOT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVehicleSlotIndex() {
    return vehicleSlotIndex;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_SLOT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleSlotIndex(Integer vehicleSlotIndex) {
    this.vehicleSlotIndex = vehicleSlotIndex;
  }


  public RouteOptimizationStop departure(OffsetDateTime departure) {
    this.departure = departure;
    return this;
  }

   /**
   * The point in time when the vehicle departs at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return departure
  **/
  @javax.annotation.Nullable
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
   * Return true if this Stop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationStop stop = (RouteOptimizationStop) o;
    return Objects.equals(this.locationId, stop.locationId) &&
        Objects.equals(this.approach, stop.approach) &&
        Objects.equals(this.arrival, stop.arrival) &&
        Objects.equals(this.preparationDuration, stop.preparationDuration) &&
        Objects.equals(this.appointments, stop.appointments) &&
        Objects.equals(this.vehicleSlotIndex, stop.vehicleSlotIndex) &&
        Objects.equals(this.departure, stop.departure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, approach, arrival, preparationDuration, appointments, vehicleSlotIndex, departure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationStop {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    approach: ").append(toIndentedString(approach)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    preparationDuration: ").append(toIndentedString(preparationDuration)).append("\n");
    sb.append("    appointments: ").append(toIndentedString(appointments)).append("\n");
    sb.append("    vehicleSlotIndex: ").append(toIndentedString(vehicleSlotIndex)).append("\n");
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

    // add `approach` to the URL query string
    if (getApproach() != null) {
      joiner.add(getApproach().toUrlQueryString(prefix + "approach" + suffix));
    }

    // add `arrival` to the URL query string
    if (getArrival() != null) {
      joiner.add(String.format("%sarrival%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getArrival()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `preparationDuration` to the URL query string
    if (getPreparationDuration() != null) {
      joiner.add(String.format("%spreparationDuration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreparationDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `appointments` to the URL query string
    if (getAppointments() != null) {
      for (int i = 0; i < getAppointments().size(); i++) {
        if (getAppointments().get(i) != null) {
          joiner.add(getAppointments().get(i).toUrlQueryString(String.format("%sappointments%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `vehicleSlotIndex` to the URL query string
    if (getVehicleSlotIndex() != null) {
      joiner.add(String.format("%svehicleSlotIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVehicleSlotIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `departure` to the URL query string
    if (getDeparture() != null) {
      joiner.add(String.format("%sdeparture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeparture()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

