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
    /// Describes the end of a route.
    /// </summary>
    [DataContract(Name = "RouteEnd")]
    public partial class RouteEnd : IEquatable<RouteEnd>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteEnd" /> class.
        /// </summary>
        /// <param name="locationId">The unique identifier of the location where the route ends. This is the end location of the assigned vehicle. .</param>
        /// <param name="approach">approach.</param>
        /// <param name="arrival">The point in time when the vehicle arrives at its end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="duration">The duration [s] between the arrival at the end location and the end of the route..</param>
        /// <param name="end">The point in time when the route ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        public RouteEnd(string locationId = default(string), Leg approach = default(Leg), DateTimeOffset arrival = default(DateTimeOffset), int duration = default(int), DateTimeOffset end = default(DateTimeOffset))
        {
            this.LocationId = locationId;
            this.Approach = approach;
            this.Arrival = arrival;
            this.Duration = duration;
            this.End = end;
        }

        /// <summary>
        /// The unique identifier of the location where the route ends. This is the end location of the assigned vehicle. 
        /// </summary>
        /// <value>The unique identifier of the location where the route ends. This is the end location of the assigned vehicle. </value>
        [DataMember(Name = "locationId", EmitDefaultValue = false)]
        public string LocationId { get; set; }

        /// <summary>
        /// Gets or Sets Approach
        /// </summary>
        [DataMember(Name = "approach", EmitDefaultValue = false)]
        public Leg Approach { get; set; }

        /// <summary>
        /// The point in time when the vehicle arrives at its end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the vehicle arrives at its end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "arrival", EmitDefaultValue = false)]
        public DateTimeOffset Arrival { get; set; }

        /// <summary>
        /// The duration [s] between the arrival at the end location and the end of the route.
        /// </summary>
        /// <value>The duration [s] between the arrival at the end location and the end of the route.</value>
        [DataMember(Name = "duration", EmitDefaultValue = false)]
        public int Duration { get; set; }

        /// <summary>
        /// The point in time when the route ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the route ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public DateTimeOffset End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteEnd {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  Approach: ").Append(Approach).Append("\n");
            sb.Append("  Arrival: ").Append(Arrival).Append("\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as RouteEnd);
        }

        /// <summary>
        /// Returns true if RouteEnd instances are equal
        /// </summary>
        /// <param name="input">Instance of RouteEnd to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RouteEnd input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LocationId == input.LocationId ||
                    (this.LocationId != null &&
                    this.LocationId.Equals(input.LocationId))
                ) && 
                (
                    this.Approach == input.Approach ||
                    (this.Approach != null &&
                    this.Approach.Equals(input.Approach))
                ) && 
                (
                    this.Arrival == input.Arrival ||
                    (this.Arrival != null &&
                    this.Arrival.Equals(input.Arrival))
                ) && 
                (
                    this.Duration == input.Duration ||
                    this.Duration.Equals(input.Duration)
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.LocationId != null)
                {
                    hashCode = (hashCode * 59) + this.LocationId.GetHashCode();
                }
                if (this.Approach != null)
                {
                    hashCode = (hashCode * 59) + this.Approach.GetHashCode();
                }
                if (this.Arrival != null)
                {
                    hashCode = (hashCode * 59) + this.Arrival.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Duration.GetHashCode();
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
            // LocationId (string) maxLength
            if (this.LocationId != null && this.LocationId.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LocationId, length must be less than 36.", new [] { "LocationId" });
            }

            // LocationId (string) minLength
            if (this.LocationId != null && this.LocationId.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LocationId, length must be greater than 1.", new [] { "LocationId" });
            }

            // LocationId (string) pattern
            Regex regexLocationId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexLocationId.Match(this.LocationId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LocationId, must match a pattern of " + regexLocationId, new [] { "LocationId" });
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
