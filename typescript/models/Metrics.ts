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
 * Metrics providing insights into the current result of the optimization. These will be provided if the status of the optimization is *RUNNING*, *STOPPING* or *SUCCEEDED*.
 * @export
 * @interface Metrics
 */
export interface Metrics {
    /**
     * The number of orders that are not planned by the optimization.
     * @type {number}
     * @memberof Metrics
     */
    numberOfUnscheduledOrders: number;
    /**
     * The number of routes that where scheduled by the optimization.
     * @type {number}
     * @memberof Metrics
     */
    numberOfRoutes: number;
    /**
     * The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders.
     * @type {number}
     * @memberof Metrics
     */
    totalCost: number;
    /**
     * The sum of the distances [m] of the scheduled routes.
     * @type {number}
     * @memberof Metrics
     */
    totalDistance: number;
    /**
     * The sum of the durations [s] of the scheduled routes.
     * @type {number}
     * @memberof Metrics
     */
    totalDuration: number;
}

export function MetricsFromJSON(json: any): Metrics {
    return MetricsFromJSONTyped(json, false);
}

export function MetricsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Metrics {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'numberOfUnscheduledOrders': json['numberOfUnscheduledOrders'],
        'numberOfRoutes': json['numberOfRoutes'],
        'totalCost': json['totalCost'],
        'totalDistance': json['totalDistance'],
        'totalDuration': json['totalDuration'],
    };
}

export function MetricsToJSON(value?: Metrics | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'numberOfUnscheduledOrders': value.numberOfUnscheduledOrders,
        'numberOfRoutes': value.numberOfRoutes,
        'totalCost': value.totalCost,
        'totalDistance': value.totalDistance,
        'totalDuration': value.totalDuration,
    };
}

