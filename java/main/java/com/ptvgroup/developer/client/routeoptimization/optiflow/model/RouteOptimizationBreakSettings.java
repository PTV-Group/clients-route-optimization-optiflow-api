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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationDrivingBreakSettings;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationWorkingBreakSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Specifies when the driver of the vehicle must take a break during the route.
 */
@JsonPropertyOrder({
  RouteOptimizationBreakSettings.JSON_PROPERTY_WORKING,
  RouteOptimizationBreakSettings.JSON_PROPERTY_DRIVING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationBreakSettings {
  public static final String JSON_PROPERTY_WORKING = "working";
  private List<RouteOptimizationWorkingBreakSettings> working = new ArrayList<>();

  public static final String JSON_PROPERTY_DRIVING = "driving";
  private List<RouteOptimizationDrivingBreakSettings> driving = new ArrayList<>();

  public RouteOptimizationBreakSettings() { 
  }

  public RouteOptimizationBreakSettings working(List<RouteOptimizationWorkingBreakSettings> working) {
    this.working = working;
    return this;
  }

  public RouteOptimizationBreakSettings addWorkingItem(RouteOptimizationWorkingBreakSettings workingItem) {
    if (this.working == null) {
      this.working = new ArrayList<>();
    }
    this.working.add(workingItem);
    return this;
  }

   /**
   * A list of restrictions that specify how long the driver of the vehicle may work without taking a break. All the time spent during a route is considered working time except for waiting time and break time. 
   * @return working
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationWorkingBreakSettings> getWorking() {
    return working;
  }


  @JsonProperty(JSON_PROPERTY_WORKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorking(List<RouteOptimizationWorkingBreakSettings> working) {
    this.working = working;
  }


  public RouteOptimizationBreakSettings driving(List<RouteOptimizationDrivingBreakSettings> driving) {
    this.driving = driving;
    return this;
  }

  public RouteOptimizationBreakSettings addDrivingItem(RouteOptimizationDrivingBreakSettings drivingItem) {
    if (this.driving == null) {
      this.driving = new ArrayList<>();
    }
    this.driving.add(drivingItem);
    return this;
  }

   /**
   * A list of restrictions that specify how long the driver of the vehicle may drive without taking a break of at least the specified duration.
   * @return driving
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationDrivingBreakSettings> getDriving() {
    return driving;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriving(List<RouteOptimizationDrivingBreakSettings> driving) {
    this.driving = driving;
  }


  /**
   * Return true if this BreakSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationBreakSettings breakSettings = (RouteOptimizationBreakSettings) o;
    return Objects.equals(this.working, breakSettings.working) &&
        Objects.equals(this.driving, breakSettings.driving);
  }

  @Override
  public int hashCode() {
    return Objects.hash(working, driving);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationBreakSettings {\n");
    sb.append("    working: ").append(toIndentedString(working)).append("\n");
    sb.append("    driving: ").append(toIndentedString(driving)).append("\n");
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

    // add `working` to the URL query string
    if (getWorking() != null) {
      for (int i = 0; i < getWorking().size(); i++) {
        if (getWorking().get(i) != null) {
          joiner.add(getWorking().get(i).toUrlQueryString(String.format("%sworking%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `driving` to the URL query string
    if (getDriving() != null) {
      for (int i = 0; i < getDriving().size(); i++) {
        if (getDriving().get(i) != null) {
          joiner.add(getDriving().get(i).toUrlQueryString(String.format("%sdriving%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}
