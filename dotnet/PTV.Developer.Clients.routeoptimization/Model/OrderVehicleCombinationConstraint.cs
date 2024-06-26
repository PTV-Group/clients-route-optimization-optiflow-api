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
    /// A constraint on the combination of orders and vehicles belonging to a certain category.
    /// </summary>
    [DataContract(Name = "OrderVehicleCombinationConstraint")]
    public partial class OrderVehicleCombinationConstraint : IEquatable<OrderVehicleCombinationConstraint>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public OrderVehicleCombinationConstraintType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderVehicleCombinationConstraint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderVehicleCombinationConstraint() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderVehicleCombinationConstraint" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="orderCategory">The category of orders to which the constraint applies. The constraint will be ignored if no order belongs to this category.  (required).</param>
        /// <param name="vehicleCategory">The category of vehicles to which the constraint applies. The constraint will be ignored if no vehicle belongs to this category.  (required).</param>
        public OrderVehicleCombinationConstraint(OrderVehicleCombinationConstraintType type = default(OrderVehicleCombinationConstraintType), string orderCategory = default(string), string vehicleCategory = default(string))
        {
            this.Type = type;
            // to ensure "orderCategory" is required (not null)
            if (orderCategory == null) {
                throw new ArgumentNullException("orderCategory is a required property for OrderVehicleCombinationConstraint and cannot be null");
            }
            this.OrderCategory = orderCategory;
            // to ensure "vehicleCategory" is required (not null)
            if (vehicleCategory == null) {
                throw new ArgumentNullException("vehicleCategory is a required property for OrderVehicleCombinationConstraint and cannot be null");
            }
            this.VehicleCategory = vehicleCategory;
        }

        /// <summary>
        /// The category of orders to which the constraint applies. The constraint will be ignored if no order belongs to this category. 
        /// </summary>
        /// <value>The category of orders to which the constraint applies. The constraint will be ignored if no order belongs to this category. </value>
        [DataMember(Name = "orderCategory", IsRequired = true, EmitDefaultValue = false)]
        public string OrderCategory { get; set; }

        /// <summary>
        /// The category of vehicles to which the constraint applies. The constraint will be ignored if no vehicle belongs to this category. 
        /// </summary>
        /// <value>The category of vehicles to which the constraint applies. The constraint will be ignored if no vehicle belongs to this category. </value>
        [DataMember(Name = "vehicleCategory", IsRequired = true, EmitDefaultValue = false)]
        public string VehicleCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrderVehicleCombinationConstraint {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  OrderCategory: ").Append(OrderCategory).Append("\n");
            sb.Append("  VehicleCategory: ").Append(VehicleCategory).Append("\n");
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
            return this.Equals(input as OrderVehicleCombinationConstraint);
        }

        /// <summary>
        /// Returns true if OrderVehicleCombinationConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderVehicleCombinationConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderVehicleCombinationConstraint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.OrderCategory == input.OrderCategory ||
                    (this.OrderCategory != null &&
                    this.OrderCategory.Equals(input.OrderCategory))
                ) && 
                (
                    this.VehicleCategory == input.VehicleCategory ||
                    (this.VehicleCategory != null &&
                    this.VehicleCategory.Equals(input.VehicleCategory))
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.OrderCategory != null)
                {
                    hashCode = (hashCode * 59) + this.OrderCategory.GetHashCode();
                }
                if (this.VehicleCategory != null)
                {
                    hashCode = (hashCode * 59) + this.VehicleCategory.GetHashCode();
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
            // OrderCategory (string) maxLength
            if (this.OrderCategory != null && this.OrderCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OrderCategory, length must be less than 36.", new [] { "OrderCategory" });
            }

            // OrderCategory (string) minLength
            if (this.OrderCategory != null && this.OrderCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OrderCategory, length must be greater than 1.", new [] { "OrderCategory" });
            }

            // OrderCategory (string) pattern
            Regex regexOrderCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexOrderCategory.Match(this.OrderCategory).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OrderCategory, must match a pattern of " + regexOrderCategory, new [] { "OrderCategory" });
            }

            // VehicleCategory (string) maxLength
            if (this.VehicleCategory != null && this.VehicleCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for VehicleCategory, length must be less than 36.", new [] { "VehicleCategory" });
            }

            // VehicleCategory (string) minLength
            if (this.VehicleCategory != null && this.VehicleCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for VehicleCategory, length must be greater than 1.", new [] { "VehicleCategory" });
            }

            // VehicleCategory (string) pattern
            Regex regexVehicleCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexVehicleCategory.Match(this.VehicleCategory).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for VehicleCategory, must match a pattern of " + regexVehicleCategory, new [] { "VehicleCategory" });
            }

            yield break;
        }
    }

}
