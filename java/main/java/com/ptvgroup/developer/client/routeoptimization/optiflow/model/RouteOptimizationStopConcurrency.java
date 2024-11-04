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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleSlot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * If stop concurrency is specified, each stop at the location must be assigned to a vehicle slot. Two stops may be assigned to the same vehicle slot if the duration between the end of the last appointment of the first stop and the start of the first appointment of the other stop is at least the specified minimum buffer duration, in which case they are not considered concurrent stops. Assigning at least one stop to a slot incurs a cost, encouraging reduction of the maximum number of concurrent stops at the location. If there is no minimum buffer duration, stops where the first appointment starts at the same time as the last ends do not need to be assigned to a vehicle slot. When omitted, stops at this location will not be assigned to a vehicle slot. 
 */
@JsonPropertyOrder({
  RouteOptimizationStopConcurrency.JSON_PROPERTY_VEHICLE_SLOTS,
  RouteOptimizationStopConcurrency.JSON_PROPERTY_VIOLATION_COST_PER_EXTRA_SLOT,
  RouteOptimizationStopConcurrency.JSON_PROPERTY_MINIMUM_BUFFER_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationStopConcurrency {
  public static final String JSON_PROPERTY_VEHICLE_SLOTS = "vehicleSlots";
  private List<RouteOptimizationVehicleSlot> vehicleSlots = new ArrayList<>();

  public static final String JSON_PROPERTY_VIOLATION_COST_PER_EXTRA_SLOT = "violationCostPerExtraSlot";
  private Double violationCostPerExtraSlot;

  public static final String JSON_PROPERTY_MINIMUM_BUFFER_DURATION = "minimumBufferDuration";
  private Integer minimumBufferDuration = 0;

  public RouteOptimizationStopConcurrency() { 
  }

  public RouteOptimizationStopConcurrency vehicleSlots(List<RouteOptimizationVehicleSlot> vehicleSlots) {
    this.vehicleSlots = vehicleSlots;
    return this;
  }

  public RouteOptimizationStopConcurrency addVehicleSlotsItem(RouteOptimizationVehicleSlot vehicleSlotsItem) {
    if (this.vehicleSlots == null) {
      this.vehicleSlots = new ArrayList<>();
    }
    this.vehicleSlots.add(vehicleSlotsItem);
    return this;
  }

   /**
   * A list of available vehicle slots.
   * @return vehicleSlots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEHICLE_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationVehicleSlot> getVehicleSlots() {
    return vehicleSlots;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleSlots(List<RouteOptimizationVehicleSlot> vehicleSlots) {
    this.vehicleSlots = vehicleSlots;
  }


  public RouteOptimizationStopConcurrency violationCostPerExtraSlot(Double violationCostPerExtraSlot) {
    this.violationCostPerExtraSlot = violationCostPerExtraSlot;
    return this;
  }

   /**
   * The additional cost incurred for using an extra vehicle slot beyond the available ones. This must be greater than or equal to the cost of each vehicle slot. 
   * minimum: 0
   * @return violationCostPerExtraSlot
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIOLATION_COST_PER_EXTRA_SLOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getViolationCostPerExtraSlot() {
    return violationCostPerExtraSlot;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION_COST_PER_EXTRA_SLOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolationCostPerExtraSlot(Double violationCostPerExtraSlot) {
    this.violationCostPerExtraSlot = violationCostPerExtraSlot;
  }


  public RouteOptimizationStopConcurrency minimumBufferDuration(Integer minimumBufferDuration) {
    this.minimumBufferDuration = minimumBufferDuration;
    return this;
  }

   /**
   * The minimum duration [s] between the end of the last appointment of a stop and the start of the first appointment of another stop assigned to the same vehicle slot.
   * minimum: 0
   * @return minimumBufferDuration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_BUFFER_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumBufferDuration() {
    return minimumBufferDuration;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_BUFFER_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumBufferDuration(Integer minimumBufferDuration) {
    this.minimumBufferDuration = minimumBufferDuration;
  }


  /**
   * Return true if this StopConcurrency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationStopConcurrency stopConcurrency = (RouteOptimizationStopConcurrency) o;
    return Objects.equals(this.vehicleSlots, stopConcurrency.vehicleSlots) &&
        Objects.equals(this.violationCostPerExtraSlot, stopConcurrency.violationCostPerExtraSlot) &&
        Objects.equals(this.minimumBufferDuration, stopConcurrency.minimumBufferDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleSlots, violationCostPerExtraSlot, minimumBufferDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationStopConcurrency {\n");
    sb.append("    vehicleSlots: ").append(toIndentedString(vehicleSlots)).append("\n");
    sb.append("    violationCostPerExtraSlot: ").append(toIndentedString(violationCostPerExtraSlot)).append("\n");
    sb.append("    minimumBufferDuration: ").append(toIndentedString(minimumBufferDuration)).append("\n");
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

    // add `vehicleSlots` to the URL query string
    if (getVehicleSlots() != null) {
      for (int i = 0; i < getVehicleSlots().size(); i++) {
        if (getVehicleSlots().get(i) != null) {
          joiner.add(getVehicleSlots().get(i).toUrlQueryString(String.format("%svehicleSlots%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `violationCostPerExtraSlot` to the URL query string
    if (getViolationCostPerExtraSlot() != null) {
      joiner.add(String.format("%sviolationCostPerExtraSlot%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViolationCostPerExtraSlot()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `minimumBufferDuration` to the URL query string
    if (getMinimumBufferDuration() != null) {
      joiner.add(String.format("%sminimumBufferDuration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinimumBufferDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

