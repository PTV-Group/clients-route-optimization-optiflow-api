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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes the current status of the optimization. * PREPARING - The optimization has been accepted. Time-distance data is being calculated and the data is being prepared for optimization. * RUNNING - The routes are being optimized. Metrics will provide insights into the current result of the optimization. * STOPPING - A request has been received to stop the optimization. The optimization will stop as soon as possible. * FAILED - The optimization has failed. An error will be provided to clarify what went wrong. * SUCCEEDED - The optimization has completed successfully. 
 */
public enum OptimizationStatus {
  
  PREPARING("PREPARING"),
  
  RUNNING("RUNNING"),
  
  STOPPING("STOPPING"),
  
  FAILED("FAILED"),
  
  SUCCEEDED("SUCCEEDED");

  private String value;

  OptimizationStatus(String value) {
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
  public static OptimizationStatus fromValue(String value) {
    for (OptimizationStatus b : OptimizationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

