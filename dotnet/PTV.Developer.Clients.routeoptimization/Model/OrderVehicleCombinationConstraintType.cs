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
    /// Describes which combinations of orders and vehicles have to be respected or excluded. * ORDER_REQUIRES_VEHICLE - An order from the given order category can only be transported by a vehicle from the given vehicle category. * VEHICLE_REQUIRES_ORDER - A vehicle from the given vehicle category can only transport orders from the given order category.  * FORBIDDEN_COMBINATION - An order from the given order category can not be transported by a vehicle from the given vehicle category. 
    /// </summary>
    /// <value>Describes which combinations of orders and vehicles have to be respected or excluded. * ORDER_REQUIRES_VEHICLE - An order from the given order category can only be transported by a vehicle from the given vehicle category. * VEHICLE_REQUIRES_ORDER - A vehicle from the given vehicle category can only transport orders from the given order category.  * FORBIDDEN_COMBINATION - An order from the given order category can not be transported by a vehicle from the given vehicle category. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OrderVehicleCombinationConstraintType
    {
        /// <summary>
        /// Enum ORDER_REQUIRES_VEHICLE for value: ORDER_REQUIRES_VEHICLE
        /// </summary>
        [EnumMember(Value = "ORDER_REQUIRES_VEHICLE")]
        ORDER_REQUIRES_VEHICLE = 1,

        /// <summary>
        /// Enum VEHICLE_REQUIRES_ORDER for value: VEHICLE_REQUIRES_ORDER
        /// </summary>
        [EnumMember(Value = "VEHICLE_REQUIRES_ORDER")]
        VEHICLE_REQUIRES_ORDER = 2,

        /// <summary>
        /// Enum FORBIDDEN_COMBINATION for value: FORBIDDEN_COMBINATION
        /// </summary>
        [EnumMember(Value = "FORBIDDEN_COMBINATION")]
        FORBIDDEN_COMBINATION = 3

    }

}
