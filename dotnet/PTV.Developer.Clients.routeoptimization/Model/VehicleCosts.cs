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
    /// Defines the costs for using the vehicle to execute tasks.
    /// </summary>
    [DataContract(Name = "VehicleCosts")]
    public partial class VehicleCosts : IEquatable<VehicleCosts>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleCosts" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VehicleCosts() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleCosts" /> class.
        /// </summary>
        /// <param name="perHour">Specifies the cost for every hour the vehicle is used. (required).</param>
        /// <param name="perKilometer">Specifies the cost for every kilometer driven with the vehicle. (required).</param>
        /// <param name="_fixed">Specifies the fixed cost for assigning a route to the vehicle. (default to 0D).</param>
        public VehicleCosts(double perHour = default(double), double perKilometer = default(double), double _fixed = 0D)
        {
            this.PerHour = perHour;
            this.PerKilometer = perKilometer;
            this.Fixed = _fixed;
        }

        /// <summary>
        /// Specifies the cost for every hour the vehicle is used.
        /// </summary>
        /// <value>Specifies the cost for every hour the vehicle is used.</value>
        [DataMember(Name = "perHour", IsRequired = true, EmitDefaultValue = false)]
        public double PerHour { get; set; }

        /// <summary>
        /// Specifies the cost for every kilometer driven with the vehicle.
        /// </summary>
        /// <value>Specifies the cost for every kilometer driven with the vehicle.</value>
        [DataMember(Name = "perKilometer", IsRequired = true, EmitDefaultValue = false)]
        public double PerKilometer { get; set; }

        /// <summary>
        /// Specifies the fixed cost for assigning a route to the vehicle.
        /// </summary>
        /// <value>Specifies the fixed cost for assigning a route to the vehicle.</value>
        [DataMember(Name = "fixed", EmitDefaultValue = false)]
        public double Fixed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VehicleCosts {\n");
            sb.Append("  PerHour: ").Append(PerHour).Append("\n");
            sb.Append("  PerKilometer: ").Append(PerKilometer).Append("\n");
            sb.Append("  Fixed: ").Append(Fixed).Append("\n");
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
            return this.Equals(input as VehicleCosts);
        }

        /// <summary>
        /// Returns true if VehicleCosts instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleCosts to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleCosts input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PerHour == input.PerHour ||
                    this.PerHour.Equals(input.PerHour)
                ) && 
                (
                    this.PerKilometer == input.PerKilometer ||
                    this.PerKilometer.Equals(input.PerKilometer)
                ) && 
                (
                    this.Fixed == input.Fixed ||
                    this.Fixed.Equals(input.Fixed)
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
                hashCode = (hashCode * 59) + this.PerHour.GetHashCode();
                hashCode = (hashCode * 59) + this.PerKilometer.GetHashCode();
                hashCode = (hashCode * 59) + this.Fixed.GetHashCode();
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
            // PerHour (double) minimum
            if (this.PerHour < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PerHour, must be a value greater than or equal to 0.", new [] { "PerHour" });
            }

            // PerKilometer (double) minimum
            if (this.PerKilometer < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PerKilometer, must be a value greater than or equal to 0.", new [] { "PerKilometer" });
            }

            // Fixed (double) minimum
            if (this.Fixed < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Fixed, must be a value greater than or equal to 0.", new [] { "Fixed" });
            }

            yield break;
        }
    }

}
