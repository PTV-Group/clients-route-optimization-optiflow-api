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
 * Describes which combination of depots and vehicles have to be respected or excluded.
 * * DEPOT_REQUIRES_VEHICLE - A depot from the given depot category can only be visited by a vehicle from the given vehicle category.
 * * VEHICLE_REQUIRES_DEPOT - A vehicle from the given vehicle category can only visit depots from the given depot category. 
 * * FORBIDDEN_COMBINATION - A depot from the given depot category can not be visited by a vehicle from the given vehicle category.
 * @export
 * @enum {string}
 */
export enum DepotVehicleCombinationConstraintType {
    DEPOT_REQUIRES_VEHICLE = 'DEPOT_REQUIRES_VEHICLE',
    VEHICLE_REQUIRES_DEPOT = 'VEHICLE_REQUIRES_DEPOT',
    FORBIDDEN_COMBINATION = 'FORBIDDEN_COMBINATION'
}

export function DepotVehicleCombinationConstraintTypeFromJSON(json: any): DepotVehicleCombinationConstraintType {
    return DepotVehicleCombinationConstraintTypeFromJSONTyped(json, false);
}

export function DepotVehicleCombinationConstraintTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): DepotVehicleCombinationConstraintType {
    return json as DepotVehicleCombinationConstraintType;
}

export function DepotVehicleCombinationConstraintTypeToJSON(value?: DepotVehicleCombinationConstraintType | null): any {
    return value as any;
}

