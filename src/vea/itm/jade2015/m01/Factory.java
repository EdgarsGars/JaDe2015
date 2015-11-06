package vea.itm.jade2015.m01;

import vea.itm.jade2015.tax.interfaces.CountryTaxFactory;

public class Factory {

	public static CountryTaxFactory getTaxFactory(Customer customer) {

		CountryTaxFactory defaultTaxFactory = null;
		
		try {
			Class<?> newClass = Class.forName("vea.itm.jade2015.tax.factory."+ customer.getCountryCode() + "TaxFactory");
			return(CountryTaxFactory) newClass.newInstance();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		
		return defaultTaxFactory;
	}
}
