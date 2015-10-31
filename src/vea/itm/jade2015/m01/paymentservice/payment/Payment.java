package vea.itm.jade2015.m01.paymentservice.payment;

import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.m01.paymentservice.Order;
import vea.itm.jade2015.m01.paymentservice.Recipient;

public interface Payment {

		void pay(Customer c, Order order, Recipient re);
}
