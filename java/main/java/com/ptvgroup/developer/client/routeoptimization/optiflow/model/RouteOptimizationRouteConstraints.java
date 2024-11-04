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
 * Describes constraints on the route that may be assigned to the vehicle.
 */
@JsonPropertyOrder({
  RouteOptimizationRouteConstraints.JSON_PROPERTY_MAXIMUM_DURATION,
  RouteOptimizationRouteConstraints.JSON_PROPERTY_MAXIMUM_DISTANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationRouteConstraints {
  public static final String JSON_PROPERTY_MAXIMUM_DURATION = "maximumDuration";
  private Integer maximumDuration;

  public static final String JSON_PROPERTY_MAXIMUM_DISTANCE = "maximumDistance";
  private Integer maximumDistance;

  public RouteOptimizationRouteConstraints() { 
  }

  public RouteOptimizationRouteConstraints maximumDuration(Integer maximumDuration) {
    this.maximumDuration = maximumDuration;
    return this;
  }

   /**
   * Restricts the maximum duration [s] of the route assigned to the vehicle.
   * minimum: 0
   * @return maximumDuration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDuration() {
    return maximumDuration;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDuration(Integer maximumDuration) {
    this.maximumDuration = maximumDuration;
  }


  public RouteOptimizationRouteConstraints maximumDistance(Integer maximumDistance) {
    this.maximumDistance = maximumDistance;
    return this;
  }

   /**
   * Restricts the maximum distance [m] travelled on the route assigned to the vehicle.
   * minimum: 1
   * @return maximumDistance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDistance() {
    return maximumDistance;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDistance(Integer maximumDistance) {
    this.maximumDistance = maximumDistance;
  }


  /**
   * Return true if this RouteConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationRouteConstraints routeConstraints = (RouteOptimizationRouteConstraints) o;
    return Objects.equals(this.maximumDuration, routeConstraints.maximumDuration) &&
        Objects.equals(this.maximumDistance, routeConstraints.maximumDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumDuration, maximumDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationRouteConstraints {\n");
    sb.append("    maximumDuration: ").append(toIndentedString(maximumDuration)).append("\n");
    sb.append("    maximumDistance: ").append(toIndentedString(maximumDistance)).append("\n");
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

    // add `maximumDuration` to the URL query string
    if (getMaximumDuration() != null) {
      joiner.add(String.format("%smaximumDuration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximumDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maximumDistance` to the URL query string
    if (getMaximumDistance() != null) {
      joiner.add(String.format("%smaximumDistance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximumDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

