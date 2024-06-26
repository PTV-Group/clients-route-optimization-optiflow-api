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

/**
 * Describes the current status of the optimization.
 * * PREPARING - The optimization has been accepted. Time-distance data is being calculated and the data is being prepared for optimization.
 * * RUNNING - The routes are being optimized. Metrics will provide insights into the current result of the optimization.
 * * STOPPING - A request has been received to stop the optimization. The optimization will stop as soon as possible.
 * * FAILED - The optimization has failed. An error will be provided to clarify what went wrong.
 * * SUCCEEDED - The optimization has completed successfully.
 * @export
 * @enum {string}
 */
export enum OptimizationStatus {
    PREPARING = 'PREPARING',
    RUNNING = 'RUNNING',
    STOPPING = 'STOPPING',
    FAILED = 'FAILED',
    SUCCEEDED = 'SUCCEEDED'
}

export function OptimizationStatusFromJSON(json: any): OptimizationStatus {
    return OptimizationStatusFromJSONTyped(json, false);
}

export function OptimizationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): OptimizationStatus {
    return json as OptimizationStatus;
}

export function OptimizationStatusToJSON(value?: OptimizationStatus | null): any {
    return value as any;
}

