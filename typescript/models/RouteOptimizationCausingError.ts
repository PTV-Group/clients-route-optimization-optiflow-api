/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
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
     * * `GENERAL_MISSING_PARAMETER` - A required parameter is missing.
     * * `GENERAL_TYPE_VIOLATED` - The value of a parameter has an invalid type.
     *   * `type` - The type.
     * * `GENERAL_FORMAT_VIOLATED` - The value of a parameter has an invalid format.
     *   * `format` - The format.
     * * `GENERAL_PATTERN_VIOLATED` - The value of a string parameter does not satisfy the required pattern.
     *   * `pattern` - The pattern.
     * * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length of a string is violated.
     *   * `minimumLength` - The minimum length.
     * * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length of a string is violated.
     *   * `maximumLength` - The maximum length.
     * * `GENERAL_MINIMUM_ITEMS_VIOLATED` - The minimum number of items of an array is violated.
     *   * `minimumItems` - The minimum number of items.
     * * `GENERAL_MAXIMUM_ITEMS_VIOLATED` - The maximum number of items of an array is violated.
     *   * `maximumItems` - The maximum number of items.
     * * `GENERAL_UNIQUE_ITEMS_VIOLATED` - The items of an array are not unique.
     *   * `indexes` - The list of indexes that have the same value.
     * * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value of a parameter is violated.
     *   * `minimumValue` - The minimum value.
     * * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value of a parameter is violated.
     *   * `maximumValue` - The maximum value.
     * * `GENERAL_MULTIPLE_OF_VIOLATED` - The value of a parameter is not a multiple of a specific value.
     *   * `multipleOf` - The number the value should be a multiple of.
     * * `GENERAL_ENUM_VIOLATED` - The value of a parameter is not one of the specified enum values.
     *   * `enum` - The allowed enum values.
     * * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.
     *   * `value` - The invalid value.
     *   * `message` - A message explaining the invalid value.
     * * `GENERAL_CONFLICTING_PARAMETER` - The value of a parameter conflicts with the value of one or more other parameters.
     *   * `conflictingParameters` - The parameters whose values cause the conflict.
     *   * `message` - A message explaining the conflict.
     * 
     * **Error codes for** `ROUTE_OPTIMIZATION_RESTRICTION_EXCEEDED`
     * * `ROUTE_OPTIMIZATION_TOO_MANY_LOCATIONS` - The request contains too many locations.
     *   * `locations` - The number of locations.
     *   * `limit` - The limit.
     * * `ROUTE_OPTIMIZATION_TOO_MANY_ORDERS` - The request contains too many orders.
     *   * `orders` - The number of orders.
     *   * `limit` - The limit.
     * * `ROUTE_OPTIMIZATION_TOO_MANY_VEHICLES` - The request contains too many vehicles.
     *   * `vehicles` - The number of vehicles.
     *   * `limit` - The limit.
     * * `ROUTE_OPTIMIZATION_TOO_LONG_DURATION` - The duration of the request is too long.
     *   * `duration` - The duration of the request [s].
     *   * `limit` - The limit.
     * * `ROUTE_OPTIMIZATION_TOO_MANY_PROFILES` - The request contains too many different combinations of profiles and traffic modes.
     *   * `profiles` - The number of combinations of profiles and traffic modes.
     *   * `limit` - The limit.
     * * `ROUTE_OPTIMIZATION_TOO_MANY_OPTIMIZATIONS` - The maximum number of concurrent optimizations is exceeded.
     *   * `runningOptimizationIds` - Currently running optimization ids [string].
     *   * `limit` - The limit.
     * 
     * **Error codes for** `GENERAL_RESOURCE_NOT_FOUND`
     * * `GENERAL_INVALID_ID` - No resource exists for the provided ID.
     *   * `value` - The ID for which no resource exists.
     * 
     * **Error codes for** `GENERAL_UNSUPPORTED_MEDIA_TYPE`
     * * `GENERAL_INVALID_CONTENT_ENCODING` - The content encoding of the request is not supported.
     *   * `contentEncodings` - A list of supported content encodings.
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

