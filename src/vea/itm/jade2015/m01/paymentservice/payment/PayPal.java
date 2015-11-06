package vea.itm.jade2015.m01.paymentservice.payment;

import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.m01.paymentservice.Order;
import vea.itm.jade2015.m01.paymentservice.PaymentService;
import vea.itm.jade2015.m01.paymentservice.Recipient;

public class PayPal implements PaymentService {

	public void pay(Customer c,  Order order, Recipient re) {
		
		System.out.println("Paying with PayPal:" +  findAccount(c) + " --> " + re.getAccNr() + " ammount: " + order.getSum());

	}
	
	public static String findAccount(Customer customer){
		// Do DB queries
		
		return "10102983621223";
	}

}
