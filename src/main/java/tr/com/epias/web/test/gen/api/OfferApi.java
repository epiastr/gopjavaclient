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

import tr.com.epias.web.test.gen.model.ServiceAdvanceResultRequest;
import tr.com.epias.web.test.gen.model.AdvanceResultServiceResponse;
import tr.com.epias.web.test.gen.model.QueryOfferServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceOfferRequest;
import tr.com.epias.web.test.gen.model.ParameterQueryServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceCurrencyRequest;
import tr.com.epias.web.test.gen.model.DeleteOfferServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceDeleteOfferRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryOfferRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryOfferHistoryRequest;
import tr.com.epias.web.test.gen.model.QueryOfferHourBlockServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceQueryOfferHourBlockRequest;
import tr.com.epias.web.test.gen.model.ServiceOfferResultRequest;
import tr.com.epias.web.test.gen.model.QueryOfferResultServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceRegionRequest;
import tr.com.epias.web.test.gen.model.BooleanServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceQueryDeliveryDayRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferApi {
  private ApiClient apiClient;

  public OfferApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OfferApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for offeradvance */
  private Call offeradvanceCall(ServiceAdvanceResultRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offeradvance(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offeradvance(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/advance".replaceAll("\\{format\\}","json");

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
   * Offer / Advance Service
   * This service returns required advances for delivery day.
   * @param body Advance List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return AdvanceResultServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AdvanceResultServiceResponse offeradvance(ServiceAdvanceResultRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<AdvanceResultServiceResponse> resp = offeradvanceWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Advance Service
   * This service returns required advances for delivery day.
   * @param body Advance List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<AdvanceResultServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AdvanceResultServiceResponse> offeradvanceWithHttpInfo(ServiceAdvanceResultRequest body, String gopServiceTicket) throws ApiException {
    Call call = offeradvanceCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<AdvanceResultServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Advance Service (asynchronously)
   * This service returns required advances for delivery day.
   * @param body Advance List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offeradvanceAsync(ServiceAdvanceResultRequest body, String gopServiceTicket, final ApiCallback<AdvanceResultServiceResponse> callback) throws ApiException {

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

    Call call = offeradvanceCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdvanceResultServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offercreateblock */
  private Call offercreateblockCall(ServiceOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offercreateblock(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offercreateblock(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/create/block".replaceAll("\\{format\\}","json");

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
   * Offer / Create / Block Service
   * This service creates block offers.
   * @param body Create Block Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offercreateblock(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offercreateblockWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Create / Block Service
   * This service creates block offers.
   * @param body Create Block Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offercreateblockWithHttpInfo(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offercreateblockCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Create / Block Service (asynchronously)
   * This service creates block offers.
   * @param body Create Block Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offercreateblockAsync(ServiceOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offercreateblockCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offercreateflexible */
  private Call offercreateflexibleCall(ServiceOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offercreateflexible(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offercreateflexible(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/create/flexible".replaceAll("\\{format\\}","json");

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
   * Offer / Create / Flexible Service
   * This service creates flexible offers.
   * @param body Create Flexible Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offercreateflexible(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offercreateflexibleWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Create / Flexible Service
   * This service creates flexible offers.
   * @param body Create Flexible Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offercreateflexibleWithHttpInfo(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offercreateflexibleCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Create / Flexible Service (asynchronously)
   * This service creates flexible offers.
   * @param body Create Flexible Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offercreateflexibleAsync(ServiceOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offercreateflexibleCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offercreatehourly */
  private Call offercreatehourlyCall(ServiceOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offercreatehourly(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offercreatehourly(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/create/hourly".replaceAll("\\{format\\}","json");

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
   * Offer / Create / Hourly Service
   * This service creates hourly offers.
   * @param body Create Hourly Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offercreatehourly(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offercreatehourlyWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Create / Hourly Service
   * This service creates hourly offers.
   * @param body Create Hourly Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offercreatehourlyWithHttpInfo(ServiceOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offercreatehourlyCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Create / Hourly Service (asynchronously)
   * This service creates hourly offers.
   * @param body Create Hourly Offer Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offercreatehourlyAsync(ServiceOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offercreatehourlyCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offercurrencies */
  private Call offercurrenciesCall(ServiceCurrencyRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offercurrencies(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offercurrencies(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/currencies".replaceAll("\\{format\\}","json");

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
   * Offer / Currency Service
   * This service returns available currencies for offer.
   * @param body Offer Currency List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ParameterQueryServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ParameterQueryServiceResponse offercurrencies(ServiceCurrencyRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ParameterQueryServiceResponse> resp = offercurrenciesWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Currency Service
   * This service returns available currencies for offer.
   * @param body Offer Currency List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ParameterQueryServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ParameterQueryServiceResponse> offercurrenciesWithHttpInfo(ServiceCurrencyRequest body, String gopServiceTicket) throws ApiException {
    Call call = offercurrenciesCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Currency Service (asynchronously)
   * This service returns available currencies for offer.
   * @param body Offer Currency List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offercurrenciesAsync(ServiceCurrencyRequest body, String gopServiceTicket, final ApiCallback<ParameterQueryServiceResponse> callback) throws ApiException {

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

    Call call = offercurrenciesCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerdeleteblock */
  private Call offerdeleteblockCall(String gopServiceTicket, ServiceDeleteOfferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerdeleteblock(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/delete/block".replaceAll("\\{format\\}","json");

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
   * Offer / Cancel / Block Service
   * This service cancels given block offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Block Offer Cancel Request (optional)
   * @return DeleteOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeleteOfferServiceResponse offerdeleteblock(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    ApiResponse<DeleteOfferServiceResponse> resp = offerdeleteblockWithHttpInfo(gopServiceTicket, body);
    return resp.getData();
  }

  /**
   * Offer / Cancel / Block Service
   * This service cancels given block offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Block Offer Cancel Request (optional)
   * @return ApiResponse<DeleteOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeleteOfferServiceResponse> offerdeleteblockWithHttpInfo(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    Call call = offerdeleteblockCall(gopServiceTicket, body, null, null);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Cancel / Block Service (asynchronously)
   * This service cancels given block offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Block Offer Cancel Request (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerdeleteblockAsync(String gopServiceTicket, ServiceDeleteOfferRequest body, final ApiCallback<DeleteOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerdeleteblockCall(gopServiceTicket, body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerdeleteflexible */
  private Call offerdeleteflexibleCall(String gopServiceTicket, ServiceDeleteOfferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerdeleteflexible(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/delete/flexible".replaceAll("\\{format\\}","json");

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
   * Offer / Cancel / Flexible Service
   * Bu servis esnek teklifleri siler.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Flexible Offer Cancel Request (optional)
   * @return DeleteOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeleteOfferServiceResponse offerdeleteflexible(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    ApiResponse<DeleteOfferServiceResponse> resp = offerdeleteflexibleWithHttpInfo(gopServiceTicket, body);
    return resp.getData();
  }

  /**
   * Offer / Cancel / Flexible Service
   * Bu servis esnek teklifleri siler.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Flexible Offer Cancel Request (optional)
   * @return ApiResponse<DeleteOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeleteOfferServiceResponse> offerdeleteflexibleWithHttpInfo(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    Call call = offerdeleteflexibleCall(gopServiceTicket, body, null, null);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Cancel / Flexible Service (asynchronously)
   * Bu servis esnek teklifleri siler.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Flexible Offer Cancel Request (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerdeleteflexibleAsync(String gopServiceTicket, ServiceDeleteOfferRequest body, final ApiCallback<DeleteOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerdeleteflexibleCall(gopServiceTicket, body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerdeletehourly */
  private Call offerdeletehourlyCall(String gopServiceTicket, ServiceDeleteOfferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerdeletehourly(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/delete/hourly".replaceAll("\\{format\\}","json");

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
   * Offer / Cancel / Hourly Service
   * This service cancels given hourly offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Hourly Offer Cancel Request (optional)
   * @return DeleteOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeleteOfferServiceResponse offerdeletehourly(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    ApiResponse<DeleteOfferServiceResponse> resp = offerdeletehourlyWithHttpInfo(gopServiceTicket, body);
    return resp.getData();
  }

  /**
   * Offer / Cancel / Hourly Service
   * This service cancels given hourly offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Hourly Offer Cancel Request (optional)
   * @return ApiResponse<DeleteOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeleteOfferServiceResponse> offerdeletehourlyWithHttpInfo(String gopServiceTicket, ServiceDeleteOfferRequest body) throws ApiException {
    Call call = offerdeletehourlyCall(gopServiceTicket, body, null, null);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Cancel / Hourly Service (asynchronously)
   * This service cancels given hourly offer.
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param body Hourly Offer Cancel Request (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerdeletehourlyAsync(String gopServiceTicket, ServiceDeleteOfferRequest body, final ApiCallback<DeleteOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerdeletehourlyCall(gopServiceTicket, body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeleteOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlistblock */
  private Call offerlistblockCall(ServiceQueryOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlistblock(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlistblock(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/block".replaceAll("\\{format\\}","json");

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
   * Offer / List / Block Service
   * This service lists block offers.
   * @param body Block Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlistblock(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlistblockWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / Block Service
   * This service lists block offers.
   * @param body Block Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlistblockWithHttpInfo(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlistblockCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / Block Service (asynchronously)
   * This service lists block offers.
   * @param body Block Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlistblockAsync(ServiceQueryOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlistblockCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlistflexible */
  private Call offerlistflexibleCall(ServiceQueryOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlistflexible(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlistflexible(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/flexible".replaceAll("\\{format\\}","json");

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
   * Offer / List / Flexible Service
   * This service lists flexible offers
   * @param body Flexible Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlistflexible(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlistflexibleWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / Flexible Service
   * This service lists flexible offers
   * @param body Flexible Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlistflexibleWithHttpInfo(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlistflexibleCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / Flexible Service (asynchronously)
   * This service lists flexible offers
   * @param body Flexible Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlistflexibleAsync(ServiceQueryOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlistflexibleCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlisthistoryblock */
  private Call offerlisthistoryblockCall(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlisthistoryblock(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlisthistoryblock(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/history/block".replaceAll("\\{format\\}","json");

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
   * Offer / List / History / Block Service
   * This service lists history of block offer.
   * @param body Block Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlisthistoryblock(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlisthistoryblockWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / History / Block Service
   * This service lists history of block offer.
   * @param body Block Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlisthistoryblockWithHttpInfo(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlisthistoryblockCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / History / Block Service (asynchronously)
   * This service lists history of block offer.
   * @param body Block Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlisthistoryblockAsync(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlisthistoryblockCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlisthistoryflexible */
  private Call offerlisthistoryflexibleCall(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlisthistoryflexible(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlisthistoryflexible(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/history/flexible".replaceAll("\\{format\\}","json");

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
   * Offer / List / History / Flexible Service
   * This service lists history of flexible offer.
   * @param body Flexible Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlisthistoryflexible(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlisthistoryflexibleWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / History / Flexible Service
   * This service lists history of flexible offer.
   * @param body Flexible Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlisthistoryflexibleWithHttpInfo(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlisthistoryflexibleCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / History / Flexible Service (asynchronously)
   * This service lists history of flexible offer.
   * @param body Flexible Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlisthistoryflexibleAsync(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlisthistoryflexibleCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlisthistoryhourly */
  private Call offerlisthistoryhourlyCall(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlisthistoryhourly(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlisthistoryhourly(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/history/hourly".replaceAll("\\{format\\}","json");

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
   * Offer / List / History / Hourly Service
   * This service lists history of hourly offer.
   * @param body Hourly Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlisthistoryhourly(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlisthistoryhourlyWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / History / Hourly Service
   * This service lists history of hourly offer.
   * @param body Hourly Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlisthistoryhourlyWithHttpInfo(ServiceQueryOfferHistoryRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlisthistoryhourlyCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / History / Hourly Service (asynchronously)
   * This service lists history of hourly offer.
   * @param body Hourly Offer History Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlisthistoryhourlyAsync(ServiceQueryOfferHistoryRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlisthistoryhourlyCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlisthourblocks */
  private Call offerlisthourblocksCall(ServiceQueryOfferHourBlockRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlisthourblocks(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlisthourblocks(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/listhourblocks".replaceAll("\\{format\\}","json");

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
   * Offer / Period Hours List Service
   * This service returns periods for deliveryday and offer type.
   * @param body Offer Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferHourBlockServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferHourBlockServiceResponse offerlisthourblocks(ServiceQueryOfferHourBlockRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferHourBlockServiceResponse> resp = offerlisthourblocksWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Period Hours List Service
   * This service returns periods for deliveryday and offer type.
   * @param body Offer Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferHourBlockServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferHourBlockServiceResponse> offerlisthourblocksWithHttpInfo(ServiceQueryOfferHourBlockRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlisthourblocksCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferHourBlockServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Period Hours List Service (asynchronously)
   * This service returns periods for deliveryday and offer type.
   * @param body Offer Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlisthourblocksAsync(ServiceQueryOfferHourBlockRequest body, String gopServiceTicket, final ApiCallback<QueryOfferHourBlockServiceResponse> callback) throws ApiException {

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

    Call call = offerlisthourblocksCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferHourBlockServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerlisthourly */
  private Call offerlisthourlyCall(ServiceQueryOfferRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerlisthourly(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerlisthourly(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/list/hourly".replaceAll("\\{format\\}","json");

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
   * Offer / List / Hourly Service
   * This service lists hourly offers
   * @param body Hourly Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferServiceResponse offerlisthourly(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferServiceResponse> resp = offerlisthourlyWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / List / Hourly Service
   * This service lists hourly offers
   * @param body Hourly Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferServiceResponse> offerlisthourlyWithHttpInfo(ServiceQueryOfferRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerlisthourlyCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / List / Hourly Service (asynchronously)
   * This service lists hourly offers
   * @param body Hourly Offer List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerlisthourlyAsync(ServiceQueryOfferRequest body, String gopServiceTicket, final ApiCallback<QueryOfferServiceResponse> callback) throws ApiException {

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

    Call call = offerlisthourlyCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerofferresult */
  private Call offerofferresultCall(ServiceOfferResultRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerofferresult(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerofferresult(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/offerresult".replaceAll("\\{format\\}","json");

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
   * Offer / Market Result Service
   * This service returns market results , market clearing price vs.
   * @param body Market Result Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryOfferResultServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryOfferResultServiceResponse offerofferresult(ServiceOfferResultRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryOfferResultServiceResponse> resp = offerofferresultWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Market Result Service
   * This service returns market results , market clearing price vs.
   * @param body Market Result Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryOfferResultServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryOfferResultServiceResponse> offerofferresultWithHttpInfo(ServiceOfferResultRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerofferresultCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryOfferResultServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Market Result Service (asynchronously)
   * This service returns market results , market clearing price vs.
   * @param body Market Result Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerofferresultAsync(ServiceOfferResultRequest body, String gopServiceTicket, final ApiCallback<QueryOfferResultServiceResponse> callback) throws ApiException {

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

    Call call = offerofferresultCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryOfferResultServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offerregions */
  private Call offerregionsCall(ServiceRegionRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offerregions(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offerregions(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/regions".replaceAll("\\{format\\}","json");

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
   * Offer / Region Service
   * This service returns available regions for offer
   * @param body Offer Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ParameterQueryServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ParameterQueryServiceResponse offerregions(ServiceRegionRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ParameterQueryServiceResponse> resp = offerregionsWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Region Service
   * This service returns available regions for offer
   * @param body Offer Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ParameterQueryServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ParameterQueryServiceResponse> offerregionsWithHttpInfo(ServiceRegionRequest body, String gopServiceTicket) throws ApiException {
    Call call = offerregionsCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Region Service (asynchronously)
   * This service returns available regions for offer
   * @param body Offer Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offerregionsAsync(ServiceRegionRequest body, String gopServiceTicket, final ApiCallback<ParameterQueryServiceResponse> callback) throws ApiException {

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

    Call call = offerregionsCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for offervalidatedeliveryday */
  private Call offervalidatedeliverydayCall(ServiceQueryDeliveryDayRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling offervalidatedeliveryday(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling offervalidatedeliveryday(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/offer/validatedeliveryday".replaceAll("\\{format\\}","json");

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
   * Offer / Delivery Day Val?dation Service
   * Validates given delivery day.
   * @param body Validate Delivery Day Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return BooleanServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public BooleanServiceResponse offervalidatedeliveryday(ServiceQueryDeliveryDayRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<BooleanServiceResponse> resp = offervalidatedeliverydayWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Offer / Delivery Day Val?dation Service
   * Validates given delivery day.
   * @param body Validate Delivery Day Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<BooleanServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<BooleanServiceResponse> offervalidatedeliverydayWithHttpInfo(ServiceQueryDeliveryDayRequest body, String gopServiceTicket) throws ApiException {
    Call call = offervalidatedeliverydayCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<BooleanServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Offer / Delivery Day Val?dation Service (asynchronously)
   * Validates given delivery day.
   * @param body Validate Delivery Day Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call offervalidatedeliverydayAsync(ServiceQueryDeliveryDayRequest body, String gopServiceTicket, final ApiCallback<BooleanServiceResponse> callback) throws ApiException {

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

    Call call = offervalidatedeliverydayCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<BooleanServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
