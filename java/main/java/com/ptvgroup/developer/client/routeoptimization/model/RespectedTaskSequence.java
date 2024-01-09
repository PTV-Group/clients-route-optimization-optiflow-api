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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sequence that must be respected when scheduling routes. Tasks with a category that occurs earlier in the sequence must be scheduled in the route before a task with a category later in the sequence. 
 */
@ApiModel(description = "A sequence that must be respected when scheduling routes. Tasks with a category that occurs earlier in the sequence must be scheduled in the route before a task with a category later in the sequence. ")
@JsonPropertyOrder({
  RespectedTaskSequence.JSON_PROPERTY_TASK_CATEGORIES,
  RespectedTaskSequence.JSON_PROPERTY_VEHICLE_CATEGORY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-09T13:34:30.390729Z[Etc/UTC]")
public class RespectedTaskSequence {
  public static final String JSON_PROPERTY_TASK_CATEGORIES = "taskCategories";
  private Set<String> taskCategories = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VEHICLE_CATEGORY = "vehicleCategory";
  private String vehicleCategory;

  public RespectedTaskSequence() { 
  }

  public RespectedTaskSequence taskCategories(Set<String> taskCategories) {
    this.taskCategories = taskCategories;
    return this;
  }

  public RespectedTaskSequence addTaskCategoriesItem(String taskCategoriesItem) {
    this.taskCategories.add(taskCategoriesItem);
    return this;
  }

   /**
   * The sequence of task categories that needs to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any task are ignored. 
   * @return taskCategories
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"MORNING\",\"AFTERNOON\",\"EVENING\"]", required = true, value = "The sequence of task categories that needs to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any task are ignored. ")
  @JsonProperty(JSON_PROPERTY_TASK_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getTaskCategories() {
    return taskCategories;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TASK_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaskCategories(Set<String> taskCategories) {
    this.taskCategories = taskCategories;
  }


  public RespectedTaskSequence vehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
    return this;
  }

   /**
   * The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category. 
   * @return vehicleCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMALL_TRUCK", value = "The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category. ")
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
   * Return true if this RespectedTaskSequence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespectedTaskSequence respectedTaskSequence = (RespectedTaskSequence) o;
    return Objects.equals(this.taskCategories, respectedTaskSequence.taskCategories) &&
        Objects.equals(this.vehicleCategory, respectedTaskSequence.vehicleCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskCategories, vehicleCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespectedTaskSequence {\n");
    sb.append("    taskCategories: ").append(toIndentedString(taskCategories)).append("\n");
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

}

