package vea.itm.jade2015.taxServices;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxServiceFactoryTest {

	@Test
	public void testGetTaxService() {
		assertTrue(TaxServiceFactory.getTaxService("taxJar") instanceof TaxJarAPI);
		assertTrue(TaxServiceFactory.getTaxService("hardcode") instanceof HardcodedTax);
		assertTrue(TaxServiceFactory.getTaxService("bob")== null);
	}

}
