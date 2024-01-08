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
    Break,
    BreakFromJSON,
    BreakFromJSONTyped,
    BreakToJSON,
} from './Break';

/**
 * A section of a route where a vehicle travels from one location to another.
 * @export
 * @interface Leg
 */
export interface Leg {
    /**
     * The unique identifier of the location where the vehicle departs.
     * @type {string}
     * @memberof Leg
     */
    startLocationId?: string;
    /**
     * The point in time when the vehicle departs from the start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof Leg
     */
    departure?: Date;
    /**
     * The unique identifier of the location where the vehicle arrives.
     * @type {string}
     * @memberof Leg
     */
    endLocationId?: string;
    /**
     * The point in time when the vehicle arrives at the end location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof Leg
     */
    arrival?: Date;
    /**
     * A list of breaks taken while travelling from the start location to the end location.
     * @type {Array<Break>}
     * @memberof Leg
     */
    breaks?: Array<Break>;
    /**
     * The distance [m] travelled between the start location and end location.
     * @type {number}
     * @memberof Leg
     */
    distance?: number;
    /**
     * The duration [s] it takes to drive from the start location to the end location.
     * @type {number}
     * @memberof Leg
     */
    drivingDuration?: number;
}

export function LegFromJSON(json: any): Leg {
    return LegFromJSONTyped(json, false);
}

export function LegFromJSONTyped(json: any, ignoreDiscriminator: boolean): Leg {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'startLocationId': !exists(json, 'startLocationId') ? undefined : json['startLocationId'],
        'departure': !exists(json, 'departure') ? undefined : (new Date(json['departure'])),
        'endLocationId': !exists(json, 'endLocationId') ? undefined : json['endLocationId'],
        'arrival': !exists(json, 'arrival') ? undefined : (new Date(json['arrival'])),
        'breaks': !exists(json, 'breaks') ? undefined : ((json['breaks'] as Array<any>).map(BreakFromJSON)),
        'distance': !exists(json, 'distance') ? undefined : json['distance'],
        'drivingDuration': !exists(json, 'drivingDuration') ? undefined : json['drivingDuration'],
    };
}

export function LegToJSON(value?: Leg | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'startLocationId': value.startLocationId,
        'departure': value.departure === undefined ? undefined : (value.departure.toISOString()),
        'endLocationId': value.endLocationId,
        'arrival': value.arrival === undefined ? undefined : (value.arrival.toISOString()),
        'breaks': value.breaks === undefined ? undefined : ((value.breaks as Array<any>).map(BreakToJSON)),
        'distance': value.distance,
        'drivingDuration': value.drivingDuration,
    };
}

