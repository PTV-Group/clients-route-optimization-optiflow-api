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
import type { RouteOptimizationOrderVehicleCombinationConstraintType } from './RouteOptimizationOrderVehicleCombinationConstraintType';
import {
    RouteOptimizationOrderVehicleCombinationConstraintTypeFromJSON,
    RouteOptimizationOrderVehicleCombinationConstraintTypeFromJSONTyped,
    RouteOptimizationOrderVehicleCombinationConstraintTypeToJSON,
} from './RouteOptimizationOrderVehicleCombinationConstraintType';

/**
 * A constraint on the combination of orders and vehicles belonging to a certain category.
 * @export
 * @interface RouteOptimizationOrderVehicleCombinationConstraint
 */
export interface RouteOptimizationOrderVehicleCombinationConstraint {
    /**
     * 
     * @type {RouteOptimizationOrderVehicleCombinationConstraintType}
     * @memberof RouteOptimizationOrderVehicleCombinationConstraint
     */
    type: RouteOptimizationOrderVehicleCombinationConstraintType;
    /**
     * The category of orders to which the constraint applies. The constraint will be ignored if no order belongs to this category.
     * 
     * @type {string}
     * @memberof RouteOptimizationOrderVehicleCombinationConstraint
     */
    orderCategory: string;
    /**
     * The category of vehicles to which the constraint applies. The constraint will be ignored if no vehicle belongs to this category.
     * 
     * @type {string}
     * @memberof RouteOptimizationOrderVehicleCombinationConstraint
     */
    vehicleCategory: string;
    /**
     * The cost incurred when an order-vehicle combination does not meet this constraint. When omitted, all order-vehicle combinations must satisfy this constraint.
     * 
     * @type {number}
     * @memberof RouteOptimizationOrderVehicleCombinationConstraint
     */
    violationCost?: number;
}

/**
 * Check if a given object implements the RouteOptimizationOrderVehicleCombinationConstraint interface.
 */
export function instanceOfRouteOptimizationOrderVehicleCombinationConstraint(value: object): boolean {
    if (!('type' in value)) return false;
    if (!('orderCategory' in value)) return false;
    if (!('vehicleCategory' in value)) return false;
    return true;
}

export function RouteOptimizationOrderVehicleCombinationConstraintFromJSON(json: any): RouteOptimizationOrderVehicleCombinationConstraint {
    return RouteOptimizationOrderVehicleCombinationConstraintFromJSONTyped(json, false);
}

export function RouteOptimizationOrderVehicleCombinationConstraintFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationOrderVehicleCombinationConstraint {
    if (json == null) {
        return json;
    }
    return {
        
        'type': RouteOptimizationOrderVehicleCombinationConstraintTypeFromJSON(json['type']),
        'orderCategory': json['orderCategory'],
        'vehicleCategory': json['vehicleCategory'],
        'violationCost': json['violationCost'] == null ? undefined : json['violationCost'],
    };
}

export function RouteOptimizationOrderVehicleCombinationConstraintToJSON(value?: RouteOptimizationOrderVehicleCombinationConstraint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': RouteOptimizationOrderVehicleCombinationConstraintTypeToJSON(value['type']),
        'orderCategory': value['orderCategory'],
        'vehicleCategory': value['vehicleCategory'],
        'violationCost': value['violationCost'],
    };
}

