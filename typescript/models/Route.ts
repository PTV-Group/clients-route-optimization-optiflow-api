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
import {
    RouteEnd,
    RouteEndFromJSON,
    RouteEndFromJSONTyped,
    RouteEndToJSON,
} from './RouteEnd';
import {
    RouteMetrics,
    RouteMetricsFromJSON,
    RouteMetricsFromJSONTyped,
    RouteMetricsToJSON,
} from './RouteMetrics';
import {
    RouteStart,
    RouteStartFromJSON,
    RouteStartFromJSONTyped,
    RouteStartToJSON,
} from './RouteStart';
import {
    Stop,
    StopFromJSON,
    StopFromJSONTyped,
    StopToJSON,
} from './Stop';

/**
 * A route is a sequence of tasks assigned to a vehicle.
 * @export
 * @interface Route
 */
export interface Route {
    /**
     * The unique identifier of the vehicle assigned to the route.
     * @type {string}
     * @memberof Route
     */
    vehicleId?: string;
    /**
     * 
     * @type {RouteStart}
     * @memberof Route
     */
    start?: RouteStart;
    /**
     * The list of stops scheduled on the route. A stop describes the visit of a location on a route where one or more tasks are scheduled. Its approach describes how to reach the location from the previous location visited on the route. Consecutive tasks are grouped to an appointment if they are assigned to the same time slot. Consecutive appointments are grouped as a stop if they are scheduled at the same location.
     * @type {Array<Stop>}
     * @memberof Route
     */
    stops?: Array<Stop>;
    /**
     * 
     * @type {RouteEnd}
     * @memberof Route
     */
    end?: RouteEnd;
    /**
     * 
     * @type {RouteMetrics}
     * @memberof Route
     */
    metrics?: RouteMetrics;
}

export function RouteFromJSON(json: any): Route {
    return RouteFromJSONTyped(json, false);
}

export function RouteFromJSONTyped(json: any, ignoreDiscriminator: boolean): Route {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'vehicleId': !exists(json, 'vehicleId') ? undefined : json['vehicleId'],
        'start': !exists(json, 'start') ? undefined : RouteStartFromJSON(json['start']),
        'stops': !exists(json, 'stops') ? undefined : ((json['stops'] as Array<any>).map(StopFromJSON)),
        'end': !exists(json, 'end') ? undefined : RouteEndFromJSON(json['end']),
        'metrics': !exists(json, 'metrics') ? undefined : RouteMetricsFromJSON(json['metrics']),
    };
}

export function RouteToJSON(value?: Route | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'vehicleId': value.vehicleId,
        'start': RouteStartToJSON(value.start),
        'stops': value.stops === undefined ? undefined : ((value.stops as Array<any>).map(StopToJSON)),
        'end': RouteEndToJSON(value.end),
        'metrics': RouteMetricsToJSON(value.metrics),
    };
}

