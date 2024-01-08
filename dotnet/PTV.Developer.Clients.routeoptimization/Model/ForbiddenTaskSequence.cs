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
    /// Constrains tasks belonging a certain category to be executed before tasks belonging to another category on the route.
    /// </summary>
    [DataContract(Name = "ForbiddenTaskSequence")]
    public partial class ForbiddenTaskSequence : IEquatable<ForbiddenTaskSequence>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public ForbiddenTaskSequenceType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ForbiddenTaskSequence" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ForbiddenTaskSequence() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ForbiddenTaskSequence" /> class.
        /// </summary>
        /// <param name="firstTaskCategory">The category of tasks that cannot be scheduled on the route before a task with the second task category. The constraint will be ignored when no task belongs to this category.  (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="secondTaskCategory">The category of the tasks that must not be preceded in the route by tasks belonging to the first task category. The constraint will be ignored when no task belongs to this category.  (required).</param>
        /// <param name="vehicleCategory">The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category. .</param>
        public ForbiddenTaskSequence(string firstTaskCategory = default(string), ForbiddenTaskSequenceType type = default(ForbiddenTaskSequenceType), string secondTaskCategory = default(string), string vehicleCategory = default(string))
        {
            // to ensure "firstTaskCategory" is required (not null)
            if (firstTaskCategory == null) {
                throw new ArgumentNullException("firstTaskCategory is a required property for ForbiddenTaskSequence and cannot be null");
            }
            this.FirstTaskCategory = firstTaskCategory;
            this.Type = type;
            // to ensure "secondTaskCategory" is required (not null)
            if (secondTaskCategory == null) {
                throw new ArgumentNullException("secondTaskCategory is a required property for ForbiddenTaskSequence and cannot be null");
            }
            this.SecondTaskCategory = secondTaskCategory;
            this.VehicleCategory = vehicleCategory;
        }

        /// <summary>
        /// The category of tasks that cannot be scheduled on the route before a task with the second task category. The constraint will be ignored when no task belongs to this category. 
        /// </summary>
        /// <value>The category of tasks that cannot be scheduled on the route before a task with the second task category. The constraint will be ignored when no task belongs to this category. </value>
        [DataMember(Name = "firstTaskCategory", IsRequired = true, EmitDefaultValue = false)]
        public string FirstTaskCategory { get; set; }

        /// <summary>
        /// The category of the tasks that must not be preceded in the route by tasks belonging to the first task category. The constraint will be ignored when no task belongs to this category. 
        /// </summary>
        /// <value>The category of the tasks that must not be preceded in the route by tasks belonging to the first task category. The constraint will be ignored when no task belongs to this category. </value>
        [DataMember(Name = "secondTaskCategory", IsRequired = true, EmitDefaultValue = false)]
        public string SecondTaskCategory { get; set; }

        /// <summary>
        /// The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category. 
        /// </summary>
        /// <value>The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category. </value>
        [DataMember(Name = "vehicleCategory", EmitDefaultValue = false)]
        public string VehicleCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ForbiddenTaskSequence {\n");
            sb.Append("  FirstTaskCategory: ").Append(FirstTaskCategory).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  SecondTaskCategory: ").Append(SecondTaskCategory).Append("\n");
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
            return this.Equals(input as ForbiddenTaskSequence);
        }

        /// <summary>
        /// Returns true if ForbiddenTaskSequence instances are equal
        /// </summary>
        /// <param name="input">Instance of ForbiddenTaskSequence to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ForbiddenTaskSequence input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FirstTaskCategory == input.FirstTaskCategory ||
                    (this.FirstTaskCategory != null &&
                    this.FirstTaskCategory.Equals(input.FirstTaskCategory))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.SecondTaskCategory == input.SecondTaskCategory ||
                    (this.SecondTaskCategory != null &&
                    this.SecondTaskCategory.Equals(input.SecondTaskCategory))
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
                if (this.FirstTaskCategory != null)
                {
                    hashCode = (hashCode * 59) + this.FirstTaskCategory.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.SecondTaskCategory != null)
                {
                    hashCode = (hashCode * 59) + this.SecondTaskCategory.GetHashCode();
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
            // FirstTaskCategory (string) maxLength
            if (this.FirstTaskCategory != null && this.FirstTaskCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FirstTaskCategory, length must be less than 36.", new [] { "FirstTaskCategory" });
            }

            // FirstTaskCategory (string) minLength
            if (this.FirstTaskCategory != null && this.FirstTaskCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FirstTaskCategory, length must be greater than 1.", new [] { "FirstTaskCategory" });
            }

            // FirstTaskCategory (string) pattern
            Regex regexFirstTaskCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexFirstTaskCategory.Match(this.FirstTaskCategory).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FirstTaskCategory, must match a pattern of " + regexFirstTaskCategory, new [] { "FirstTaskCategory" });
            }

            // SecondTaskCategory (string) maxLength
            if (this.SecondTaskCategory != null && this.SecondTaskCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SecondTaskCategory, length must be less than 36.", new [] { "SecondTaskCategory" });
            }

            // SecondTaskCategory (string) minLength
            if (this.SecondTaskCategory != null && this.SecondTaskCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SecondTaskCategory, length must be greater than 1.", new [] { "SecondTaskCategory" });
            }

            // SecondTaskCategory (string) pattern
            Regex regexSecondTaskCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexSecondTaskCategory.Match(this.SecondTaskCategory).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SecondTaskCategory, must match a pattern of " + regexSecondTaskCategory, new [] { "SecondTaskCategory" });
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