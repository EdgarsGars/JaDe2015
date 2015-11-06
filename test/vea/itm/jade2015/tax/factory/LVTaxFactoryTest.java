package vea.itm.jade2015.tax.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vea.itm.jade2015.m01.Customer;
import vea.itm.jade2015.m01.Factory;
import vea.itm.jade2015.tax.interfaces.CountryTaxFactory;
import vea.itm.jade2015.tax.interfaces.TaxService;
import vea.itm.jade2015.tax.services.LV.LVTaxService;

public class LVTaxFactoryTest {

	@Test
	public void testGetTaxService() {
		LVTaxFactory taxFactory = new LVTaxFactory();
		TaxService result = taxFactory.getTaxService();
		assertTrue(result instanceof LVTaxService);
		
		//TODO case 2
		
		//TODO case 3
	}

}
