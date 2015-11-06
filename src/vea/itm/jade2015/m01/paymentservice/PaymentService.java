package vea.itm.jade2015.m01.paymentservice;

import vea.itm.jade2015.m01.Customer;

public interface PaymentService {

		void pay(Customer c, Order order, Recipient re);
}
