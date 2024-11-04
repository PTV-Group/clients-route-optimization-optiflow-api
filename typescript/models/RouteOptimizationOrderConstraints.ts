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
import type { RouteOptimizationLoadingIncompatibilityConstraint } from './RouteOptimizationLoadingIncompatibilityConstraint';
import {
    RouteOptimizationLoadingIncompatibilityConstraintFromJSON,
    RouteOptimizationLoadingIncompatibilityConstraintFromJSONTyped,
    RouteOptimizationLoadingIncompatibilityConstraintToJSON,
} from './RouteOptimizationLoadingIncompatibilityConstraint';
import type { RouteOptimizationRespectedOrderSequence } from './RouteOptimizationRespectedOrderSequence';
import {
    RouteOptimizationRespectedOrderSequenceFromJSON,
    RouteOptimizationRespectedOrderSequenceFromJSONTyped,
    RouteOptimizationRespectedOrderSequenceToJSON,
} from './RouteOptimizationRespectedOrderSequence';

/**
 * Describes constraints on the way orders can be scheduled together on routes.
 * @export
 * @interface RouteOptimizationOrderConstraints
 */
export interface RouteOptimizationOrderConstraints {
    /**
     * A list of sequences that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered in the route before an order belonging to a category later in the sequence can be picked up.
     * 
     * @type {Array<RouteOptimizationRespectedOrderSequence>}
     * @memberof RouteOptimizationOrderConstraints
     */
    respectedSequences?: Array<RouteOptimizationRespectedOrderSequence>;
    /**
     * A list of constraints that prevent orders to be loaded or unloaded while other orders are loaded in the vehicle.
     * @type {Array<RouteOptimizationLoadingIncompatibilityConstraint>}
     * @memberof RouteOptimizationOrderConstraints
     */
    loadingIncompatibilities?: Array<RouteOptimizationLoadingIncompatibilityConstraint>;
}

/**
 * Check if a given object implements the RouteOptimizationOrderConstraints interface.
 */
export function instanceOfRouteOptimizationOrderConstraints(value: object): boolean {
    return true;
}

export function RouteOptimizationOrderConstraintsFromJSON(json: any): RouteOptimizationOrderConstraints {
    return RouteOptimizationOrderConstraintsFromJSONTyped(json, false);
}

export function RouteOptimizationOrderConstraintsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationOrderConstraints {
    if (json == null) {
        return json;
    }
    return {
        
        'respectedSequences': json['respectedSequences'] == null ? undefined : ((json['respectedSequences'] as Array<any>).map(RouteOptimizationRespectedOrderSequenceFromJSON)),
        'loadingIncompatibilities': json['loadingIncompatibilities'] == null ? undefined : ((json['loadingIncompatibilities'] as Array<any>).map(RouteOptimizationLoadingIncompatibilityConstraintFromJSON)),
    };
}

export function RouteOptimizationOrderConstraintsToJSON(value?: RouteOptimizationOrderConstraints | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'respectedSequences': value['respectedSequences'] == null ? undefined : ((value['respectedSequences'] as Array<any>).map(RouteOptimizationRespectedOrderSequenceToJSON)),
        'loadingIncompatibilities': value['loadingIncompatibilities'] == null ? undefined : ((value['loadingIncompatibilities'] as Array<any>).map(RouteOptimizationLoadingIncompatibilityConstraintToJSON)),
    };
}
