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
    /// Describes constraints on combinations of orders, vehicles and depots.
    /// </summary>
    [DataContract(Name = "CombinationConstraints")]
    public partial class CombinationConstraints : IEquatable<CombinationConstraints>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinationConstraints" /> class.
        /// </summary>
        /// <param name="orderVehicle">A list of constraints on combinations of orders and vehicles..</param>
        /// <param name="depotVehicle">A list of constraints on combinations of depots and vehicles..</param>
        public CombinationConstraints(List<OrderVehicleCombinationConstraint> orderVehicle = default(List<OrderVehicleCombinationConstraint>), List<DepotVehicleCombinationConstraint> depotVehicle = default(List<DepotVehicleCombinationConstraint>))
        {
            this.OrderVehicle = orderVehicle;
            this.DepotVehicle = depotVehicle;
        }

        /// <summary>
        /// A list of constraints on combinations of orders and vehicles.
        /// </summary>
        /// <value>A list of constraints on combinations of orders and vehicles.</value>
        [DataMember(Name = "orderVehicle", EmitDefaultValue = false)]
        public List<OrderVehicleCombinationConstraint> OrderVehicle { get; set; }

        /// <summary>
        /// A list of constraints on combinations of depots and vehicles.
        /// </summary>
        /// <value>A list of constraints on combinations of depots and vehicles.</value>
        [DataMember(Name = "depotVehicle", EmitDefaultValue = false)]
        public List<DepotVehicleCombinationConstraint> DepotVehicle { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CombinationConstraints {\n");
            sb.Append("  OrderVehicle: ").Append(OrderVehicle).Append("\n");
            sb.Append("  DepotVehicle: ").Append(DepotVehicle).Append("\n");
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
            return this.Equals(input as CombinationConstraints);
        }

        /// <summary>
        /// Returns true if CombinationConstraints instances are equal
        /// </summary>
        /// <param name="input">Instance of CombinationConstraints to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CombinationConstraints input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OrderVehicle == input.OrderVehicle ||
                    this.OrderVehicle != null &&
                    input.OrderVehicle != null &&
                    this.OrderVehicle.SequenceEqual(input.OrderVehicle)
                ) && 
                (
                    this.DepotVehicle == input.DepotVehicle ||
                    this.DepotVehicle != null &&
                    input.DepotVehicle != null &&
                    this.DepotVehicle.SequenceEqual(input.DepotVehicle)
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
                if (this.OrderVehicle != null)
                {
                    hashCode = (hashCode * 59) + this.OrderVehicle.GetHashCode();
                }
                if (this.DepotVehicle != null)
                {
                    hashCode = (hashCode * 59) + this.DepotVehicle.GetHashCode();
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
