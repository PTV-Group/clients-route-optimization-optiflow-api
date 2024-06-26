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
import com.ptvgroup.developer.client.routeoptimization.model.OrderProperties;
import com.ptvgroup.developer.client.routeoptimization.model.TaskProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A request to pickup an order and transport it to a depot.
 */
@ApiModel(description = "A request to pickup an order and transport it to a depot.")
@JsonPropertyOrder({
  PickupOrder.JSON_PROPERTY_ID,
  PickupOrder.JSON_PROPERTY_PICKUP,
  PickupOrder.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class PickupOrder {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PICKUP = "pickup";
  private TaskProperties pickup;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private OrderProperties properties;

  public PickupOrder() { 
  }

  public PickupOrder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the order. This must be unique across all orders. 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PICKUP-123", required = true, value = "A unique identifier of the order. This must be unique across all orders. ")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PickupOrder pickup(TaskProperties pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Get pickup
   * @return pickup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PICKUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TaskProperties getPickup() {
    return pickup;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPickup(TaskProperties pickup) {
    this.pickup = pickup;
  }


  public PickupOrder properties(OrderProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderProperties getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(OrderProperties properties) {
    this.properties = properties;
  }


  /**
   * Return true if this PickupOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickupOrder pickupOrder = (PickupOrder) o;
    return Objects.equals(this.id, pickupOrder.id) &&
        Objects.equals(this.pickup, pickupOrder.pickup) &&
        Objects.equals(this.properties, pickupOrder.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pickup, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickupOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

