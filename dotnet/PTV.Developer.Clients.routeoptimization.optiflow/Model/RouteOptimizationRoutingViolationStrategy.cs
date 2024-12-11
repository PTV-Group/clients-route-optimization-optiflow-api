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
    /// Defines how to handle segments prohibited by the profile. * &#x60;ALLOW&#x60; - A vehicle is permitted to travel on segments prohibited by its profile. These prohibited segments will only be used when no valid alternatives are available. * &#x60;DISALLOW&#x60; - A vehicle is not permitted to travel on segments prohibited by its profile.
    /// </summary>
    /// <value>Defines how to handle segments prohibited by the profile. * &#x60;ALLOW&#x60; - A vehicle is permitted to travel on segments prohibited by its profile. These prohibited segments will only be used when no valid alternatives are available. * &#x60;DISALLOW&#x60; - A vehicle is not permitted to travel on segments prohibited by its profile.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RouteOptimizationRoutingViolationStrategy
    {
        /// <summary>
        /// Enum ALLOW for value: ALLOW
        /// </summary>
        [EnumMember(Value = "ALLOW")]
        ALLOW = 1,

        /// <summary>
        /// Enum DISALLOW for value: DISALLOW
        /// </summary>
        [EnumMember(Value = "DISALLOW")]
        DISALLOW = 2
    }

}
