package vea.itm.jade2015.taxServices.countryServices;

import vea.itm.jade2015.taxServices.TaxService;

public class LTTaxService implements TaxService {

	public double getTax(double total) {
		// TODO Auto-generated method stub
		return total*0.18;
	}

}
