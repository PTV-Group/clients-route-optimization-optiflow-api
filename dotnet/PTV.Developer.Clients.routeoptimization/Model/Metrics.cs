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
    /// Metrics providing insights into the current result of the optimization. These will be provided if the status of the optimization is *RUNNING*, *STOPPING* or *SUCCEEDED*. 
    /// </summary>
    [DataContract(Name = "Metrics")]
    public partial class Metrics : IEquatable<Metrics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Metrics" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Metrics() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Metrics" /> class.
        /// </summary>
        /// <param name="numberOfUnscheduledOrders">The number of orders that are not planned by the optimization. (required).</param>
        /// <param name="numberOfRoutes">The number of routes that where scheduled by the optimization. (required).</param>
        /// <param name="totalCost">The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders.  (required).</param>
        /// <param name="totalDistance">The sum of the distances [m] of the scheduled routes. (required).</param>
        /// <param name="totalDuration">The sum of the durations [s] of the scheduled routes. (required).</param>
        public Metrics(int numberOfUnscheduledOrders = default(int), int numberOfRoutes = default(int), double totalCost = default(double), int totalDistance = default(int), int totalDuration = default(int))
        {
            this.NumberOfUnscheduledOrders = numberOfUnscheduledOrders;
            this.NumberOfRoutes = numberOfRoutes;
            this.TotalCost = totalCost;
            this.TotalDistance = totalDistance;
            this.TotalDuration = totalDuration;
        }

        /// <summary>
        /// The number of orders that are not planned by the optimization.
        /// </summary>
        /// <value>The number of orders that are not planned by the optimization.</value>
        [DataMember(Name = "numberOfUnscheduledOrders", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfUnscheduledOrders { get; set; }

        /// <summary>
        /// The number of routes that where scheduled by the optimization.
        /// </summary>
        /// <value>The number of routes that where scheduled by the optimization.</value>
        [DataMember(Name = "numberOfRoutes", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfRoutes { get; set; }

        /// <summary>
        /// The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders. 
        /// </summary>
        /// <value>The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders. </value>
        [DataMember(Name = "totalCost", IsRequired = true, EmitDefaultValue = false)]
        public double TotalCost { get; set; }

        /// <summary>
        /// The sum of the distances [m] of the scheduled routes.
        /// </summary>
        /// <value>The sum of the distances [m] of the scheduled routes.</value>
        [DataMember(Name = "totalDistance", IsRequired = true, EmitDefaultValue = false)]
        public int TotalDistance { get; set; }

        /// <summary>
        /// The sum of the durations [s] of the scheduled routes.
        /// </summary>
        /// <value>The sum of the durations [s] of the scheduled routes.</value>
        [DataMember(Name = "totalDuration", IsRequired = true, EmitDefaultValue = false)]
        public int TotalDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Metrics {\n");
            sb.Append("  NumberOfUnscheduledOrders: ").Append(NumberOfUnscheduledOrders).Append("\n");
            sb.Append("  NumberOfRoutes: ").Append(NumberOfRoutes).Append("\n");
            sb.Append("  TotalCost: ").Append(TotalCost).Append("\n");
            sb.Append("  TotalDistance: ").Append(TotalDistance).Append("\n");
            sb.Append("  TotalDuration: ").Append(TotalDuration).Append("\n");
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
            return this.Equals(input as Metrics);
        }

        /// <summary>
        /// Returns true if Metrics instances are equal
        /// </summary>
        /// <param name="input">Instance of Metrics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Metrics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NumberOfUnscheduledOrders == input.NumberOfUnscheduledOrders ||
                    this.NumberOfUnscheduledOrders.Equals(input.NumberOfUnscheduledOrders)
                ) && 
                (
                    this.NumberOfRoutes == input.NumberOfRoutes ||
                    this.NumberOfRoutes.Equals(input.NumberOfRoutes)
                ) && 
                (
                    this.TotalCost == input.TotalCost ||
                    this.TotalCost.Equals(input.TotalCost)
                ) && 
                (
                    this.TotalDistance == input.TotalDistance ||
                    this.TotalDistance.Equals(input.TotalDistance)
                ) && 
                (
                    this.TotalDuration == input.TotalDuration ||
                    this.TotalDuration.Equals(input.TotalDuration)
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
                hashCode = (hashCode * 59) + this.NumberOfUnscheduledOrders.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfRoutes.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalCost.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalDistance.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalDuration.GetHashCode();
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
            // NumberOfUnscheduledOrders (int) minimum
            if (this.NumberOfUnscheduledOrders < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NumberOfUnscheduledOrders, must be a value greater than or equal to 0.", new [] { "NumberOfUnscheduledOrders" });
            }

            // NumberOfRoutes (int) minimum
            if (this.NumberOfRoutes < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NumberOfRoutes, must be a value greater than or equal to 0.", new [] { "NumberOfRoutes" });
            }

            // TotalDistance (int) minimum
            if (this.TotalDistance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalDistance, must be a value greater than or equal to 0.", new [] { "TotalDistance" });
            }

            // TotalDuration (int) minimum
            if (this.TotalDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalDuration, must be a value greater than or equal to 0.", new [] { "TotalDuration" });
            }

            yield break;
        }
    }

}
