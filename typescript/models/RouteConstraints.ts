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
 * Describes constraints on the route that may be assigned to the vehicle.
 * @export
 * @interface RouteConstraints
 */
export interface RouteConstraints {
    /**
     * Restricts the maximum duration [s] of the route assigned to the vehicle.
     * @type {number}
     * @memberof RouteConstraints
     */
    maximumDuration?: number;
    /**
     * Restricts the maximum distance [m] travelled on the route assigned to the vehicle.
     * @type {number}
     * @memberof RouteConstraints
     */
    maximumDistance?: number;
}

export function RouteConstraintsFromJSON(json: any): RouteConstraints {
    return RouteConstraintsFromJSONTyped(json, false);
}

export function RouteConstraintsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteConstraints {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'maximumDuration': !exists(json, 'maximumDuration') ? undefined : json['maximumDuration'],
        'maximumDistance': !exists(json, 'maximumDistance') ? undefined : json['maximumDistance'],
    };
}

export function RouteConstraintsToJSON(value?: RouteConstraints | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'maximumDuration': value.maximumDuration,
        'maximumDistance': value.maximumDistance,
    };
}

