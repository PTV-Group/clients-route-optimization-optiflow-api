/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Defines the costs for using the vehicle to execute tasks.
 * @export
 * @interface VehicleCosts
 */
export interface VehicleCosts {
    /**
     * Specifies the cost for every hour the vehicle is used.
     * @type {number}
     * @memberof VehicleCosts
     */
    perHour: number;
    /**
     * Specifies the cost for every kilometer driven with the vehicle.
     * @type {number}
     * @memberof VehicleCosts
     */
    perKilometer: number;
    /**
     * Specifies the fixed cost for assigning a route to the vehicle.
     * @type {number}
     * @memberof VehicleCosts
     */
    fixed?: number;
}

export function VehicleCostsFromJSON(json: any): VehicleCosts {
    return VehicleCostsFromJSONTyped(json, false);
}

export function VehicleCostsFromJSONTyped(json: any, ignoreDiscriminator: boolean): VehicleCosts {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'perHour': json['perHour'],
        'perKilometer': json['perKilometer'],
        'fixed': !exists(json, 'fixed') ? undefined : json['fixed'],
    };
}

export function VehicleCostsToJSON(value?: VehicleCosts | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'perHour': value.perHour,
        'perKilometer': value.perKilometer,
        'fixed': value.fixed,
    };
}

