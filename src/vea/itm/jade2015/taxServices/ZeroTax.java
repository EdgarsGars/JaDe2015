package vea.itm.jade2015.taxServices;

public class ZeroTax implements TaxService {

	public double getTax(double total) {

		return 0;
	}

}
