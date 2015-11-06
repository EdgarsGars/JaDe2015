package vea.itm.jade2015.m01.paymentservice;

import java.util.HashMap;
import java.util.Map;

import vea.itm.jade2015.m01.paymentservice.payment.CreditCard;
import vea.itm.jade2015.m01.paymentservice.payment.EBank;
import vea.itm.jade2015.m01.paymentservice.payment.PayPal;
import vea.itm.jade2015.m01.taxServices.TaxService;
import vea.itm.jade2015.m01.taxServices.ZeroTax;
import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.m01.ServiceFactory;

public class PaymentFactory implements ServiceFactory<PaymentService>{
	
	
	public PaymentService getService(String paymethod){
		if(paymethod == null){
	         return null;
	      }		
	      if(paymethod.equalsIgnoreCase("PAYPAL")){
	         return new PayPal();
	         
	      } else if(paymethod.equalsIgnoreCase("CreditCard")){
	         return new CreditCard();
	         
	      } else if(paymethod.equalsIgnoreCase("EBANK")){
	         return new EBank();
	      }
	      
	      return null;
	}
}
