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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationForbiddenTaskSequenceType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constrains tasks belonging a certain category to be executed before tasks belonging to another category on the route.
 */
@JsonPropertyOrder({
  RouteOptimizationForbiddenTaskSequence.JSON_PROPERTY_FIRST_TASK_CATEGORY,
  RouteOptimizationForbiddenTaskSequence.JSON_PROPERTY_TYPE,
  RouteOptimizationForbiddenTaskSequence.JSON_PROPERTY_SECOND_TASK_CATEGORY,
  RouteOptimizationForbiddenTaskSequence.JSON_PROPERTY_VEHICLE_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:41:02.727616123Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationForbiddenTaskSequence {
  public static final String JSON_PROPERTY_FIRST_TASK_CATEGORY = "firstTaskCategory";
  private String firstTaskCategory;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RouteOptimizationForbiddenTaskSequenceType type;

  public static final String JSON_PROPERTY_SECOND_TASK_CATEGORY = "secondTaskCategory";
  private String secondTaskCategory;

  public static final String JSON_PROPERTY_VEHICLE_CATEGORY = "vehicleCategory";
  private String vehicleCategory;

  public RouteOptimizationForbiddenTaskSequence() { 
  }

  public RouteOptimizationForbiddenTaskSequence firstTaskCategory(String firstTaskCategory) {
    this.firstTaskCategory = firstTaskCategory;
    return this;
  }

   /**
   * The category of tasks that cannot be scheduled on the route before a task with the second task category. The constraint will be ignored when no task belongs to this category.
   * @return firstTaskCategory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstTaskCategory() {
    return firstTaskCategory;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstTaskCategory(String firstTaskCategory) {
    this.firstTaskCategory = firstTaskCategory;
  }


  public RouteOptimizationForbiddenTaskSequence type(RouteOptimizationForbiddenTaskSequenceType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationForbiddenTaskSequenceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(RouteOptimizationForbiddenTaskSequenceType type) {
    this.type = type;
  }


  public RouteOptimizationForbiddenTaskSequence secondTaskCategory(String secondTaskCategory) {
    this.secondTaskCategory = secondTaskCategory;
    return this;
  }

   /**
   * The category of the tasks that must not be preceded in the route by tasks belonging to the first task category. The constraint will be ignored when no task belongs to this category.
   * @return secondTaskCategory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECOND_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecondTaskCategory() {
    return secondTaskCategory;
  }


  @JsonProperty(JSON_PROPERTY_SECOND_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecondTaskCategory(String secondTaskCategory) {
    this.secondTaskCategory = secondTaskCategory;
  }


  public RouteOptimizationForbiddenTaskSequence vehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
    return this;
  }

   /**
   * The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category.
   * @return vehicleCategory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVehicleCategory() {
    return vehicleCategory;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
  }


  /**
   * Return true if this ForbiddenTaskSequence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationForbiddenTaskSequence forbiddenTaskSequence = (RouteOptimizationForbiddenTaskSequence) o;
    return Objects.equals(this.firstTaskCategory, forbiddenTaskSequence.firstTaskCategory) &&
        Objects.equals(this.type, forbiddenTaskSequence.type) &&
        Objects.equals(this.secondTaskCategory, forbiddenTaskSequence.secondTaskCategory) &&
        Objects.equals(this.vehicleCategory, forbiddenTaskSequence.vehicleCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstTaskCategory, type, secondTaskCategory, vehicleCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationForbiddenTaskSequence {\n");
    sb.append("    firstTaskCategory: ").append(toIndentedString(firstTaskCategory)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    secondTaskCategory: ").append(toIndentedString(secondTaskCategory)).append("\n");
    sb.append("    vehicleCategory: ").append(toIndentedString(vehicleCategory)).append("\n");
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

    // add `firstTaskCategory` to the URL query string
    if (getFirstTaskCategory() != null) {
      joiner.add(String.format("%sfirstTaskCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstTaskCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secondTaskCategory` to the URL query string
    if (getSecondTaskCategory() != null) {
      joiner.add(String.format("%ssecondTaskCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecondTaskCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `vehicleCategory` to the URL query string
    if (getVehicleCategory() != null) {
      joiner.add(String.format("%svehicleCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVehicleCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

