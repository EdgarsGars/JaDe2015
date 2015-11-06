package vea.itm.jade2015.taxServices;

import java.util.Calendar;
import java.util.Date;

import vea.itm.jade2015.m01.Customer;

public class DateTaxServiceFactory implements TaxFactory {
	
	Customer c;
	TaxFactory tf;

	public DateTaxServiceFactory(Customer c, TaxFactory tf){
		this.c = c;
		this.tf = tf;
	}
	
	public TaxService getTaxService() {
		// TODO Auto-generated method stub
		
		TaxService ts = null;

		if(c.getCountryCode().equals("LV") && Calendar.getInstance().get(Calendar.MONTH) == 10 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 18)
			ts = new ZeroTax();
		else
			ts = tf.getTaxService();
		return ts;
	}

}
