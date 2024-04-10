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
    /// A list of orders that should be scheduled by the optimization on the routes. When providing pickup-delivery orders, it is not possible to provide other order types. If pickup orders or delivery orders are provided, at least one depot must be provided where the pickup orders can be delivered to or the delivery orders can be picked up from. The unique identifiers of the orders must by unique across the three types.  Orders of the same type always satisfy the \&quot;last in, first out\&quot; (LIFO) principle, with respect to each other. When an order is picked up while another order of the same type is already loaded, the former should be delivered before the latter. Orders of different types do not have to satisfy the LIFO principle. For example, if a pickup order is picked up while a delivery order is loaded, the delivery order can be delivered before the pickup order is delivered at depot. 
    /// </summary>
    [DataContract(Name = "Orders")]
    public partial class Orders : IEquatable<Orders>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Orders" /> class.
        /// </summary>
        /// <param name="pickups">A list of orders that must be picked up from a specific location and transported to a depot.   Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply. .</param>
        /// <param name="deliveries">A list of orders that must be delivered to a specific location and transported from a depot.   Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. .</param>
        /// <param name="pickupDeliveries">A list of orders that must be picked up at a specific location and delivered to a specific location.   Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. .</param>
        public Orders(List<PickupOrder> pickups = default(List<PickupOrder>), List<DeliveryOrder> deliveries = default(List<DeliveryOrder>), List<PickupDeliveryOrder> pickupDeliveries = default(List<PickupDeliveryOrder>))
        {
            this.Pickups = pickups;
            this.Deliveries = deliveries;
            this.PickupDeliveries = pickupDeliveries;
        }

        /// <summary>
        /// A list of orders that must be picked up from a specific location and transported to a depot.   Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply. 
        /// </summary>
        /// <value>A list of orders that must be picked up from a specific location and transported to a depot.   Please note that the upper bound on number of pickups is a technical limit. Check your individual price plan or contract to see which limits apply. </value>
        [DataMember(Name = "pickups", EmitDefaultValue = false)]
        public List<PickupOrder> Pickups { get; set; }

        /// <summary>
        /// A list of orders that must be delivered to a specific location and transported from a depot.   Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. 
        /// </summary>
        /// <value>A list of orders that must be delivered to a specific location and transported from a depot.   Please note that the upper bound on number of deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. </value>
        [DataMember(Name = "deliveries", EmitDefaultValue = false)]
        public List<DeliveryOrder> Deliveries { get; set; }

        /// <summary>
        /// A list of orders that must be picked up at a specific location and delivered to a specific location.   Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. 
        /// </summary>
        /// <value>A list of orders that must be picked up at a specific location and delivered to a specific location.   Please note that the upper bound on number of pickup-deliveries is a technical limit. Check your individual price plan or contract to see which limits apply. </value>
        [DataMember(Name = "pickupDeliveries", EmitDefaultValue = false)]
        public List<PickupDeliveryOrder> PickupDeliveries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Orders {\n");
            sb.Append("  Pickups: ").Append(Pickups).Append("\n");
            sb.Append("  Deliveries: ").Append(Deliveries).Append("\n");
            sb.Append("  PickupDeliveries: ").Append(PickupDeliveries).Append("\n");
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
            return this.Equals(input as Orders);
        }

        /// <summary>
        /// Returns true if Orders instances are equal
        /// </summary>
        /// <param name="input">Instance of Orders to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Orders input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Pickups == input.Pickups ||
                    this.Pickups != null &&
                    input.Pickups != null &&
                    this.Pickups.SequenceEqual(input.Pickups)
                ) && 
                (
                    this.Deliveries == input.Deliveries ||
                    this.Deliveries != null &&
                    input.Deliveries != null &&
                    this.Deliveries.SequenceEqual(input.Deliveries)
                ) && 
                (
                    this.PickupDeliveries == input.PickupDeliveries ||
                    this.PickupDeliveries != null &&
                    input.PickupDeliveries != null &&
                    this.PickupDeliveries.SequenceEqual(input.PickupDeliveries)
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
                if (this.Pickups != null)
                {
                    hashCode = (hashCode * 59) + this.Pickups.GetHashCode();
                }
                if (this.Deliveries != null)
                {
                    hashCode = (hashCode * 59) + this.Deliveries.GetHashCode();
                }
                if (this.PickupDeliveries != null)
                {
                    hashCode = (hashCode * 59) + this.PickupDeliveries.GetHashCode();
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
