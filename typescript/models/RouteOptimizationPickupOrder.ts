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
import type { RouteOptimizationOrderProperties } from './RouteOptimizationOrderProperties';
import {
    RouteOptimizationOrderPropertiesFromJSON,
    RouteOptimizationOrderPropertiesFromJSONTyped,
    RouteOptimizationOrderPropertiesToJSON,
} from './RouteOptimizationOrderProperties';
import type { RouteOptimizationTaskProperties } from './RouteOptimizationTaskProperties';
import {
    RouteOptimizationTaskPropertiesFromJSON,
    RouteOptimizationTaskPropertiesFromJSONTyped,
    RouteOptimizationTaskPropertiesToJSON,
} from './RouteOptimizationTaskProperties';

/**
 * A request to pickup an order and transport it to a depot.
 * @export
 * @interface RouteOptimizationPickupOrder
 */
export interface RouteOptimizationPickupOrder {
    /**
     * A unique identifier of the order. This must be unique across all orders.
     * 
     * @type {string}
     * @memberof RouteOptimizationPickupOrder
     */
    id: string;
    /**
     * 
     * @type {RouteOptimizationTaskProperties}
     * @memberof RouteOptimizationPickupOrder
     */
    pickup: RouteOptimizationTaskProperties;
    /**
     * 
     * @type {RouteOptimizationOrderProperties}
     * @memberof RouteOptimizationPickupOrder
     */
    properties?: RouteOptimizationOrderProperties;
}

/**
 * Check if a given object implements the RouteOptimizationPickupOrder interface.
 */
export function instanceOfRouteOptimizationPickupOrder(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('pickup' in value)) return false;
    return true;
}

export function RouteOptimizationPickupOrderFromJSON(json: any): RouteOptimizationPickupOrder {
    return RouteOptimizationPickupOrderFromJSONTyped(json, false);
}

export function RouteOptimizationPickupOrderFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationPickupOrder {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'pickup': RouteOptimizationTaskPropertiesFromJSON(json['pickup']),
        'properties': json['properties'] == null ? undefined : RouteOptimizationOrderPropertiesFromJSON(json['properties']),
    };
}

export function RouteOptimizationPickupOrderToJSON(value?: RouteOptimizationPickupOrder | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'pickup': RouteOptimizationTaskPropertiesToJSON(value['pickup']),
        'properties': RouteOptimizationOrderPropertiesToJSON(value['properties']),
    };
}
