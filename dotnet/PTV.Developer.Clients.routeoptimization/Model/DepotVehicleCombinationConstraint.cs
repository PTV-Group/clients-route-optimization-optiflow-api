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
    /// A constraint on the combination of depots and vehicles belonging to a certain category.
    /// </summary>
    [DataContract(Name = "DepotVehicleCombinationConstraint")]
    public partial class DepotVehicleCombinationConstraint : IEquatable<DepotVehicleCombinationConstraint>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public DepotVehicleCombinationConstraintType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DepotVehicleCombinationConstraint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DepotVehicleCombinationConstraint() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DepotVehicleCombinationConstraint" /> class.
        /// </summary>
        /// <param name="type">type (required).</param>
        /// <param name="depotCategory">The category of depots to which the constraint applies. The constraint will be ignored when no depot belongs to this category.  (required).</param>
        /// <param name="vehicleCategory">The category of vehicles to which the constraint applies. The constraint will be ignored when no vehicle belongs to this category.  (required).</param>
        public DepotVehicleCombinationConstraint(DepotVehicleCombinationConstraintType type = default(DepotVehicleCombinationConstraintType), string depotCategory = default(string), string vehicleCategory = default(string))
        {
            this.Type = type;
            // to ensure "depotCategory" is required (not null)
            if (depotCategory == null) {
                throw new ArgumentNullException("depotCategory is a required property for DepotVehicleCombinationConstraint and cannot be null");
            }
            this.DepotCategory = depotCategory;
            // to ensure "vehicleCategory" is required (not null)
            if (vehicleCategory == null) {
                throw new ArgumentNullException("vehicleCategory is a required property for DepotVehicleCombinationConstraint and cannot be null");
            }
            this.VehicleCategory = vehicleCategory;
        }

        /// <summary>
        /// The category of depots to which the constraint applies. The constraint will be ignored when no depot belongs to this category. 
        /// </summary>
        /// <value>The category of depots to which the constraint applies. The constraint will be ignored when no depot belongs to this category. </value>
        [DataMember(Name = "depotCategory", IsRequired = true, EmitDefaultValue = false)]
        public string DepotCategory { get; set; }

        /// <summary>
        /// The category of vehicles to which the constraint applies. The constraint will be ignored when no vehicle belongs to this category. 
        /// </summary>
        /// <value>The category of vehicles to which the constraint applies. The constraint will be ignored when no vehicle belongs to this category. </value>
        [DataMember(Name = "vehicleCategory", IsRequired = true, EmitDefaultValue = false)]
        public string VehicleCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DepotVehicleCombinationConstraint {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  DepotCategory: ").Append(DepotCategory).Append("\n");
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
            return this.Equals(input as DepotVehicleCombinationConstraint);
        }

        /// <summary>
        /// Returns true if DepotVehicleCombinationConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of DepotVehicleCombinationConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DepotVehicleCombinationConstraint input)
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
                    this.DepotCategory == input.DepotCategory ||
                    (this.DepotCategory != null &&
                    this.DepotCategory.Equals(input.DepotCategory))
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
                if (this.DepotCategory != null)
                {
                    hashCode = (hashCode * 59) + this.DepotCategory.GetHashCode();
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
            // DepotCategory (string) maxLength
            if (this.DepotCategory != null && this.DepotCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepotCategory, length must be less than 36.", new [] { "DepotCategory" });
            }

            // DepotCategory (string) minLength
            if (this.DepotCategory != null && this.DepotCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepotCategory, length must be greater than 1.", new [] { "DepotCategory" });
            }

            // DepotCategory (string) pattern
            Regex regexDepotCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexDepotCategory.Match(this.DepotCategory).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepotCategory, must match a pattern of " + regexDepotCategory, new [] { "DepotCategory" });
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
