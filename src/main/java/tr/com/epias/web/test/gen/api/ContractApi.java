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

import tr.com.epias.web.test.gen.model.ContractServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceContractRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryContractListRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryContractRequest;
import tr.com.epias.web.test.gen.model.QueryContractStatusResponse;
import tr.com.epias.web.test.gen.model.Service;
import tr.com.epias.web.test.gen.model.ServiceQueryContractPeriodRequest;
import tr.com.epias.web.test.gen.model.QueryContractPeriodServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceContractOrganizationRequest;
import tr.com.epias.web.test.gen.model.OrganizationServiceResponse;
import tr.com.epias.web.test.gen.model.ParameterQueryServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceRegionRequest;
import tr.com.epias.web.test.gen.model.BooleanServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceQueryDeliveryDayRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractApi {
  private ApiClient apiClient;

  public ContractApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContractApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for contractcreate */
  private Call contractcreateCall(ServiceContractRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractcreate(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractcreate(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/create".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Create Service
   * This service creates billateral agreements.
   * @param body Bilateral Agreements Create Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ContractServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ContractServiceResponse contractcreate(ServiceContractRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ContractServiceResponse> resp = contractcreateWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Create Service
   * This service creates billateral agreements.
   * @param body Bilateral Agreements Create Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ContractServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ContractServiceResponse> contractcreateWithHttpInfo(ServiceContractRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractcreateCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Create Service (asynchronously)
   * This service creates billateral agreements.
   * @param body Bilateral Agreements Create Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractcreateAsync(ServiceContractRequest body, String gopServiceTicket, final ApiCallback<ContractServiceResponse> callback) throws ApiException {

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

    Call call = contractcreateCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractdelete */
  private Call contractdeleteCall(ServiceQueryContractListRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractdelete(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractdelete(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/delete".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Cancel Service
   * This service cancels billateral agreements
   * @param body Bilateral Agreements Cancel Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ContractServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ContractServiceResponse contractdelete(ServiceQueryContractListRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ContractServiceResponse> resp = contractdeleteWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Cancel Service
   * This service cancels billateral agreements
   * @param body Bilateral Agreements Cancel Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ContractServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ContractServiceResponse> contractdeleteWithHttpInfo(ServiceQueryContractListRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractdeleteCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Cancel Service (asynchronously)
   * This service cancels billateral agreements
   * @param body Bilateral Agreements Cancel Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractdeleteAsync(ServiceQueryContractListRequest body, String gopServiceTicket, final ApiCallback<ContractServiceResponse> callback) throws ApiException {

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

    Call call = contractdeleteCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractlist */
  private Call contractlistCall(ServiceQueryContractRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractlist(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractlist(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/list".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / List Service
   * This service lists billateral agreements
   * @param body Bilateral Agreements List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ContractServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ContractServiceResponse contractlist(ServiceQueryContractRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ContractServiceResponse> resp = contractlistWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / List Service
   * This service lists billateral agreements
   * @param body Bilateral Agreements List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ContractServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ContractServiceResponse> contractlistWithHttpInfo(ServiceQueryContractRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractlistCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / List Service (asynchronously)
   * This service lists billateral agreements
   * @param body Bilateral Agreements List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractlistAsync(ServiceQueryContractRequest body, String gopServiceTicket, final ApiCallback<ContractServiceResponse> callback) throws ApiException {

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

    Call call = contractlistCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractlistcontractstatuses */
  private Call contractlistcontractstatusesCall(Service body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractlistcontractstatuses(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractlistcontractstatuses(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/listcontractstatuses".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Status / List Service
   * This service returns available statuses.
   * @param body Bilateral Agreements Status List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return List<QueryContractStatusResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public List<QueryContractStatusResponse> contractlistcontractstatuses(Service body, String gopServiceTicket) throws ApiException {
    ApiResponse<List<QueryContractStatusResponse>> resp = contractlistcontractstatusesWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Status / List Service
   * This service returns available statuses.
   * @param body Bilateral Agreements Status List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<List<QueryContractStatusResponse>>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<List<QueryContractStatusResponse>> contractlistcontractstatusesWithHttpInfo(Service body, String gopServiceTicket) throws ApiException {
    Call call = contractlistcontractstatusesCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<List<QueryContractStatusResponse>>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Status / List Service (asynchronously)
   * This service returns available statuses.
   * @param body Bilateral Agreements Status List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractlistcontractstatusesAsync(Service body, String gopServiceTicket, final ApiCallback<List<QueryContractStatusResponse>> callback) throws ApiException {

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

    Call call = contractlistcontractstatusesCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<List<QueryContractStatusResponse>>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractlisthistory */
  private Call contractlisthistoryCall(ServiceQueryContractRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractlisthistory(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractlisthistory(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/list/history".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / History / List Service
   * This service lists history of given billateral agreement.
   * @param body Bilateral Agreements History List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ContractServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ContractServiceResponse contractlisthistory(ServiceQueryContractRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ContractServiceResponse> resp = contractlisthistoryWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / History / List Service
   * This service lists history of given billateral agreement.
   * @param body Bilateral Agreements History List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ContractServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ContractServiceResponse> contractlisthistoryWithHttpInfo(ServiceQueryContractRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractlisthistoryCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / History / List Service (asynchronously)
   * This service lists history of given billateral agreement.
   * @param body Bilateral Agreements History List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractlisthistoryAsync(ServiceQueryContractRequest body, String gopServiceTicket, final ApiCallback<ContractServiceResponse> callback) throws ApiException {

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

    Call call = contractlisthistoryCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ContractServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractlisthourblocks */
  private Call contractlisthourblocksCall(ServiceQueryContractPeriodRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractlisthourblocks(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractlisthourblocks(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/listhourblocks".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Period List Service
   * This service lists periods given date.
   * @param body Bilateral Agreements Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return QueryContractPeriodServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public QueryContractPeriodServiceResponse contractlisthourblocks(ServiceQueryContractPeriodRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<QueryContractPeriodServiceResponse> resp = contractlisthourblocksWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Period List Service
   * This service lists periods given date.
   * @param body Bilateral Agreements Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<QueryContractPeriodServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<QueryContractPeriodServiceResponse> contractlisthourblocksWithHttpInfo(ServiceQueryContractPeriodRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractlisthourblocksCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<QueryContractPeriodServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Period List Service (asynchronously)
   * This service lists periods given date.
   * @param body Bilateral Agreements Period List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractlisthourblocksAsync(ServiceQueryContractPeriodRequest body, String gopServiceTicket, final ApiCallback<QueryContractPeriodServiceResponse> callback) throws ApiException {

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

    Call call = contractlisthourblocksCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<QueryContractPeriodServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractorganizationlist */
  private Call contractorganizationlistCall(ServiceContractOrganizationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractorganizationlist(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/organization/list".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
   * Bilateral Agreements / Organization / List Service
   * This service returns billateral agreement organization list.
   * @param body Bilateral Agreements Organization List Request (required)
   * @return OrganizationServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public OrganizationServiceResponse contractorganizationlist(ServiceContractOrganizationRequest body) throws ApiException {
    ApiResponse<OrganizationServiceResponse> resp = contractorganizationlistWithHttpInfo(body);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Organization / List Service
   * This service returns billateral agreement organization list.
   * @param body Bilateral Agreements Organization List Request (required)
   * @return ApiResponse<OrganizationServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<OrganizationServiceResponse> contractorganizationlistWithHttpInfo(ServiceContractOrganizationRequest body) throws ApiException {
    Call call = contractorganizationlistCall(body, null, null);
    Type localVarReturnType = new TypeToken<OrganizationServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Organization / List Service (asynchronously)
   * This service returns billateral agreement organization list.
   * @param body Bilateral Agreements Organization List Request (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractorganizationlistAsync(ServiceContractOrganizationRequest body, final ApiCallback<OrganizationServiceResponse> callback) throws ApiException {

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

    Call call = contractorganizationlistCall(body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<OrganizationServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractregions */
  private Call contractregionsCall(ServiceRegionRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractregions(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractregions(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/regions".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Region / List Service
   * This service returns available regions.
   * @param body Bilateral Agreements Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ParameterQueryServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ParameterQueryServiceResponse contractregions(ServiceRegionRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<ParameterQueryServiceResponse> resp = contractregionsWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Region / List Service
   * This service returns available regions.
   * @param body Bilateral Agreements Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<ParameterQueryServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ParameterQueryServiceResponse> contractregionsWithHttpInfo(ServiceRegionRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractregionsCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Region / List Service (asynchronously)
   * This service returns available regions.
   * @param body Bilateral Agreements Region List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractregionsAsync(ServiceRegionRequest body, String gopServiceTicket, final ApiCallback<ParameterQueryServiceResponse> callback) throws ApiException {

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

    Call call = contractregionsCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for contractvalidatedeliveryday */
  private Call contractvalidatedeliverydayCall(ServiceQueryDeliveryDayRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling contractvalidatedeliveryday(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling contractvalidatedeliveryday(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/contract/validatedeliveryday".replaceAll("\\{format\\}","json");

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
   * Bilateral Agreements / Delivery Day Validation Service
   * Validates given date.
   * @param body Bilateral Agreements Delivery Day Validation Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return BooleanServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public BooleanServiceResponse contractvalidatedeliveryday(ServiceQueryDeliveryDayRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<BooleanServiceResponse> resp = contractvalidatedeliverydayWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Bilateral Agreements / Delivery Day Validation Service
   * Validates given date.
   * @param body Bilateral Agreements Delivery Day Validation Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<BooleanServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<BooleanServiceResponse> contractvalidatedeliverydayWithHttpInfo(ServiceQueryDeliveryDayRequest body, String gopServiceTicket) throws ApiException {
    Call call = contractvalidatedeliverydayCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<BooleanServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Bilateral Agreements / Delivery Day Validation Service (asynchronously)
   * Validates given date.
   * @param body Bilateral Agreements Delivery Day Validation Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call contractvalidatedeliverydayAsync(ServiceQueryDeliveryDayRequest body, String gopServiceTicket, final ApiCallback<BooleanServiceResponse> callback) throws ApiException {

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

    Call call = contractvalidatedeliverydayCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<BooleanServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
