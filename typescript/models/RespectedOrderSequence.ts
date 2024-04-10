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
/**
 * A sequence that must be respected when scheduling routes. Orders belonging to a category that occurs earlier in the sequence must be delivered before an order belonging to a category later in the sequence can be picked up.
 * @export
 * @interface RespectedOrderSequence
 */
export interface RespectedOrderSequence {
    /**
     * The sequence of order categories that has to be respected within a route. The index of the category in the list determines the sequence. Categories that do not correspond to any order will be ignored.
     * @type {Set<string>}
     * @memberof RespectedOrderSequence
     */
    orderCategories: Set<string>;
    /**
     * The category of vehicles to which this constraint applies. When omitted the constraint applies to all vehicles. The constraint will be ignored if no vehicle belongs to this category.
     * @type {string}
     * @memberof RespectedOrderSequence
     */
    vehicleCategory?: string;
}

export function RespectedOrderSequenceFromJSON(json: any): RespectedOrderSequence {
    return RespectedOrderSequenceFromJSONTyped(json, false);
}

export function RespectedOrderSequenceFromJSONTyped(json: any, ignoreDiscriminator: boolean): RespectedOrderSequence {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'orderCategories': json['orderCategories'],
        'vehicleCategory': !exists(json, 'vehicleCategory') ? undefined : json['vehicleCategory'],
    };
}

export function RespectedOrderSequenceToJSON(value?: RespectedOrderSequence | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'orderCategories': value.orderCategories,
        'vehicleCategory': value.vehicleCategory,
    };
}

