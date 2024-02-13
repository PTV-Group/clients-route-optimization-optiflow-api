/*
 * Route Optimization OptiFlow
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes constraints on the route that may be assigned to the vehicle.
 */
@ApiModel(description = "Describes constraints on the route that may be assigned to the vehicle.")
@JsonPropertyOrder({
  RouteConstraints.JSON_PROPERTY_MAXIMUM_DURATION,
  RouteConstraints.JSON_PROPERTY_MAXIMUM_DISTANCE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T09:16:08.739853Z[Etc/UTC]")
public class RouteConstraints {
  public static final String JSON_PROPERTY_MAXIMUM_DURATION = "maximumDuration";
  private Integer maximumDuration;

  public static final String JSON_PROPERTY_MAXIMUM_DISTANCE = "maximumDistance";
  private Integer maximumDistance;

  public RouteConstraints() { 
  }

  public RouteConstraints maximumDuration(Integer maximumDuration) {
    this.maximumDuration = maximumDuration;
    return this;
  }

   /**
   * Restricts the maximum duration [s] of the route assigned to the vehicle.
   * minimum: 0
   * @return maximumDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28800", value = "Restricts the maximum duration [s] of the route assigned to the vehicle.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDuration() {
    return maximumDuration;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDuration(Integer maximumDuration) {
    this.maximumDuration = maximumDuration;
  }


  public RouteConstraints maximumDistance(Integer maximumDistance) {
    this.maximumDistance = maximumDistance;
    return this;
  }

   /**
   * Restricts the maximum distance [m] travelled on the route assigned to the vehicle.
   * minimum: 1
   * @return maximumDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "Restricts the maximum distance [m] travelled on the route assigned to the vehicle.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDistance() {
    return maximumDistance;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDistance(Integer maximumDistance) {
    this.maximumDistance = maximumDistance;
  }


  /**
   * Return true if this RouteConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteConstraints routeConstraints = (RouteConstraints) o;
    return Objects.equals(this.maximumDuration, routeConstraints.maximumDuration) &&
        Objects.equals(this.maximumDistance, routeConstraints.maximumDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumDuration, maximumDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteConstraints {\n");
    sb.append("    maximumDuration: ").append(toIndentedString(maximumDuration)).append("\n");
    sb.append("    maximumDistance: ").append(toIndentedString(maximumDistance)).append("\n");
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

