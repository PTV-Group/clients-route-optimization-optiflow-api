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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationBreak;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationTaskType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A description of a task that is scheduled for execution on a route. 
 */
@JsonPropertyOrder({
  RouteOptimizationTask.JSON_PROPERTY_ORDER_ID,
  RouteOptimizationTask.JSON_PROPERTY_TYPE,
  RouteOptimizationTask.JSON_PROPERTY_BREAKS,
  RouteOptimizationTask.JSON_PROPERTY_START,
  RouteOptimizationTask.JSON_PROPERTY_DURATION,
  RouteOptimizationTask.JSON_PROPERTY_END,
  RouteOptimizationTask.JSON_PROPERTY_COMPARTMENT_ID,
  RouteOptimizationTask.JSON_PROPERTY_DEPOT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationTask {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RouteOptimizationTaskType type;

  public static final String JSON_PROPERTY_BREAKS = "breaks";
  private List<RouteOptimizationBreak> breaks = new ArrayList<>();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_COMPARTMENT_ID = "compartmentId";
  private String compartmentId;

  public static final String JSON_PROPERTY_DEPOT_ID = "depotId";
  private String depotId;

  public RouteOptimizationTask() { 
  }

  public RouteOptimizationTask orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The unique identifier of the order whose pickup or delivery is described by this task.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public RouteOptimizationTask type(RouteOptimizationTaskType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RouteOptimizationTaskType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RouteOptimizationTaskType type) {
    this.type = type;
  }


  public RouteOptimizationTask breaks(List<RouteOptimizationBreak> breaks) {
    this.breaks = breaks;
    return this;
  }

  public RouteOptimizationTask addBreaksItem(RouteOptimizationBreak breaksItem) {
    if (this.breaks == null) {
      this.breaks = new ArrayList<>();
    }
    this.breaks.add(breaksItem);
    return this;
  }

   /**
   * A list of breaks that are scheduled to be taken before the execution of the task.
   * @return breaks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationBreak> getBreaks() {
    return breaks;
  }


  @JsonProperty(JSON_PROPERTY_BREAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreaks(List<RouteOptimizationBreak> breaks) {
    this.breaks = breaks;
  }


  public RouteOptimizationTask start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The point in time when the execution of the task is scheduled to start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return start
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public RouteOptimizationTask duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The scheduled duration [s] for the task to be executed. This is the duration between the start and end of the task.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public RouteOptimizationTask end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The point in time when the execution of the task is scheduled to end. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return end
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public RouteOptimizationTask compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
  }

   /**
   * The unique identifier of the compartment that the order was loaded in or unloaded from.
   * @return compartmentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARTMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompartmentId() {
    return compartmentId;
  }


  @JsonProperty(JSON_PROPERTY_COMPARTMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
  }


  public RouteOptimizationTask depotId(String depotId) {
    this.depotId = depotId;
    return this;
  }

   /**
   * The unique identifier of the depot in case the task is a pickup or a delivery at a depot.
   * @return depotId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepotId() {
    return depotId;
  }


  @JsonProperty(JSON_PROPERTY_DEPOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepotId(String depotId) {
    this.depotId = depotId;
  }


  /**
   * Return true if this Task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationTask task = (RouteOptimizationTask) o;
    return Objects.equals(this.orderId, task.orderId) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.breaks, task.breaks) &&
        Objects.equals(this.start, task.start) &&
        Objects.equals(this.duration, task.duration) &&
        Objects.equals(this.end, task.end) &&
        Objects.equals(this.compartmentId, task.compartmentId) &&
        Objects.equals(this.depotId, task.depotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, type, breaks, start, duration, end, compartmentId, depotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationTask {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    compartmentId: ").append(toIndentedString(compartmentId)).append("\n");
    sb.append("    depotId: ").append(toIndentedString(depotId)).append("\n");
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

    // add `orderId` to the URL query string
    if (getOrderId() != null) {
      joiner.add(String.format("%sorderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `breaks` to the URL query string
    if (getBreaks() != null) {
      for (int i = 0; i < getBreaks().size(); i++) {
        if (getBreaks().get(i) != null) {
          joiner.add(getBreaks().get(i).toUrlQueryString(String.format("%sbreaks%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(String.format("%sstart%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format("%sduration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end` to the URL query string
    if (getEnd() != null) {
      joiner.add(String.format("%send%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `compartmentId` to the URL query string
    if (getCompartmentId() != null) {
      joiner.add(String.format("%scompartmentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompartmentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `depotId` to the URL query string
    if (getDepotId() != null) {
      joiner.add(String.format("%sdepotId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDepotId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

