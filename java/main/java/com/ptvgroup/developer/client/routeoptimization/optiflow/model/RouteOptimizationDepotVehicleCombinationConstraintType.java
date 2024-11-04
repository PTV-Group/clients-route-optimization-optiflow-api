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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes which combination of depots and vehicles have to be respected or excluded. * DEPOT_REQUIRES_VEHICLE - A depot from the given depot category can only be visited by a vehicle from the given vehicle category. * VEHICLE_REQUIRES_DEPOT - A vehicle from the given vehicle category can only visit depots from the given depot category.  * FORBIDDEN_COMBINATION - A depot from the given depot category can not be visited by a vehicle from the given vehicle category. 
 */
public enum RouteOptimizationDepotVehicleCombinationConstraintType {
  
  DEPOT_REQUIRES_VEHICLE("DEPOT_REQUIRES_VEHICLE"),
  
  VEHICLE_REQUIRES_DEPOT("VEHICLE_REQUIRES_DEPOT"),
  
  FORBIDDEN_COMBINATION("FORBIDDEN_COMBINATION");

  private String value;

  RouteOptimizationDepotVehicleCombinationConstraintType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RouteOptimizationDepotVehicleCombinationConstraintType fromValue(String value) {
    for (RouteOptimizationDepotVehicleCombinationConstraintType b : RouteOptimizationDepotVehicleCombinationConstraintType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}
