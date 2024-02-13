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
    /// A location visit on a route where one or more tasks are scheduled. 
    /// </summary>
    [DataContract(Name = "Stop")]
    public partial class Stop : IEquatable<Stop>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Stop" /> class.
        /// </summary>
        /// <param name="locationId">The unique identifier of the location where this stop is taking place..</param>
        /// <param name="approach">approach.</param>
        /// <param name="arrival">The point in time when the vehicle arrives at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="preparationDuration">A period of time [s] that is required between the arrival at the location and the start of the first appointment. The preparation duration is scheduled before tasks can be executed at the stop..</param>
        /// <param name="appointments">A list of appointments that describe the tasks that are scheduled for execution at this stop. Consecutive tasks are grouped into an appointment if they have been assigned to the same time slot. .</param>
        /// <param name="departure">The point in time when the vehicle departs at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        public Stop(string locationId = default(string), Leg approach = default(Leg), DateTimeOffset arrival = default(DateTimeOffset), int preparationDuration = default(int), List<Appointment> appointments = default(List<Appointment>), DateTimeOffset departure = default(DateTimeOffset))
        {
            this.LocationId = locationId;
            this.Approach = approach;
            this.Arrival = arrival;
            this.PreparationDuration = preparationDuration;
            this.Appointments = appointments;
            this.Departure = departure;
        }

        /// <summary>
        /// The unique identifier of the location where this stop is taking place.
        /// </summary>
        /// <value>The unique identifier of the location where this stop is taking place.</value>
        [DataMember(Name = "locationId", EmitDefaultValue = false)]
        public string LocationId { get; set; }

        /// <summary>
        /// Gets or Sets Approach
        /// </summary>
        [DataMember(Name = "approach", EmitDefaultValue = false)]
        public Leg Approach { get; set; }

        /// <summary>
        /// The point in time when the vehicle arrives at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the vehicle arrives at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "arrival", EmitDefaultValue = false)]
        public DateTimeOffset Arrival { get; set; }

        /// <summary>
        /// A period of time [s] that is required between the arrival at the location and the start of the first appointment. The preparation duration is scheduled before tasks can be executed at the stop.
        /// </summary>
        /// <value>A period of time [s] that is required between the arrival at the location and the start of the first appointment. The preparation duration is scheduled before tasks can be executed at the stop.</value>
        [DataMember(Name = "preparationDuration", EmitDefaultValue = false)]
        public int PreparationDuration { get; set; }

        /// <summary>
        /// A list of appointments that describe the tasks that are scheduled for execution at this stop. Consecutive tasks are grouped into an appointment if they have been assigned to the same time slot. 
        /// </summary>
        /// <value>A list of appointments that describe the tasks that are scheduled for execution at this stop. Consecutive tasks are grouped into an appointment if they have been assigned to the same time slot. </value>
        [DataMember(Name = "appointments", EmitDefaultValue = false)]
        public List<Appointment> Appointments { get; set; }

        /// <summary>
        /// The point in time when the vehicle departs at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the vehicle departs at the location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "departure", EmitDefaultValue = false)]
        public DateTimeOffset Departure { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Stop {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  Approach: ").Append(Approach).Append("\n");
            sb.Append("  Arrival: ").Append(Arrival).Append("\n");
            sb.Append("  PreparationDuration: ").Append(PreparationDuration).Append("\n");
            sb.Append("  Appointments: ").Append(Appointments).Append("\n");
            sb.Append("  Departure: ").Append(Departure).Append("\n");
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
            return this.Equals(input as Stop);
        }

        /// <summary>
        /// Returns true if Stop instances are equal
        /// </summary>
        /// <param name="input">Instance of Stop to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Stop input)
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
                    this.PreparationDuration == input.PreparationDuration ||
                    this.PreparationDuration.Equals(input.PreparationDuration)
                ) && 
                (
                    this.Appointments == input.Appointments ||
                    this.Appointments != null &&
                    input.Appointments != null &&
                    this.Appointments.SequenceEqual(input.Appointments)
                ) && 
                (
                    this.Departure == input.Departure ||
                    (this.Departure != null &&
                    this.Departure.Equals(input.Departure))
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
                hashCode = (hashCode * 59) + this.PreparationDuration.GetHashCode();
                if (this.Appointments != null)
                {
                    hashCode = (hashCode * 59) + this.Appointments.GetHashCode();
                }
                if (this.Departure != null)
                {
                    hashCode = (hashCode * 59) + this.Departure.GetHashCode();
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

            // PreparationDuration (int) minimum
            if (this.PreparationDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PreparationDuration, must be a value greater than or equal to 0.", new [] { "PreparationDuration" });
            }

            yield break;
        }
    }

}
