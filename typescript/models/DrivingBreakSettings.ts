/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Restricts how long the driver of the vehicle may drive without taking a break of at least the specified duration.
 * @export
 * @interface DrivingBreakSettings
 */
export interface DrivingBreakSettings {
    /**
     * Describes how long [s] the driver may drive without taking a break of at least the specified duration.
     * @type {number}
     * @memberof DrivingBreakSettings
     */
    maximumDrivingDuration: number;
    /**
     * Specifies the duration [s] of a break a driver has to take if they exceed the maximum driving duration.
     * @type {number}
     * @memberof DrivingBreakSettings
     */
    minimumBreakDuration: number;
}

export function DrivingBreakSettingsFromJSON(json: any): DrivingBreakSettings {
    return DrivingBreakSettingsFromJSONTyped(json, false);
}

export function DrivingBreakSettingsFromJSONTyped(json: any, ignoreDiscriminator: boolean): DrivingBreakSettings {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'maximumDrivingDuration': json['maximumDrivingDuration'],
        'minimumBreakDuration': json['minimumBreakDuration'],
    };
}

export function DrivingBreakSettingsToJSON(value?: DrivingBreakSettings | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'maximumDrivingDuration': value.maximumDrivingDuration,
        'minimumBreakDuration': value.minimumBreakDuration,
    };
}

