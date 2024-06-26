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
 * Describes a possibility to schedule an appointment to execute tasks at a location.
 * @export
 * @interface TimeSlot
 */
export interface TimeSlot {
    /**
     * A unique identifier of the time slot. Must be unique within each location.
     * @type {string}
     * @memberof TimeSlot
     */
    id: string;
    /**
     * The earliest point in time an appointment may start in this time slot. When omitted the appointment may start as early as desired.    When used in conjunction with a latest start time, the earliest start time of a time slot must not be later than its latest start time. When used in conjunction with a latest end time, the earliest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof TimeSlot
     */
    earliestStart?: Date;
    /**
     * The latest point in time an appointment may start in this time slot. When omitted the appointment may start as late as desired.  When used in conjunction with an earliest start time, the latest start time of a time slot must not be earlier than its earliest start time. When used in conjunction with a latest end time, the latest start time of a time slot must not be later than its latest end time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof TimeSlot
     */
    latestStart?: Date;
    /**
     * The latest point in time an appointment may end in this time slot. When omitted the appointment may end as late as desired.  When used in conjunction with an earliest start time, the latest end time of a time slot must not be earlier than its earliest start time. When used in conjunction with an latest start time, the latest end time of a time slot must not be earlier than its latest start time. Formatted according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) and not before `1970-01-01T00:00:00+00:00`. The date must provide an offset to UTC.
     * @type {Date}
     * @memberof TimeSlot
     */
    latestEnd?: Date;
    /**
     * Describes how many appointments may be assigned to this time slot. When omitted, an unlimited number of appointments may be assigned to this time slot.
     * @type {number}
     * @memberof TimeSlot
     */
    maximumAppointments?: number;
    /**
     * Describes how long [s] it takes before the first task can be executed after starting the appointment.
     * @type {number}
     * @memberof TimeSlot
     */
    preparationDuration?: number;
}

export function TimeSlotFromJSON(json: any): TimeSlot {
    return TimeSlotFromJSONTyped(json, false);
}

export function TimeSlotFromJSONTyped(json: any, ignoreDiscriminator: boolean): TimeSlot {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'earliestStart': !exists(json, 'earliestStart') ? undefined : (new Date(json['earliestStart'])),
        'latestStart': !exists(json, 'latestStart') ? undefined : (new Date(json['latestStart'])),
        'latestEnd': !exists(json, 'latestEnd') ? undefined : (new Date(json['latestEnd'])),
        'maximumAppointments': !exists(json, 'maximumAppointments') ? undefined : json['maximumAppointments'],
        'preparationDuration': !exists(json, 'preparationDuration') ? undefined : json['preparationDuration'],
    };
}

export function TimeSlotToJSON(value?: TimeSlot | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'earliestStart': value.earliestStart === undefined ? undefined : (value.earliestStart.toISOString()),
        'latestStart': value.latestStart === undefined ? undefined : (value.latestStart.toISOString()),
        'latestEnd': value.latestEnd === undefined ? undefined : (value.latestEnd.toISOString()),
        'maximumAppointments': value.maximumAppointments,
        'preparationDuration': value.preparationDuration,
    };
}

