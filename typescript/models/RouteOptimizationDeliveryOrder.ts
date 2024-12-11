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
 * An order to deliver goods, which are picked up from a depot.
 * @export
 * @interface RouteOptimizationDeliveryOrder
 */
export interface RouteOptimizationDeliveryOrder {
    /**
     * A unique identifier of the order. This must be unique across all orders.
     * @type {string}
     * @memberof RouteOptimizationDeliveryOrder
     */
    id: string;
    /**
     * 
     * @type {RouteOptimizationTaskProperties}
     * @memberof RouteOptimizationDeliveryOrder
     */
    delivery: RouteOptimizationTaskProperties;
    /**
     * 
     * @type {RouteOptimizationOrderProperties}
     * @memberof RouteOptimizationDeliveryOrder
     */
    properties?: RouteOptimizationOrderProperties;
}

/**
 * Check if a given object implements the RouteOptimizationDeliveryOrder interface.
 */
export function instanceOfRouteOptimizationDeliveryOrder(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('delivery' in value)) return false;
    return true;
}

export function RouteOptimizationDeliveryOrderFromJSON(json: any): RouteOptimizationDeliveryOrder {
    return RouteOptimizationDeliveryOrderFromJSONTyped(json, false);
}

export function RouteOptimizationDeliveryOrderFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationDeliveryOrder {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'delivery': RouteOptimizationTaskPropertiesFromJSON(json['delivery']),
        'properties': json['properties'] == null ? undefined : RouteOptimizationOrderPropertiesFromJSON(json['properties']),
    };
}

export function RouteOptimizationDeliveryOrderToJSON(value?: RouteOptimizationDeliveryOrder | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'delivery': RouteOptimizationTaskPropertiesToJSON(value['delivery']),
        'properties': RouteOptimizationOrderPropertiesToJSON(value['properties']),
    };
}

