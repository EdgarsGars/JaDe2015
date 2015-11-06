package vea.itm.jade2015.m01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomer() {
		Customer customer = new Customer();
		assertEquals(customer.getName(),null);
		assertEquals(customer.getCountry(),null);
		assertEquals(customer.getCountryCode(),null);
		assertEquals(customer.getStateCode(),null);
		assertEquals(customer.getZipCode(),null);
	}

	@Test
	public void testCustomerStringStringStringStringString() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getName(),"John Doe");
		assertEquals(customer.getCountry(),"Latvia");
		assertEquals(customer.getCountryCode(),"LV");
		assertEquals(customer.getStateCode(),"Kurzeme");
		assertEquals(customer.getZipCode(),"LV-3601");
	}

	@Test
	public void testGetName() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getName(),"John Doe");
	}

	@Test
	public void testSetName() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		customer.setName("Lilly");
		assertEquals(customer.getName(),"Lilly");
	}

	@Test
	public void testGetCountry() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getCountry(),"Latvia");
	}

	@Test
	public void testSetCountry() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		customer.setCountry("Lithuania");
		assertEquals(customer.getCountry(),"Lithuania");
	}

	@Test
	public void testGetCountryCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getCountryCode(),"LV");
	}

	@Test
	public void testSetCountryCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		customer.setCountryCode("LT");
		assertEquals(customer.getCountryCode(),"LT");
	}

	@Test
	public void testGetStateCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getStateCode(),"Kurzeme");
	}

	@Test
	public void testSetStateCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		customer.setStateCode("Latgale");
		assertEquals(customer.getStateCode(),"Latgale");
	}

	@Test
	public void testGetZipCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		assertEquals(customer.getZipCode(),"LV-3601");
	}

	@Test
	public void testSetZipCode() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		customer.setZipCode("LV-3605");
		assertEquals(customer.getZipCode(),"LV-3605");
	}

}
