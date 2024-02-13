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
    /// For an order this describes how much capacity for a certain dimension is needed in the vehicle. For a vehicle, this describes its capacity for a certain dimension. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle. 
    /// </summary>
    [DataContract(Name = "Load")]
    public partial class Load : IEquatable<Load>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Load" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Load() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Load" /> class.
        /// </summary>
        /// <param name="dimension">Indicates the specific dimension of the load, such as its volume, weight, or size. (required).</param>
        /// <param name="value">Represents the numeric value associated with the load&#39;s dimension. This value could be the actual measurement or quantity of the load.  (required).</param>
        public Load(string dimension = default(string), int value = default(int))
        {
            // to ensure "dimension" is required (not null)
            if (dimension == null) {
                throw new ArgumentNullException("dimension is a required property for Load and cannot be null");
            }
            this.Dimension = dimension;
            this.Value = value;
        }

        /// <summary>
        /// Indicates the specific dimension of the load, such as its volume, weight, or size.
        /// </summary>
        /// <value>Indicates the specific dimension of the load, such as its volume, weight, or size.</value>
        [DataMember(Name = "dimension", IsRequired = true, EmitDefaultValue = false)]
        public string Dimension { get; set; }

        /// <summary>
        /// Represents the numeric value associated with the load&#39;s dimension. This value could be the actual measurement or quantity of the load. 
        /// </summary>
        /// <value>Represents the numeric value associated with the load&#39;s dimension. This value could be the actual measurement or quantity of the load. </value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public int Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Load {\n");
            sb.Append("  Dimension: ").Append(Dimension).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as Load);
        }

        /// <summary>
        /// Returns true if Load instances are equal
        /// </summary>
        /// <param name="input">Instance of Load to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Load input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Dimension == input.Dimension ||
                    (this.Dimension != null &&
                    this.Dimension.Equals(input.Dimension))
                ) && 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
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
                if (this.Dimension != null)
                {
                    hashCode = (hashCode * 59) + this.Dimension.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
            // Dimension (string) maxLength
            if (this.Dimension != null && this.Dimension.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Dimension, length must be less than 36.", new [] { "Dimension" });
            }

            // Dimension (string) minLength
            if (this.Dimension != null && this.Dimension.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Dimension, length must be greater than 1.", new [] { "Dimension" });
            }

            // Dimension (string) pattern
            Regex regexDimension = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
            if (false == regexDimension.Match(this.Dimension).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Dimension, must match a pattern of " + regexDimension, new [] { "Dimension" });
            }

            // Value (int) minimum
            if (this.Value < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Value, must be a value greater than or equal to 0.", new [] { "Value" });
            }

            yield break;
        }
    }

}
