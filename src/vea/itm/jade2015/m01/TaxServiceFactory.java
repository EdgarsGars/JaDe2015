package vea.itm.jade2015.m01;

import vea.itm.jade2015.taxServices.TaxService;

public class TaxServiceFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TaxService getTaxService(String serviceName){
		if(serviceName.equals("hardcode")){
				return null;		
		}
		else if(serviceName.equals("taxJar")){
			return null;	
		}
		else if(serviceName.equals("")){
			return null;
		}
		return null;		
	}

}
