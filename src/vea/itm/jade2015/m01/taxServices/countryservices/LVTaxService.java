package vea.itm.jade2015.m01.taxServices.countryservices;

import vea.itm.jade2015.m01.taxServices.TaxService;

public class LVTaxService implements TaxService {

	public double getTax(double total) {
		// TODO Auto-generated method stub
		return total*0.21;
	}

}
