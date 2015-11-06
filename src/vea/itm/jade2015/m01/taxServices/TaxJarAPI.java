package vea.itm.jade2015.m01.taxServices;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import org.json.JSONObject;

import java.io.IOException;


public class TaxJarAPI implements TaxService {

	private static final String apiToken = "ae0d9ea987e0b027f38792280a2b5568";
	private static final String host = "api.taxjar.com";
	private static final int port = 443;
	private static final String restPath = "/v2/taxes";
	
	/**
	 * @param customer - customer in question 
	 * @return tax rate
	 */
	public double getTax(double total) {
		double rate = 0;
		/*
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		URIBuilder builder = new URIBuilder();
		
	    builder.setScheme("https").setHost(host).setPort(port)
	    .setPath(restPath)
	    .setParameter("amount","0")
	    .setParameter("shipping","0")
	    .setParameter("from_country",taxObject.getCountryCode())
	    .setParameter("to_country",taxObject.getCountryCode());
	    
	    if (taxObject.getCountryCode().equals("US") || taxObject.getCountryCode().equals("CA")) {
	    	builder
	    	.setParameter("from_state",taxObject.getStateCode())
		    .setParameter("from_zip",taxObject.getZipCode())
			.setParameter("to_state",taxObject.getStateCode())
		    .setParameter("to_zip",taxObject.getZipCode());
	    }
	    	
	    HttpPost postRequest = new HttpPost(builder.toString());
	    postRequest.setHeader("Authorization", "Bearer "+apiToken);
		
	    HttpResponse response;
	    String encoding;
	    
		try {
			response = httpClient.execute(postRequest);
			if (response.getStatusLine().getStatusCode() != 200){
		    	throw new RuntimeException("Failed: HTTP error code : " + response.getStatusLine().getStatusCode());
		    }
			HttpEntity entity = response.getEntity();
		    Header encodingHeader = entity.getContentEncoding();
		    try{
		    	encoding = encodingHeader.getValue();
		    } catch(NullPointerException e){
		    	encoding="UTF-8";
		    }
		    
		    String responseString = EntityUtils.toString(entity,encoding);
		    JSONObject jsonObj = new JSONObject(responseString);
		    rate = Double.parseDouble(jsonObj.getJSONObject("tax").get("rate").toString());

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	    */
		return rate;
	}

}
