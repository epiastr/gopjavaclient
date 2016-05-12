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

import tr.com.epias.web.test.gen.model.OperationHistoryResponseServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceOperationHistorySearchRequest;
import tr.com.epias.web.test.gen.model.ParameterQueryServiceResponse;
import tr.com.epias.web.test.gen.model.ServiceObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationhistoryApi {
  private ApiClient apiClient;

  public OperationhistoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OperationhistoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for operationhistorylist */
  private Call operationhistorylistCall(ServiceOperationHistorySearchRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling operationhistorylist(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling operationhistorylist(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/operationhistory/list".replaceAll("\\{format\\}","json");

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
   * Operation History / Operation History List Service
   * This service lists operation history records.
   * @param body Operation History Query Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return List<OperationHistoryResponseServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public List<OperationHistoryResponseServiceResponse> operationhistorylist(ServiceOperationHistorySearchRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<List<OperationHistoryResponseServiceResponse>> resp = operationhistorylistWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Operation History / Operation History List Service
   * This service lists operation history records.
   * @param body Operation History Query Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<List<OperationHistoryResponseServiceResponse>>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<List<OperationHistoryResponseServiceResponse>> operationhistorylistWithHttpInfo(ServiceOperationHistorySearchRequest body, String gopServiceTicket) throws ApiException {
    Call call = operationhistorylistCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<List<OperationHistoryResponseServiceResponse>>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Operation History / Operation History List Service (asynchronously)
   * This service lists operation history records.
   * @param body Operation History Query Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call operationhistorylistAsync(ServiceOperationHistorySearchRequest body, String gopServiceTicket, final ApiCallback<List<OperationHistoryResponseServiceResponse>> callback) throws ApiException {

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

    Call call = operationhistorylistCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<List<OperationHistoryResponseServiceResponse>>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for operationhistoryoperationcodes */
  private Call operationhistoryoperationcodesCall(ServiceObject body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    

    // create path and map variables
    String localVarPath = "/operationhistory/operationcodes".replaceAll("\\{format\\}","json");

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
   * Operation History / Operation Code List Service
   * This service returns available operations for query.
   * @param body Operation Code List Request (optional)
   * @return ParameterQueryServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ParameterQueryServiceResponse operationhistoryoperationcodes(ServiceObject body) throws ApiException {
    ApiResponse<ParameterQueryServiceResponse> resp = operationhistoryoperationcodesWithHttpInfo(body);
    return resp.getData();
  }

  /**
   * Operation History / Operation Code List Service
   * This service returns available operations for query.
   * @param body Operation Code List Request (optional)
   * @return ApiResponse<ParameterQueryServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ParameterQueryServiceResponse> operationhistoryoperationcodesWithHttpInfo(ServiceObject body) throws ApiException {
    Call call = operationhistoryoperationcodesCall(body, null, null);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Operation History / Operation Code List Service (asynchronously)
   * This service returns available operations for query.
   * @param body Operation Code List Request (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call operationhistoryoperationcodesAsync(ServiceObject body, final ApiCallback<ParameterQueryServiceResponse> callback) throws ApiException {

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

    Call call = operationhistoryoperationcodesCall(body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ParameterQueryServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
