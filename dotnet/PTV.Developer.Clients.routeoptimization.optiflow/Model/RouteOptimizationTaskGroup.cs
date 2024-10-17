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
    /// A group of tasks identified by a category. Tasks belonging to the same task group must be planned on the same route, or consecutively if they are on the same route, depending on the constraints defined in the task group. 
    /// </summary>
    [DataContract(Name = "TaskGroup")]
    public partial class RouteOptimizationTaskGroup : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Constraint
        /// </summary>
        [DataMember(Name = "constraint", IsRequired = true, EmitDefaultValue = true)]
        public RouteOptimizationTaskGroupConstraint Constraint { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationTaskGroup" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RouteOptimizationTaskGroup() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteOptimizationTaskGroup" /> class.
        /// </summary>
        /// <param name="taskCategory">The category that defines which tasks belong to this task group. The constraint will be ignored when no task belongs to this category.  (required).</param>
        /// <param name="constraint">constraint (required).</param>
        public RouteOptimizationTaskGroup(string taskCategory = default(string), RouteOptimizationTaskGroupConstraint constraint = default(RouteOptimizationTaskGroupConstraint))
        {
            // to ensure "taskCategory" is required (not null)
            if (taskCategory == null)
            {
                throw new ArgumentNullException("taskCategory is a required property for RouteOptimizationTaskGroup and cannot be null");
            }
            this.TaskCategory = taskCategory;
            this.Constraint = constraint;
        }

        /// <summary>
        /// The category that defines which tasks belong to this task group. The constraint will be ignored when no task belongs to this category. 
        /// </summary>
        /// <value>The category that defines which tasks belong to this task group. The constraint will be ignored when no task belongs to this category. </value>
        /// <example>SESAME_STREET</example>
        [DataMember(Name = "taskCategory", IsRequired = true, EmitDefaultValue = true)]
        public string TaskCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteOptimizationTaskGroup {\n");
            sb.Append("  TaskCategory: ").Append(TaskCategory).Append("\n");
            sb.Append("  Constraint: ").Append(Constraint).Append("\n");
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
            // TaskCategory (string) maxLength
            if (this.TaskCategory != null && this.TaskCategory.Length > 36)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TaskCategory, length must be less than 36.", new [] { "TaskCategory" });
            }

            // TaskCategory (string) minLength
            if (this.TaskCategory != null && this.TaskCategory.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TaskCategory, length must be greater than 1.", new [] { "TaskCategory" });
            }

            if (this.TaskCategory != null) {
                // TaskCategory (string) pattern
                Regex regexTaskCategory = new Regex(@"^[a-zA-Z0-9_-]{1,36}$", RegexOptions.CultureInvariant);
                if (!regexTaskCategory.Match(this.TaskCategory).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TaskCategory, must match a pattern of " + regexTaskCategory, new [] { "TaskCategory" });
                }
            }

            yield break;
        }
    }

}
