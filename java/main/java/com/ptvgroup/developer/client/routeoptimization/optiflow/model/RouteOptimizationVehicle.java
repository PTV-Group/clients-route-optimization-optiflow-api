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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationBreakSettings;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationCompartment;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleConstraints;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleCosts;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleEnd;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleRouting;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationVehicleStart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A vehicle that can be used to schedule routes. The optimization can only assign a single route to a vehicle while respecting the properties and constraints of the vehicle. 
 */
@JsonPropertyOrder({
  RouteOptimizationVehicle.JSON_PROPERTY_ID,
  RouteOptimizationVehicle.JSON_PROPERTY_START,
  RouteOptimizationVehicle.JSON_PROPERTY_END,
  RouteOptimizationVehicle.JSON_PROPERTY_ROUTING,
  RouteOptimizationVehicle.JSON_PROPERTY_COSTS,
  RouteOptimizationVehicle.JSON_PROPERTY_BREAKS,
  RouteOptimizationVehicle.JSON_PROPERTY_COMPARTMENTS,
  RouteOptimizationVehicle.JSON_PROPERTY_CONSTRAINTS,
  RouteOptimizationVehicle.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationVehicle {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_START = "start";
  private RouteOptimizationVehicleStart start;

  public static final String JSON_PROPERTY_END = "end";
  private RouteOptimizationVehicleEnd end;

  public static final String JSON_PROPERTY_ROUTING = "routing";
  private RouteOptimizationVehicleRouting routing;

  public static final String JSON_PROPERTY_COSTS = "costs";
  private RouteOptimizationVehicleCosts costs;

  public static final String JSON_PROPERTY_BREAKS = "breaks";
  private RouteOptimizationBreakSettings breaks;

  public static final String JSON_PROPERTY_COMPARTMENTS = "compartments";
  private List<RouteOptimizationCompartment> compartments = new ArrayList<>();

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private RouteOptimizationVehicleConstraints constraints;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = new ArrayList<>();

  public RouteOptimizationVehicle() { 
  }

  public RouteOptimizationVehicle id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of the vehicle.
   * @return id
  **/
  @javax.annotation.Nonnull
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


  public RouteOptimizationVehicle start(RouteOptimizationVehicleStart start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationVehicleStart getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(RouteOptimizationVehicleStart start) {
    this.start = start;
  }


  public RouteOptimizationVehicle end(RouteOptimizationVehicleEnd end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationVehicleEnd getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(RouteOptimizationVehicleEnd end) {
    this.end = end;
  }


  public RouteOptimizationVehicle routing(RouteOptimizationVehicleRouting routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationVehicleRouting getRouting() {
    return routing;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRouting(RouteOptimizationVehicleRouting routing) {
    this.routing = routing;
  }


  public RouteOptimizationVehicle costs(RouteOptimizationVehicleCosts costs) {
    this.costs = costs;
    return this;
  }

   /**
   * Get costs
   * @return costs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteOptimizationVehicleCosts getCosts() {
    return costs;
  }


  @JsonProperty(JSON_PROPERTY_COSTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCosts(RouteOptimizationVehicleCosts costs) {
    this.costs = costs;
  }


  public RouteOptimizationVehicle breaks(RouteOptimizationBreakSettings breaks) {
    this.breaks = breaks;
    return this;
  }

   /**
   * Get breaks
   * @return breaks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationBreakSettings getBreaks() {
    return breaks;
  }


  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreaks(RouteOptimizationBreakSettings breaks) {
    this.breaks = breaks;
  }


  public RouteOptimizationVehicle compartments(List<RouteOptimizationCompartment> compartments) {
    this.compartments = compartments;
    return this;
  }

  public RouteOptimizationVehicle addCompartmentsItem(RouteOptimizationCompartment compartmentsItem) {
    if (this.compartments == null) {
      this.compartments = new ArrayList<>();
    }
    this.compartments.add(compartmentsItem);
    return this;
  }

   /**
   * A list of compartments available for loading orders. Orders placed into the same compartment must follow the compartment&#39;s loading strategy, which may impose restrictions on the unloading sequence. If orders are loaded into separate compartments, no restrictions apply to the unloading sequence. When unspecified or empty, the vehicle is assumed to have a single compartment with loading strategy &#x60;NONE&#x60; (resp. &#x60;LAST_IN_FIRST_OUT&#x60;) when optimizing pickup and/or delivery orders (resp. pickup-delivery orders). **Note that this default behaviour will change. The vehicle will be assumed to have a single compartment with loading strategy &#x60;NONE&#x60; regardless of the specified order types. When relying on the default &#x60;LAST_IN_FIRST_OUT&#x60; behaviour for pickup-delivery orders, please already specify a single compartment with loading strategy &#x60;LAST_IN_FIRST_OUT&#x60; in order to ensure this change will not impact your optimizations.** 
   * @return compartments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationCompartment> getCompartments() {
    return compartments;
  }


  @JsonProperty(JSON_PROPERTY_COMPARTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompartments(List<RouteOptimizationCompartment> compartments) {
    this.compartments = compartments;
  }


  public RouteOptimizationVehicle constraints(RouteOptimizationVehicleConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationVehicleConstraints getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(RouteOptimizationVehicleConstraints constraints) {
    this.constraints = constraints;
  }


  public RouteOptimizationVehicle categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public RouteOptimizationVehicle addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * A list of categories the vehicle belongs to that can be used to describe constraints.
   * @return categories
  **/
  @javax.annotation.Nullable
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
   * Return true if this Vehicle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationVehicle vehicle = (RouteOptimizationVehicle) o;
    return Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.start, vehicle.start) &&
        Objects.equals(this.end, vehicle.end) &&
        Objects.equals(this.routing, vehicle.routing) &&
        Objects.equals(this.costs, vehicle.costs) &&
        Objects.equals(this.breaks, vehicle.breaks) &&
        Objects.equals(this.compartments, vehicle.compartments) &&
        Objects.equals(this.constraints, vehicle.constraints) &&
        Objects.equals(this.categories, vehicle.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, routing, costs, breaks, compartments, constraints, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationVehicle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    compartments: ").append(toIndentedString(compartments)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(getStart().toUrlQueryString(prefix + "start" + suffix));
    }

    // add `end` to the URL query string
    if (getEnd() != null) {
      joiner.add(getEnd().toUrlQueryString(prefix + "end" + suffix));
    }

    // add `routing` to the URL query string
    if (getRouting() != null) {
      joiner.add(getRouting().toUrlQueryString(prefix + "routing" + suffix));
    }

    // add `costs` to the URL query string
    if (getCosts() != null) {
      joiner.add(getCosts().toUrlQueryString(prefix + "costs" + suffix));
    }

    // add `breaks` to the URL query string
    if (getBreaks() != null) {
      joiner.add(getBreaks().toUrlQueryString(prefix + "breaks" + suffix));
    }

    // add `compartments` to the URL query string
    if (getCompartments() != null) {
      for (int i = 0; i < getCompartments().size(); i++) {
        if (getCompartments().get(i) != null) {
          joiner.add(getCompartments().get(i).toUrlQueryString(String.format("%scompartments%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `constraints` to the URL query string
    if (getConstraints() != null) {
      joiner.add(getConstraints().toUrlQueryString(prefix + "constraints" + suffix));
    }

    // add `categories` to the URL query string
    if (getCategories() != null) {
      for (int i = 0; i < getCategories().size(); i++) {
        joiner.add(String.format("%scategories%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getCategories().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

