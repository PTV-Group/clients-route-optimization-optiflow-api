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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationRoutingViolationStrategy;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationTrafficMode;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Specifies how time-distance data must be calculated for routes driven by the vehicle.
 */
@JsonPropertyOrder({
  RouteOptimizationVehicleRouting.JSON_PROPERTY_PROFILE,
  RouteOptimizationVehicleRouting.JSON_PROPERTY_SPEED_FACTOR,
  RouteOptimizationVehicleRouting.JSON_PROPERTY_VIOLATIONS,
  RouteOptimizationVehicleRouting.JSON_PROPERTY_TRAFFIC_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:41:02.727616123Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationVehicleRouting {
  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_SPEED_FACTOR = "speedFactor";
  private Double speedFactor = 1d;

  public static final String JSON_PROPERTY_VIOLATIONS = "violations";
  private RouteOptimizationRoutingViolationStrategy violations = RouteOptimizationRoutingViolationStrategy.ALLOW;

  public static final String JSON_PROPERTY_TRAFFIC_MODE = "trafficMode";
  private RouteOptimizationTrafficMode trafficMode = RouteOptimizationTrafficMode.CONSTANT;

  public RouteOptimizationVehicleRouting() { 
  }

  public RouteOptimizationVehicleRouting profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the predefined profiles &#x60;EUR_PEDESTRIAN&#x60;, &#x60;EUR_BICYCLE&#x60;, &#x60;EUR_CAR&#x60;, &#x60;EUR_VAN&#x60;, &#x60;EUR_TRUCK_7_49T&#x60;, &#x60;EUR_TRUCK_11_99T&#x60;, &#x60;EUR_TRUCK_40T&#x60;, &#x60;EUR_TRAILER_TRUCK&#x60;, &#x60;AUS_LCV_LIGHT_COMMERCIAL&#x60;, &#x60;AUS_MR_MEDIUM_RIGID&#x60;, &#x60;AUS_HR_HEAVY_RIGID&#x60;, &#x60;IMEA_CAR&#x60;, &#x60;IMEA_VAN&#x60;, &#x60;IMEA_TRUCK_7_49T&#x60;, &#x60;IMEA_TRUCK_40T&#x60;, &#x60;USA_1_PICKUP&#x60;, &#x60;USA_5_DELIVERY&#x60;, &#x60;USA_8_SEMITRAILER_5AXLE&#x60;. At most ten profiles may be used within a single optimization. Please note that the upper bound on number of different routing profiles is a technical limit. Check your individual price plan or contract to see which limits apply.
   * @return profile
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfile(String profile) {
    this.profile = profile;
  }


  public RouteOptimizationVehicleRouting speedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
    return this;
  }

   /**
   * An additional factor to apply to the speed of the vehicle. When lower than one, the driving durations of the vehicle will increase, when greater than one, the driving durations of the vehicle will decrease.
   * minimum: 0
   * @return speedFactor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEED_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSpeedFactor() {
    return speedFactor;
  }


  @JsonProperty(JSON_PROPERTY_SPEED_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpeedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
  }


  public RouteOptimizationVehicleRouting violations(RouteOptimizationRoutingViolationStrategy violations) {
    this.violations = violations;
    return this;
  }

   /**
   * Get violations
   * @return violations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationRoutingViolationStrategy getViolations() {
    return violations;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolations(RouteOptimizationRoutingViolationStrategy violations) {
    this.violations = violations;
  }


  public RouteOptimizationVehicleRouting trafficMode(RouteOptimizationTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

   /**
   * Get trafficMode
   * @return trafficMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationTrafficMode getTrafficMode() {
    return trafficMode;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficMode(RouteOptimizationTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
  }


  /**
   * Return true if this VehicleRouting object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationVehicleRouting vehicleRouting = (RouteOptimizationVehicleRouting) o;
    return Objects.equals(this.profile, vehicleRouting.profile) &&
        Objects.equals(this.speedFactor, vehicleRouting.speedFactor) &&
        Objects.equals(this.violations, vehicleRouting.violations) &&
        Objects.equals(this.trafficMode, vehicleRouting.trafficMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, speedFactor, violations, trafficMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationVehicleRouting {\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    speedFactor: ").append(toIndentedString(speedFactor)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    trafficMode: ").append(toIndentedString(trafficMode)).append("\n");
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

    // add `profile` to the URL query string
    if (getProfile() != null) {
      joiner.add(String.format("%sprofile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfile()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `speedFactor` to the URL query string
    if (getSpeedFactor() != null) {
      joiner.add(String.format("%sspeedFactor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpeedFactor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `violations` to the URL query string
    if (getViolations() != null) {
      joiner.add(String.format("%sviolations%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViolations()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trafficMode` to the URL query string
    if (getTrafficMode() != null) {
      joiner.add(String.format("%strafficMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrafficMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

