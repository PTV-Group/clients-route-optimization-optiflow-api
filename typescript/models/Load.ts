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
 * For an order this describes how much capacity for a certain dimension is needed in the vehicle. For a vehicle, this describes its capacity for a certain dimension. For each dimension, the sum of the values of orders loaded into the vehicle must be lower than or equal to the value of the vehicle.
 * @export
 * @interface Load
 */
export interface Load {
    /**
     * Indicates the specific dimension of the load, such as its volume, weight, or size.
     * @type {string}
     * @memberof Load
     */
    dimension: string;
    /**
     * Represents the numeric value associated with the load's dimension. This value could be the actual measurement or quantity of the load.
     * @type {number}
     * @memberof Load
     */
    value: number;
}

export function LoadFromJSON(json: any): Load {
    return LoadFromJSONTyped(json, false);
}

export function LoadFromJSONTyped(json: any, ignoreDiscriminator: boolean): Load {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'dimension': json['dimension'],
        'value': json['value'],
    };
}

export function LoadToJSON(value?: Load | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'dimension': value.dimension,
        'value': value.value,
    };
}

