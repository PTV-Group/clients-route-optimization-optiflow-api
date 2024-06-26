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
    /// Metrics providing insights into the route.
    /// </summary>
    [DataContract(Name = "RouteMetrics")]
    public partial class RouteMetrics : IEquatable<RouteMetrics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteMetrics" /> class.
        /// </summary>
        /// <param name="numberOfStops">The number of stops in the route. A stop is a visit at a location where one or more tasks are executed. .</param>
        /// <param name="cost">The cost of the route. This includes the cost per hour, cost per kilometer and fixed cost of the vehicle. .</param>
        /// <param name="distance">The distance [m] travelled on the route..</param>
        /// <param name="duration">The duration [s] of the route from start to end..</param>
        public RouteMetrics(int numberOfStops = default(int), double cost = default(double), int distance = default(int), int duration = default(int))
        {
            this.NumberOfStops = numberOfStops;
            this.Cost = cost;
            this.Distance = distance;
            this.Duration = duration;
        }

        /// <summary>
        /// The number of stops in the route. A stop is a visit at a location where one or more tasks are executed. 
        /// </summary>
        /// <value>The number of stops in the route. A stop is a visit at a location where one or more tasks are executed. </value>
        [DataMember(Name = "numberOfStops", EmitDefaultValue = false)]
        public int NumberOfStops { get; set; }

        /// <summary>
        /// The cost of the route. This includes the cost per hour, cost per kilometer and fixed cost of the vehicle. 
        /// </summary>
        /// <value>The cost of the route. This includes the cost per hour, cost per kilometer and fixed cost of the vehicle. </value>
        [DataMember(Name = "cost", EmitDefaultValue = false)]
        public double Cost { get; set; }

        /// <summary>
        /// The distance [m] travelled on the route.
        /// </summary>
        /// <value>The distance [m] travelled on the route.</value>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The duration [s] of the route from start to end.
        /// </summary>
        /// <value>The duration [s] of the route from start to end.</value>
        [DataMember(Name = "duration", EmitDefaultValue = false)]
        public int Duration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteMetrics {\n");
            sb.Append("  NumberOfStops: ").Append(NumberOfStops).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
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
            return this.Equals(input as RouteMetrics);
        }

        /// <summary>
        /// Returns true if RouteMetrics instances are equal
        /// </summary>
        /// <param name="input">Instance of RouteMetrics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RouteMetrics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NumberOfStops == input.NumberOfStops ||
                    this.NumberOfStops.Equals(input.NumberOfStops)
                ) && 
                (
                    this.Cost == input.Cost ||
                    this.Cost.Equals(input.Cost)
                ) && 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.Duration == input.Duration ||
                    this.Duration.Equals(input.Duration)
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
                hashCode = (hashCode * 59) + this.NumberOfStops.GetHashCode();
                hashCode = (hashCode * 59) + this.Cost.GetHashCode();
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.Duration.GetHashCode();
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
            // NumberOfStops (int) minimum
            if (this.NumberOfStops < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for NumberOfStops, must be a value greater than or equal to 0.", new [] { "NumberOfStops" });
            }

            // Distance (int) minimum
            if (this.Distance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // Duration (int) minimum
            if (this.Duration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Duration, must be a value greater than or equal to 0.", new [] { "Duration" });
            }

            yield break;
        }
    }

}
