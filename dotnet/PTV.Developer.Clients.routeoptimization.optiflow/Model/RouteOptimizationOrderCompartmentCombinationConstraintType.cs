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
    /// Describes which combination of orders and compartments have to be respected or excluded. * &#x60;ORDER_REQUIRES_COMPARTMENT&#x60; - An order from the given order category can only be loaded into a compartment from the given compartment category. * &#x60;COMPARTMENT_REQUIRES_ORDER&#x60; - A compartment from the given compartment category can only be used to load orders from the given order category. * &#x60;FORBIDDEN_COMBINATION&#x60; - An order from the given order category cannot be loaded into a compartment from the given compartment category.
    /// </summary>
    /// <value>Describes which combination of orders and compartments have to be respected or excluded. * &#x60;ORDER_REQUIRES_COMPARTMENT&#x60; - An order from the given order category can only be loaded into a compartment from the given compartment category. * &#x60;COMPARTMENT_REQUIRES_ORDER&#x60; - A compartment from the given compartment category can only be used to load orders from the given order category. * &#x60;FORBIDDEN_COMBINATION&#x60; - An order from the given order category cannot be loaded into a compartment from the given compartment category.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RouteOptimizationOrderCompartmentCombinationConstraintType
    {
        /// <summary>
        /// Enum ORDER_REQUIRES_COMPARTMENT for value: ORDER_REQUIRES_COMPARTMENT
        /// </summary>
        [EnumMember(Value = "ORDER_REQUIRES_COMPARTMENT")]
        ORDER_REQUIRES_COMPARTMENT = 1,

        /// <summary>
        /// Enum COMPARTMENT_REQUIRES_ORDER for value: COMPARTMENT_REQUIRES_ORDER
        /// </summary>
        [EnumMember(Value = "COMPARTMENT_REQUIRES_ORDER")]
        COMPARTMENT_REQUIRES_ORDER = 2,

        /// <summary>
        /// Enum FORBIDDEN_COMBINATION for value: FORBIDDEN_COMBINATION
        /// </summary>
        [EnumMember(Value = "FORBIDDEN_COMBINATION")]
        FORBIDDEN_COMBINATION = 3
    }

}
