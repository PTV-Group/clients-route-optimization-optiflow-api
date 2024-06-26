/*
 * Route Optimization OptiFlow
 *
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routeoptimization.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routeoptimization.Model
{
    /// <summary>
    /// Error
    /// </summary>
    [DataContract(Name = "Error")]
    public partial class Error : IEquatable<Error>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Error" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Error() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Error" /> class.
        /// </summary>
        /// <param name="description">A human readable message that describes the error. (required).</param>
        /// <param name="errorCode">A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  * &#x60;ROUTEOPTIMIZATION_EMPTY_ROUTE_NOT_VALID_FOR_BREAKS&#x60; - A vehicle can not be assigned any route that is valid for the provided break settings   * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_NOTHING_TO_OPTIMIZE&#x60; - No order can be scheduled on any route of the provided vehicles. The optimization stopped because there is nothing to optimize. * &#x60;ROUTEOPTIMIZATION_STOPPED_UNEXPECTEDLY&#x60; - The optimization stopped unexpectedly. The provided routes are from the last known optimization result. * &#x60;ROUTEOPTIMIZATION_STOPPED_WHILE_PREPARING&#x60; - The optimization has been stopped while it was preparing. No routes will be provided. * &#x60;ROUTEOPTIMIZATION_START_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the start location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location. * &#x60;ROUTEOPTIMIZATION_END_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the end location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location. (required).</param>
        /// <param name="details">Additional properties specific to this class of errors..</param>
        public Error(string description = default(string), string errorCode = default(string), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            // to ensure "description" is required (not null)
            if (description == null) {
                throw new ArgumentNullException("description is a required property for Error and cannot be null");
            }
            this.Description = description;
            // to ensure "errorCode" is required (not null)
            if (errorCode == null) {
                throw new ArgumentNullException("errorCode is a required property for Error and cannot be null");
            }
            this.ErrorCode = errorCode;
            this.Details = details;
        }

        /// <summary>
        /// A human readable message that describes the error.
        /// </summary>
        /// <value>A human readable message that describes the error.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  * &#x60;ROUTEOPTIMIZATION_EMPTY_ROUTE_NOT_VALID_FOR_BREAKS&#x60; - A vehicle can not be assigned any route that is valid for the provided break settings   * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_NOTHING_TO_OPTIMIZE&#x60; - No order can be scheduled on any route of the provided vehicles. The optimization stopped because there is nothing to optimize. * &#x60;ROUTEOPTIMIZATION_STOPPED_UNEXPECTEDLY&#x60; - The optimization stopped unexpectedly. The provided routes are from the last known optimization result. * &#x60;ROUTEOPTIMIZATION_STOPPED_WHILE_PREPARING&#x60; - The optimization has been stopped while it was preparing. No routes will be provided. * &#x60;ROUTEOPTIMIZATION_START_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the start location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location. * &#x60;ROUTEOPTIMIZATION_END_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the end location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location.
        /// </summary>
        /// <value>A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  * &#x60;ROUTEOPTIMIZATION_EMPTY_ROUTE_NOT_VALID_FOR_BREAKS&#x60; - A vehicle can not be assigned any route that is valid for the provided break settings   * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_NOTHING_TO_OPTIMIZE&#x60; - No order can be scheduled on any route of the provided vehicles. The optimization stopped because there is nothing to optimize. * &#x60;ROUTEOPTIMIZATION_STOPPED_UNEXPECTEDLY&#x60; - The optimization stopped unexpectedly. The provided routes are from the last known optimization result. * &#x60;ROUTEOPTIMIZATION_STOPPED_WHILE_PREPARING&#x60; - The optimization has been stopped while it was preparing. No routes will be provided. * &#x60;ROUTEOPTIMIZATION_START_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the start location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location. * &#x60;ROUTEOPTIMIZATION_END_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from the end location of a vehicle.   * &#x60;vehicleId&#x60; - The ID of the vehicle.   * &#x60;locationId&#x60; - The ID of the location.</value>
        [DataMember(Name = "errorCode", IsRequired = true, EmitDefaultValue = false)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// Additional properties specific to this class of errors.
        /// </summary>
        /// <value>Additional properties specific to this class of errors.</value>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public Dictionary<string, Object> Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Error {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Error);
        }

        /// <summary>
        /// Returns true if Error instances are equal
        /// </summary>
        /// <param name="input">Instance of Error to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Error input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ErrorCode == input.ErrorCode ||
                    (this.ErrorCode != null &&
                    this.ErrorCode.Equals(input.ErrorCode))
                ) && 
                (
                    this.Details == input.Details ||
                    this.Details != null &&
                    input.Details != null &&
                    this.Details.SequenceEqual(input.Details)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.ErrorCode != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorCode.GetHashCode();
                }
                if (this.Details != null)
                {
                    hashCode = (hashCode * 59) + this.Details.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
