/*
 * Route Optimization OptiFlow
 *
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.0
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
    /// Warning
    /// </summary>
    [DataContract(Name = "Warning")]
    public partial class Warning : IEquatable<Warning>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Warning" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Warning() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Warning" /> class.
        /// </summary>
        /// <param name="description">A human readable message that describes the warning. (required).</param>
        /// <param name="warningCode">A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location. (required).</param>
        /// <param name="details">Additional properties specific to this class of warnings..</param>
        public Warning(string description = default(string), string warningCode = default(string), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            // to ensure "description" is required (not null)
            if (description == null) {
                throw new ArgumentNullException("description is a required property for Warning and cannot be null");
            }
            this.Description = description;
            // to ensure "warningCode" is required (not null)
            if (warningCode == null) {
                throw new ArgumentNullException("warningCode is a required property for Warning and cannot be null");
            }
            this.WarningCode = warningCode;
            this.Details = details;
        }

        /// <summary>
        /// A human readable message that describes the warning.
        /// </summary>
        /// <value>A human readable message that describes the warning.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location.
        /// </summary>
        /// <value>A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location.</value>
        [DataMember(Name = "warningCode", IsRequired = true, EmitDefaultValue = false)]
        public string WarningCode { get; set; }

        /// <summary>
        /// Additional properties specific to this class of warnings.
        /// </summary>
        /// <value>Additional properties specific to this class of warnings.</value>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public Dictionary<string, Object> Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Warning {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  WarningCode: ").Append(WarningCode).Append("\n");
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
            return this.Equals(input as Warning);
        }

        /// <summary>
        /// Returns true if Warning instances are equal
        /// </summary>
        /// <param name="input">Instance of Warning to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Warning input)
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
                    this.WarningCode == input.WarningCode ||
                    (this.WarningCode != null &&
                    this.WarningCode.Equals(input.WarningCode))
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
                if (this.WarningCode != null)
                {
                    hashCode = (hashCode * 59) + this.WarningCode.GetHashCode();
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
