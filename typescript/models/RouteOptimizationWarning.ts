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
 * @interface RouteOptimizationWarning
 */
export interface RouteOptimizationWarning {
    /**
     * A human readable message that describes the warning.
     * @type {string}
     * @memberof RouteOptimizationWarning
     */
    description: string;
    /**
     * A constant string that can be used to identify this warning class programmatically. A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.
     * Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.
     * * `ROUTE_OPTIMIZATION_NO_VEHICLE_FOR_ORDER` - An order cannot be scheduled on any route of the provided vehicles.
     *   * `orderId` - The unique identifier of the order.
     * * `ROUTE_OPTIMIZATION_NO_ORDER_FOR_VEHICLE` - No order can be scheduled on the route of a vehicle.
     *   * `vehicleId` - The unique identifier of the vehicle.
     * * `ROUTE_OPTIMIZATION_NO_DEPOTS_FOR_VEHICLE` - No depot can be scheduled on the route of a vehicle.
     *   * `vehicleId` - The ID of the vehicle.
     * * `ROUTE_OPTIMIZATION_LOCATION_UNREACHABLE` - Travel times and distances cannot be calculated to or from the provided location.
     *   * `locationId` - The unique identifier of the location.
     * * `ROUTE_OPTIMIZATION_DEPOT_INVALID_FOR_BREAKS` - The total preparation duration of the depot exceeds the maximum work time between breaks for a vehicle.
     *   * `depotId` - The unique identifier of the depot.
     *   * `vehicleId` - The unique identifier of the vehicle.
     * * `ROUTE_OPTIMIZATION_TRAFFIC_DATA_MISSING` - Traffic data is missing for routes to and from some locations. Optimistic travel times will be used instead.
     *   * `locationIds` - The unique identifiers of the locations to and from which traffic data is missing.
     *   * `profile` - The vehicle routing profile for which traffic data is missing.
     *   * `trafficMode` - The vehicle traffic mode for which traffic data is missing.
     * @type {string}
     * @memberof RouteOptimizationWarning
     */
    warningCode: string;
    /**
     * Additional properties specific to this class of warnings.
     * @type {{ [key: string]: any; }}
     * @memberof RouteOptimizationWarning
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the RouteOptimizationWarning interface.
 */
export function instanceOfRouteOptimizationWarning(value: object): boolean {
    if (!('description' in value)) return false;
    if (!('warningCode' in value)) return false;
    return true;
}

export function RouteOptimizationWarningFromJSON(json: any): RouteOptimizationWarning {
    return RouteOptimizationWarningFromJSONTyped(json, false);
}

export function RouteOptimizationWarningFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationWarning {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'],
        'warningCode': json['warningCode'],
        'details': json['details'] == null ? undefined : json['details'],
    };
}

export function RouteOptimizationWarningToJSON(value?: RouteOptimizationWarning | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'warningCode': value['warningCode'],
        'details': value['details'],
    };
}

