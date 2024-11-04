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
    /// Specifies when the driver of the vehicle must take a break during the route.
    /// </summary>
    [DataContract(Name = "BreakSettings")]
    public partial class RouteOptimizationBreakSettings : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationBreakSettings" /> class.
        /// </summary>
        /// <param name="working">A list of restrictions that specify how long the driver of the vehicle may work without taking a break. All the time spent during a route is considered working time except for waiting time and break time. .</param>
        /// <param name="driving">A list of restrictions that specify how long the driver of the vehicle may drive without taking a break of at least the specified duration..</param>
        public RouteOptimizationBreakSettings(List<RouteOptimizationWorkingBreakSettings> working = default(List<RouteOptimizationWorkingBreakSettings>), List<RouteOptimizationDrivingBreakSettings> driving = default(List<RouteOptimizationDrivingBreakSettings>))
        {
            this.Working = working;
            this.Driving = driving;
        }

        /// <summary>
        /// A list of restrictions that specify how long the driver of the vehicle may work without taking a break. All the time spent during a route is considered working time except for waiting time and break time. 
        /// </summary>
        /// <value>A list of restrictions that specify how long the driver of the vehicle may work without taking a break. All the time spent during a route is considered working time except for waiting time and break time. </value>
        [DataMember(Name = "working", EmitDefaultValue = false)]
        public List<RouteOptimizationWorkingBreakSettings> Working { get; set; }

        /// <summary>
        /// A list of restrictions that specify how long the driver of the vehicle may drive without taking a break of at least the specified duration.
        /// </summary>
        /// <value>A list of restrictions that specify how long the driver of the vehicle may drive without taking a break of at least the specified duration.</value>
        [DataMember(Name = "driving", EmitDefaultValue = false)]
        public List<RouteOptimizationDrivingBreakSettings> Driving { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationBreakSettings {\n");
            sb.Append("  Working: ").Append(Working).Append("\n");
            sb.Append("  Driving: ").Append(Driving).Append("\n");
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
            yield break;
        }
    }

}