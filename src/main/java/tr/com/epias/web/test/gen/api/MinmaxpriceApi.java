package tr.com.epias.web.test.gen.api;

import tr.com.epias.web.test.gen.invoke.ApiCallback;
import tr.com.epias.web.test.gen.invoke.ApiClient;
import tr.com.epias.web.test.gen.invoke.ApiException;
import tr.com.epias.web.test.gen.invoke.ApiResponse;
import tr.com.epias.web.test.gen.invoke.Configuration;
import tr.com.epias.web.test.gen.invoke.Pair;
import tr.com.epias.web.test.gen.invoke.ProgressRequestBody;
import tr.com.epias.web.test.gen.invoke.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;

import tr.com.epias.web.test.gen.model.MinMaxPriceListServiceResponse;
import tr.com.epias.web.test.gen.model.MinMaxPriceServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceMinMaxPriceListRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinmaxpriceApi {
  private ApiClient apiClient;

  public MinmaxpriceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MinmaxpriceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for minmaxpricelistall */
  private Call minmaxpricelistallCall(String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling minmaxpricelistall(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/minmaxprice/list/all".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    if (gopServiceTicket != null)
      localVarHeaderParams.put("gop-service-ticket", apiClient.parameterToString(gopServiceTicket));

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Mininimum Maximum / Offer Price / All / List
   * This service returns all minimum and maximum price information.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return MinMaxPriceListServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public MinMaxPriceListServiceResponse minmaxpricelistall(String gopServiceTicket) throws ApiException {
    ApiResponse<MinMaxPriceListServiceResponse> resp = minmaxpricelistallWithHttpInfo(gopServiceTicket);
    return resp.getData();
  }

  /**
   * Mininimum Maximum / Offer Price / All / List
   * This service returns all minimum and maximum price information.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<MinMaxPriceListServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<MinMaxPriceListServiceResponse> minmaxpricelistallWithHttpInfo(String gopServiceTicket) throws ApiException {
    Call call = minmaxpricelistallCall(gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<MinMaxPriceListServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Mininimum Maximum / Offer Price / All / List (asynchronously)
   * This service returns all minimum and maximum price information.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call minmaxpricelistallAsync(String gopServiceTicket, final ApiCallback<MinMaxPriceListServiceResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = minmaxpricelistallCall(gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<MinMaxPriceListServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for minmaxpricelisteffective */
  private Call minmaxpricelisteffectiveCall(ServiceMinMaxPriceListRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling minmaxpricelisteffective(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling minmaxpricelisteffective(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/minmaxprice/list/effective".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    if (gopServiceTicket != null)
      localVarHeaderParams.put("gop-service-ticket", apiClient.parameterToString(gopServiceTicket));

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json", "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] {  };
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Mininimum Maximum / Offer Price / Delivery Day / List Service
   * This service returns minimum and maximum prices for delivery day.
   * @param body MinMax Price List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return MinMaxPriceServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public MinMaxPriceServiceResponse minmaxpricelisteffective(ServiceMinMaxPriceListRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<MinMaxPriceServiceResponse> resp = minmaxpricelisteffectiveWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Mininimum Maximum / Offer Price / Delivery Day / List Service
   * This service returns minimum and maximum prices for delivery day.
   * @param body MinMax Price List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<MinMaxPriceServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<MinMaxPriceServiceResponse> minmaxpricelisteffectiveWithHttpInfo(ServiceMinMaxPriceListRequest body, String gopServiceTicket) throws ApiException {
    Call call = minmaxpricelisteffectiveCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<MinMaxPriceServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Mininimum Maximum / Offer Price / Delivery Day / List Service (asynchronously)
   * This service returns minimum and maximum prices for delivery day.
   * @param body MinMax Price List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call minmaxpricelisteffectiveAsync(ServiceMinMaxPriceListRequest body, String gopServiceTicket, final ApiCallback<MinMaxPriceServiceResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = minmaxpricelisteffectiveCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<MinMaxPriceServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
