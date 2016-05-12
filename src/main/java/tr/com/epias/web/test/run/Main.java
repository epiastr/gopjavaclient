package tr.com.epias.web.test.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import tr.com.epias.web.test.adapter.LocalDateAdapter;
import tr.com.epias.web.test.adapter.LocalDateTimeAdapter;
import tr.com.epias.web.test.gen.api.MinmaxpriceApi;
import tr.com.epias.web.test.gen.api.OfferApi;
import tr.com.epias.web.test.gen.invoke.ApiClient;
import tr.com.epias.web.test.gen.invoke.ApiException;
import tr.com.epias.web.test.gen.invoke.Configuration;
import tr.com.epias.web.test.gen.model.BooleanServiceResponse;
import tr.com.epias.web.test.gen.model.CurrencyRequest;
import tr.com.epias.web.test.gen.model.Header;
import tr.com.epias.web.test.gen.model.MinMaxPriceListRequest;
import tr.com.epias.web.test.gen.model.MinMaxPriceResponse;
import tr.com.epias.web.test.gen.model.MinMaxPriceServiceResponse;
import tr.com.epias.web.test.gen.model.OfferBlockHour;
import tr.com.epias.web.test.gen.model.OfferDetail;
import tr.com.epias.web.test.gen.model.OfferPrice;
import tr.com.epias.web.test.gen.model.OfferRequest;
import tr.com.epias.web.test.gen.model.ParameterQueryServiceResponse;
import tr.com.epias.web.test.gen.model.QueryDeliveryDayRequest;
import tr.com.epias.web.test.gen.model.QueryOfferHourBlockRequest;
import tr.com.epias.web.test.gen.model.QueryOfferHourBlockServiceResponse;
import tr.com.epias.web.test.gen.model.QueryOfferServiceResponse;
import tr.com.epias.web.test.gen.model.RegionRequest;
import tr.com.epias.web.test.gen.model.ServiceCurrencyRequest;
import tr.com.epias.web.test.gen.model.ServiceMinMaxPriceListRequest;
import tr.com.epias.web.test.gen.model.ServiceOfferRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryDeliveryDayRequest;
import tr.com.epias.web.test.gen.model.ServiceQueryOfferHourBlockRequest;
import tr.com.epias.web.test.gen.model.ServiceRegionRequest;

public class Main {

	private static final String USERNAME = "YOURUSERNAME";
	private static final String PASSWORD = "YOURPASSWORD";
	private static final String CAS_URL = "https://cas.epias.com.tr/cas/v1/tickets?format=text";
	private static final String CAS_SERVICE_NAME = "https://goptest.epias.com.tr";
	private static final String CAS_ST_URL = "https://cas.epias.com.tr/cas/v1/tickets";
	private static final String BASE_PATH = "https://goptest.epias.com.tr/gop-servis/rest";

	public static void main(String[] args) {

		String tgt = getCasTGT();

		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
				.registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
		client.getJSON().setGson(gson);

		OfferApi api = new OfferApi(client);

		LocalDateTime deliveryDay = LocalDateTime.now().plusDays(2);
		String region = getRegionCode(LocalDateTime.now(), tgt);
		MinMaxPriceResponse minMaxPriceResponse = getMinMaxPrice(deliveryDay, tgt);
		String currency = getCurrencyCode(deliveryDay, tgt);
		List<OfferBlockHour> blockHours = getPeriods(deliveryDay, tgt);
		Boolean isDeliveryDayOk = validateDeliveryDay(deliveryDay, tgt);

		ServiceOfferRequest request = new ServiceOfferRequest();
		request.setHeader(getHeader());
		OfferRequest offerRequest = new OfferRequest();
		offerRequest.setCurrencyCode(currency);
		offerRequest.setDeliveryDay(deliveryDay);
		offerRequest.setOfferType(OfferRequest.OfferTypeEnum.HOURLY);
		offerRequest.setRegionCode(region);
		offerRequest.setOfferDetails(new ArrayList<>());

		if (isDeliveryDayOk) {
			for (OfferBlockHour offerBlockHour : blockHours) {
				OfferDetail model = new OfferDetail();
				model.setStartPeriod(offerBlockHour.getPeriod());
				model.setDuration(1);
				model.setOfferPrices(new ArrayList<>());

				OfferPrice offerPriceMin = new OfferPrice();
				offerPriceMin.setAmount(Double.valueOf(offerBlockHour.getPeriod()));
				offerPriceMin.setPrice(BigDecimal.valueOf(minMaxPriceResponse.getMinimumPrice()));
				model.getOfferPrices().add(offerPriceMin);

				OfferPrice offerPriceMax = new OfferPrice();
				offerPriceMax.setAmount(Double.valueOf(offerBlockHour.getPeriod()));
				offerPriceMax.setPrice(BigDecimal.valueOf(minMaxPriceResponse.getMaximumPrice()));
				model.getOfferPrices().add(offerPriceMax);

				offerRequest.getOfferDetails().add(model);
			}
		}
		request.setBody(offerRequest);
		String ticket = getCasSt(tgt);

		QueryOfferServiceResponse resp = null;

		try {
			resp = api.offercreatehourly(request, ticket);
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}

		if (QueryOfferServiceResponse.ResultTypeEnum.SUCCESS != resp.getResultType()) {
			throw new RuntimeException(resp.getResultCode() +"-"+ resp.getResultDescription());
		}

		System.out.println("Offer Created :: " + resp.getResultDescription());
		System.out.println(resp);
	}

	public static List<OfferBlockHour> getPeriods(LocalDateTime deliveryDay, String tgt) {
		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		OfferApi api = new OfferApi(client);
		ServiceQueryOfferHourBlockRequest request = new ServiceQueryOfferHourBlockRequest();

		QueryOfferHourBlockRequest blockRequest = new QueryOfferHourBlockRequest();
		blockRequest.setDate(deliveryDay);
		blockRequest.setOfferType(QueryOfferHourBlockRequest.OfferTypeEnum.HOURLY);

		request.setHeader(getHeader());
		request.setBody(blockRequest);
		String ticket = getCasSt(tgt);
		QueryOfferHourBlockServiceResponse resp = null;
		try {
			resp = api.offerlisthourblocks(request, ticket);
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}

		if (QueryOfferHourBlockServiceResponse.ResultTypeEnum.SUCCESS != resp.getResultType()) {
			throw new RuntimeException(resp.getResultCode() + "-" + resp.getResultDescription());
		}
		System.out.println("Periods received :: " + resp.getResultDescription());
		System.out.println(resp.getBody());
		return resp.getBody().getOfferBlockHours();
	}

	public static Boolean validateDeliveryDay(LocalDateTime deliveryDay, String tgt) {
		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		OfferApi api = new OfferApi(client);
		ServiceQueryDeliveryDayRequest request = new ServiceQueryDeliveryDayRequest();
		QueryDeliveryDayRequest dayRequest = new QueryDeliveryDayRequest();
		dayRequest.setDeliveryDay(deliveryDay);
		request.setHeader(getHeader());
		request.setBody(dayRequest);
		String ticket = getCasSt(tgt);
		BooleanServiceResponse resp = null;

		try {
			resp = api.offervalidatedeliveryday(request, ticket);
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}

		if (BooleanServiceResponse.ResultTypeEnum.SUCCESS != resp.getResultType()) {
			throw new RuntimeException(resp.getResultCode() + "-" + resp.getResultDescription());
		}
		System.out.println("Deliveryday validated :: " +resp.getBody() +"-"+ resp.getResultDescription());
		return resp.getBody().booleanValue();
	}

	public static String getCurrencyCode(LocalDateTime deliveryDay, String tgt) {
		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		OfferApi api = new OfferApi(client);
		ServiceCurrencyRequest request = new ServiceCurrencyRequest();
		CurrencyRequest currencyRequest = new CurrencyRequest();
		currencyRequest.setDeliveryDay(deliveryDay);
		request.setHeader(getHeader());
		request.setBody(currencyRequest);
		String ticket = getCasSt(tgt);
		ParameterQueryServiceResponse resp = null;

		try {
			resp = api.offercurrencies(request, ticket);
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}

		if (ParameterQueryServiceResponse.ResultTypeEnum.SUCCESS != resp.getResultType()) {
			throw new RuntimeException(resp.getResultCode() + "-" + resp.getResultDescription());
		}

		System.out.println("Currencies received :: " + resp.getResultDescription());
		System.out.println(resp.getBody());
		return resp.getBody().getParameters().get(0).getValue();
	}

	public static String getRegionCode(LocalDateTime deliveryDay, String tgt) {
		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		OfferApi api = new OfferApi(client);
		ServiceRegionRequest request = new ServiceRegionRequest();
		RegionRequest regionRequest = new RegionRequest();
		regionRequest.setDeliveryDay(deliveryDay);
		request.setHeader(getHeader());
		request.setBody(regionRequest);
		String ticket = getCasSt(tgt);

		ParameterQueryServiceResponse resp = null;
		try {
			resp = api.offerregions(request, ticket);
		} catch (ApiException e) {
			throw new RuntimeException(e);
		}

		if (ParameterQueryServiceResponse.ResultTypeEnum.SUCCESS != resp.getResultType()) {
			throw new RuntimeException(resp.getResultCode() + "-" + resp.getResultDescription());
		}
		System.out.println("Regions received :: " + resp.getResultDescription());
		System.out.println(resp.getBody());
		return resp.getBody().getParameters().get(0).getValue();
	}

	public static MinMaxPriceResponse getMinMaxPrice(LocalDateTime deliveryDay, String tgt) {
		ApiClient client = Configuration.getDefaultApiClient();
		client.setBasePath(BASE_PATH);
		MinmaxpriceApi api = new MinmaxpriceApi(client);
		ServiceMinMaxPriceListRequest req = new ServiceMinMaxPriceListRequest();
		req.setBody(new MinMaxPriceListRequest());
		req.getBody().setEffectiveDate(deliveryDay);
		req.setHeader(getHeader());
		MinMaxPriceServiceResponse resp = null;
		try {
			resp = api.minmaxpricelisteffective(req, getCasSt(tgt));
			if (resp.getResultType() != MinMaxPriceServiceResponse.ResultTypeEnum.SUCCESS) {
				throw new RuntimeException(resp.getResultCode() + "-" + resp.getResultDescription());
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		System.out.println("MinMax prices received ::" + resp.getResultDescription());
		System.out.println(resp.getBody());
		return resp.getBody();
	}

	public static String getCasTGT() {
		URL url = null;
		byte[] postDataBytes = null;
		HttpsURLConnection connection = null;
		InputStreamReader inStreamReader = null;
		String tgt = null;

		StringBuilder postData = new StringBuilder();
		postData.append("username=");
		postData.append(USERNAME);
		postData.append("&password=");
		postData.append(PASSWORD);

		try {
			url = new URL(CAS_URL);
			postDataBytes = postData.toString().getBytes("UTF-8");
			connection = (HttpsURLConnection) url.openConnection();

			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
			connection.setDoOutput(true);
			connection.getOutputStream().write(postDataBytes);

			inStreamReader = new InputStreamReader(connection.getInputStream(), "UTF-8");
			BufferedReader bufReader = new BufferedReader(inStreamReader);
			tgt = bufReader.readLine();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return tgt;
	}

	public static String getCasSt(String tgt) {
		URL url = null;
		byte[] postDataBytes = null;
		String st = null;

		StringBuilder postData = new StringBuilder();
		postData.append("service=");
		postData.append(CAS_SERVICE_NAME);

		try {
			url = new URL(CAS_ST_URL + "/" + tgt);
			postDataBytes = postData.toString().getBytes("UTF-8");
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
			connection.setDoOutput(true);
			connection.getOutputStream().write(postDataBytes);

			InputStreamReader inStreamReader = new InputStreamReader(connection.getInputStream(), "UTF-8");
			BufferedReader bufReader = new BufferedReader(inStreamReader);
			st = bufReader.readLine();
			bufReader.close();
			System.out.println("received CAS Service Ticket :: " + st);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return st;
	}

	public static List<Header> getHeader() {
		List<Header> headers = new ArrayList<Header>();
		headers.add(getApp());
		headers.add(getTxtId());
		return headers;
	}

	private static Header getTxtId() {
		Header txt = new Header();
		txt.setKey("transactionId");
		txt.setValue(UUID.randomUUID().toString());
		return txt;
	}

	private static Header getApp() {
		Header app = new Header();
		app.setKey("application");
		app.setValue("Demo Elk Urt. A.S.");
		return app;
	}
}
