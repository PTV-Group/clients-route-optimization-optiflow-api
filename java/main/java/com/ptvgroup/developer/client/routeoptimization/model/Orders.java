/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routeoptimization.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routeoptimization.model.DeliveryOrder;
import com.ptvgroup.developer.client.routeoptimization.model.PickupDeliveryOrder;
import com.ptvgroup.developer.client.routeoptimization.model.PickupOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of orders that should be scheduled by the optimization on the routes. When providing pickup-delivery orders, it is not possible to provide other order types. If pickup orders or delivery orders are provided, at least one depot must be provided where the pickup orders can be delivered to or the delivery orders can be picked up from. The unique identifiers of the orders must by unique across the three types.  Orders of the same type always satisfy the \&quot;last in, first out\&quot; (LIFO) principle, with respect to each other. When an order is picked up while another order of the same type is already loaded, the former should be delivered before the latter. Orders of different types do not have to satisfy the LIFO principle. For example, if a pickup order is picked up while a delivery order is loaded, the delivery order can be delivered before the pickup order is delivered at depot. 
 */
@ApiModel(description = "A list of orders that should be scheduled by the optimization on the routes. When providing pickup-delivery orders, it is not possible to provide other order types. If pickup orders or delivery orders are provided, at least one depot must be provided where the pickup orders can be delivered to or the delivery orders can be picked up from. The unique identifiers of the orders must by unique across the three types.  Orders of the same type always satisfy the \"last in, first out\" (LIFO) principle, with respect to each other. When an order is picked up while another order of the same type is already loaded, the former should be delivered before the latter. Orders of different types do not have to satisfy the LIFO principle. For example, if a pickup order is picked up while a delivery order is loaded, the delivery order can be delivered before the pickup order is delivered at depot. ")
@JsonPropertyOrder({
  Orders.JSON_PROPERTY_PICKUPS,
  Orders.JSON_PROPERTY_DELIVERIES,
  Orders.JSON_PROPERTY_PICKUP_DELIVERIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class Orders {
  public static final String JSON_PROPERTY_PICKUPS = "pickups";
  private List<PickupOrder> pickups = null;

  public static final String JSON_PROPERTY_DELIVERIES = "deliveries";
  private List<DeliveryOrder> deliveries = null;

  public static final String JSON_PROPERTY_PICKUP_DELIVERIES = "pickupDeliveries";
  private List<PickupDeliveryOrder> pickupDeliveries = null;

  public Orders() { 
  }

  public Orders pickups(List<PickupOrder> pickups) {
    this.pickups = pickups;
    return this;
  }

  public Orders addPickupsItem(PickupOrder pickupsItem) {
    if (this.pickups == null) {
      this.pickups = new ArrayList<>();
    }
    this.pickups.add(pickupsItem);
    return this;
  }

   /**
   * A list of orders that must be picked up from a specific location and transported to a depot.   Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply. 
   * @return pickups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of orders that must be picked up from a specific location and transported to a depot.   Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply. ")
  @JsonProperty(JSON_PROPERTY_PICKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PickupOrder> getPickups() {
    return pickups;
  }


  @JsonProperty(JSON_PROPERTY_PICKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickups(List<PickupOrder> pickups) {
    this.pickups = pickups;
  }


  public Orders deliveries(List<DeliveryOrder> deliveries) {
    this.deliveries = deliveries;
    return this;
  }

  public Orders addDeliveriesItem(DeliveryOrder deliveriesItem) {
    if (this.deliveries == null) {
      this.deliveries = new ArrayList<>();
    }
    this.deliveries.add(deliveriesItem);
    return this;
  }

   /**
   * A list of orders that must be delivered to a specific location and transported from a depot.   Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. 
   * @return deliveries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of orders that must be delivered to a specific location and transported from a depot.   Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. ")
  @JsonProperty(JSON_PROPERTY_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeliveryOrder> getDeliveries() {
    return deliveries;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveries(List<DeliveryOrder> deliveries) {
    this.deliveries = deliveries;
  }


  public Orders pickupDeliveries(List<PickupDeliveryOrder> pickupDeliveries) {
    this.pickupDeliveries = pickupDeliveries;
    return this;
  }

  public Orders addPickupDeliveriesItem(PickupDeliveryOrder pickupDeliveriesItem) {
    if (this.pickupDeliveries == null) {
      this.pickupDeliveries = new ArrayList<>();
    }
    this.pickupDeliveries.add(pickupDeliveriesItem);
    return this;
  }

   /**
   * A list of orders that must be picked up at a specific location and delivered to a specific location.   Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. 
   * @return pickupDeliveries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of orders that must be picked up at a specific location and delivered to a specific location.   Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. ")
  @JsonProperty(JSON_PROPERTY_PICKUP_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PickupDeliveryOrder> getPickupDeliveries() {
    return pickupDeliveries;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_DELIVERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupDeliveries(List<PickupDeliveryOrder> pickupDeliveries) {
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
    Orders orders = (Orders) o;
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
    sb.append("class Orders {\n");
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

}

