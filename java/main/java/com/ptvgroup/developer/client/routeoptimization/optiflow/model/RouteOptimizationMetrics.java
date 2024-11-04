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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Metrics providing insights into the current result of the optimization. These will be provided if the status of the optimization is *RUNNING*, *STOPPING* or *SUCCEEDED*. 
 */
@JsonPropertyOrder({
  RouteOptimizationMetrics.JSON_PROPERTY_NUMBER_OF_UNSCHEDULED_ORDERS,
  RouteOptimizationMetrics.JSON_PROPERTY_NUMBER_OF_ROUTES,
  RouteOptimizationMetrics.JSON_PROPERTY_TOTAL_COST,
  RouteOptimizationMetrics.JSON_PROPERTY_TOTAL_DISTANCE,
  RouteOptimizationMetrics.JSON_PROPERTY_TOTAL_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationMetrics {
  public static final String JSON_PROPERTY_NUMBER_OF_UNSCHEDULED_ORDERS = "numberOfUnscheduledOrders";
  private Integer numberOfUnscheduledOrders;

  public static final String JSON_PROPERTY_NUMBER_OF_ROUTES = "numberOfRoutes";
  private Integer numberOfRoutes;

  public static final String JSON_PROPERTY_TOTAL_COST = "totalCost";
  private Double totalCost;

  public static final String JSON_PROPERTY_TOTAL_DISTANCE = "totalDistance";
  private Integer totalDistance;

  public static final String JSON_PROPERTY_TOTAL_DURATION = "totalDuration";
  private Integer totalDuration;

  public RouteOptimizationMetrics() { 
  }

  public RouteOptimizationMetrics numberOfUnscheduledOrders(Integer numberOfUnscheduledOrders) {
    this.numberOfUnscheduledOrders = numberOfUnscheduledOrders;
    return this;
  }

   /**
   * The number of orders that are not planned by the optimization.
   * minimum: 0
   * @return numberOfUnscheduledOrders
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_UNSCHEDULED_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfUnscheduledOrders() {
    return numberOfUnscheduledOrders;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_UNSCHEDULED_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfUnscheduledOrders(Integer numberOfUnscheduledOrders) {
    this.numberOfUnscheduledOrders = numberOfUnscheduledOrders;
  }


  public RouteOptimizationMetrics numberOfRoutes(Integer numberOfRoutes) {
    this.numberOfRoutes = numberOfRoutes;
    return this;
  }

   /**
   * The number of routes that where scheduled by the optimization.
   * minimum: 0
   * @return numberOfRoutes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfRoutes() {
    return numberOfRoutes;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfRoutes(Integer numberOfRoutes) {
    this.numberOfRoutes = numberOfRoutes;
  }


  public RouteOptimizationMetrics totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders. 
   * @return totalCost
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTotalCost() {
    return totalCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }


  public RouteOptimizationMetrics totalDistance(Integer totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

   /**
   * The sum of the distances [m] of the scheduled routes.
   * minimum: 0
   * @return totalDistance
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalDistance() {
    return totalDistance;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalDistance(Integer totalDistance) {
    this.totalDistance = totalDistance;
  }


  public RouteOptimizationMetrics totalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * The sum of the durations [s] of the scheduled routes.
   * minimum: 0
   * @return totalDuration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalDuration() {
    return totalDuration;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalDuration(Integer totalDuration) {
    this.totalDuration = totalDuration;
  }


  /**
   * Return true if this Metrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationMetrics metrics = (RouteOptimizationMetrics) o;
    return Objects.equals(this.numberOfUnscheduledOrders, metrics.numberOfUnscheduledOrders) &&
        Objects.equals(this.numberOfRoutes, metrics.numberOfRoutes) &&
        Objects.equals(this.totalCost, metrics.totalCost) &&
        Objects.equals(this.totalDistance, metrics.totalDistance) &&
        Objects.equals(this.totalDuration, metrics.totalDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfUnscheduledOrders, numberOfRoutes, totalCost, totalDistance, totalDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationMetrics {\n");
    sb.append("    numberOfUnscheduledOrders: ").append(toIndentedString(numberOfUnscheduledOrders)).append("\n");
    sb.append("    numberOfRoutes: ").append(toIndentedString(numberOfRoutes)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    totalDistance: ").append(toIndentedString(totalDistance)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
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

    // add `numberOfUnscheduledOrders` to the URL query string
    if (getNumberOfUnscheduledOrders() != null) {
      joiner.add(String.format("%snumberOfUnscheduledOrders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfUnscheduledOrders()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `numberOfRoutes` to the URL query string
    if (getNumberOfRoutes() != null) {
      joiner.add(String.format("%snumberOfRoutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfRoutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalCost` to the URL query string
    if (getTotalCost() != null) {
      joiner.add(String.format("%stotalCost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalDistance` to the URL query string
    if (getTotalDistance() != null) {
      joiner.add(String.format("%stotalDistance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalDuration` to the URL query string
    if (getTotalDuration() != null) {
      joiner.add(String.format("%stotalDuration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
