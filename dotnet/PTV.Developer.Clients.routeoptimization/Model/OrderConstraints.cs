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
    /// Describes constraints on the way orders can be scheduled together on routes.
    /// </summary>
    [DataContract(Name = "OrderConstraints")]
    public partial class OrderConstraints : IEquatable<OrderConstraints>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderConstraints" /> class.
        /// </summary>
        /// <param name="respectedSequences">A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up. .</param>
        /// <param name="loadingIncompatibilities">A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle..</param>
        public OrderConstraints(List<RespectedOrderSequence> respectedSequences = default(List<RespectedOrderSequence>), List<LoadingIncompatibilityConstraint> loadingIncompatibilities = default(List<LoadingIncompatibilityConstraint>))
        {
            this.RespectedSequences = respectedSequences;
            this.LoadingIncompatibilities = loadingIncompatibilities;
        }

        /// <summary>
        /// A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up. 
        /// </summary>
        /// <value>A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up. </value>
        [DataMember(Name = "respectedSequences", EmitDefaultValue = false)]
        public List<RespectedOrderSequence> RespectedSequences { get; set; }

        /// <summary>
        /// A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle.
        /// </summary>
        /// <value>A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle.</value>
        [DataMember(Name = "loadingIncompatibilities", EmitDefaultValue = false)]
        public List<LoadingIncompatibilityConstraint> LoadingIncompatibilities { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrderConstraints {\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OrderConstraints);
        }

        /// <summary>
        /// Returns true if OrderConstraints instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderConstraints to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderConstraints input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RespectedSequences == input.RespectedSequences ||
                    this.RespectedSequences != null &&
                    input.RespectedSequences != null &&
                    this.RespectedSequences.SequenceEqual(input.RespectedSequences)
                ) && 
                (
                    this.LoadingIncompatibilities == input.LoadingIncompatibilities ||
                    this.LoadingIncompatibilities != null &&
                    input.LoadingIncompatibilities != null &&
                    this.LoadingIncompatibilities.SequenceEqual(input.LoadingIncompatibilities)
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
                if (this.RespectedSequences != null)
                {
                    hashCode = (hashCode * 59) + this.RespectedSequences.GetHashCode();
                }
                if (this.LoadingIncompatibilities != null)
                {
                    hashCode = (hashCode * 59) + this.LoadingIncompatibilities.GetHashCode();
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
            yield break;
        }
    }

}