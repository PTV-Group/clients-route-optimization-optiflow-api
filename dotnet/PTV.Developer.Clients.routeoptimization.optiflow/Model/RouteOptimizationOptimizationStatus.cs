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
    /// Describes the current status of the optimization. * PREPARING - The optimization has been accepted. Time-distance data is being calculated and the data is being prepared for optimization. * RUNNING - The routes are being optimized. Metrics will provide insights into the current result of the optimization. * STOPPING - A request has been received to stop the optimization. The optimization will stop as soon as possible. * FAILED - The optimization has failed. An error will be provided to clarify what went wrong. * SUCCEEDED - The optimization has completed successfully. 
    /// </summary>
    /// <value>Describes the current status of the optimization. * PREPARING - The optimization has been accepted. Time-distance data is being calculated and the data is being prepared for optimization. * RUNNING - The routes are being optimized. Metrics will provide insights into the current result of the optimization. * STOPPING - A request has been received to stop the optimization. The optimization will stop as soon as possible. * FAILED - The optimization has failed. An error will be provided to clarify what went wrong. * SUCCEEDED - The optimization has completed successfully. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RouteOptimizationOptimizationStatus
    {
        /// <summary>
        /// Enum PREPARING for value: PREPARING
        /// </summary>
        [EnumMember(Value = "PREPARING")]
        PREPARING = 1,

        /// <summary>
        /// Enum RUNNING for value: RUNNING
        /// </summary>
        [EnumMember(Value = "RUNNING")]
        RUNNING = 2,

        /// <summary>
        /// Enum STOPPING for value: STOPPING
        /// </summary>
        [EnumMember(Value = "STOPPING")]
        STOPPING = 3,

        /// <summary>
        /// Enum FAILED for value: FAILED
        /// </summary>
        [EnumMember(Value = "FAILED")]
        FAILED = 4,

        /// <summary>
        /// Enum SUCCEEDED for value: SUCCEEDED
        /// </summary>
        [EnumMember(Value = "SUCCEEDED")]
        SUCCEEDED = 5
    }

}