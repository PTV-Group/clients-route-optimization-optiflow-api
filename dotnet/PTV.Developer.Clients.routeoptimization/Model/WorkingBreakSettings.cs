/*
 * OptiFlow
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
    /// Restricts how long the driver of the vehicle may work without taking a break of at least the specified duration. All the time spent during a route is considered working time except for waiting time and break time. 
    /// </summary>
    [DataContract(Name = "WorkingBreakSettings")]
    public partial class WorkingBreakSettings : IEquatable<WorkingBreakSettings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkingBreakSettings" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WorkingBreakSettings() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkingBreakSettings" /> class.
        /// </summary>
        /// <param name="maximumWorkingDuration">Describes how long [s] the driver may work without taking a break of at least the specified duration. (required).</param>
        /// <param name="minimumBreakDuration">Specifies the duration [s] of a break a driver must take if they exceed the maximum working duration. (required).</param>
        public WorkingBreakSettings(int maximumWorkingDuration = default(int), int minimumBreakDuration = default(int))
        {
            this.MaximumWorkingDuration = maximumWorkingDuration;
            this.MinimumBreakDuration = minimumBreakDuration;
        }

        /// <summary>
        /// Describes how long [s] the driver may work without taking a break of at least the specified duration.
        /// </summary>
        /// <value>Describes how long [s] the driver may work without taking a break of at least the specified duration.</value>
        [DataMember(Name = "maximumWorkingDuration", IsRequired = true, EmitDefaultValue = false)]
        public int MaximumWorkingDuration { get; set; }

        /// <summary>
        /// Specifies the duration [s] of a break a driver must take if they exceed the maximum working duration.
        /// </summary>
        /// <value>Specifies the duration [s] of a break a driver must take if they exceed the maximum working duration.</value>
        [DataMember(Name = "minimumBreakDuration", IsRequired = true, EmitDefaultValue = false)]
        public int MinimumBreakDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WorkingBreakSettings {\n");
            sb.Append("  MaximumWorkingDuration: ").Append(MaximumWorkingDuration).Append("\n");
            sb.Append("  MinimumBreakDuration: ").Append(MinimumBreakDuration).Append("\n");
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
            return this.Equals(input as WorkingBreakSettings);
        }

        /// <summary>
        /// Returns true if WorkingBreakSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkingBreakSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkingBreakSettings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MaximumWorkingDuration == input.MaximumWorkingDuration ||
                    this.MaximumWorkingDuration.Equals(input.MaximumWorkingDuration)
                ) && 
                (
                    this.MinimumBreakDuration == input.MinimumBreakDuration ||
                    this.MinimumBreakDuration.Equals(input.MinimumBreakDuration)
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
                hashCode = (hashCode * 59) + this.MaximumWorkingDuration.GetHashCode();
                hashCode = (hashCode * 59) + this.MinimumBreakDuration.GetHashCode();
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
            // MaximumWorkingDuration (int) minimum
            if (this.MaximumWorkingDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MaximumWorkingDuration, must be a value greater than or equal to 0.", new [] { "MaximumWorkingDuration" });
            }

            // MinimumBreakDuration (int) minimum
            if (this.MinimumBreakDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MinimumBreakDuration, must be a value greater than or equal to 0.", new [] { "MinimumBreakDuration" });
            }

            yield break;
        }
    }

}