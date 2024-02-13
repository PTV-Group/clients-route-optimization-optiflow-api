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
 * A description of the location and time the route starts.
 * @export
 * @interface RouteStart
 */
export interface RouteStart {
    /**
     * The unique identifier of the start location of the route. This is the start location of the assigned vehicle.
     * @type {string}
     * @memberof RouteStart
     */
    locationId?: string;
    /**
     * The point in time when the route starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteStart
     */
    start?: Date;
    /**
     * The duration [s] between the start of the route and the departure at the start location.
     * @type {number}
     * @memberof RouteStart
     */
    duration?: number;
    /**
     * The point in time when the vehicle departs at its start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteStart
     */
    departure?: Date;
}

export function RouteStartFromJSON(json: any): RouteStart {
    return RouteStartFromJSONTyped(json, false);
}

export function RouteStartFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteStart {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'locationId': !exists(json, 'locationId') ? undefined : json['locationId'],
        'start': !exists(json, 'start') ? undefined : (new Date(json['start'])),
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
        'departure': !exists(json, 'departure') ? undefined : (new Date(json['departure'])),
    };
}

export function RouteStartToJSON(value?: RouteStart | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'locationId': value.locationId,
        'start': value.start === undefined ? undefined : (value.start.toISOString()),
        'duration': value.duration,
        'departure': value.departure === undefined ? undefined : (value.departure.toISOString()),
    };
}

