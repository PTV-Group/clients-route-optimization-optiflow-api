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
    /// Describes the start of a route assigned to the vehicle.
    /// </summary>
    [DataContract(Name = "VehicleStart")]
    public partial class VehicleStart : IEquatable<VehicleStart>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleStart" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VehicleStart() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleStart" /> class.
        /// </summary>
        /// <param name="locationId">The unique identifier of the location where a route assigned to the vehicle must start. (required).</param>
        /// <param name="earliestStartTime">The earliest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC.  (required).</param>
        /// <param name="latestStartTime">The latest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. .</param>
        /// <param name="duration">Describes how long [s] it takes for the vehicle to depart at its start location after the route starts. (default to 0).</param>
        public VehicleStart(string locationId = default(string), DateTimeOffset earliestStartTime = default(DateTimeOffset), DateTimeOffset latestStartTime = default(DateTimeOffset), int duration = 0)
        {
            // to ensure "locationId" is required (not null)
            if (locationId == null) {
                throw new ArgumentNullException("locationId is a required property for VehicleStart and cannot be null");
            }
            this.LocationId = locationId;
            this.EarliestStartTime = earliestStartTime;
            this.LatestStartTime = latestStartTime;
            this.Duration = duration;
        }

        /// <summary>
        /// The unique identifier of the location where a route assigned to the vehicle must start.
        /// </summary>
        /// <value>The unique identifier of the location where a route assigned to the vehicle must start.</value>
        [DataMember(Name = "locationId", IsRequired = true, EmitDefaultValue = false)]
        public string LocationId { get; set; }

        /// <summary>
        /// The earliest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
        /// </summary>
        /// <value>The earliest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. </value>
        [DataMember(Name = "earliestStartTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset EarliestStartTime { get; set; }

        /// <summary>
        /// The latest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. 
        /// </summary>
        /// <value>The latest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before &#x60;1970-01-01T00:00:00+00:00&#x60;. The date must provide an offset to UTC. </value>
        [DataMember(Name = "latestStartTime", EmitDefaultValue = false)]
        public DateTimeOffset LatestStartTime { get; set; }

        /// <summary>
        /// Describes how long [s] it takes for the vehicle to depart at its start location after the route starts.
        /// </summary>
        /// <value>Describes how long [s] it takes for the vehicle to depart at its start location after the route starts.</value>
        [DataMember(Name = "duration", EmitDefaultValue = false)]
        public int Duration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VehicleStart {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  EarliestStartTime: ").Append(EarliestStartTime).Append("\n");
            sb.Append("  LatestStartTime: ").Append(LatestStartTime).Append("\n");
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
            return this.Equals(input as VehicleStart);
        }

        /// <summary>
        /// Returns true if VehicleStart instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleStart to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleStart input)
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
                    this.EarliestStartTime == input.EarliestStartTime ||
                    (this.EarliestStartTime != null &&
                    this.EarliestStartTime.Equals(input.EarliestStartTime))
                ) && 
                (
                    this.LatestStartTime == input.LatestStartTime ||
                    (this.LatestStartTime != null &&
                    this.LatestStartTime.Equals(input.LatestStartTime))
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
                if (this.LocationId != null)
                {
                    hashCode = (hashCode * 59) + this.LocationId.GetHashCode();
                }
                if (this.EarliestStartTime != null)
                {
                    hashCode = (hashCode * 59) + this.EarliestStartTime.GetHashCode();
                }
                if (this.LatestStartTime != null)
                {
                    hashCode = (hashCode * 59) + this.LatestStartTime.GetHashCode();
                }
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
