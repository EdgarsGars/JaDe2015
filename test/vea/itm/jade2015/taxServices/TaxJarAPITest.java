package vea.itm.jade2015.taxServices;

import static org.junit.Assert.*;
import org.junit.Test;
import vea.itm.jade2015.tax.TaxJarAPI;

public class TaxJarAPITest {
	
	

	@Test
	public void testGetTax() {
		double expected = 0.21;
		double result = TaxJarAPI.getTax("LV");
		assertEquals(expected, result,0.001);
		
		//TODO test case 2
		
		//TODO test case 3
	}
	
	
	@Test
	public void testRuntimeException()
	{
		String expected = "Failed: HTTP error code : 400";
		try {
			TaxJarAPI.getTax("US");
		} catch (final RuntimeException e) {
			assertEquals(expected, e.getMessage());
		}
	}

}
