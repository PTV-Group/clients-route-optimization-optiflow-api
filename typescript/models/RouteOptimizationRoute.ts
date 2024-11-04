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
import type { RouteOptimizationRouteEnd } from './RouteOptimizationRouteEnd';
import {
    RouteOptimizationRouteEndFromJSON,
    RouteOptimizationRouteEndFromJSONTyped,
    RouteOptimizationRouteEndToJSON,
} from './RouteOptimizationRouteEnd';
import type { RouteOptimizationRouteMetrics } from './RouteOptimizationRouteMetrics';
import {
    RouteOptimizationRouteMetricsFromJSON,
    RouteOptimizationRouteMetricsFromJSONTyped,
    RouteOptimizationRouteMetricsToJSON,
} from './RouteOptimizationRouteMetrics';
import type { RouteOptimizationRouteStart } from './RouteOptimizationRouteStart';
import {
    RouteOptimizationRouteStartFromJSON,
    RouteOptimizationRouteStartFromJSONTyped,
    RouteOptimizationRouteStartToJSON,
} from './RouteOptimizationRouteStart';
import type { RouteOptimizationStop } from './RouteOptimizationStop';
import {
    RouteOptimizationStopFromJSON,
    RouteOptimizationStopFromJSONTyped,
    RouteOptimizationStopToJSON,
} from './RouteOptimizationStop';

/**
 * A route is a sequence of tasks assigned to a vehicle.
 * 
 * @export
 * @interface RouteOptimizationRoute
 */
export interface RouteOptimizationRoute {
    /**
     * The unique identifier of the vehicle assigned to the route.
     * @type {string}
     * @memberof RouteOptimizationRoute
     */
    vehicleId?: string;
    /**
     * 
     * @type {RouteOptimizationRouteStart}
     * @memberof RouteOptimizationRoute
     */
    start?: RouteOptimizationRouteStart;
    /**
     * The list of stops scheduled on the route. A stop describes the visit of a location on a route where one or more tasks are scheduled. Its approach describes how to reach the location from the previous location visited on the route. Consecutive tasks are grouped to an appointment if they are assigned to the same time slot. Consecutive appointments are grouped as a stop if they are scheduled at the same location.
     * 
     * @type {Array<RouteOptimizationStop>}
     * @memberof RouteOptimizationRoute
     */
    stops?: Array<RouteOptimizationStop>;
    /**
     * 
     * @type {RouteOptimizationRouteEnd}
     * @memberof RouteOptimizationRoute
     */
    end?: RouteOptimizationRouteEnd;
    /**
     * 
     * @type {RouteOptimizationRouteMetrics}
     * @memberof RouteOptimizationRoute
     */
    metrics?: RouteOptimizationRouteMetrics;
}

/**
 * Check if a given object implements the RouteOptimizationRoute interface.
 */
export function instanceOfRouteOptimizationRoute(value: object): boolean {
    return true;
}

export function RouteOptimizationRouteFromJSON(json: any): RouteOptimizationRoute {
    return RouteOptimizationRouteFromJSONTyped(json, false);
}

export function RouteOptimizationRouteFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationRoute {
    if (json == null) {
        return json;
    }
    return {
        
        'vehicleId': json['vehicleId'] == null ? undefined : json['vehicleId'],
        'start': json['start'] == null ? undefined : RouteOptimizationRouteStartFromJSON(json['start']),
        'stops': json['stops'] == null ? undefined : ((json['stops'] as Array<any>).map(RouteOptimizationStopFromJSON)),
        'end': json['end'] == null ? undefined : RouteOptimizationRouteEndFromJSON(json['end']),
        'metrics': json['metrics'] == null ? undefined : RouteOptimizationRouteMetricsFromJSON(json['metrics']),
    };
}

export function RouteOptimizationRouteToJSON(value?: RouteOptimizationRoute | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'vehicleId': value['vehicleId'],
        'start': RouteOptimizationRouteStartToJSON(value['start']),
        'stops': value['stops'] == null ? undefined : ((value['stops'] as Array<any>).map(RouteOptimizationStopToJSON)),
        'end': RouteOptimizationRouteEndToJSON(value['end']),
        'metrics': RouteOptimizationRouteMetricsToJSON(value['metrics']),
    };
}
