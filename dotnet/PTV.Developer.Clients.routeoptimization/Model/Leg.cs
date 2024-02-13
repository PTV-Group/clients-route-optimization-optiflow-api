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
    /// A section of a route where a vehicle travels from one location to another.
    /// </summary>
    [DataContract(Name = "Leg")]
    public partial class Leg : IEquatable<Leg>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Leg" /> class.
        /// </summary>
        /// <param name="startLocationId">The unique identifier of the location where the vehicle departs..</param>
        /// <param name="departure">The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="endLocationId">The unique identifier of the location where the vehicle arrives..</param>
        /// <param name="arrival">The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="breaks">A list of breaks taken while travelling from the start location to the end location..</param>
        /// <param name="distance">The distance [m] travelled between the start location and end location..</param>
        /// <param name="drivingDuration">The duration [s] it takes to drive from the start location to the end location..</param>
        public Leg(string startLocationId = default(string), DateTimeOffset departure = default(DateTimeOffset), string endLocationId = default(string), DateTimeOffset arrival = default(DateTimeOffset), List<Break> breaks = default(List<Break>), int distance = default(int), int drivingDuration = default(int))
        {
            this.StartLocationId = startLocationId;
            this.Departure = departure;
            this.EndLocationId = endLocationId;
            this.Arrival = arrival;
            this.Breaks = breaks;
            this.Distance = distance;
            this.DrivingDuration = drivingDuration;
        }

        /// <summary>
        /// The unique identifier of the location where the vehicle departs.
        /// </summary>
        /// <value>The unique identifier of the location where the vehicle departs.</value>
        [DataMember(Name = "startLocationId", EmitDefaultValue = false)]
        public string StartLocationId { get; set; }

        /// <summary>
        /// The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "departure", EmitDefaultValue = false)]
        public DateTimeOffset Departure { get; set; }

        /// <summary>
        /// The unique identifier of the location where the vehicle arrives.
        /// </summary>
        /// <value>The unique identifier of the location where the vehicle arrives.</value>
        [DataMember(Name = "endLocationId", EmitDefaultValue = false)]
        public string EndLocationId { get; set; }

        /// <summary>
        /// The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "arrival", EmitDefaultValue = false)]
        public DateTimeOffset Arrival { get; set; }

        /// <summary>
        /// A list of breaks taken while travelling from the start location to the end location.
        /// </summary>
        /// <value>A list of breaks taken while travelling from the start location to the end location.</value>
        [DataMember(Name = "breaks", EmitDefaultValue = false)]
        public List<Break> Breaks { get; set; }

        /// <summary>
        /// The distance [m] travelled between the start location and end location.
        /// </summary>
        /// <value>The distance [m] travelled between the start location and end location.</value>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The duration [s] it takes to drive from the start location to the end location.
        /// </summary>
        /// <value>The duration [s] it takes to drive from the start location to the end location.</value>
        [DataMember(Name = "drivingDuration", EmitDefaultValue = false)]
        public int DrivingDuration { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Leg {\n");
            sb.Append("  StartLocationId: ").Append(StartLocationId).Append("\n");
            sb.Append("  Departure: ").Append(Departure).Append("\n");
            sb.Append("  EndLocationId: ").Append(EndLocationId).Append("\n");
            sb.Append("  Arrival: ").Append(Arrival).Append("\n");
            sb.Append("  Breaks: ").Append(Breaks).Append("\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  DrivingDuration: ").Append(DrivingDuration).Append("\n");
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
            return this.Equals(input as Leg);
        }

        /// <summary>
        /// Returns true if Leg instances are equal
        /// </summary>
        /// <param name="input">Instance of Leg to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Leg input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.StartLocationId == input.StartLocationId ||
                    (this.StartLocationId != null &&
                    this.StartLocationId.Equals(input.StartLocationId))
                ) && 
                (
                    this.Departure == input.Departure ||
                    (this.Departure != null &&
                    this.Departure.Equals(input.Departure))
                ) && 
                (
                    this.EndLocationId == input.EndLocationId ||
                    (this.EndLocationId != null &&
                    this.EndLocationId.Equals(input.EndLocationId))
                ) && 
                (
                    this.Arrival == input.Arrival ||
                    (this.Arrival != null &&
                    this.Arrival.Equals(input.Arrival))
                ) && 
                (
                    this.Breaks == input.Breaks ||
                    this.Breaks != null &&
                    input.Breaks != null &&
                    this.Breaks.SequenceEqual(input.Breaks)
                ) && 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.DrivingDuration == input.DrivingDuration ||
                    this.DrivingDuration.Equals(input.DrivingDuration)
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
                if (this.StartLocationId != null)
                {
                    hashCode = (hashCode * 59) + this.StartLocationId.GetHashCode();
                }
                if (this.Departure != null)
                {
                    hashCode = (hashCode * 59) + this.Departure.GetHashCode();
                }
                if (this.EndLocationId != null)
                {
                    hashCode = (hashCode * 59) + this.EndLocationId.GetHashCode();
                }
                if (this.Arrival != null)
                {
                    hashCode = (hashCode * 59) + this.Arrival.GetHashCode();
                }
                if (this.Breaks != null)
                {
                    hashCode = (hashCode * 59) + this.Breaks.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.DrivingDuration.GetHashCode();
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
            // StartLocationId (string) maxLength
            if (this.StartLocationId != null && this.StartLocationId.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartLocationId, length must be less than 36.", new [] { "StartLocationId" });
            }

            // StartLocationId (string) minLength
            if (this.StartLocationId != null && this.StartLocationId.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartLocationId, length must be greater than 1.", new [] { "StartLocationId" });
            }

            // StartLocationId (string) pattern
            Regex regexStartLocationId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexStartLocationId.Match(this.StartLocationId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartLocationId, must match a pattern of " + regexStartLocationId, new [] { "StartLocationId" });
            }

            // EndLocationId (string) maxLength
            if (this.EndLocationId != null && this.EndLocationId.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EndLocationId, length must be less than 36.", new [] { "EndLocationId" });
            }

            // EndLocationId (string) minLength
            if (this.EndLocationId != null && this.EndLocationId.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EndLocationId, length must be greater than 1.", new [] { "EndLocationId" });
            }

            // EndLocationId (string) pattern
            Regex regexEndLocationId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexEndLocationId.Match(this.EndLocationId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EndLocationId, must match a pattern of " + regexEndLocationId, new [] { "EndLocationId" });
            }

            // Distance (int) minimum
            if (this.Distance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // DrivingDuration (int) minimum
            if (this.DrivingDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DrivingDuration, must be a value greater than or equal to 0.", new [] { "DrivingDuration" });
            }

            yield break;
        }
    }

}
