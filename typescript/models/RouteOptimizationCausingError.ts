/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface RouteOptimizationCausingError
 */
export interface RouteOptimizationCausingError {
    /**
     * A human readable message that describes the error.
     * @type {string}
     * @memberof RouteOptimizationCausingError
     */
    description: string;
    /**
     * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.
     * Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.
     * 
     * **Error codes for** `GENERAL_VALIDATION_ERROR`
     * * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.
     *   * `value` - The invalid value.
     * * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown.
     * * `GENERAL_MISSING_PARAMETER` - A required parameter is missing.
     * * `GENERAL_PATTERN_VIOLATED` - The value of a parameter does not match its pattern.
     * * `GENERAL_INVALID_INTERVAL` - A time interval is invalid, i.e. start is greater than end.
     * * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length is violated.
     *   * `minimumLength` - The minimum length (integer).
     * * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length is violated.
     *   * `maximumLength` - The maximum length (integer).
     * * `GENERAL_DUPLICATE_ID` - Two or more objects of the same type have the same ID.
     *   * `value` - The duplicated value.
     *   * `indexes` - The list indexes of the objects with the same ID.
     * * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value restriction is violated.
     *   * `minimumValue` - The minimum value (integer or double).
     * * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value restriction is violated.
     *   * `maximumValue` - The maximum value (integer or double).
     * * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated.
     * * `ROUTEOPTIMIZATION_LOCATION_CANNOT_BE_MATCHED` - The location cannot be matched to a street and no airline distance fallback is possible.
     * * `ROUTEOPTIMIZATION_TOO_MANY_PROFILES` - The request contains too many different vehicle routing profiles.
     * * `ROUTEOPTIMIZATION_DEPOTS_INVALID` - If PickupDeliveryOrders are specified, no Depots are allowed.
     * * `ROUTEOPTIMIZATION_ID_MISSING_IN_LOCATIONS` - The list of locations does not contain the location with ID ''.
     *   * `locationId` - the missing location id.
     * * `ROUTEOPTIMIZATION_ID_MISSING_IN_VEHICLES` - The list of vehicles does not contain the vehicle with ID ''.
     *   * `vehicleId` - The missing vehicle id.
     * * `ROUTEOPTIMIZATION_ID_MISSING_IN_ORDERS` - The list of orders does not contain the order with ID ''.
     *   * `orderId` - The missing order id.
     * * `ROUTEOPTIMIZATION_ID_MISSING_IN_TIMESLOTS` - The list of time slots of the corresponding location does not contain the time slot with ID ''.
     *   * `timeSlotId` - The missing time slot id.
     * * `ROUTEOPTIMIZATION_DEPOTS_INVALID` - If PickupDeliveryOrders are specified, no Depots are allowed.
     * *`ROUTEOPTIMIZATION_DEPOT_MISSING_FOR_PICKUPS_OR_DELIVERIES` - At least one depot has to be specified for pickup or delivery orders.
     * *`ROUTEOPTIMIZATION_EMPTY_ORDERS` - Empty orders without any pickups, deliveries and pickup-deliveries are not allowed.
     * *`ROUTEOPTIMIZATION_INVALID_ORDERS_COMPOSITION` - When pickup-deliveries are given, pickups and/or deliveries are not allowed, and vice-versa.
     * *`ROUTEOPTIMIZATION_VEHICLE_NOT_VALID_FOR_BREAKS` - The start or end duration of the vehicle exceeds the maximum work time between breaks.
     * *`ROUTEOPTIMIZATION_DEPOT_NOT_VALID_FOR_BREAKS` - The total preparation duration of the depot exceeds the maximum work time between breaks for a vehicle.
     * *`ROUTEOPTIMIZATION_NO_DEPOT_FOR_VEHICLE` - Due to the provided constraints, the vehicle is not allowed to visit any depot.
     * *`ROUTEOPTIMIZATION_PARAMETER_CONFLICT` - Two parameters are in conflict with each other.
     *   * `conflictingParameter` - A path to the affected property of the request.
     *   * `message` - A human readable message that describes the error.
     * 
     * **Error codes for** `ROUTEOPTIMIZATION_RESTRICTION_EXCEEDED`
     * * `ROUTEOPTIMIZATION_NUMBER_OF_OPTIMIZATIONS_EXCEEDED` - The maximum number of concurrent optimizations is exceeded.
     *   * `limit` - The limit (integer).
     *  * `runningOptimizationIds` - Currently running optimization ids (String).
     * * `ROUTEOPTIMIZATION_NUMBER_OF_LOCATIONS_EXCEEDED` - The request contains too many locations.
     *   * `locations` - The number of locations (integer).
     *   * `limit` - The limit (integer).
     * * `ROUTEOPTIMIZATION_NUMBER_OF_ORDERS_EXCEEDED` - The request contains too many orders.
     *   * `orders` - The number of orders (integer).
     *   * `limit` - The limit (integer).
     * * `ROUTEOPTIMIZATION_NUMBER_OF_VEHICLES_EXCEEDED` - The request contains too many vehicles.
     *   * `vehicles` - The number of vehicles (integer).
     *   * `limit` - The limit (integer).
     * * `ROUTEOPTIMIZATION_DURATION_EXCEEDS_LIMIT` - The duration of the request is too long.
     *   * `duration` - The duration of the request [s] (integer).
     *   * `limit` - The limit (integer).
     * 
     * **Error codes for** `ROUTEOPTIMIZATION_RESTRICTION_EXCEEDED`
     * * `ROUTEOPTIMIZATION_NUMBER_OF_OPTIMIZATIONS_EXCEEDED` - The maximum number of concurrent optimizations is exceeded.
     * 
     * **Error codes for** `GENERAL_RESOURCE_NOT_FOUND`
     * * `GENERAL_INVALID_ID` - The ID does not exist.
     *   * `value` - The invalid ID.
     * 
     * **Error codes for** `ROUTEOPTIMIZATION_CONTENT_TOO_LARGE`
     * * `ROUTEOPTIMIZATION_DECOMPRESSED_SIZE_EXCEEDED` - The decompressed size of the body exceeds the limit.
     *   * `limit` - The decompressed body size limit [bytes].
     * @type {string}
     * @memberof RouteOptimizationCausingError
     */
    errorCode: string;
    /**
     * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
     * @type {string}
     * @memberof RouteOptimizationCausingError
     */
    parameter?: string;
    /**
     * Additional properties specific to this error class.
     * @type {{ [key: string]: any; }}
     * @memberof RouteOptimizationCausingError
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the RouteOptimizationCausingError interface.
 */
export function instanceOfRouteOptimizationCausingError(value: object): boolean {
    if (!('description' in value)) return false;
    if (!('errorCode' in value)) return false;
    return true;
}

export function RouteOptimizationCausingErrorFromJSON(json: any): RouteOptimizationCausingError {
    return RouteOptimizationCausingErrorFromJSONTyped(json, false);
}

export function RouteOptimizationCausingErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationCausingError {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'],
        'errorCode': json['errorCode'],
        'parameter': json['parameter'] == null ? undefined : json['parameter'],
        'details': json['details'] == null ? undefined : json['details'],
    };
}

export function RouteOptimizationCausingErrorToJSON(value?: RouteOptimizationCausingError | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'errorCode': value['errorCode'],
        'parameter': value['parameter'],
        'details': value['details'],
    };
}

