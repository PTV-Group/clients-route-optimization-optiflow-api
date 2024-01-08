/*
 * OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.0
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
import com.ptvgroup.developer.client.routeoptimization.model.DepotVehicleCombinationConstraint;
import com.ptvgroup.developer.client.routeoptimization.model.OrderVehicleCombinationConstraint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes constraints on combinations of orders, vehicles and depots.
 */
@ApiModel(description = "Describes constraints on combinations of orders, vehicles and depots.")
@JsonPropertyOrder({
  CombinationConstraints.JSON_PROPERTY_ORDER_VEHICLE,
  CombinationConstraints.JSON_PROPERTY_DEPOT_VEHICLE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-08T10:16:41.445132Z[Etc/UTC]")
public class CombinationConstraints {
  public static final String JSON_PROPERTY_ORDER_VEHICLE = "orderVehicle";
  private List<OrderVehicleCombinationConstraint> orderVehicle = null;

  public static final String JSON_PROPERTY_DEPOT_VEHICLE = "depotVehicle";
  private List<DepotVehicleCombinationConstraint> depotVehicle = null;

  public CombinationConstraints() { 
  }

  public CombinationConstraints orderVehicle(List<OrderVehicleCombinationConstraint> orderVehicle) {
    this.orderVehicle = orderVehicle;
    return this;
  }

  public CombinationConstraints addOrderVehicleItem(OrderVehicleCombinationConstraint orderVehicleItem) {
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
  @ApiModelProperty(value = "A list of constraints on combinations of orders and vehicles.")
  @JsonProperty(JSON_PROPERTY_ORDER_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderVehicleCombinationConstraint> getOrderVehicle() {
    return orderVehicle;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderVehicle(List<OrderVehicleCombinationConstraint> orderVehicle) {
    this.orderVehicle = orderVehicle;
  }


  public CombinationConstraints depotVehicle(List<DepotVehicleCombinationConstraint> depotVehicle) {
    this.depotVehicle = depotVehicle;
    return this;
  }

  public CombinationConstraints addDepotVehicleItem(DepotVehicleCombinationConstraint depotVehicleItem) {
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
  @ApiModelProperty(value = "A list of constraints on combinations of depots and vehicles.")
  @JsonProperty(JSON_PROPERTY_DEPOT_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DepotVehicleCombinationConstraint> getDepotVehicle() {
    return depotVehicle;
  }


  @JsonProperty(JSON_PROPERTY_DEPOT_VEHICLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepotVehicle(List<DepotVehicleCombinationConstraint> depotVehicle) {
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
    CombinationConstraints combinationConstraints = (CombinationConstraints) o;
    return Objects.equals(this.orderVehicle, combinationConstraints.orderVehicle) &&
        Objects.equals(this.depotVehicle, combinationConstraints.depotVehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderVehicle, depotVehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinationConstraints {\n");
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

}

