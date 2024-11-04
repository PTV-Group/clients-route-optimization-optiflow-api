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
 * Describes the start of a route assigned to the vehicle.
 * @export
 * @interface RouteOptimizationVehicleStart
 */
export interface RouteOptimizationVehicleStart {
    /**
     * The unique identifier of the location where a route assigned to the vehicle must start.
     * @type {string}
     * @memberof RouteOptimizationVehicleStart
     */
    locationId: string;
    /**
     * The earliest point in time a route assigned to the vehicle may start. This must be not be later than the vehicle's latest end time. When used in conjunction with a latest start time, the earliest start time must not be later than the latest start time.  Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * 
     * @type {Date}
     * @memberof RouteOptimizationVehicleStart
     */
    earliestStartTime: Date;
    /**
     * The latest point in time a route assigned to the vehicle may start. This must not be earlier than the vehicle's earliest start time nor later than the vehicle's earliest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * 
     * @type {Date}
     * @memberof RouteOptimizationVehicleStart
     */
    latestStartTime?: Date;
    /**
     * Describes how long [s] it takes for the vehicle to depart at its start location after the route starts.
     * @type {number}
     * @memberof RouteOptimizationVehicleStart
     */
    duration?: number;
}

/**
 * Check if a given object implements the RouteOptimizationVehicleStart interface.
 */
export function instanceOfRouteOptimizationVehicleStart(value: object): boolean {
    if (!('locationId' in value)) return false;
    if (!('earliestStartTime' in value)) return false;
    return true;
}

export function RouteOptimizationVehicleStartFromJSON(json: any): RouteOptimizationVehicleStart {
    return RouteOptimizationVehicleStartFromJSONTyped(json, false);
}

export function RouteOptimizationVehicleStartFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationVehicleStart {
    if (json == null) {
        return json;
    }
    return {
        
        'locationId': json['locationId'],
        'earliestStartTime': (new Date(json['earliestStartTime'])),
        'latestStartTime': json['latestStartTime'] == null ? undefined : (new Date(json['latestStartTime'])),
        'duration': json['duration'] == null ? undefined : json['duration'],
    };
}

export function RouteOptimizationVehicleStartToJSON(value?: RouteOptimizationVehicleStart | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'locationId': value['locationId'],
        'earliestStartTime': ((value['earliestStartTime']).toISOString()),
        'latestStartTime': value['latestStartTime'] == null ? undefined : ((value['latestStartTime']).toISOString()),
        'duration': value['duration'],
    };
}
