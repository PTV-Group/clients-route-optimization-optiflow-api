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
 * Describes the pickup task or the delivery task of an order.
 * @export
 * @interface RouteOptimizationTaskProperties
 */
export interface RouteOptimizationTaskProperties {
    /**
     * The unique identifier of the location where the task must be scheduled.
     * @type {string}
     * @memberof RouteOptimizationTaskProperties
     */
    locationId: string;
    /**
     * A list of unique identifiers of the time slots of the location that can be used to execute this task. When empty all time slots can be used.
     * @type {Array<string>}
     * @memberof RouteOptimizationTaskProperties
     */
    timeSlotIds?: Array<string>;
    /**
     * The duration [s] it takes to execute this task.
     * @type {number}
     * @memberof RouteOptimizationTaskProperties
     */
    duration?: number;
    /**
     * A list of categories the task belongs to that can be used to describe constraints.
     * @type {Array<string>}
     * @memberof RouteOptimizationTaskProperties
     */
    categories?: Array<string>;
}

/**
 * Check if a given object implements the RouteOptimizationTaskProperties interface.
 */
export function instanceOfRouteOptimizationTaskProperties(value: object): boolean {
    if (!('locationId' in value)) return false;
    return true;
}

export function RouteOptimizationTaskPropertiesFromJSON(json: any): RouteOptimizationTaskProperties {
    return RouteOptimizationTaskPropertiesFromJSONTyped(json, false);
}

export function RouteOptimizationTaskPropertiesFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationTaskProperties {
    if (json == null) {
        return json;
    }
    return {
        
        'locationId': json['locationId'],
        'timeSlotIds': json['timeSlotIds'] == null ? undefined : json['timeSlotIds'],
        'duration': json['duration'] == null ? undefined : json['duration'],
        'categories': json['categories'] == null ? undefined : json['categories'],
    };
}

export function RouteOptimizationTaskPropertiesToJSON(value?: RouteOptimizationTaskProperties | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'locationId': value['locationId'],
        'timeSlotIds': value['timeSlotIds'],
        'duration': value['duration'],
        'categories': value['categories'],
    };
}

