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
import com.ptvgroup.developer.client.routeoptimization.model.Load;
import com.ptvgroup.developer.client.routeoptimization.model.RouteConstraints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines constraints on the tasks that can be executed with the vehicle.
 */
@ApiModel(description = "Defines constraints on the tasks that can be executed with the vehicle.")
@JsonPropertyOrder({
  VehicleConstraints.JSON_PROPERTY_MAXIMUM_LOADS,
  VehicleConstraints.JSON_PROPERTY_ROUTE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T13:34:30.390729Z[Etc/UTC]")
public class VehicleConstraints {
  public static final String JSON_PROPERTY_MAXIMUM_LOADS = "maximumLoads";
  private List<Load> maximumLoads = null;

  public static final String JSON_PROPERTY_ROUTE = "route";
  private RouteConstraints route;

  public VehicleConstraints() { 
  }

  public VehicleConstraints maximumLoads(List<Load> maximumLoads) {
    this.maximumLoads = maximumLoads;
    return this;
  }

  public VehicleConstraints addMaximumLoadsItem(Load maximumLoadsItem) {
    if (this.maximumLoads == null) {
      this.maximumLoads = new ArrayList<>();
    }
    this.maximumLoads.add(maximumLoadsItem);
    return this;
  }

   /**
   * A list of load dimensions that describe the capacity of the vehicle. For each dimension specified in this list, the sum of the values of the orders loaded in the vehicle must be lower than or equal to the value of the vehicle. For dimension not specified, the capacity of the vehicle is assumed to be zero. 
   * @return maximumLoads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of load dimensions that describe the capacity of the vehicle. For each dimension specified in this list, the sum of the values of the orders loaded in the vehicle must be lower than or equal to the value of the vehicle. For dimension not specified, the capacity of the vehicle is assumed to be zero. ")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_LOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Load> getMaximumLoads() {
    return maximumLoads;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_LOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumLoads(List<Load> maximumLoads) {
    this.maximumLoads = maximumLoads;
  }


  public VehicleConstraints route(RouteConstraints route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteConstraints getRoute() {
    return route;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoute(RouteConstraints route) {
    this.route = route;
  }


  /**
   * Return true if this VehicleConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleConstraints vehicleConstraints = (VehicleConstraints) o;
    return Objects.equals(this.maximumLoads, vehicleConstraints.maximumLoads) &&
        Objects.equals(this.route, vehicleConstraints.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumLoads, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleConstraints {\n");
    sb.append("    maximumLoads: ").append(toIndentedString(maximumLoads)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

