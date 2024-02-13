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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes which combinations of orders and vehicles have to be respected or excluded. * ORDER_REQUIRES_VEHICLE - An order from the given order category can only be transported by a vehicle from the given vehicle category. * VEHICLE_REQUIRES_ORDER - A vehicle from the given vehicle category can only transport orders from the given order category.  * FORBIDDEN_COMBINATION - An order from the given order category can not be transported by a vehicle from the given vehicle category. 
 */
public enum OrderVehicleCombinationConstraintType {
  
  ORDER_REQUIRES_VEHICLE("ORDER_REQUIRES_VEHICLE"),
  
  VEHICLE_REQUIRES_ORDER("VEHICLE_REQUIRES_ORDER"),
  
  FORBIDDEN_COMBINATION("FORBIDDEN_COMBINATION");

  private String value;

  OrderVehicleCombinationConstraintType(String value) {
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
  public static OrderVehicleCombinationConstraintType fromValue(String value) {
    for (OrderVehicleCombinationConstraintType b : OrderVehicleCombinationConstraintType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

