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
 * Defines the costs for using the vehicle to execute tasks.
 * @export
 * @interface RouteOptimizationVehicleCosts
 */
export interface RouteOptimizationVehicleCosts {
    /**
     * Specifies the cost for every hour the vehicle is used.
     * @type {number}
     * @memberof RouteOptimizationVehicleCosts
     */
    perHour: number;
    /**
     * Specifies the cost for every kilometer driven with the vehicle.
     * @type {number}
     * @memberof RouteOptimizationVehicleCosts
     */
    perKilometer: number;
    /**
     * Specifies the fixed cost for assigning a route to the vehicle.
     * @type {number}
     * @memberof RouteOptimizationVehicleCosts
     */
    fixed?: number;
}

/**
 * Check if a given object implements the RouteOptimizationVehicleCosts interface.
 */
export function instanceOfRouteOptimizationVehicleCosts(value: object): boolean {
    if (!('perHour' in value)) return false;
    if (!('perKilometer' in value)) return false;
    return true;
}

export function RouteOptimizationVehicleCostsFromJSON(json: any): RouteOptimizationVehicleCosts {
    return RouteOptimizationVehicleCostsFromJSONTyped(json, false);
}

export function RouteOptimizationVehicleCostsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationVehicleCosts {
    if (json == null) {
        return json;
    }
    return {
        
        'perHour': json['perHour'],
        'perKilometer': json['perKilometer'],
        'fixed': json['fixed'] == null ? undefined : json['fixed'],
    };
}

export function RouteOptimizationVehicleCostsToJSON(value?: RouteOptimizationVehicleCosts | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'perHour': value['perHour'],
        'perKilometer': value['perKilometer'],
        'fixed': value['fixed'],
    };
}

