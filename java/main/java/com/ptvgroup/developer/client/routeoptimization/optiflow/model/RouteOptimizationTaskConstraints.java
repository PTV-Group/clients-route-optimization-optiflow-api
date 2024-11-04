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
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationForbiddenTaskSequence;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationRespectedTaskSequence;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationTaskGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constraints on the way tasks can be scheduled together on routes.
 */
@JsonPropertyOrder({
  RouteOptimizationTaskConstraints.JSON_PROPERTY_GROUPS,
  RouteOptimizationTaskConstraints.JSON_PROPERTY_RESPECTED_SEQUENCES,
  RouteOptimizationTaskConstraints.JSON_PROPERTY_FORBIDDEN_SEQUENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class RouteOptimizationTaskConstraints {
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<RouteOptimizationTaskGroup> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPECTED_SEQUENCES = "respectedSequences";
  private List<RouteOptimizationRespectedTaskSequence> respectedSequences = new ArrayList<>();

  public static final String JSON_PROPERTY_FORBIDDEN_SEQUENCES = "forbiddenSequences";
  private List<RouteOptimizationForbiddenTaskSequence> forbiddenSequences = new ArrayList<>();

  public RouteOptimizationTaskConstraints() { 
  }

  public RouteOptimizationTaskConstraints groups(List<RouteOptimizationTaskGroup> groups) {
    this.groups = groups;
    return this;
  }

  public RouteOptimizationTaskConstraints addGroupsItem(RouteOptimizationTaskGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of task groups. Tasks belonging to the same task group must be planned on the same route, or consecutively if they are on the same route, depending on the constraint defined in the task group. 
   * @return groups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationTaskGroup> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(List<RouteOptimizationTaskGroup> groups) {
    this.groups = groups;
  }


  public RouteOptimizationTaskConstraints respectedSequences(List<RouteOptimizationRespectedTaskSequence> respectedSequences) {
    this.respectedSequences = respectedSequences;
    return this;
  }

  public RouteOptimizationTaskConstraints addRespectedSequencesItem(RouteOptimizationRespectedTaskSequence respectedSequencesItem) {
    if (this.respectedSequences == null) {
      this.respectedSequences = new ArrayList<>();
    }
    this.respectedSequences.add(respectedSequencesItem);
    return this;
  }

   /**
   * A list of sequences that must be respected when scheduling routes. Tasks belonging to a category that occurs earlier in the sequence must be scheduled on the route before a task belonging to a category later in the sequence. 
   * @return respectedSequences
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPECTED_SEQUENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationRespectedTaskSequence> getRespectedSequences() {
    return respectedSequences;
  }


  @JsonProperty(JSON_PROPERTY_RESPECTED_SEQUENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRespectedSequences(List<RouteOptimizationRespectedTaskSequence> respectedSequences) {
    this.respectedSequences = respectedSequences;
  }


  public RouteOptimizationTaskConstraints forbiddenSequences(List<RouteOptimizationForbiddenTaskSequence> forbiddenSequences) {
    this.forbiddenSequences = forbiddenSequences;
    return this;
  }

  public RouteOptimizationTaskConstraints addForbiddenSequencesItem(RouteOptimizationForbiddenTaskSequence forbiddenSequencesItem) {
    if (this.forbiddenSequences == null) {
      this.forbiddenSequences = new ArrayList<>();
    }
    this.forbiddenSequences.add(forbiddenSequencesItem);
    return this;
  }

   /**
   * A list of sequences that are forbidden to be scheduled on a route. Tasks belonging to certain categories must not be scheduled before, or immediately before, tasks belonging to another specific category. 
   * @return forbiddenSequences
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORBIDDEN_SEQUENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteOptimizationForbiddenTaskSequence> getForbiddenSequences() {
    return forbiddenSequences;
  }


  @JsonProperty(JSON_PROPERTY_FORBIDDEN_SEQUENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForbiddenSequences(List<RouteOptimizationForbiddenTaskSequence> forbiddenSequences) {
    this.forbiddenSequences = forbiddenSequences;
  }


  /**
   * Return true if this TaskConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteOptimizationTaskConstraints taskConstraints = (RouteOptimizationTaskConstraints) o;
    return Objects.equals(this.groups, taskConstraints.groups) &&
        Objects.equals(this.respectedSequences, taskConstraints.respectedSequences) &&
        Objects.equals(this.forbiddenSequences, taskConstraints.forbiddenSequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, respectedSequences, forbiddenSequences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteOptimizationTaskConstraints {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    respectedSequences: ").append(toIndentedString(respectedSequences)).append("\n");
    sb.append("    forbiddenSequences: ").append(toIndentedString(forbiddenSequences)).append("\n");
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

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format("%sgroups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `respectedSequences` to the URL query string
    if (getRespectedSequences() != null) {
      for (int i = 0; i < getRespectedSequences().size(); i++) {
        if (getRespectedSequences().get(i) != null) {
          joiner.add(getRespectedSequences().get(i).toUrlQueryString(String.format("%srespectedSequences%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `forbiddenSequences` to the URL query string
    if (getForbiddenSequences() != null) {
      for (int i = 0; i < getForbiddenSequences().size(); i++) {
        if (getForbiddenSequences().get(i) != null) {
          joiner.add(getForbiddenSequences().get(i).toUrlQueryString(String.format("%sforbiddenSequences%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}
