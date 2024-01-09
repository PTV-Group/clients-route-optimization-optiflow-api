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
import com.ptvgroup.developer.client.routeoptimization.model.Load;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about the order.
 */
@ApiModel(description = "Information about the order.")
@JsonPropertyOrder({
  OrderProperties.JSON_PROPERTY_LOADS,
  OrderProperties.JSON_PROPERTY_OUTSOURCING_COST,
  OrderProperties.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T13:34:30.390729Z[Etc/UTC]")
public class OrderProperties {
  public static final String JSON_PROPERTY_LOADS = "loads";
  private List<Load> loads = null;

  public static final String JSON_PROPERTY_OUTSOURCING_COST = "outsourcingCost";
  private Double outsourcingCost;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = null;

  public OrderProperties() { 
  }

  public OrderProperties loads(List<Load> loads) {
    this.loads = loads;
    return this;
  }

  public OrderProperties addLoadsItem(Load loadsItem) {
    if (this.loads == null) {
      this.loads = new ArrayList<>();
    }
    this.loads.add(loadsItem);
    return this;
  }

   /**
   * A list of load definitions that describe the necessary vehicle capacity to transport the order. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. 
   * @return loads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of load definitions that describe the necessary vehicle capacity to transport the order. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. ")
  @JsonProperty(JSON_PROPERTY_LOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Load> getLoads() {
    return loads;
  }


  @JsonProperty(JSON_PROPERTY_LOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoads(List<Load> loads) {
    this.loads = loads;
  }


  public OrderProperties outsourcingCost(Double outsourcingCost) {
    this.outsourcingCost = outsourcingCost;
    return this;
  }

   /**
   * Defines the cost for not scheduling the order on a route. This cost is weighed against the cost of scheduling the order on a route. When omitted the optimization will try to schedule the order regardless of the added cost. 
   * minimum: 0
   * @return outsourcingCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Defines the cost for not scheduling the order on a route. This cost is weighed against the cost of scheduling the order on a route. When omitted the optimization will try to schedule the order regardless of the added cost. ")
  @JsonProperty(JSON_PROPERTY_OUTSOURCING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOutsourcingCost() {
    return outsourcingCost;
  }


  @JsonProperty(JSON_PROPERTY_OUTSOURCING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutsourcingCost(Double outsourcingCost) {
    this.outsourcingCost = outsourcingCost;
  }


  public OrderProperties categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public OrderProperties addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * A list of categories the order belongs to that can be used to describe constraints.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"FRESH\"]", value = "A list of categories the order belongs to that can be used to describe constraints.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this OrderProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderProperties orderProperties = (OrderProperties) o;
    return Objects.equals(this.loads, orderProperties.loads) &&
        Objects.equals(this.outsourcingCost, orderProperties.outsourcingCost) &&
        Objects.equals(this.categories, orderProperties.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loads, outsourcingCost, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProperties {\n");
    sb.append("    loads: ").append(toIndentedString(loads)).append("\n");
    sb.append("    outsourcingCost: ").append(toIndentedString(outsourcingCost)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

