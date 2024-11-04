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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sequence that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered before an order belonging to a category later in the sequence can be picked up. 
 */
@JsonPropertyOrder({
  RouteOptimizationRespectedOrderSequence.JSON_PROPERTY_ORDER_CATEGORIES,
  RouteOptimizationRespectedOrderSequence.JSON_PROPERTY_VEHICLE_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationRespectedOrderSequence {
  public static final String JSON_PROPERTY_ORDER_CATEGORIES = "orderCategories";
  private Set<String> orderCategories = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VEHICLE_CATEGORY = "vehicleCategory";
  private String vehicleCategory;

  public RouteOptimizationRespectedOrderSequence() { 
  }

  public RouteOptimizationRespectedOrderSequence orderCategories(Set<String> orderCategories) {
    this.orderCategories = orderCategories;
    return this;
  }

  public RouteOptimizationRespectedOrderSequence addOrderCategoriesItem(String orderCategoriesItem) {
    if (this.orderCategories == null) {
      this.orderCategories = new LinkedHashSet<>();
    }
    this.orderCategories.add(orderCategoriesItem);
    return this;
  }

   /**
   * The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored. 
   * @return orderCategories
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getOrderCategories() {
    return orderCategories;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ORDER_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderCategories(Set<String> orderCategories) {
    this.orderCategories = orderCategories;
  }


  public RouteOptimizationRespectedOrderSequence vehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
    return this;
  }

   /**
   * The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category. 
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
   * Return true if this RespectedOrderSequence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationRespectedOrderSequence respectedOrderSequence = (RouteOptimizationRespectedOrderSequence) o;
    return Objects.equals(this.orderCategories, respectedOrderSequence.orderCategories) &&
        Objects.equals(this.vehicleCategory, respectedOrderSequence.vehicleCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderCategories, vehicleCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationRespectedOrderSequence {\n");
    sb.append("    orderCategories: ").append(toIndentedString(orderCategories)).append("\n");
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

    // add `orderCategories` to the URL query string
    if (getOrderCategories() != null) {
      int i = 0;
      for (String _item : getOrderCategories()) {
        joiner.add(String.format("%sorderCategories%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
      i++;
    }

    // add `vehicleCategory` to the URL query string
    if (getVehicleCategory() != null) {
      joiner.add(String.format("%svehicleCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVehicleCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
