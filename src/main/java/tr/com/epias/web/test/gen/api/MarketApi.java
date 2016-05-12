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

import tr.com.epias.web.test.gen.model.ServiceQueryFinalResultRequest;
import tr.com.epias.web.test.gen.model.OptimizationResultServiceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketApi {
  private ApiClient apiClient;

  public MarketApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for marketfinalresults */
  private Call marketfinalresultsCall(ServiceQueryFinalResultRequest body, String gopServiceTicket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException("Missing the required parameter 'body' when calling marketfinalresults(Async)");
    }
    
    // verify the required parameter 'gopServiceTicket' is set
    if (gopServiceTicket == null) {
       throw new ApiException("Missing the required parameter 'gopServiceTicket' when calling marketfinalresults(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/market/finalresults".replaceAll("\\{format\\}","json");

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
   * Market Result / Region / List Service
   * This service returns market result by region
   * @param body Region Market Result List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return OptimizationResultServiceResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public OptimizationResultServiceResponse marketfinalresults(ServiceQueryFinalResultRequest body, String gopServiceTicket) throws ApiException {
    ApiResponse<OptimizationResultServiceResponse> resp = marketfinalresultsWithHttpInfo(body, gopServiceTicket);
    return resp.getData();
  }

  /**
   * Market Result / Region / List Service
   * This service returns market result by region
   * @param body Region Market Result List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @return ApiResponse<OptimizationResultServiceResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<OptimizationResultServiceResponse> marketfinalresultsWithHttpInfo(ServiceQueryFinalResultRequest body, String gopServiceTicket) throws ApiException {
    Call call = marketfinalresultsCall(body, gopServiceTicket, null, null);
    Type localVarReturnType = new TypeToken<OptimizationResultServiceResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Market Result / Region / List Service (asynchronously)
   * This service returns market result by region
   * @param body Region Market Result List Request (required)
   * @param gopServiceTicket CAS Service Token (ST) (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call marketfinalresultsAsync(ServiceQueryFinalResultRequest body, String gopServiceTicket, final ApiCallback<OptimizationResultServiceResponse> callback) throws ApiException {

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

    Call call = marketfinalresultsCall(body, gopServiceTicket, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<OptimizationResultServiceResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
