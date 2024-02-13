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
    /// A sequence that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered before an order belonging to a category later in the sequence can be picked up. 
    /// </summary>
    [DataContract(Name = "RespectedOrderSequence")]
    public partial class RespectedOrderSequence : IEquatable<RespectedOrderSequence>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RespectedOrderSequence" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RespectedOrderSequence() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RespectedOrderSequence" /> class.
        /// </summary>
        /// <param name="orderCategories">The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored.  (required).</param>
        /// <param name="vehicleCategory">The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category. .</param>
        public RespectedOrderSequence(List<string> orderCategories = default(List<string>), string vehicleCategory = default(string))
        {
            // to ensure "orderCategories" is required (not null)
            if (orderCategories == null) {
                throw new ArgumentNullException("orderCategories is a required property for RespectedOrderSequence and cannot be null");
            }
            this.OrderCategories = orderCategories;
            this.VehicleCategory = vehicleCategory;
        }

        /// <summary>
        /// The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored. 
        /// </summary>
        /// <value>The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored. </value>
        [DataMember(Name = "orderCategories", IsRequired = true, EmitDefaultValue = false)]
        public List<string> OrderCategories { get; set; }

        /// <summary>
        /// The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category. 
        /// </summary>
        /// <value>The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category. </value>
        [DataMember(Name = "vehicleCategory", EmitDefaultValue = false)]
        public string VehicleCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RespectedOrderSequence {\n");
            sb.Append("  OrderCategories: ").Append(OrderCategories).Append("\n");
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
            return this.Equals(input as RespectedOrderSequence);
        }

        /// <summary>
        /// Returns true if RespectedOrderSequence instances are equal
        /// </summary>
        /// <param name="input">Instance of RespectedOrderSequence to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RespectedOrderSequence input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OrderCategories == input.OrderCategories ||
                    this.OrderCategories != null &&
                    input.OrderCategories != null &&
                    this.OrderCategories.SequenceEqual(input.OrderCategories)
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
                if (this.OrderCategories != null)
                {
                    hashCode = (hashCode * 59) + this.OrderCategories.GetHashCode();
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
