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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationDeliveryOrder;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationPickupDeliveryOrder;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationPickupOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of orders that should be scheduled by the optimization on the routes. When providing pickup-delivery orders, it is not possible to provide other order types. If pickup orders or delivery orders are provided, at least one depot must be provided where the pickup orders can be delivered to or the delivery orders can be picked up from. The unique identifiers of the orders must by unique across the three types. Orders of the same type always satisfy the \&quot;last in, first out\&quot; (LIFO) principle,with respect to each other. When an order is picked up while another order of the same type is already loaded, the former should be delivered before the latter. Orders of different types do not have to satisfy the LIFO principle. For example, if a pickup order is picked up while a delivery order is loaded, the delivery order can be delivered before the pickup order is delivered at depot.
 */
@JsonPropertyOrder({
  RouteOptimizationOrders.JSON_PROPERTY_PICKUPS,
  RouteOptimizationOrders.JSON_PROPERTY_DELIVERIES,
  RouteOptimizationOrders.JSON_PROPERTY_PICKUP_DELIVERIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:41:02.727616123Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationOrders {
  public static final String JSON_PROPERTY_PICKUPS = "pickups";
  private List<RouteOptimizationPickupOrder> pickups = new ArrayList<>();

  public static final String JSON_PROPERTY_DELIVERIES = "deliveries";
  private List<RouteOptimizationDeliveryOrder> deliveries = new ArrayList<>();

  public static final String JSON_PROPERTY_PICKUP_DELIVERIES = "pickupDeliveries";
  private List<RouteOptimizationPickupDeliveryOrder> pickupDeliveries = new ArrayList<>();

  public RouteOptimizationOrders() { 
  }

  public RouteOptimizationOrders pickups(List<RouteOptimizationPickupOrder> pickups) {
    this.pickups = pickups;
    return this;
  }

  public RouteOptimizationOrders addPickupsItem(RouteOptimizationPickupOrder pickupsItem) {
    if (this.pickups == null) {
      this.pickups = new ArrayList<>();
    }
    this.pickups.add(pickupsItem);
    return this;
  }

   /**
   * A list of orders that must be picked up from a specific location and transported to a depot. Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply.
   * @return pickups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationPickupOrder> getPickups() {
    return pickups;
  }


  @JsonProperty(JSON_PROPERTY_PICKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickups(List<RouteOptimizationPickupOrder> pickups) {
    this.pickups = pickups;
  }


  public RouteOptimizationOrders deliveries(List<RouteOptimizationDeliveryOrder> deliveries) {
    this.deliveries = deliveries;
    return this;
  }

  public RouteOptimizationOrders addDeliveriesItem(RouteOptimizationDeliveryOrder deliveriesItem) {
    if (this.deliveries == null) {
      this.deliveries = new ArrayList<>();
    }
    this.deliveries.add(deliveriesItem);
    return this;
  }

   /**
   * A list of orders that must be delivered to a specific location and transported from a depot. Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply.
   * @return deliveries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationDeliveryOrder> getDeliveries() {
    return deliveries;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveries(List<RouteOptimizationDeliveryOrder> deliveries) {
    this.deliveries = deliveries;
  }


  public RouteOptimizationOrders pickupDeliveries(List<RouteOptimizationPickupDeliveryOrder> pickupDeliveries) {
    this.pickupDeliveries = pickupDeliveries;
    return this;
  }

  public RouteOptimizationOrders addPickupDeliveriesItem(RouteOptimizationPickupDeliveryOrder pickupDeliveriesItem) {
    if (this.pickupDeliveries == null) {
      this.pickupDeliveries = new ArrayList<>();
    }
    this.pickupDeliveries.add(pickupDeliveriesItem);
    return this;
  }

   /**
   * A list of orders that must be picked up at a specific location and delivered to a specific location. Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply.
   * @return pickupDeliveries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationPickupDeliveryOrder> getPickupDeliveries() {
    return pickupDeliveries;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupDeliveries(List<RouteOptimizationPickupDeliveryOrder> pickupDeliveries) {
    this.pickupDeliveries = pickupDeliveries;
  }


  /**
   * Return true if this Orders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationOrders orders = (RouteOptimizationOrders) o;
    return Objects.equals(this.pickups, orders.pickups) &&
        Objects.equals(this.deliveries, orders.deliveries) &&
        Objects.equals(this.pickupDeliveries, orders.pickupDeliveries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickups, deliveries, pickupDeliveries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationOrders {\n");
    sb.append("    pickups: ").append(toIndentedString(pickups)).append("\n");
    sb.append("    deliveries: ").append(toIndentedString(deliveries)).append("\n");
    sb.append("    pickupDeliveries: ").append(toIndentedString(pickupDeliveries)).append("\n");
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

    // add `pickups` to the URL query string
    if (getPickups() != null) {
      for (int i = 0; i < getPickups().size(); i++) {
        if (getPickups().get(i) != null) {
          joiner.add(getPickups().get(i).toUrlQueryString(String.format("%spickups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deliveries` to the URL query string
    if (getDeliveries() != null) {
      for (int i = 0; i < getDeliveries().size(); i++) {
        if (getDeliveries().get(i) != null) {
          joiner.add(getDeliveries().get(i).toUrlQueryString(String.format("%sdeliveries%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `pickupDeliveries` to the URL query string
    if (getPickupDeliveries() != null) {
      for (int i = 0; i < getPickupDeliveries().size(); i++) {
        if (getPickupDeliveries().get(i) != null) {
          joiner.add(getPickupDeliveries().get(i).toUrlQueryString(String.format("%spickupDeliveries%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

