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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOrderVehicleCombinationConstraintType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A constraint on the combination of orders and vehicles belonging to a certain category.
 */
@JsonPropertyOrder({
  RouteOptimizationOrderVehicleCombinationConstraint.JSON_PROPERTY_TYPE,
  RouteOptimizationOrderVehicleCombinationConstraint.JSON_PROPERTY_ORDER_CATEGORY,
  RouteOptimizationOrderVehicleCombinationConstraint.JSON_PROPERTY_VEHICLE_CATEGORY,
  RouteOptimizationOrderVehicleCombinationConstraint.JSON_PROPERTY_VIOLATION_COST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationOrderVehicleCombinationConstraint {
  public static final String JSON_PROPERTY_TYPE = "type";
  private RouteOptimizationOrderVehicleCombinationConstraintType type;

  public static final String JSON_PROPERTY_ORDER_CATEGORY = "orderCategory";
  private String orderCategory;

  public static final String JSON_PROPERTY_VEHICLE_CATEGORY = "vehicleCategory";
  private String vehicleCategory;

  public static final String JSON_PROPERTY_VIOLATION_COST = "violationCost";
  private Double violationCost;

  public RouteOptimizationOrderVehicleCombinationConstraint() { 
  }

  public RouteOptimizationOrderVehicleCombinationConstraint type(RouteOptimizationOrderVehicleCombinationConstraintType type) {
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

  public RouteOptimizationOrderVehicleCombinationConstraintType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(RouteOptimizationOrderVehicleCombinationConstraintType type) {
    this.type = type;
  }


  public RouteOptimizationOrderVehicleCombinationConstraint orderCategory(String orderCategory) {
    this.orderCategory = orderCategory;
    return this;
  }

   /**
   * The category of orders to which the constraint applies. The constraint will be ignored if no order belongs to this category. 
   * @return orderCategory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderCategory() {
    return orderCategory;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderCategory(String orderCategory) {
    this.orderCategory = orderCategory;
  }


  public RouteOptimizationOrderVehicleCombinationConstraint vehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
    return this;
  }

   /**
   * The category of vehicles to which the constraint applies. The constraint will be ignored if no vehicle belongs to this category. 
   * @return vehicleCategory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVehicleCategory() {
    return vehicleCategory;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
  }


  public RouteOptimizationOrderVehicleCombinationConstraint violationCost(Double violationCost) {
    this.violationCost = violationCost;
    return this;
  }

   /**
   * The cost incurred when an order-vehicle combination does not meet this constraint. When omitted, all order-vehicle combinations must satisfy this constraint. 
   * minimum: 0
   * @return violationCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getViolationCost() {
    return violationCost;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolationCost(Double violationCost) {
    this.violationCost = violationCost;
  }


  /**
   * Return true if this OrderVehicleCombinationConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationOrderVehicleCombinationConstraint orderVehicleCombinationConstraint = (RouteOptimizationOrderVehicleCombinationConstraint) o;
    return Objects.equals(this.type, orderVehicleCombinationConstraint.type) &&
        Objects.equals(this.orderCategory, orderVehicleCombinationConstraint.orderCategory) &&
        Objects.equals(this.vehicleCategory, orderVehicleCombinationConstraint.vehicleCategory) &&
        Objects.equals(this.violationCost, orderVehicleCombinationConstraint.violationCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, orderCategory, vehicleCategory, violationCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationOrderVehicleCombinationConstraint {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderCategory: ").append(toIndentedString(orderCategory)).append("\n");
    sb.append("    vehicleCategory: ").append(toIndentedString(vehicleCategory)).append("\n");
    sb.append("    violationCost: ").append(toIndentedString(violationCost)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `orderCategory` to the URL query string
    if (getOrderCategory() != null) {
      joiner.add(String.format("%sorderCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `vehicleCategory` to the URL query string
    if (getVehicleCategory() != null) {
      joiner.add(String.format("%svehicleCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVehicleCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `violationCost` to the URL query string
    if (getViolationCost() != null) {
      joiner.add(String.format("%sviolationCost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViolationCost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

