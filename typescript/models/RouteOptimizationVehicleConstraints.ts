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
import type { RouteOptimizationLoad } from './RouteOptimizationLoad';
import {
    RouteOptimizationLoadFromJSON,
    RouteOptimizationLoadFromJSONTyped,
    RouteOptimizationLoadToJSON,
} from './RouteOptimizationLoad';
import type { RouteOptimizationRouteConstraints } from './RouteOptimizationRouteConstraints';
import {
    RouteOptimizationRouteConstraintsFromJSON,
    RouteOptimizationRouteConstraintsFromJSONTyped,
    RouteOptimizationRouteConstraintsToJSON,
} from './RouteOptimizationRouteConstraints';

/**
 * Defines constraints on the tasks that can be executed with the vehicle.
 * @export
 * @interface RouteOptimizationVehicleConstraints
 */
export interface RouteOptimizationVehicleConstraints {
    /**
     * A list of load dimensions that describe the capacity of the vehicle. For each dimension specified in this list, the sum of the values of the orders loaded in the vehicle must be lower than or equal to the value of the vehicle. For unspecified dimensions, the load of the vehicle is assumed to be unconstrained for this dimension.
     * @type {Array<RouteOptimizationLoad>}
     * @memberof RouteOptimizationVehicleConstraints
     */
    maximumLoads?: Array<RouteOptimizationLoad>;
    /**
     * 
     * @type {RouteOptimizationRouteConstraints}
     * @memberof RouteOptimizationVehicleConstraints
     */
    route?: RouteOptimizationRouteConstraints;
}

/**
 * Check if a given object implements the RouteOptimizationVehicleConstraints interface.
 */
export function instanceOfRouteOptimizationVehicleConstraints(value: object): boolean {
    return true;
}

export function RouteOptimizationVehicleConstraintsFromJSON(json: any): RouteOptimizationVehicleConstraints {
    return RouteOptimizationVehicleConstraintsFromJSONTyped(json, false);
}

export function RouteOptimizationVehicleConstraintsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationVehicleConstraints {
    if (json == null) {
        return json;
    }
    return {
        
        'maximumLoads': json['maximumLoads'] == null ? undefined : ((json['maximumLoads'] as Array<any>).map(RouteOptimizationLoadFromJSON)),
        'route': json['route'] == null ? undefined : RouteOptimizationRouteConstraintsFromJSON(json['route']),
    };
}

export function RouteOptimizationVehicleConstraintsToJSON(value?: RouteOptimizationVehicleConstraints | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'maximumLoads': value['maximumLoads'] == null ? undefined : ((value['maximumLoads'] as Array<any>).map(RouteOptimizationLoadToJSON)),
        'route': RouteOptimizationRouteConstraintsToJSON(value['route']),
    };
}

