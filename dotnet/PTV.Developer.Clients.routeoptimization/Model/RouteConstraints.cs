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
    /// Describes constraints on the route that may be assigned to the vehicle.
    /// </summary>
    [DataContract(Name = "RouteConstraints")]
    public partial class RouteConstraints : IEquatable<RouteConstraints>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteConstraints" /> class.
        /// </summary>
        /// <param name="maximumDuration">Restricts the maximum duration [s] of the route assigned to the vehicle..</param>
        /// <param name="maximumDistance">Restricts the maximum distance [m] travelled on the route assigned to the vehicle..</param>
        public RouteConstraints(int maximumDuration = default(int), int maximumDistance = default(int))
        {
            this.MaximumDuration = maximumDuration;
            this.MaximumDistance = maximumDistance;
        }

        /// <summary>
        /// Restricts the maximum duration [s] of the route assigned to the vehicle.
        /// </summary>
        /// <value>Restricts the maximum duration [s] of the route assigned to the vehicle.</value>
        [DataMember(Name = "maximumDuration", EmitDefaultValue = false)]
        public int MaximumDuration { get; set; }

        /// <summary>
        /// Restricts the maximum distance [m] travelled on the route assigned to the vehicle.
        /// </summary>
        /// <value>Restricts the maximum distance [m] travelled on the route assigned to the vehicle.</value>
        [DataMember(Name = "maximumDistance", EmitDefaultValue = false)]
        public int MaximumDistance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteConstraints {\n");
            sb.Append("  MaximumDuration: ").Append(MaximumDuration).Append("\n");
            sb.Append("  MaximumDistance: ").Append(MaximumDistance).Append("\n");
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
            return this.Equals(input as RouteConstraints);
        }

        /// <summary>
        /// Returns true if RouteConstraints instances are equal
        /// </summary>
        /// <param name="input">Instance of RouteConstraints to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RouteConstraints input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MaximumDuration == input.MaximumDuration ||
                    this.MaximumDuration.Equals(input.MaximumDuration)
                ) && 
                (
                    this.MaximumDistance == input.MaximumDistance ||
                    this.MaximumDistance.Equals(input.MaximumDistance)
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
                hashCode = (hashCode * 59) + this.MaximumDuration.GetHashCode();
                hashCode = (hashCode * 59) + this.MaximumDistance.GetHashCode();
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
            // MaximumDuration (int) minimum
            if (this.MaximumDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumDuration, must be a value greater than or equal to 0.", new [] { "MaximumDuration" });
            }

            // MaximumDistance (int) minimum
            if (this.MaximumDistance < (int)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumDistance, must be a value greater than or equal to 1.", new [] { "MaximumDistance" });
            }

            yield break;
        }
    }

}
