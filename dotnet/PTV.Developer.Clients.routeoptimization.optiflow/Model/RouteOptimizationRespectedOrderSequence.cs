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
    /// A sequence that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered before an order belonging to a category later in the sequence can be picked up.
    /// </summary>
    [DataContract(Name = "RespectedOrderSequence")]
    public partial class RouteOptimizationRespectedOrderSequence : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationRespectedOrderSequence" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationRespectedOrderSequence() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationRespectedOrderSequence" /> class.
        /// </summary>
        /// <param name="orderCategories">The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored. (required).</param>
        /// <param name="vehicleCategory">The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category..</param>
        public RouteOptimizationRespectedOrderSequence(List<string> orderCategories = default(List<string>), string vehicleCategory = default(string))
        {
            // to ensure "orderCategories" is required (not null)
            if (orderCategories == null)
            {
                throw new ArgumentNullException("orderCategories is a required property for RouteOptimizationRespectedOrderSequence and cannot be null");
            }
            this.OrderCategories = orderCategories;
            this.VehicleCategory = vehicleCategory;
        }

        /// <summary>
        /// The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored.
        /// </summary>
        /// <value>The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored.</value>
        /// <example>[&quot;FOOD&quot;,&quot;DIRT&quot;]</example>
        [DataMember(Name = "orderCategories", IsRequired = true, EmitDefaultValue = true)]
        public List<string> OrderCategories { get; set; }

        /// <summary>
        /// The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category.
        /// </summary>
        /// <value>The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category.</value>
        /// <example>SMALL_TRUCK</example>
        [DataMember(Name = "vehicleCategory", EmitDefaultValue = true)]
        public string VehicleCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationRespectedOrderSequence {\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
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

            if (this.VehicleCategory != null) {
                // VehicleCategory (string) pattern
                Regex regexVehicleCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
                if (!regexVehicleCategory.Match(this.VehicleCategory).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for VehicleCategory, must match a pattern of " + regexVehicleCategory, new [] { "VehicleCategory" });
                }
            }

            yield break;
        }
    }

}
