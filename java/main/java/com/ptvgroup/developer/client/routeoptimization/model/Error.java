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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Error
 */
@JsonPropertyOrder({
  Error.JSON_PROPERTY_DESCRIPTION,
  Error.JSON_PROPERTY_ERROR_CODE,
  Error.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T11:00:47.938367Z[Etc/UTC]")
public class Error {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;

  public Error() { 
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable message that describes the error.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  * &#x60;ROUTEOPTIMIZATION_EMPTY_ROUTE_NOT_VALID_FOR_BREAKS&#x60; - A vehicle can not be assigned any route that is valid for the provided break settings   * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_NOTHING_TO_OPTIMIZE&#x60; - No order can be scheduled on any route of the provided vehicles. The optimization stopped because there is nothing to optimize. * &#x60;ROUTEOPTIMIZATION_STOPPED_UNEXPECTEDLY&#x60; - The optimization stopped unexpectedly. The provided routes are from the last known optimization result. * &#x60;ROUTEOPTIMIZATION_STOPPED_WHILE_PREPARING&#x60; - The optimization has been stopped while it was preparing. No routes will be provided. * &#x60;ROUTEOPTIMIZATION_START_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the start location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location. * &#x60;ROUTEOPTIMIZATION_END_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the end location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  * `ROUTEOPTIMIZATION_EMPTY_ROUTE_NOT_VALID_FOR_BREAKS` - A vehicle can not be assigned any route that is valid for the provided break settings   * `vehicleId` - The ID of the vehicle. * `ROUTEOPTIMIZATION_NOTHING_TO_OPTIMIZE` - No order can be scheduled on any route of the provided vehicles. The optimization stopped because there is nothing to optimize. * `ROUTEOPTIMIZATION_STOPPED_UNEXPECTEDLY` - The optimization stopped unexpectedly. The provided routes are from the last known optimization result. * `ROUTEOPTIMIZATION_STOPPED_WHILE_PREPARING` - The optimization has been stopped while it was preparing. No routes will be provided. * `ROUTEOPTIMIZATION_START_LOCATION_UNREACHABLE` - Time-distance can not be calculated to or from the start location of a vehicle.   * `vehicleId` - The ID of the vehicle.   * `locationId` - The ID of the location. * `ROUTEOPTIMIZATION_END_LOCATION_UNREACHABLE` - Time-distance can not be calculated to or from the end location of a vehicle.   * `vehicleId` - The ID of the vehicle.   * `locationId` - The ID of the location.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Error details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public Error putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this class of errors.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this class of errors.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this Error object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.description, error.description) &&
        Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

