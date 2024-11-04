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
/**
 * Describes constraints on the route that may be assigned to the vehicle.
 * @export
 * @interface RouteOptimizationRouteConstraints
 */
export interface RouteOptimizationRouteConstraints {
    /**
     * Restricts the maximum duration [s] of the route assigned to the vehicle.
     * @type {number}
     * @memberof RouteOptimizationRouteConstraints
     */
    maximumDuration?: number;
    /**
     * Restricts the maximum distance [m] travelled on the route assigned to the vehicle.
     * @type {number}
     * @memberof RouteOptimizationRouteConstraints
     */
    maximumDistance?: number;
}

/**
 * Check if a given object implements the RouteOptimizationRouteConstraints interface.
 */
export function instanceOfRouteOptimizationRouteConstraints(value: object): boolean {
    return true;
}

export function RouteOptimizationRouteConstraintsFromJSON(json: any): RouteOptimizationRouteConstraints {
    return RouteOptimizationRouteConstraintsFromJSONTyped(json, false);
}

export function RouteOptimizationRouteConstraintsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationRouteConstraints {
    if (json == null) {
        return json;
    }
    return {
        
        'maximumDuration': json['maximumDuration'] == null ? undefined : json['maximumDuration'],
        'maximumDistance': json['maximumDistance'] == null ? undefined : json['maximumDistance'],
    };
}

export function RouteOptimizationRouteConstraintsToJSON(value?: RouteOptimizationRouteConstraints | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'maximumDuration': value['maximumDuration'],
        'maximumDistance': value['maximumDistance'],
    };
}
