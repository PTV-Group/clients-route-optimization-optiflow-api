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
 * Metrics providing insights into the route.
 * @export
 * @interface RouteMetrics
 */
export interface RouteMetrics {
    /**
     * The number of stops in the route. A stop is a visit at a location where one or more tasks are executed.
     * @type {number}
     * @memberof RouteMetrics
     */
    numberOfStops?: number;
    /**
     * The cost of the route. This includes the cost per hour, cost per kilometer and fixed cost of the vehicle.
     * @type {number}
     * @memberof RouteMetrics
     */
    cost?: number;
    /**
     * The distance [m] travelled on the route.
     * @type {number}
     * @memberof RouteMetrics
     */
    distance?: number;
    /**
     * The duration [s] of the route from start to end.
     * @type {number}
     * @memberof RouteMetrics
     */
    duration?: number;
}

export function RouteMetricsFromJSON(json: any): RouteMetrics {
    return RouteMetricsFromJSONTyped(json, false);
}

export function RouteMetricsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteMetrics {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'numberOfStops': !exists(json, 'numberOfStops') ? undefined : json['numberOfStops'],
        'cost': !exists(json, 'cost') ? undefined : json['cost'],
        'distance': !exists(json, 'distance') ? undefined : json['distance'],
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
    };
}

export function RouteMetricsToJSON(value?: RouteMetrics | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'numberOfStops': value.numberOfStops,
        'cost': value.cost,
        'distance': value.distance,
        'duration': value.duration,
    };
}

