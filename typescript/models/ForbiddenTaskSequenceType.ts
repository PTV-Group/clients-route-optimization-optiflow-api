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

/**
 * Determines in which cases the sequence is forbidden.
 * * NOT_IMMEDIATELY_BEFORE - The task immediately before a task belonging to the second category must not belong to the first category.
 * * NOT_BEFORE - Tasks from the first category can not be executed before a task from the second category, regardless of whether there are other tasks in between.
 * @export
 * @enum {string}
 */
export enum ForbiddenTaskSequenceType {
    NOT_IMMEDIATELY_BEFORE = 'NOT_IMMEDIATELY_BEFORE',
    NOT_BEFORE = 'NOT_BEFORE'
}

export function ForbiddenTaskSequenceTypeFromJSON(json: any): ForbiddenTaskSequenceType {
    return ForbiddenTaskSequenceTypeFromJSONTyped(json, false);
}

export function ForbiddenTaskSequenceTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ForbiddenTaskSequenceType {
    return json as ForbiddenTaskSequenceType;
}

export function ForbiddenTaskSequenceTypeToJSON(value?: ForbiddenTaskSequenceType | null): any {
    return value as any;
}

