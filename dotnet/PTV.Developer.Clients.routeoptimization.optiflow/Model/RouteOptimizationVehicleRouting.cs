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
    /// Specifies how time-distance data must be calculated for routes driven by the vehicle.
    /// </summary>
    [DataContract(Name = "VehicleRouting")]
    public partial class RouteOptimizationVehicleRouting : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Violations
        /// </summary>
        [DataMember(Name = "violations", EmitDefaultValue = true)]
        public RouteOptimizationRoutingViolationStrategy? Violations { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationVehicleRouting" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationVehicleRouting() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationVehicleRouting" /> class.
        /// </summary>
        /// <param name="profile">A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the predefined profiles *EUR_PEDESTRIAN*, *EUR_BICYCLE*, *EUR_CAR*, *EUR_VAN*, *EUR_TRUCK_7_49T*, *EUR_TRUCK_11_99T*, *EUR_TRUCK_40T* or *EUR_TRAILER_TRUCK*. At most ten profiles may be used within a single optimization.   Please note that the upper bound on number of different routing profiles is a technical limit. Check your individual price plan or contract to see which limits apply.  (required).</param>
        /// <param name="speedFactor">An additional factor to apply to the speed of the vehicle. When lower than one, the driving durations of the vehicle will increase, when greater than one, the driving durations of the vehicle will decrease.  (default to 1D).</param>
        /// <param name="violations">violations.</param>
        public RouteOptimizationVehicleRouting(string profile = default(string), double? speedFactor = 1D, RouteOptimizationRoutingViolationStrategy? violations = default(RouteOptimizationRoutingViolationStrategy?))
        {
            // to ensure "profile" is required (not null)
            if (profile == null)
            {
                throw new ArgumentNullException("profile is a required property for RouteOptimizationVehicleRouting and cannot be null");
            }
            this.Profile = profile;
            // use default value if no "speedFactor" provided
            this.SpeedFactor = speedFactor ?? 1D;
            this.Violations = violations;
        }

        /// <summary>
        /// A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the predefined profiles *EUR_PEDESTRIAN*, *EUR_BICYCLE*, *EUR_CAR*, *EUR_VAN*, *EUR_TRUCK_7_49T*, *EUR_TRUCK_11_99T*, *EUR_TRUCK_40T* or *EUR_TRAILER_TRUCK*. At most ten profiles may be used within a single optimization.   Please note that the upper bound on number of different routing profiles is a technical limit. Check your individual price plan or contract to see which limits apply. 
        /// </summary>
        /// <value>A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the predefined profiles *EUR_PEDESTRIAN*, *EUR_BICYCLE*, *EUR_CAR*, *EUR_VAN*, *EUR_TRUCK_7_49T*, *EUR_TRUCK_11_99T*, *EUR_TRUCK_40T* or *EUR_TRAILER_TRUCK*. At most ten profiles may be used within a single optimization.   Please note that the upper bound on number of different routing profiles is a technical limit. Check your individual price plan or contract to see which limits apply. </value>
        /// <example>EUR_VAN</example>
        [DataMember(Name = "profile", IsRequired = true, EmitDefaultValue = true)]
        public string Profile { get; set; }

        /// <summary>
        /// An additional factor to apply to the speed of the vehicle. When lower than one, the driving durations of the vehicle will increase, when greater than one, the driving durations of the vehicle will decrease. 
        /// </summary>
        /// <value>An additional factor to apply to the speed of the vehicle. When lower than one, the driving durations of the vehicle will increase, when greater than one, the driving durations of the vehicle will decrease. </value>
        /// <example>1.1</example>
        [DataMember(Name = "speedFactor", EmitDefaultValue = true)]
        public double? SpeedFactor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationVehicleRouting {\n");
            sb.Append("  Profile: ").Append(Profile).Append("\n");
            sb.Append("  SpeedFactor: ").Append(SpeedFactor).Append("\n");
            sb.Append("  Violations: ").Append(Violations).Append("\n");
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
            // SpeedFactor (double?) minimum
            if (this.SpeedFactor < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SpeedFactor, must be a value greater than or equal to 0.", new [] { "SpeedFactor" });
            }

            yield break;
        }
    }

}
