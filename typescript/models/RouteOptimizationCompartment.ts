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
import type { RouteOptimizationCompartmentLoadingStrategy } from './RouteOptimizationCompartmentLoadingStrategy';
import {
    RouteOptimizationCompartmentLoadingStrategyFromJSON,
    RouteOptimizationCompartmentLoadingStrategyFromJSONTyped,
    RouteOptimizationCompartmentLoadingStrategyToJSON,
} from './RouteOptimizationCompartmentLoadingStrategy';

/**
 * Defines a vehicle compartment available for loading orders.
 * @export
 * @interface RouteOptimizationCompartment
 */
export interface RouteOptimizationCompartment {
    /**
     * A unique identifier for the compartment, which must be distinct among all compartments within the same vehicle.
     * @type {string}
     * @memberof RouteOptimizationCompartment
     */
    id: string;
    /**
     * 
     * @type {RouteOptimizationCompartmentLoadingStrategy}
     * @memberof RouteOptimizationCompartment
     */
    loadingStrategy?: RouteOptimizationCompartmentLoadingStrategy;
    /**
     * A list of categories the compartment belongs to that can be used to describe constraints.
     * @type {Array<string>}
     * @memberof RouteOptimizationCompartment
     */
    categories?: Array<string>;
}

/**
 * Check if a given object implements the RouteOptimizationCompartment interface.
 */
export function instanceOfRouteOptimizationCompartment(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function RouteOptimizationCompartmentFromJSON(json: any): RouteOptimizationCompartment {
    return RouteOptimizationCompartmentFromJSONTyped(json, false);
}

export function RouteOptimizationCompartmentFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationCompartment {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'loadingStrategy': json['loadingStrategy'] == null ? undefined : RouteOptimizationCompartmentLoadingStrategyFromJSON(json['loadingStrategy']),
        'categories': json['categories'] == null ? undefined : json['categories'],
    };
}

export function RouteOptimizationCompartmentToJSON(value?: RouteOptimizationCompartment | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'loadingStrategy': RouteOptimizationCompartmentLoadingStrategyToJSON(value['loadingStrategy']),
        'categories': value['categories'],
    };
}

