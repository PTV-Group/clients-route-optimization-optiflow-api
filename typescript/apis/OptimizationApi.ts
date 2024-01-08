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


import * as runtime from '../runtime';
import {
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    OptimizationIdentifier,
    OptimizationIdentifierFromJSON,
    OptimizationIdentifierToJSON,
    OptimizationRequest,
    OptimizationRequestFromJSON,
    OptimizationRequestToJSON,
    OptimizationResult,
    OptimizationResultFromJSON,
    OptimizationResultToJSON,
} from '../models';

export interface GetOptimizationResultRequest {
    id: string;
}

export interface StartOptimizationRequest {
    optimizationRequest: OptimizationRequest;
}

export interface StopOptimizationRequest {
    id: string;
}

/**
 * 
 */
export class OptimizationApi extends runtime.BaseAPI {

    /**
     * Retrieves the current result of the optimization. While the optimization is running, this will return intermediate metrics to track the progress. Once succeeded, the optimized routes are returned. 
     */
    async getOptimizationResultRaw(requestParameters: GetOptimizationResultRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<OptimizationResult>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getOptimizationResult.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/optimizations/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OptimizationResultFromJSON(jsonValue));
    }

    /**
     * Retrieves the current result of the optimization. While the optimization is running, this will return intermediate metrics to track the progress. Once succeeded, the optimized routes are returned. 
     */
    async getOptimizationResult(requestParameters: GetOptimizationResultRequest, initOverrides?: RequestInit): Promise<OptimizationResult> {
        const response = await this.getOptimizationResultRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Initiates a cost-minimizing optimization that efficiently schedules orders onto routes. The routes are assigned to the provided vehicles and satisfy the given constraints. Once the optimization is accepted, the optimization starts for the requested duration after which the resulting routes can be retrieved. 
     */
    async startOptimizationRaw(requestParameters: StartOptimizationRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<OptimizationIdentifier>> {
        if (requestParameters.optimizationRequest === null || requestParameters.optimizationRequest === undefined) {
            throw new runtime.RequiredError('optimizationRequest','Required parameter requestParameters.optimizationRequest was null or undefined when calling startOptimization.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/optimizations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: OptimizationRequestToJSON(requestParameters.optimizationRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OptimizationIdentifierFromJSON(jsonValue));
    }

    /**
     * Initiates a cost-minimizing optimization that efficiently schedules orders onto routes. The routes are assigned to the provided vehicles and satisfy the given constraints. Once the optimization is accepted, the optimization starts for the requested duration after which the resulting routes can be retrieved. 
     */
    async startOptimization(requestParameters: StartOptimizationRequest, initOverrides?: RequestInit): Promise<OptimizationIdentifier> {
        const response = await this.startOptimizationRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Stops an optimization. Once accepted, the optimization will stop as soon as possible and the final state of the routes can be retrieved. 
     */
    async stopOptimizationRaw(requestParameters: StopOptimizationRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling stopOptimization.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};
		headerParameters['User-Agent'] = "ptv-generated typescript client";

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/optimizations/{id}/stop`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Stops an optimization. Once accepted, the optimization will stop as soon as possible and the final state of the routes can be retrieved. 
     */
    async stopOptimization(requestParameters: StopOptimizationRequest, initOverrides?: RequestInit): Promise<void> {
        await this.stopOptimizationRaw(requestParameters, initOverrides);
    }

}