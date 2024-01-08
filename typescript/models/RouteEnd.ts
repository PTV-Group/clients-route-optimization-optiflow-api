/* tslint:disable */
/* eslint-disable */
/**
 * OptiFlow
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
import {
    Leg,
    LegFromJSON,
    LegFromJSONTyped,
    LegToJSON,
} from './Leg';

/**
 * Describes the end of a route.
 * @export
 * @interface RouteEnd
 */
export interface RouteEnd {
    /**
     * The unique identifier of the location where the route ends. This is the end location of the assigned vehicle.
     * @type {string}
     * @memberof RouteEnd
     */
    locationId?: string;
    /**
     * 
     * @type {Leg}
     * @memberof RouteEnd
     */
    approach?: Leg;
    /**
     * The point in time when the vehicle arrives at its end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteEnd
     */
    arrival?: Date;
    /**
     * The duration [s] between the arrival at the end location and the end of the route.
     * @type {number}
     * @memberof RouteEnd
     */
    duration?: number;
    /**
     * The point in time when the route ends. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteEnd
     */
    end?: Date;
}

export function RouteEndFromJSON(json: any): RouteEnd {
    return RouteEndFromJSONTyped(json, false);
}

export function RouteEndFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteEnd {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'locationId': !exists(json, 'locationId') ? undefined : json['locationId'],
        'approach': !exists(json, 'approach') ? undefined : LegFromJSON(json['approach']),
        'arrival': !exists(json, 'arrival') ? undefined : (new Date(json['arrival'])),
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
        'end': !exists(json, 'end') ? undefined : (new Date(json['end'])),
    };
}

export function RouteEndToJSON(value?: RouteEnd | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'locationId': value.locationId,
        'approach': LegToJSON(value.approach),
        'arrival': value.arrival === undefined ? undefined : (value.arrival.toISOString()),
        'duration': value.duration,
        'end': value.end === undefined ? undefined : (value.end.toISOString()),
    };
}

