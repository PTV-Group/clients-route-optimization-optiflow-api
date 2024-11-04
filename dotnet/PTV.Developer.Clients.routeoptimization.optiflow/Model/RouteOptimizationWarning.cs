/*
 * Route Optimization OptiFlow
 *
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.6
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
using OpenAPIDateConverter = PTV.Developer.Clients.routeoptimization.optiflow.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routeoptimization.optiflow.Model
{
    /// <summary>
    /// RouteOptimizationWarning
    /// </summary>
    [DataContract(Name = "Warning")]
    public partial class RouteOptimizationWarning : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationWarning" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationWarning() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationWarning" /> class.
        /// </summary>
        /// <param name="description">A human readable message that describes the warning. (required).</param>
        /// <param name="warningCode">A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location. (required).</param>
        /// <param name="details">Additional properties specific to this class of warnings..</param>
        public RouteOptimizationWarning(string description = default(string), string warningCode = default(string), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for RouteOptimizationWarning and cannot be null");
            }
            this.Description = description;
            // to ensure "warningCode" is required (not null)
            if (warningCode == null)
            {
                throw new ArgumentNullException("warningCode is a required property for RouteOptimizationWarning and cannot be null");
            }
            this.WarningCode = warningCode;
            this.Details = details;
        }

        /// <summary>
        /// A human readable message that describes the warning.
        /// </summary>
        /// <value>A human readable message that describes the warning.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location.
        /// </summary>
        /// <value>A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.    Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.    * &#x60;GENERAL_PARAMETER_IGNORED&#x60; - A parameter was ignored.     * &#x60;parameter&#x60; - The ignored parameter.     * &#x60;value&#x60; - The value of the ignored parameter.     * &#x60;relatedParameter&#x60; - The parameter which caused the parameter in question to be ignored.     * &#x60;relatedValue&#x60; - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value. * &#x60;ROUTEOPTIMIZATION_NO_VEHICLE_FOR_ORDER&#x60; - An order can not be scheduled on any route of the provided vehicles.     * &#x60;orderId&#x60; - The ID of the order. * &#x60;ROUTEOPTIMIZATION_NO_ORDER_FOR_VEHICLE&#x60; - No order can be scheduled on the route of a vehicle.     * &#x60;vehicleId&#x60; - The ID of the vehicle. * &#x60;ROUTEOPTIMIZATION_LOCATION_UNREACHABLE&#x60; - Time-distance can not be calculated to or from a location.     * &#x60;locationId&#x60; - The ID of the location.</value>
        [DataMember(Name = "warningCode", IsRequired = true, EmitDefaultValue = true)]
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
            sb.Append("class RouteOptimizationWarning {\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}