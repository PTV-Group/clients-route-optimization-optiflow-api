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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationTaskGroupConstraint;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A group of tasks identified by a category. Tasks belonging to the same task group must be planned on the same route, or consecutively if they are on the same route, depending on the constraints defined in the task group. 
 */
@JsonPropertyOrder({
  RouteOptimizationTaskGroup.JSON_PROPERTY_TASK_CATEGORY,
  RouteOptimizationTaskGroup.JSON_PROPERTY_CONSTRAINT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-17T12:11:10.322024603Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationTaskGroup {
  public static final String JSON_PROPERTY_TASK_CATEGORY = "taskCategory";
  private String taskCategory;

  public static final String JSON_PROPERTY_CONSTRAINT = "constraint";
  private RouteOptimizationTaskGroupConstraint constraint;

  public RouteOptimizationTaskGroup() { 
  }

  public RouteOptimizationTaskGroup taskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
    return this;
  }

   /**
   * The category that defines which tasks belong to this task group. The constraint will be ignored when no task belongs to this category. 
   * @return taskCategory
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaskCategory() {
    return taskCategory;
  }


  @JsonProperty(JSON_PROPERTY_TASK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
  }


  public RouteOptimizationTaskGroup constraint(RouteOptimizationTaskGroupConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationTaskGroupConstraint getConstraint() {
    return constraint;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraint(RouteOptimizationTaskGroupConstraint constraint) {
    this.constraint = constraint;
  }


  /**
   * Return true if this TaskGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationTaskGroup taskGroup = (RouteOptimizationTaskGroup) o;
    return Objects.equals(this.taskCategory, taskGroup.taskCategory) &&
        Objects.equals(this.constraint, taskGroup.constraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskCategory, constraint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationTaskGroup {\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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

    // add `taskCategory` to the URL query string
    if (getTaskCategory() != null) {
      joiner.add(String.format("%staskCategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaskCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `constraint` to the URL query string
    if (getConstraint() != null) {
      joiner.add(String.format("%sconstraint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConstraint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

