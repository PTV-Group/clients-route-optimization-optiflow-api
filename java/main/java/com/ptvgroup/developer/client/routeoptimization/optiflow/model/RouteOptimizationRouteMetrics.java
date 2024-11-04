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
 * Metrics providing insights into the route.
 */
@JsonPropertyOrder({
  RouteOptimizationRouteMetrics.JSON_PROPERTY_NUMBER_OF_STOPS,
  RouteOptimizationRouteMetrics.JSON_PROPERTY_COST,
  RouteOptimizationRouteMetrics.JSON_PROPERTY_DISTANCE,
  RouteOptimizationRouteMetrics.JSON_PROPERTY_DURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationRouteMetrics {
  public static final String JSON_PROPERTY_NUMBER_OF_STOPS = "numberOfStops";
  private Integer numberOfStops;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public RouteOptimizationRouteMetrics() { 
  }

  public RouteOptimizationRouteMetrics numberOfStops(Integer numberOfStops) {
    this.numberOfStops = numberOfStops;
    return this;
  }

   /**
   * The number of stops in the route. A stop is a visit at a location where one or more tasks are executed. 
   * minimum: 0
   * @return numberOfStops
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfStops() {
    return numberOfStops;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfStops(Integer numberOfStops) {
    this.numberOfStops = numberOfStops;
  }


  public RouteOptimizationRouteMetrics cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost of the route. This includes the cost per hour, cost per kilometer and fixed cost of the vehicle. 
   * @return cost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public RouteOptimizationRouteMetrics distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance [m] travelled on the route.
   * minimum: 0
   * @return distance
  **/
  @javax.annotation.Nullable
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


  public RouteOptimizationRouteMetrics duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration [s] of the route from start to end.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
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
   * Return true if this RouteMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationRouteMetrics routeMetrics = (RouteOptimizationRouteMetrics) o;
    return Objects.equals(this.numberOfStops, routeMetrics.numberOfStops) &&
        Objects.equals(this.cost, routeMetrics.cost) &&
        Objects.equals(this.distance, routeMetrics.distance) &&
        Objects.equals(this.duration, routeMetrics.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfStops, cost, distance, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationRouteMetrics {\n");
    sb.append("    numberOfStops: ").append(toIndentedString(numberOfStops)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

    // add `numberOfStops` to the URL query string
    if (getNumberOfStops() != null) {
      joiner.add(String.format("%snumberOfStops%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfStops()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cost` to the URL query string
    if (getCost() != null) {
      joiner.add(String.format("%scost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `distance` to the URL query string
    if (getDistance() != null) {
      joiner.add(String.format("%sdistance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format("%sduration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
