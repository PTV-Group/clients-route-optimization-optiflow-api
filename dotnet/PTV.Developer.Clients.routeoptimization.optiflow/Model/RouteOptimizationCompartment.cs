/*
 * Route Optimization OptiFlow
 *
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.6
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
    /// Defines a vehicle compartment available for loading orders.
    /// </summary>
    [DataContract(Name = "Compartment")]
    public partial class RouteOptimizationCompartment : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets LoadingStrategy
        /// </summary>
        [DataMember(Name = "loadingStrategy", EmitDefaultValue = true)]
        public RouteOptimizationCompartmentLoadingStrategy? LoadingStrategy { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationCompartment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationCompartment() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationCompartment" /> class.
        /// </summary>
        /// <param name="id">A unique identifier for the compartment, which must be distinct among all compartments within the same vehicle. (required).</param>
        /// <param name="loadingStrategy">loadingStrategy.</param>
        /// <param name="categories">A list of categories the compartment belongs to that can be used to describe constraints..</param>
        public RouteOptimizationCompartment(string id = default(string), RouteOptimizationCompartmentLoadingStrategy? loadingStrategy = default(RouteOptimizationCompartmentLoadingStrategy?), List<string> categories = default(List<string>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for RouteOptimizationCompartment and cannot be null");
            }
            this.Id = id;
            this.LoadingStrategy = loadingStrategy;
            this.Categories = categories;
        }

        /// <summary>
        /// A unique identifier for the compartment, which must be distinct among all compartments within the same vehicle.
        /// </summary>
        /// <value>A unique identifier for the compartment, which must be distinct among all compartments within the same vehicle.</value>
        /// <example>FROZEN</example>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// A list of categories the compartment belongs to that can be used to describe constraints.
        /// </summary>
        /// <value>A list of categories the compartment belongs to that can be used to describe constraints.</value>
        /// <example>[&quot;COOLING_COMPARTMENT&quot;,&quot;SMALL_BOXES&quot;,&quot;DANGEROUS_GOODS&quot;]</example>
        [DataMember(Name = "categories", EmitDefaultValue = false)]
        public List<string> Categories { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationCompartment {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LoadingStrategy: ").Append(LoadingStrategy).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Id (string) maxLength
            if (this.Id != null && this.Id.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, length must be less than 36.", new [] { "Id" });
            }

            // Id (string) minLength
            if (this.Id != null && this.Id.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, length must be greater than 1.", new [] { "Id" });
            }

            if (this.Id != null) {
                // Id (string) pattern
                Regex regexId = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
                if (!regexId.Match(this.Id).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Id, must match a pattern of " + regexId, new [] { "Id" });
                }
            }

            yield break;
        }
    }

}