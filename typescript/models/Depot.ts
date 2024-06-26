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
 * A depot where pickup orders can be delivered to or delivery orders can be picked up from.
 * When stopping at a depot, all pickup orders present in the vehicle are unloaded first.
 * Afterwards delivery orders can be loaded in the vehicle, which must be delivered before stopping at the next depot.
 * 
 * When providing pickup or delivery orders, at least one depot should be specified.
 * 
 * When providing pickup-delivery orders, no tasks happen at the depot and depots must be omitted.
 * @export
 * @interface Depot
 */
export interface Depot {
    /**
     * A unique identifier of the depot.
     * @type {string}
     * @memberof Depot
     */
    id: string;
    /**
     * The unique identifier of the location where the depot is situated.
     * @type {string}
     * @memberof Depot
     */
    locationId: string;
    /**
     * A list of unique identifiers of the time slots of the depot location that can be used to execute tasks at this depot. When empty all time slots can be used.
     * @type {Array<string>}
     * @memberof Depot
     */
    timeSlotIds?: Array<string>;
    /**
     * A list of categories the depot belongs to that can be used to describe constraints.
     * @type {Array<string>}
     * @memberof Depot
     */
    categories?: Array<string>;
}

export function DepotFromJSON(json: any): Depot {
    return DepotFromJSONTyped(json, false);
}

export function DepotFromJSONTyped(json: any, ignoreDiscriminator: boolean): Depot {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'locationId': json['locationId'],
        'timeSlotIds': !exists(json, 'timeSlotIds') ? undefined : json['timeSlotIds'],
        'categories': !exists(json, 'categories') ? undefined : json['categories'],
    };
}

export function DepotToJSON(value?: Depot | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'locationId': value.locationId,
        'timeSlotIds': value.timeSlotIds,
        'categories': value.categories,
    };
}

