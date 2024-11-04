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
    /// Metrics providing insights into the current result of the optimization. These will be provided if the status of the optimization is *RUNNING*, *STOPPING* or *SUCCEEDED*. 
    /// </summary>
    [DataContract(Name = "Metrics")]
    public partial class RouteOptimizationMetrics : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationMetrics" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationMetrics() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationMetrics" /> class.
        /// </summary>
        /// <param name="numberOfUnscheduledOrders">The number of orders that are not planned by the optimization. (required).</param>
        /// <param name="numberOfRoutes">The number of routes that where scheduled by the optimization. (required).</param>
        /// <param name="totalCost">The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders.  (required).</param>
        /// <param name="totalDistance">The sum of the distances [m] of the scheduled routes. (required).</param>
        /// <param name="totalDuration">The sum of the durations [s] of the scheduled routes. (required).</param>
        public RouteOptimizationMetrics(int? numberOfUnscheduledOrders = default(int?), int? numberOfRoutes = default(int?), double? totalCost = default(double?), int? totalDistance = default(int?), int? totalDuration = default(int?))
        {
            // to ensure "numberOfUnscheduledOrders" is required (not null)
            if (numberOfUnscheduledOrders == null)
            {
                throw new ArgumentNullException("numberOfUnscheduledOrders is a required property for RouteOptimizationMetrics and cannot be null");
            }
            this.NumberOfUnscheduledOrders = numberOfUnscheduledOrders;
            // to ensure "numberOfRoutes" is required (not null)
            if (numberOfRoutes == null)
            {
                throw new ArgumentNullException("numberOfRoutes is a required property for RouteOptimizationMetrics and cannot be null");
            }
            this.NumberOfRoutes = numberOfRoutes;
            // to ensure "totalCost" is required (not null)
            if (totalCost == null)
            {
                throw new ArgumentNullException("totalCost is a required property for RouteOptimizationMetrics and cannot be null");
            }
            this.TotalCost = totalCost;
            // to ensure "totalDistance" is required (not null)
            if (totalDistance == null)
            {
                throw new ArgumentNullException("totalDistance is a required property for RouteOptimizationMetrics and cannot be null");
            }
            this.TotalDistance = totalDistance;
            // to ensure "totalDuration" is required (not null)
            if (totalDuration == null)
            {
                throw new ArgumentNullException("totalDuration is a required property for RouteOptimizationMetrics and cannot be null");
            }
            this.TotalDuration = totalDuration;
        }

        /// <summary>
        /// The number of orders that are not planned by the optimization.
        /// </summary>
        /// <value>The number of orders that are not planned by the optimization.</value>
        /// <example>0</example>
        [DataMember(Name = "numberOfUnscheduledOrders", IsRequired = true, EmitDefaultValue = true)]
        public int? NumberOfUnscheduledOrders { get; set; }

        /// <summary>
        /// The number of routes that where scheduled by the optimization.
        /// </summary>
        /// <value>The number of routes that where scheduled by the optimization.</value>
        /// <example>97</example>
        [DataMember(Name = "numberOfRoutes", IsRequired = true, EmitDefaultValue = true)]
        public int? NumberOfRoutes { get; set; }

        /// <summary>
        /// The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders. 
        /// </summary>
        /// <value>The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders. </value>
        /// <example>12345</example>
        [DataMember(Name = "totalCost", IsRequired = true, EmitDefaultValue = true)]
        public double? TotalCost { get; set; }

        /// <summary>
        /// The sum of the distances [m] of the scheduled routes.
        /// </summary>
        /// <value>The sum of the distances [m] of the scheduled routes.</value>
        /// <example>45678901</example>
        [DataMember(Name = "totalDistance", IsRequired = true, EmitDefaultValue = true)]
        public int? TotalDistance { get; set; }

        /// <summary>
        /// The sum of the durations [s] of the scheduled routes.
        /// </summary>
        /// <value>The sum of the durations [s] of the scheduled routes.</value>
        /// <example>2179392</example>
        [DataMember(Name = "totalDuration", IsRequired = true, EmitDefaultValue = true)]
        public int? TotalDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationMetrics {\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // NumberOfUnscheduledOrders (int?) minimum
            if (this.NumberOfUnscheduledOrders < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NumberOfUnscheduledOrders, must be a value greater than or equal to 0.", new [] { "NumberOfUnscheduledOrders" });
            }

            // NumberOfRoutes (int?) minimum
            if (this.NumberOfRoutes < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NumberOfRoutes, must be a value greater than or equal to 0.", new [] { "NumberOfRoutes" });
            }

            // TotalDistance (int?) minimum
            if (this.TotalDistance < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalDistance, must be a value greater than or equal to 0.", new [] { "TotalDistance" });
            }

            // TotalDuration (int?) minimum
            if (this.TotalDuration < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalDuration, must be a value greater than or equal to 0.", new [] { "TotalDuration" });
            }

            yield break;
        }
    }

}