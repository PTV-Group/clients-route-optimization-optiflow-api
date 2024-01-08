/* tslint:disable */
/* eslint-disable */
/**
 * OptiFlow
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
import {
    TimeSlot,
    TimeSlotFromJSON,
    TimeSlotFromJSONTyped,
    TimeSlotToJSON,
} from './TimeSlot';

/**
 * Specifies the necessary information needed to schedule a stop at this location. This information is not relevant when the location is the start or end location of a vehicle.
 * @export
 * @interface StopProperties
 */
export interface StopProperties {
    /**
     * Defines a duration [s] that is needed before an appointment (one or more tasks) can start at this location. This duration is needed once per stop whenever tasks are executed.
     * @type {number}
     * @memberof StopProperties
     */
    preparationDuration?: number;
    /**
     * A list of time intervals that describe when tasks can be executed at this location. Consecutive tasks with the same time slot are grouped to an appointment. The timings of the appointment must satisfy the restrictions of the time slot. When omitted or empty, all tasks within a stop at this location will be grouped into one appointment and the timings of this appointment are unrestricted.
     * @type {Array<TimeSlot>}
     * @memberof StopProperties
     */
    timeSlots?: Array<TimeSlot>;
}

export function StopPropertiesFromJSON(json: any): StopProperties {
    return StopPropertiesFromJSONTyped(json, false);
}

export function StopPropertiesFromJSONTyped(json: any, ignoreDiscriminator: boolean): StopProperties {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'preparationDuration': !exists(json, 'preparationDuration') ? undefined : json['preparationDuration'],
        'timeSlots': !exists(json, 'timeSlots') ? undefined : ((json['timeSlots'] as Array<any>).map(TimeSlotFromJSON)),
    };
}

export function StopPropertiesToJSON(value?: StopProperties | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'preparationDuration': value.preparationDuration,
        'timeSlots': value.timeSlots === undefined ? undefined : ((value.timeSlots as Array<any>).map(TimeSlotToJSON)),
    };
}

