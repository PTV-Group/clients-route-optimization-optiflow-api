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
 * Describes which combinations of orders and vehicles have to be respected or excluded.
 * * ORDER_REQUIRES_VEHICLE - An order from the given order category can only be transported by a vehicle from the given vehicle category.
 * * VEHICLE_REQUIRES_ORDER - A vehicle from the given vehicle category can only transport orders from the given order category. 
 * * FORBIDDEN_COMBINATION - An order from the given order category can not be transported by a vehicle from the given vehicle category.
 * @export
 * @enum {string}
 */
export enum OrderVehicleCombinationConstraintType {
    ORDER_REQUIRES_VEHICLE = 'ORDER_REQUIRES_VEHICLE',
    VEHICLE_REQUIRES_ORDER = 'VEHICLE_REQUIRES_ORDER',
    FORBIDDEN_COMBINATION = 'FORBIDDEN_COMBINATION'
}

export function OrderVehicleCombinationConstraintTypeFromJSON(json: any): OrderVehicleCombinationConstraintType {
    return OrderVehicleCombinationConstraintTypeFromJSONTyped(json, false);
}

export function OrderVehicleCombinationConstraintTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrderVehicleCombinationConstraintType {
    return json as OrderVehicleCombinationConstraintType;
}

export function OrderVehicleCombinationConstraintTypeToJSON(value?: OrderVehicleCombinationConstraintType | null): any {
    return value as any;
}

