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
    /// Information about the order.
    /// </summary>
    [DataContract(Name = "OrderProperties")]
    public partial class OrderProperties : IEquatable<OrderProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderProperties" /> class.
        /// </summary>
        /// <param name="loads">A list of load definitions that describe the necessary vehicle capacity to transport the order. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. .</param>
        /// <param name="outsourcingCost">Defines the cost for not scheduling the order on a route. This cost is weighed against the cost of scheduling the order on a route. When omitted the optimization will try to schedule the order regardless of the added cost. .</param>
        /// <param name="categories">A list of categories the order belongs to that can be used to describe constraints..</param>
        public OrderProperties(List<Load> loads = default(List<Load>), double outsourcingCost = default(double), List<string> categories = default(List<string>))
        {
            this.Loads = loads;
            this.OutsourcingCost = outsourcingCost;
            this.Categories = categories;
        }

        /// <summary>
        /// A list of load definitions that describe the necessary vehicle capacity to transport the order. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. 
        /// </summary>
        /// <value>A list of load definitions that describe the necessary vehicle capacity to transport the order. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. </value>
        [DataMember(Name = "loads", EmitDefaultValue = false)]
        public List<Load> Loads { get; set; }

        /// <summary>
        /// Defines the cost for not scheduling the order on a route. This cost is weighed against the cost of scheduling the order on a route. When omitted the optimization will try to schedule the order regardless of the added cost. 
        /// </summary>
        /// <value>Defines the cost for not scheduling the order on a route. This cost is weighed against the cost of scheduling the order on a route. When omitted the optimization will try to schedule the order regardless of the added cost. </value>
        [DataMember(Name = "outsourcingCost", EmitDefaultValue = false)]
        public double OutsourcingCost { get; set; }

        /// <summary>
        /// A list of categories the order belongs to that can be used to describe constraints.
        /// </summary>
        /// <value>A list of categories the order belongs to that can be used to describe constraints.</value>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrderProperties {\n");
            sb.Append("  Loads: ").Append(Loads).Append("\n");
            sb.Append("  OutsourcingCost: ").Append(OutsourcingCost).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
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
            return this.Equals(input as OrderProperties);
        }

        /// <summary>
        /// Returns true if OrderProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderProperties input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Loads == input.Loads ||
                    this.Loads != null &&
                    input.Loads != null &&
                    this.Loads.SequenceEqual(input.Loads)
                ) && 
                (
                    this.OutsourcingCost == input.OutsourcingCost ||
                    this.OutsourcingCost.Equals(input.OutsourcingCost)
                ) && 
                (
                    this.Categories == input.Categories ||
                    this.Categories != null &&
                    input.Categories != null &&
                    this.Categories.SequenceEqual(input.Categories)
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
                if (this.Loads != null)
                {
                    hashCode = (hashCode * 59) + this.Loads.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OutsourcingCost.GetHashCode();
                if (this.Categories != null)
                {
                    hashCode = (hashCode * 59) + this.Categories.GetHashCode();
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
            // OutsourcingCost (double) minimum
            if (this.OutsourcingCost < (double)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OutsourcingCost, must be a value greater than or equal to 0.", new [] { "OutsourcingCost" });
            }

            yield break;
        }
    }

}
