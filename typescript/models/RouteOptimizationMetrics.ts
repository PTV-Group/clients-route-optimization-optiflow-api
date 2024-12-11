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
 * Metrics providing insights into the current result of the optimization. These will be provided if the status of the optimization is `RUNNING`, `STOPPING` or `SUCCEEDED`.
 * @export
 * @interface RouteOptimizationMetrics
 */
export interface RouteOptimizationMetrics {
    /**
     * The number of orders that are not planned by the optimization.
     * @type {number}
     * @memberof RouteOptimizationMetrics
     */
    numberOfUnscheduledOrders: number;
    /**
     * The number of routes that where scheduled by the optimization.
     * @type {number}
     * @memberof RouteOptimizationMetrics
     */
    numberOfRoutes: number;
    /**
     * The total cost of the scheduled routes. This includes the cost of the routes and the outsourcing cost of the unplanned orders.
     * @type {number}
     * @memberof RouteOptimizationMetrics
     */
    totalCost: number;
    /**
     * The sum of the distances [m] of the scheduled routes.
     * @type {number}
     * @memberof RouteOptimizationMetrics
     */
    totalDistance: number;
    /**
     * The sum of the durations [s] of the scheduled routes.
     * @type {number}
     * @memberof RouteOptimizationMetrics
     */
    totalDuration: number;
}

/**
 * Check if a given object implements the RouteOptimizationMetrics interface.
 */
export function instanceOfRouteOptimizationMetrics(value: object): boolean {
    if (!('numberOfUnscheduledOrders' in value)) return false;
    if (!('numberOfRoutes' in value)) return false;
    if (!('totalCost' in value)) return false;
    if (!('totalDistance' in value)) return false;
    if (!('totalDuration' in value)) return false;
    return true;
}

export function RouteOptimizationMetricsFromJSON(json: any): RouteOptimizationMetrics {
    return RouteOptimizationMetricsFromJSONTyped(json, false);
}

export function RouteOptimizationMetricsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationMetrics {
    if (json == null) {
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

export function RouteOptimizationMetricsToJSON(value?: RouteOptimizationMetrics | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'numberOfUnscheduledOrders': value['numberOfUnscheduledOrders'],
        'numberOfRoutes': value['numberOfRoutes'],
        'totalCost': value['totalCost'],
        'totalDistance': value['totalDistance'],
        'totalDuration': value['totalDuration'],
    };
}

