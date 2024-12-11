/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
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
 * Defines the costs for using the vehicle to execute tasks.
 */
@JsonPropertyOrder({
  RouteOptimizationVehicleCosts.JSON_PROPERTY_PER_HOUR,
  RouteOptimizationVehicleCosts.JSON_PROPERTY_PER_KILOMETER,
  RouteOptimizationVehicleCosts.JSON_PROPERTY_FIXED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:41:02.727616123Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationVehicleCosts {
  public static final String JSON_PROPERTY_PER_HOUR = "perHour";
  private Double perHour;

  public static final String JSON_PROPERTY_PER_KILOMETER = "perKilometer";
  private Double perKilometer;

  public static final String JSON_PROPERTY_FIXED = "fixed";
  private Double fixed = 0d;

  public RouteOptimizationVehicleCosts() { 
  }

  public RouteOptimizationVehicleCosts perHour(Double perHour) {
    this.perHour = perHour;
    return this;
  }

   /**
   * Specifies the cost for every hour the vehicle is used.
   * minimum: 0
   * @return perHour
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getPerHour() {
    return perHour;
  }


  @JsonProperty(JSON_PROPERTY_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerHour(Double perHour) {
    this.perHour = perHour;
  }


  public RouteOptimizationVehicleCosts perKilometer(Double perKilometer) {
    this.perKilometer = perKilometer;
    return this;
  }

   /**
   * Specifies the cost for every kilometer driven with the vehicle.
   * minimum: 0
   * @return perKilometer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PER_KILOMETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getPerKilometer() {
    return perKilometer;
  }


  @JsonProperty(JSON_PROPERTY_PER_KILOMETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerKilometer(Double perKilometer) {
    this.perKilometer = perKilometer;
  }


  public RouteOptimizationVehicleCosts fixed(Double fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Specifies the fixed cost for assigning a route to the vehicle.
   * minimum: 0
   * @return fixed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFixed() {
    return fixed;
  }


  @JsonProperty(JSON_PROPERTY_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixed(Double fixed) {
    this.fixed = fixed;
  }


  /**
   * Return true if this VehicleCosts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationVehicleCosts vehicleCosts = (RouteOptimizationVehicleCosts) o;
    return Objects.equals(this.perHour, vehicleCosts.perHour) &&
        Objects.equals(this.perKilometer, vehicleCosts.perKilometer) &&
        Objects.equals(this.fixed, vehicleCosts.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perHour, perKilometer, fixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationVehicleCosts {\n");
    sb.append("    perHour: ").append(toIndentedString(perHour)).append("\n");
    sb.append("    perKilometer: ").append(toIndentedString(perKilometer)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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

    // add `perHour` to the URL query string
    if (getPerHour() != null) {
      joiner.add(String.format("%sperHour%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPerHour()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `perKilometer` to the URL query string
    if (getPerKilometer() != null) {
      joiner.add(String.format("%sperKilometer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPerKilometer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fixed` to the URL query string
    if (getFixed() != null) {
      joiner.add(String.format("%sfixed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFixed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

