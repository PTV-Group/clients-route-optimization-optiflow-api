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
import type { RouteOptimizationDrivingBreakSettings } from './RouteOptimizationDrivingBreakSettings';
import {
    RouteOptimizationDrivingBreakSettingsFromJSON,
    RouteOptimizationDrivingBreakSettingsFromJSONTyped,
    RouteOptimizationDrivingBreakSettingsToJSON,
} from './RouteOptimizationDrivingBreakSettings';
import type { RouteOptimizationWorkingBreakSettings } from './RouteOptimizationWorkingBreakSettings';
import {
    RouteOptimizationWorkingBreakSettingsFromJSON,
    RouteOptimizationWorkingBreakSettingsFromJSONTyped,
    RouteOptimizationWorkingBreakSettingsToJSON,
} from './RouteOptimizationWorkingBreakSettings';

/**
 * Specifies when the driver of the vehicle must take a break during the route.
 * @export
 * @interface RouteOptimizationBreakSettings
 */
export interface RouteOptimizationBreakSettings {
    /**
     * A list of restrictions that specify how long the driver of the vehicle may work without taking a break. All the time spent during a route is considered working time except for waiting time and break time.
     * @type {Array<RouteOptimizationWorkingBreakSettings>}
     * @memberof RouteOptimizationBreakSettings
     */
    working?: Array<RouteOptimizationWorkingBreakSettings>;
    /**
     * A list of restrictions that specify how long the driver of the vehicle may drive without taking a break of at least the specified duration.
     * @type {Array<RouteOptimizationDrivingBreakSettings>}
     * @memberof RouteOptimizationBreakSettings
     */
    driving?: Array<RouteOptimizationDrivingBreakSettings>;
}

/**
 * Check if a given object implements the RouteOptimizationBreakSettings interface.
 */
export function instanceOfRouteOptimizationBreakSettings(value: object): boolean {
    return true;
}

export function RouteOptimizationBreakSettingsFromJSON(json: any): RouteOptimizationBreakSettings {
    return RouteOptimizationBreakSettingsFromJSONTyped(json, false);
}

export function RouteOptimizationBreakSettingsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationBreakSettings {
    if (json == null) {
        return json;
    }
    return {
        
        'working': json['working'] == null ? undefined : ((json['working'] as Array<any>).map(RouteOptimizationWorkingBreakSettingsFromJSON)),
        'driving': json['driving'] == null ? undefined : ((json['driving'] as Array<any>).map(RouteOptimizationDrivingBreakSettingsFromJSON)),
    };
}

export function RouteOptimizationBreakSettingsToJSON(value?: RouteOptimizationBreakSettings | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'working': value['working'] == null ? undefined : ((value['working'] as Array<any>).map(RouteOptimizationWorkingBreakSettingsToJSON)),
        'driving': value['driving'] == null ? undefined : ((value['driving'] as Array<any>).map(RouteOptimizationDrivingBreakSettingsToJSON)),
    };
}

