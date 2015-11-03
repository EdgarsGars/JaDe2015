package vea.itm.jade2015.taxServices;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;

import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.m01.Shop;
import vea.itm.jade2015.m01.ShoppingCart;

public class TaxJarAPI implements TaxService{

	private final String apiToken = "ae0d9ea987e0b027f38792280a2b5568";
	private final String host = "api.taxjar.com";
	private final int port = 443;
	private final String restPath = "/sales_tax";
	
	public double getTax(String countryCode) {
		//TODO Customer customer = getCustomerInfo();
		Customer customer = new Customer();
		
		//TODO Shop shop = getShopInfo();
		Shop shop = new Shop();
		
		//TODO ShoppingCart cart = getShoppingCartInfo();
		ShoppingCart cart = new ShoppingCart();
		
		HttpClient httpClient = new DefaultHttpClient();
		
		URIBuilder builder = new URIBuilder();
		
	    builder.setScheme("http").setHost(host).setPort(port)
	    .setPath(restPath)
	    .setParameter("amount","10")
	    .setParameter("shipping","0")
	    .setParameter("from_country","CA")
	    .setParameter("to_country","CA");
	    
	    if (countryCode == "US" || countryCode == "CA") {
	    	builder
	    	.setParameter("from_state", "BC")
		    .setParameter("from_zip","V0J1A0")
			.setParameter("to_state", "BC")
		    .setParameter("to_zip","V0J1A0");
	    	
	    }
	    	
	    	
	    
	    
	    
		
	    HttpPost postRequest = new HttpPost(builder.toString());
	    postRequest.setHeader("Authorization", "Bearer "+apiToken);
		
		return 0;
	}

}
