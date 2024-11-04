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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationDepotVehicleCombinationConstraint;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOrderCompartmentCombinationConstraint;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOrderVehicleCombinationConstraint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes constraints on combinations of orders, vehicles and depots.
 */
@JsonPropertyOrder({
  RouteOptimizationCombinationConstraints.JSON_PROPERTY_ORDER_COMPARTMENT,
  RouteOptimizationCombinationConstraints.JSON_PROPERTY_ORDER_VEHICLE,
  RouteOptimizationCombinationConstraints.JSON_PROPERTY_DEPOT_VEHICLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationCombinationConstraints {
  public static final String JSON_PROPERTY_ORDER_COMPARTMENT = "orderCompartment";
  private List<RouteOptimizationOrderCompartmentCombinationConstraint> orderCompartment = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_VEHICLE = "orderVehicle";
  private List<RouteOptimizationOrderVehicleCombinationConstraint> orderVehicle = new ArrayList<>();

  public static final String JSON_PROPERTY_DEPOT_VEHICLE = "depotVehicle";
  private List<RouteOptimizationDepotVehicleCombinationConstraint> depotVehicle = new ArrayList<>();

  public RouteOptimizationCombinationConstraints() { 
  }

  public RouteOptimizationCombinationConstraints orderCompartment(List<RouteOptimizationOrderCompartmentCombinationConstraint> orderCompartment) {
    this.orderCompartment = orderCompartment;
    return this;
  }

  public RouteOptimizationCombinationConstraints addOrderCompartmentItem(RouteOptimizationOrderCompartmentCombinationConstraint orderCompartmentItem) {
    if (this.orderCompartment == null) {
      this.orderCompartment = new ArrayList<>();
    }
    this.orderCompartment.add(orderCompartmentItem);
    return this;
  }

   /**
   * A list of constraints on combinations of orders and compartments.
   * @return orderCompartment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_COMPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationOrderCompartmentCombinationConstraint> getOrderCompartment() {
    return orderCompartment;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_COMPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderCompartment(List<RouteOptimizationOrderCompartmentCombinationConstraint> orderCompartment) {
    this.orderCompartment = orderCompartment;
  }


  public RouteOptimizationCombinationConstraints orderVehicle(List<RouteOptimizationOrderVehicleCombinationConstraint> orderVehicle) {
    this.orderVehicle = orderVehicle;
    return this;
  }

  public RouteOptimizationCombinationConstraints addOrderVehicleItem(RouteOptimizationOrderVehicleCombinationConstraint orderVehicleItem) {
    if (this.orderVehicle == null) {
      this.orderVehicle = new ArrayList<>();
    }
    this.orderVehicle.add(orderVehicleItem);
    return this;
  }

   /**
   * A list of constraints on combinations of orders and vehicles.
   * @return orderVehicle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationOrderVehicleCombinationConstraint> getOrderVehicle() {
    return orderVehicle;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderVehicle(List<RouteOptimizationOrderVehicleCombinationConstraint> orderVehicle) {
    this.orderVehicle = orderVehicle;
  }


  public RouteOptimizationCombinationConstraints depotVehicle(List<RouteOptimizationDepotVehicleCombinationConstraint> depotVehicle) {
    this.depotVehicle = depotVehicle;
    return this;
  }

  public RouteOptimizationCombinationConstraints addDepotVehicleItem(RouteOptimizationDepotVehicleCombinationConstraint depotVehicleItem) {
    if (this.depotVehicle == null) {
      this.depotVehicle = new ArrayList<>();
    }
    this.depotVehicle.add(depotVehicleItem);
    return this;
  }

   /**
   * A list of constraints on combinations of depots and vehicles.
   * @return depotVehicle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPOT_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationDepotVehicleCombinationConstraint> getDepotVehicle() {
    return depotVehicle;
  }


  @JsonProperty(JSON_PROPERTY_DEPOT_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepotVehicle(List<RouteOptimizationDepotVehicleCombinationConstraint> depotVehicle) {
    this.depotVehicle = depotVehicle;
  }


  /**
   * Return true if this CombinationConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationCombinationConstraints combinationConstraints = (RouteOptimizationCombinationConstraints) o;
    return Objects.equals(this.orderCompartment, combinationConstraints.orderCompartment) &&
        Objects.equals(this.orderVehicle, combinationConstraints.orderVehicle) &&
        Objects.equals(this.depotVehicle, combinationConstraints.depotVehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderCompartment, orderVehicle, depotVehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationCombinationConstraints {\n");
    sb.append("    orderCompartment: ").append(toIndentedString(orderCompartment)).append("\n");
    sb.append("    orderVehicle: ").append(toIndentedString(orderVehicle)).append("\n");
    sb.append("    depotVehicle: ").append(toIndentedString(depotVehicle)).append("\n");
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

    // add `orderCompartment` to the URL query string
    if (getOrderCompartment() != null) {
      for (int i = 0; i < getOrderCompartment().size(); i++) {
        if (getOrderCompartment().get(i) != null) {
          joiner.add(getOrderCompartment().get(i).toUrlQueryString(String.format("%sorderCompartment%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `orderVehicle` to the URL query string
    if (getOrderVehicle() != null) {
      for (int i = 0; i < getOrderVehicle().size(); i++) {
        if (getOrderVehicle().get(i) != null) {
          joiner.add(getOrderVehicle().get(i).toUrlQueryString(String.format("%sorderVehicle%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `depotVehicle` to the URL query string
    if (getDepotVehicle() != null) {
      for (int i = 0; i < getDepotVehicle().size(); i++) {
        if (getDepotVehicle().get(i) != null) {
          joiner.add(getDepotVehicle().get(i).toUrlQueryString(String.format("%sdepotVehicle%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}
