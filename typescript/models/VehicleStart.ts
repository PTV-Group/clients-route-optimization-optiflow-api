/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Describes the start of a route assigned to the vehicle.
 * @export
 * @interface VehicleStart
 */
export interface VehicleStart {
    /**
     * The unique identifier of the location where a route assigned to the vehicle must start.
     * @type {string}
     * @memberof VehicleStart
     */
    locationId: string;
    /**
     * The earliest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof VehicleStart
     */
    earliestStartTime: Date;
    /**
     * The latest point in time a route assigned to the vehicle may start. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof VehicleStart
     */
    latestStartTime?: Date;
    /**
     * Describes how long [s] it takes for the vehicle to depart at its start location after the route starts.
     * @type {number}
     * @memberof VehicleStart
     */
    duration?: number;
}

export function VehicleStartFromJSON(json: any): VehicleStart {
    return VehicleStartFromJSONTyped(json, false);
}

export function VehicleStartFromJSONTyped(json: any, ignoreDiscriminator: boolean): VehicleStart {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'locationId': json['locationId'],
        'earliestStartTime': (new Date(json['earliestStartTime'])),
        'latestStartTime': !exists(json, 'latestStartTime') ? undefined : (new Date(json['latestStartTime'])),
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
    };
}

export function VehicleStartToJSON(value?: VehicleStart | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'locationId': value.locationId,
        'earliestStartTime': (value.earliestStartTime.toISOString()),
        'latestStartTime': value.latestStartTime === undefined ? undefined : (value.latestStartTime.toISOString()),
        'duration': value.duration,
    };
}

