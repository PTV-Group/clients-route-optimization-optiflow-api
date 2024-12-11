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
import type { RouteOptimizationStopProperties } from './RouteOptimizationStopProperties';
import {
    RouteOptimizationStopPropertiesFromJSON,
    RouteOptimizationStopPropertiesFromJSONTyped,
    RouteOptimizationStopPropertiesToJSON,
} from './RouteOptimizationStopProperties';

/**
 * A specific location where goods have to be picked up or delivered, or where vehicles are located.
 * @export
 * @interface RouteOptimizationLocation
 */
export interface RouteOptimizationLocation {
    /**
     * A unique identifier of the location.
     * @type {string}
     * @memberof RouteOptimizationLocation
     */
    id: string;
    /**
     * The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof RouteOptimizationLocation
     */
    latitude: number;
    /**
     * The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof RouteOptimizationLocation
     */
    longitude: number;
    /**
     * 
     * @type {RouteOptimizationStopProperties}
     * @memberof RouteOptimizationLocation
     */
    stopProperties?: RouteOptimizationStopProperties;
}

/**
 * Check if a given object implements the RouteOptimizationLocation interface.
 */
export function instanceOfRouteOptimizationLocation(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('latitude' in value)) return false;
    if (!('longitude' in value)) return false;
    return true;
}

export function RouteOptimizationLocationFromJSON(json: any): RouteOptimizationLocation {
    return RouteOptimizationLocationFromJSONTyped(json, false);
}

export function RouteOptimizationLocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationLocation {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'stopProperties': json['stopProperties'] == null ? undefined : RouteOptimizationStopPropertiesFromJSON(json['stopProperties']),
    };
}

export function RouteOptimizationLocationToJSON(value?: RouteOptimizationLocation | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'latitude': value['latitude'],
        'longitude': value['longitude'],
        'stopProperties': RouteOptimizationStopPropertiesToJSON(value['stopProperties']),
    };
}

