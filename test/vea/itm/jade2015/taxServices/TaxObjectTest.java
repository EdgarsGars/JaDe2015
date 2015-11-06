package vea.itm.jade2015.taxServices;

import static org.junit.Assert.*;

import org.junit.Test;

import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.tax.TaxObject;

public class TaxObjectTest {

	@Test
	public void testTaxObjectDoubleStringStringString() {
		TaxObject object = new TaxObject(5, "LV", "Kurzeme", "LV-3601");
		assertTrue(object.getAmount()==5);
		assertEquals(object.getCountryCode(),"LV");
		assertEquals(object.getStateCode(),"Kurzeme");
		assertEquals(object.getZipCode(),"LV-3601");
	}

	@Test
	public void testTaxObjectDoubleCustomer() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "Kurzeme", "LV-3601");
		TaxObject object = new TaxObject(5, customer);
		assertTrue(object.getAmount()==5);
		assertEquals(object.getCountryCode(),"LV");
		assertEquals(object.getStateCode(),"Kurzeme");
		assertEquals(object.getZipCode(),"LV-3601");
	}

	@Test
	public void testGetAmount() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		assertTrue(object.getAmount()==5.67);
	}

	@Test
	public void testSetAmount() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		object.setAmount(10);
		assertTrue(object.getAmount()==10);
	}

	@Test
	public void testGetCountryCode() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		assertEquals(object.getCountryCode(),"LV");
	}

	@Test
	public void testSetCountry() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		object.setCountry("LT");
		assertEquals(object.getCountryCode(),"LT");
	}

	@Test
	public void testGetStateCode() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		assertEquals(object.getStateCode(),"Kurzeme");
	}

	@Test
	public void testSetStateCode() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		object.setStateCode("Latgale");
		assertEquals(object.getStateCode(),"Latgale");
	}

	@Test
	public void testGetZipCode() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		assertEquals(object.getZipCode(),"LV-3601");
	}

	@Test
	public void testSetZipCode() {
		TaxObject object = new TaxObject(5.67, "LV", "Kurzeme", "LV-3601");
		object.setZipCode("LV-3605");
		assertEquals(object.getZipCode(),"LV-3605");
	}

}
