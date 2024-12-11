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


/**
 * Describes the current status of the optimization.
 * * `PREPARING` - The optimization has been accepted. Time-distance data is being calculated and the data is being prepared for optimization.
 * * `RUNNING` - The routes are being optimized. Metrics will provide insights into the current result of the optimization.
 * * `STOPPING` - A request has been received to stop the optimization. The optimization will stop as soon as possible.
 * * `FAILED` - The optimization has failed. An error will be provided to clarify what went wrong.
 * * `SUCCEEDED` - The optimization has completed successfully.
 * @export
 */
export const RouteOptimizationOptimizationStatus = {
    PREPARING: 'PREPARING',
    RUNNING: 'RUNNING',
    STOPPING: 'STOPPING',
    FAILED: 'FAILED',
    SUCCEEDED: 'SUCCEEDED'
} as const;
export type RouteOptimizationOptimizationStatus = typeof RouteOptimizationOptimizationStatus[keyof typeof RouteOptimizationOptimizationStatus];


export function instanceOfRouteOptimizationOptimizationStatus(value: any): boolean {
    return Object.values(RouteOptimizationOptimizationStatus).includes(value);
}

export function RouteOptimizationOptimizationStatusFromJSON(json: any): RouteOptimizationOptimizationStatus {
    return RouteOptimizationOptimizationStatusFromJSONTyped(json, false);
}

export function RouteOptimizationOptimizationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteOptimizationOptimizationStatus {
    return json as RouteOptimizationOptimizationStatus;
}

export function RouteOptimizationOptimizationStatusToJSON(value?: RouteOptimizationOptimizationStatus | null): any {
    return value as any;
}

