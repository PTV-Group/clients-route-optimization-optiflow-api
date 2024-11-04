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
    /// A collection of consecutive tasks that are allocated to a time slot.
    /// </summary>
    [DataContract(Name = "Appointment")]
    public partial class RouteOptimizationAppointment : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationAppointment" /> class.
        /// </summary>
        /// <param name="timeSlotId">The unique identifier of the time slot this appointment is assigned to..</param>
        /// <param name="breaks">A list of breaks that are scheduled to be taken before the appointment..</param>
        /// <param name="waitingDuration">The duration [s] of the waiting period before the appointment can start..</param>
        /// <param name="start">The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        /// <param name="preparationDuration">The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot..</param>
        /// <param name="tasks">The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. .</param>
        /// <param name="end">The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). .</param>
        public RouteOptimizationAppointment(string timeSlotId = default(string), List<RouteOptimizationBreak> breaks = default(List<RouteOptimizationBreak>), int? waitingDuration = default(int?), DateTimeOffset? start = default(DateTimeOffset?), int? preparationDuration = default(int?), List<RouteOptimizationTask> tasks = default(List<RouteOptimizationTask>), DateTimeOffset? end = default(DateTimeOffset?))
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
        /// <example>NOON</example>
        [DataMember(Name = "timeSlotId", EmitDefaultValue = true)]
        public string TimeSlotId { get; set; }

        /// <summary>
        /// A list of breaks that are scheduled to be taken before the appointment.
        /// </summary>
        /// <value>A list of breaks that are scheduled to be taken before the appointment.</value>
        [DataMember(Name = "breaks", EmitDefaultValue = false)]
        public List<RouteOptimizationBreak> Breaks { get; set; }

        /// <summary>
        /// The duration [s] of the waiting period before the appointment can start.
        /// </summary>
        /// <value>The duration [s] of the waiting period before the appointment can start.</value>
        /// <example>0</example>
        [DataMember(Name = "waitingDuration", EmitDefaultValue = true)]
        public int? WaitingDuration { get; set; }

        /// <summary>
        /// The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the appointment starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        /// <example>2023-10-03T12:00Z</example>
        [DataMember(Name = "start", EmitDefaultValue = true)]
        public DateTimeOffset? Start { get; set; }

        /// <summary>
        /// The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot.
        /// </summary>
        /// <value>The duration [s] of the preparation period before the first task can start. This is determined by the allocated time slot.</value>
        /// <example>1800</example>
        [DataMember(Name = "preparationDuration", EmitDefaultValue = true)]
        public int? PreparationDuration { get; set; }

        /// <summary>
        /// The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. 
        /// </summary>
        /// <value>The list of tasks that are scheduled to be executed within this appointment. Each task can either be a pickup or a delivery. For every order scheduled on the route, the route will contain a task describing the pickup of the order and a task describing the delivery of the order. When the order is a pickup order (resp. delivery order), its delivery task (resp. pickup task) will be scheduled at a depot. </value>
        [DataMember(Name = "tasks", EmitDefaultValue = false)]
        public List<RouteOptimizationTask> Tasks { get; set; }

        /// <summary>
        /// The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). 
        /// </summary>
        /// <value>The point in time when the appointment ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6). </value>
        /// <example>2023-10-03T13:00Z</example>
        [DataMember(Name = "end", EmitDefaultValue = true)]
        public DateTimeOffset? End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationAppointment {\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
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

            if (this.TimeSlotId != null) {
                // TimeSlotId (string) pattern
                Regex regexTimeSlotId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
                if (!regexTimeSlotId.Match(this.TimeSlotId).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TimeSlotId, must match a pattern of " + regexTimeSlotId, new [] { "TimeSlotId" });
                }
            }

            // WaitingDuration (int?) minimum
            if (this.WaitingDuration < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WaitingDuration, must be a value greater than or equal to 0.", new [] { "WaitingDuration" });
            }

            // PreparationDuration (int?) minimum
            if (this.PreparationDuration < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PreparationDuration, must be a value greater than or equal to 0.", new [] { "PreparationDuration" });
            }

            yield break;
        }
    }

}