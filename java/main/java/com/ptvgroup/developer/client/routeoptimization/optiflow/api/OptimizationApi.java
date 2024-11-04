/*
 * Route Optimization OptiFlow
 * With the Route Optimization OptiFlow service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ptvgroup.developer.client.routeoptimization.optiflow.api;

import com.ptvgroup.developer.client.routeoptimization.optiflow.ApiClient;
import com.ptvgroup.developer.client.routeoptimization.optiflow.ApiException;
import com.ptvgroup.developer.client.routeoptimization.optiflow.ApiResponse;
import com.ptvgroup.developer.client.routeoptimization.optiflow.Pair;

import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationErrorResponse;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOptimizationIdentifier;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOptimizationRequest;
import com.ptvgroup.developer.client.routeoptimization.optiflow.model.RouteOptimizationOptimizationResult;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:10:30.792689579Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class OptimizationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OptimizationApi() {
    this(new ApiClient());
  }

  public OptimizationApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Retrieves the current result of the optimization. While the optimization is running, this will return intermediate metrics to track the progress. Once succeeded, the optimized routes are returned. 
   * @param id A unique identifier of the optimization. (required)
   * @return RouteOptimizationOptimizationResult
   * @throws ApiException if fails to make API call
   */
  public RouteOptimizationOptimizationResult getOptimizationResult(UUID id) throws ApiException {
    ApiResponse<RouteOptimizationOptimizationResult> localVarResponse = getOptimizationResultWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * 
   * Retrieves the current result of the optimization. While the optimization is running, this will return intermediate metrics to track the progress. Once succeeded, the optimized routes are returned. 
   * @param id A unique identifier of the optimization. (required)
   * @return ApiResponse&lt;RouteOptimizationOptimizationResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RouteOptimizationOptimizationResult> getOptimizationResultWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getOptimizationResultRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getOptimizationResult", localVarResponse);
        }
        return new ApiResponse<RouteOptimizationOptimizationResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RouteOptimizationOptimizationResult>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getOptimizationResultRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOptimizationResult");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/optimizations/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Initiates a cost-minimizing optimization that efficiently schedules orders onto routes. The routes are assigned to the provided vehicles and satisfy the given constraints. Once the optimization is accepted, the optimization starts for the requested duration after which the resulting routes can be retrieved. 
   * @param routeOptimizationOptimizationRequest The data needed to optimize the routes. (required)
   * @return RouteOptimizationOptimizationIdentifier
   * @throws ApiException if fails to make API call
   */
  public RouteOptimizationOptimizationIdentifier startOptimization(RouteOptimizationOptimizationRequest routeOptimizationOptimizationRequest) throws ApiException {
    ApiResponse<RouteOptimizationOptimizationIdentifier> localVarResponse = startOptimizationWithHttpInfo(routeOptimizationOptimizationRequest);
    return localVarResponse.getData();
  }

  /**
   * 
   * Initiates a cost-minimizing optimization that efficiently schedules orders onto routes. The routes are assigned to the provided vehicles and satisfy the given constraints. Once the optimization is accepted, the optimization starts for the requested duration after which the resulting routes can be retrieved. 
   * @param routeOptimizationOptimizationRequest The data needed to optimize the routes. (required)
   * @return ApiResponse&lt;RouteOptimizationOptimizationIdentifier&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RouteOptimizationOptimizationIdentifier> startOptimizationWithHttpInfo(RouteOptimizationOptimizationRequest routeOptimizationOptimizationRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = startOptimizationRequestBuilder(routeOptimizationOptimizationRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("startOptimization", localVarResponse);
        }
        return new ApiResponse<RouteOptimizationOptimizationIdentifier>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RouteOptimizationOptimizationIdentifier>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder startOptimizationRequestBuilder(RouteOptimizationOptimizationRequest routeOptimizationOptimizationRequest) throws ApiException {
    // verify the required parameter 'routeOptimizationOptimizationRequest' is set
    if (routeOptimizationOptimizationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'routeOptimizationOptimizationRequest' when calling startOptimization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/optimizations";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(routeOptimizationOptimizationRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Stops an optimization. Once accepted, the optimization will stop as soon as possible and the final state of the routes can be retrieved. 
   * @param id A unique identifier of the optimization. (required)
   * @throws ApiException if fails to make API call
   */
  public void stopOptimization(UUID id) throws ApiException {
    stopOptimizationWithHttpInfo(id);
  }

  /**
   * 
   * Stops an optimization. Once accepted, the optimization will stop as soon as possible and the final state of the routes can be retrieved. 
   * @param id A unique identifier of the optimization. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> stopOptimizationWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = stopOptimizationRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("stopOptimization", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder stopOptimizationRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopOptimization");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/optimizations/{id}/stop"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
