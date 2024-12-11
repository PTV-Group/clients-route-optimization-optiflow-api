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
 * A description of the location and time the route starts.
 * @export
 * @interface RouteOptimizationRouteStart
 */
export interface RouteOptimizationRouteStart {
    /**
     * The unique identifier of the start location of the route. This is the start location of the assigned vehicle.
     * @type {string}
     * @memberof RouteOptimizationRouteStart
     */
    locationId?: string;
    /**
     * The point in time when the route starts. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteOptimizationRouteStart
     */
    start?: Date;
    /**
     * The duration [s] between the start of the route and the departure at the start location.
     * @type {number}
     * @memberof RouteOptimizationRouteStart
     */
    duration?: number;
    /**
     * The point in time when the vehicle departs at its start location. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @type {Date}
     * @memberof RouteOptimizationRouteStart
     */
    departure?: Date;
}

/**
 * Check if a given object implements the RouteOptimizationRouteStart interface.
 */
export function instanceOfRouteOptimizationRouteStart(value: object): boolean {
    return true;
}

export function RouteOptimizationRouteStartFromJSON(json: any): RouteOptimizationRouteStart {
    return RouteOptimizationRouteStartFromJSONTyped(json, false);
}

export function RouteOptimizationRouteStartFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationRouteStart {
    if (json == null) {
        return json;
    }
    return {
        
        'locationId': json['locationId'] == null ? undefined : json['locationId'],
        'start': json['start'] == null ? undefined : (new Date(json['start'])),
        'duration': json['duration'] == null ? undefined : json['duration'],
        'departure': json['departure'] == null ? undefined : (new Date(json['departure'])),
    };
}

export function RouteOptimizationRouteStartToJSON(value?: RouteOptimizationRouteStart | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'locationId': value['locationId'],
        'start': value['start'] == null ? undefined : ((value['start']).toISOString()),
        'duration': value['duration'],
        'departure': value['departure'] == null ? undefined : ((value['departure']).toISOString()),
    };
}

