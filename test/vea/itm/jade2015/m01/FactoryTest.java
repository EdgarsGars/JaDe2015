package vea.itm.jade2015.m01;

import static org.junit.Assert.*;

import org.junit.Test;

import vea.itm.jade2015.tax.factory.LVTaxFactory;
import vea.itm.jade2015.tax.interfaces.CountryTaxFactory;

public class FactoryTest {
	
	@Test
	public void testGetTaxFactory() {
		Customer customer = new Customer("John Doe", "Latvia", "LV", "", "");
		CountryTaxFactory result = Factory.getTaxFactory(customer);
		assertTrue(result instanceof LVTaxFactory);
		
		//TODO case 2
		
		//TODO case 3
	}

}
