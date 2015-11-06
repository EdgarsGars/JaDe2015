package vea.itm.jade2015.m01.taxServices;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import vea.itm.jade2015.m01.Customer;

public class TaxServiceFactory implements TaxFactory{

	static Map<String, TaxService> dictionary = new HashMap<String, TaxService>();
	Customer c;
	
	public TaxServiceFactory(Customer c){
		this.c = c;
	}
	
	public TaxService getTaxService() {
		
		TaxService ts = null;
		try {
			if(dictionary.containsKey(c.getCountryCode())){
				ts = dictionary.get(c.getCountryCode());
			} else{
				ts = (TaxService)Class.forName("vea.itm.jade2015.m01.taxServices.countryservices."+c.getCountryCode()+"TaxService").getConstructor().newInstance();
				dictionary.put(c.getCountryCode(), ts);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ts = new ZeroTax();
		}
		return ts;

	}

}
