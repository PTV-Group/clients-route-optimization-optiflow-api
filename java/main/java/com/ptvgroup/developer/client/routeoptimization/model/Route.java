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
import com.ptvgroup.developer.client.routeoptimization.model.RouteEnd;
import com.ptvgroup.developer.client.routeoptimization.model.RouteMetrics;
import com.ptvgroup.developer.client.routeoptimization.model.RouteStart;
import com.ptvgroup.developer.client.routeoptimization.model.Stop;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A route is a sequence of tasks assigned to a vehicle. 
 */
@ApiModel(description = "A route is a sequence of tasks assigned to a vehicle. ")
@JsonPropertyOrder({
  Route.JSON_PROPERTY_VEHICLE_ID,
  Route.JSON_PROPERTY_START,
  Route.JSON_PROPERTY_STOPS,
  Route.JSON_PROPERTY_END,
  Route.JSON_PROPERTY_METRICS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class Route {
  public static final String JSON_PROPERTY_VEHICLE_ID = "vehicleId";
  private String vehicleId;

  public static final String JSON_PROPERTY_START = "start";
  private RouteStart start;

  public static final String JSON_PROPERTY_STOPS = "stops";
  private List<Stop> stops = null;

  public static final String JSON_PROPERTY_END = "end";
  private RouteEnd end;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private RouteMetrics metrics;

  public Route() { 
  }

  public Route vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * The unique identifier of the vehicle assigned to the route.
   * @return vehicleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VEHICLE-123", value = "The unique identifier of the vehicle assigned to the route.")
  @JsonProperty(JSON_PROPERTY_VEHICLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVehicleId() {
    return vehicleId;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }


  public Route start(RouteStart start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteStart getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(RouteStart start) {
    this.start = start;
  }


  public Route stops(List<Stop> stops) {
    this.stops = stops;
    return this;
  }

  public Route addStopsItem(Stop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * The list of stops scheduled on the route. A stop describes the visit of a location on a route where one or more tasks are scheduled. Its approach describes how to reach the location from the previous location visited on the route. Consecutive tasks are grouped to an appointment if they are assigned to the same time slot. Consecutive appointments are grouped as a stop if they are scheduled at the same location. 
   * @return stops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of stops scheduled on the route. A stop describes the visit of a location on a route where one or more tasks are scheduled. Its approach describes how to reach the location from the previous location visited on the route. Consecutive tasks are grouped to an appointment if they are assigned to the same time slot. Consecutive appointments are grouped as a stop if they are scheduled at the same location. ")
  @JsonProperty(JSON_PROPERTY_STOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Stop> getStops() {
    return stops;
  }


  @JsonProperty(JSON_PROPERTY_STOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStops(List<Stop> stops) {
    this.stops = stops;
  }


  public Route end(RouteEnd end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteEnd getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(RouteEnd end) {
    this.end = end;
  }


  public Route metrics(RouteMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteMetrics getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(RouteMetrics metrics) {
    this.metrics = metrics;
  }


  /**
   * Return true if this Route object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.vehicleId, route.vehicleId) &&
        Objects.equals(this.start, route.start) &&
        Objects.equals(this.stops, route.stops) &&
        Objects.equals(this.end, route.end) &&
        Objects.equals(this.metrics, route.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, start, stops, end, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

