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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A break scheduled in a route according the vehicle break parameters.
 */
@ApiModel(description = "A break scheduled in a route according the vehicle break parameters.")
@JsonPropertyOrder({
  ModelBreak.JSON_PROPERTY_START,
  ModelBreak.JSON_PROPERTY_DURATION,
  ModelBreak.JSON_PROPERTY_END
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class ModelBreak {
  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public ModelBreak() { 
  }

  public ModelBreak start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The point in time when the break starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T11:00Z", value = "The point in time when the break starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
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


  public ModelBreak duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration [s] of the break.
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "The duration [s] of the break.")
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


  public ModelBreak end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The point in time when the break ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-03T11:30Z", value = "The point in time when the break ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). ")
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


  /**
   * Return true if this Break object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelBreak _break = (ModelBreak) o;
    return Objects.equals(this.start, _break.start) &&
        Objects.equals(this.duration, _break.duration) &&
        Objects.equals(this.end, _break.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, duration, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelBreak {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

