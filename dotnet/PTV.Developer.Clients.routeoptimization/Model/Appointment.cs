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
    /// A collection of consecutive tasks that are allocated to a time slot.
    /// </summary>
    [DataContract(Name = "Appointment")]
    public partial class Appointment : IEquatable<Appointment>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Appointment" /> class.
        /// </summary>
        /// <param name="timeSlotId">The unique identifier of the time slot this appointment is assigned to..</param>
        /// <param name="breaks">A list of breaks that are scheduled to be taken before the appointment..</param>
        /// <param name="waitingDuration">The duration [s] of the waiting period before the appointment can start..</param>
        /// <param name="start">The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="preparationDuration">The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot..</param>
        /// <param name="tasks">The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. .</param>
        /// <param name="end">The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        public Appointment(string timeSlotId = default(string), List<Break> breaks = default(List<Break>), int waitingDuration = default(int), DateTimeOffset start = default(DateTimeOffset), int preparationDuration = default(int), List<Task> tasks = default(List<Task>), DateTimeOffset end = default(DateTimeOffset))
        {
            this.TimeSlotId = timeSlotId;
            this.Breaks = breaks;
            this.WaitingDuration = waitingDuration;
            this.Start = start;
            this.PreparationDuration = preparationDuration;
            this.Tasks = tasks;
            this.End = end;
        }

        /// <summary>
        /// The unique identifier of the time slot this appointment is assigned to.
        /// </summary>
        /// <value>The unique identifier of the time slot this appointment is assigned to.</value>
        [DataMember(Name = "timeSlotId", EmitDefaultValue = false)]
        public string TimeSlotId { get; set; }

        /// <summary>
        /// A list of breaks that are scheduled to be taken before the appointment.
        /// </summary>
        /// <value>A list of breaks that are scheduled to be taken before the appointment.</value>
        [DataMember(Name = "breaks", EmitDefaultValue = false)]
        public List<Break> Breaks { get; set; }

        /// <summary>
        /// The duration [s] of the waiting period before the appointment can start.
        /// </summary>
        /// <value>The duration [s] of the waiting period before the appointment can start.</value>
        [DataMember(Name = "waitingDuration", EmitDefaultValue = false)]
        public int WaitingDuration { get; set; }

        /// <summary>
        /// The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        public DateTimeOffset Start { get; set; }

        /// <summary>
        /// The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot.
        /// </summary>
        /// <value>The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot.</value>
        [DataMember(Name = "preparationDuration", EmitDefaultValue = false)]
        public int PreparationDuration { get; set; }

        /// <summary>
        /// The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. 
        /// </summary>
        /// <value>The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. </value>
        [DataMember(Name = "tasks", EmitDefaultValue = false)]
        public List<Task> Tasks { get; set; }

        /// <summary>
        /// The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public DateTimeOffset End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Appointment {\n");
            sb.Append("  TimeSlotId: ").Append(TimeSlotId).Append("\n");
            sb.Append("  Breaks: ").Append(Breaks).Append("\n");
            sb.Append("  WaitingDuration: ").Append(WaitingDuration).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  PreparationDuration: ").Append(PreparationDuration).Append("\n");
            sb.Append("  Tasks: ").Append(Tasks).Append("\n");
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
            return this.Equals(input as Appointment);
        }

        /// <summary>
        /// Returns true if Appointment instances are equal
        /// </summary>
        /// <param name="input">Instance of Appointment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Appointment input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TimeSlotId == input.TimeSlotId ||
                    (this.TimeSlotId != null &&
                    this.TimeSlotId.Equals(input.TimeSlotId))
                ) && 
                (
                    this.Breaks == input.Breaks ||
                    this.Breaks != null &&
                    input.Breaks != null &&
                    this.Breaks.SequenceEqual(input.Breaks)
                ) && 
                (
                    this.WaitingDuration == input.WaitingDuration ||
                    this.WaitingDuration.Equals(input.WaitingDuration)
                ) && 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.PreparationDuration == input.PreparationDuration ||
                    this.PreparationDuration.Equals(input.PreparationDuration)
                ) && 
                (
                    this.Tasks == input.Tasks ||
                    this.Tasks != null &&
                    input.Tasks != null &&
                    this.Tasks.SequenceEqual(input.Tasks)
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
                if (this.TimeSlotId != null)
                {
                    hashCode = (hashCode * 59) + this.TimeSlotId.GetHashCode();
                }
                if (this.Breaks != null)
                {
                    hashCode = (hashCode * 59) + this.Breaks.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.WaitingDuration.GetHashCode();
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PreparationDuration.GetHashCode();
                if (this.Tasks != null)
                {
                    hashCode = (hashCode * 59) + this.Tasks.GetHashCode();
                }
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
            // TimeSlotId (string) maxLength
            if (this.TimeSlotId != null && this.TimeSlotId.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TimeSlotId, length must be less than 36.", new [] { "TimeSlotId" });
            }

            // TimeSlotId (string) minLength
            if (this.TimeSlotId != null && this.TimeSlotId.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TimeSlotId, length must be greater than 1.", new [] { "TimeSlotId" });
            }

            // TimeSlotId (string) pattern
            Regex regexTimeSlotId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexTimeSlotId.Match(this.TimeSlotId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TimeSlotId, must match a pattern of " + regexTimeSlotId, new [] { "TimeSlotId" });
            }

            // WaitingDuration (int) minimum
            if (this.WaitingDuration < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WaitingDuration, must be a value greater than or equal to 0.", new [] { "WaitingDuration" });
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
