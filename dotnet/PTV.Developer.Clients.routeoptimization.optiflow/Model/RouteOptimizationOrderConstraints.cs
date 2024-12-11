/*
 * Route Optimization OptiFlow
 *
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
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
    /// Describes constraints on the way orders can be scheduled together on routes.
    /// </summary>
    [DataContract(Name = "OrderConstraints")]
    public partial class RouteOptimizationOrderConstraints : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationOrderConstraints" /> class.
        /// </summary>
        /// <param name="respectedSequences">A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up..</param>
        /// <param name="loadingIncompatibilities">A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle..</param>
        public RouteOptimizationOrderConstraints(List<RouteOptimizationRespectedOrderSequence> respectedSequences = default(List<RouteOptimizationRespectedOrderSequence>), List<RouteOptimizationLoadingIncompatibilityConstraint> loadingIncompatibilities = default(List<RouteOptimizationLoadingIncompatibilityConstraint>))
        {
            this.RespectedSequences = respectedSequences;
            this.LoadingIncompatibilities = loadingIncompatibilities;
        }

        /// <summary>
        /// A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up.
        /// </summary>
        /// <value>A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up.</value>
        [DataMember(Name = "respectedSequences", EmitDefaultValue = false)]
        public List<RouteOptimizationRespectedOrderSequence> RespectedSequences { get; set; }

        /// <summary>
        /// A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle.
        /// </summary>
        /// <value>A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle.</value>
        [DataMember(Name = "loadingIncompatibilities", EmitDefaultValue = false)]
        public List<RouteOptimizationLoadingIncompatibilityConstraint> LoadingIncompatibilities { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationOrderConstraints {\n");
            sb.Append("  RespectedSequences: ").Append(RespectedSequences).Append("\n");
            sb.Append("  LoadingIncompatibilities: ").Append(LoadingIncompatibilities).Append("\n");
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
