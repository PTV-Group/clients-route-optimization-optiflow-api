/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    ForbiddenTaskSequenceType,
    ForbiddenTaskSequenceTypeFromJSON,
    ForbiddenTaskSequenceTypeFromJSONTyped,
    ForbiddenTaskSequenceTypeToJSON,
} from './ForbiddenTaskSequenceType';

/**
 * Constrains tasks belonging a certain category to be executed before tasks belonging to another category on the route.
 * @export
 * @interface ForbiddenTaskSequence
 */
export interface ForbiddenTaskSequence {
    /**
     * The category of tasks that cannot be scheduled on the route before a task with the second task category. The constraint will be ignored when no task belongs to this category.
     * @type {string}
     * @memberof ForbiddenTaskSequence
     */
    firstTaskCategory: string;
    /**
     * 
     * @type {ForbiddenTaskSequenceType}
     * @memberof ForbiddenTaskSequence
     */
    type: ForbiddenTaskSequenceType;
    /**
     * The category of the tasks that must not be preceded in the route by tasks belonging to the first task category. The constraint will be ignored when no task belongs to this category.
     * @type {string}
     * @memberof ForbiddenTaskSequence
     */
    secondTaskCategory: string;
    /**
     * The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored when no vehicle belongs to this category.
     * @type {string}
     * @memberof ForbiddenTaskSequence
     */
    vehicleCategory?: string;
}

export function ForbiddenTaskSequenceFromJSON(json: any): ForbiddenTaskSequence {
    return ForbiddenTaskSequenceFromJSONTyped(json, false);
}

export function ForbiddenTaskSequenceFromJSONTyped(json: any, ignoreDiscriminator: boolean): ForbiddenTaskSequence {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'firstTaskCategory': json['firstTaskCategory'],
        'type': ForbiddenTaskSequenceTypeFromJSON(json['type']),
        'secondTaskCategory': json['secondTaskCategory'],
        'vehicleCategory': !exists(json, 'vehicleCategory') ? undefined : json['vehicleCategory'],
    };
}

export function ForbiddenTaskSequenceToJSON(value?: ForbiddenTaskSequence | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'firstTaskCategory': value.firstTaskCategory,
        'type': ForbiddenTaskSequenceTypeToJSON(value.type),
        'secondTaskCategory': value.secondTaskCategory,
        'vehicleCategory': value.vehicleCategory,
    };
}

