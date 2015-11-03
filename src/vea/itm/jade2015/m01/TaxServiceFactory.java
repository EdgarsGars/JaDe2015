package vea.itm.jade2015.m01;

import vea.itm.jade2015.taxServices.TaxJarAPI;
import vea.itm.jade2015.taxServices.TaxService;

public class TaxServiceFactory {
	
	public static TaxService getTaxService(String serviceName){
		if(serviceName.equals("hardcode")){
				return null;		
		}
		else if(serviceName.equals("taxJar")){
			return new TaxJarAPI();	
		}
		else if(serviceName.equals("")){
			return null;
		}
		return null;		
	}

}
