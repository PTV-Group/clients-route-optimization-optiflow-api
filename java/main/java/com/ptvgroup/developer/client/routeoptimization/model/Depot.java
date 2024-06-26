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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A depot where pickup orders can be delivered to or delivery orders can be picked up from. When stopping at a depot, all pickup orders present in the vehicle are unloaded first. Afterwards delivery orders can be loaded in the vehicle, which must be delivered before stopping at the next depot.  When providing pickup or delivery orders, at least one depot should be specified.  When providing pickup-delivery orders, no tasks happen at the depot and depots must be omitted. 
 */
@ApiModel(description = "A depot where pickup orders can be delivered to or delivery orders can be picked up from. When stopping at a depot, all pickup orders present in the vehicle are unloaded first. Afterwards delivery orders can be loaded in the vehicle, which must be delivered before stopping at the next depot.  When providing pickup or delivery orders, at least one depot should be specified.  When providing pickup-delivery orders, no tasks happen at the depot and depots must be omitted. ")
@JsonPropertyOrder({
  Depot.JSON_PROPERTY_ID,
  Depot.JSON_PROPERTY_LOCATION_ID,
  Depot.JSON_PROPERTY_TIME_SLOT_IDS,
  Depot.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class Depot {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_TIME_SLOT_IDS = "timeSlotIds";
  private List<String> timeSlotIds = null;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = null;

  public Depot() { 
  }

  public Depot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the depot.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DEPOT-123", required = true, value = "A unique identifier of the depot.")
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


  public Depot locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique identifier of the location where the depot is situated.
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GHENT", required = true, value = "The unique identifier of the location where the depot is situated.")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public Depot timeSlotIds(List<String> timeSlotIds) {
    this.timeSlotIds = timeSlotIds;
    return this;
  }

  public Depot addTimeSlotIdsItem(String timeSlotIdsItem) {
    if (this.timeSlotIds == null) {
      this.timeSlotIds = new ArrayList<>();
    }
    this.timeSlotIds.add(timeSlotIdsItem);
    return this;
  }

   /**
   * A list of unique identifiers of the time slots of the depot location that can be used to execute tasks at this depot. When empty all time slots can be used. 
   * @return timeSlotIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"MORNING\",\"NOON\"]", value = "A list of unique identifiers of the time slots of the depot location that can be used to execute tasks at this depot. When empty all time slots can be used. ")
  @JsonProperty(JSON_PROPERTY_TIME_SLOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTimeSlotIds() {
    return timeSlotIds;
  }


  @JsonProperty(JSON_PROPERTY_TIME_SLOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeSlotIds(List<String> timeSlotIds) {
    this.timeSlotIds = timeSlotIds;
  }


  public Depot categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Depot addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * A list of categories the depot belongs to that can be used to describe constraints.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"GHENT\",\"FRESH\"]", value = "A list of categories the depot belongs to that can be used to describe constraints.")
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
   * Return true if this Depot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Depot depot = (Depot) o;
    return Objects.equals(this.id, depot.id) &&
        Objects.equals(this.locationId, depot.locationId) &&
        Objects.equals(this.timeSlotIds, depot.timeSlotIds) &&
        Objects.equals(this.categories, depot.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, timeSlotIds, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Depot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    timeSlotIds: ").append(toIndentedString(timeSlotIds)).append("\n");
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

