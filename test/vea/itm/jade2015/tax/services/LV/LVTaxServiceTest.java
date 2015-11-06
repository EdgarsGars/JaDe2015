package vea.itm.jade2015.tax.services.LV;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class LVTaxServiceTest {
	
	@Test
	public void testGetTax() {
		Calendar calendar = Calendar.getInstance();
		LVTaxService taxService = new LVTaxService();
		double expected = 0.21;
		double result = taxService.getTax(calendar);
		assertEquals(expected, result, 0.001);
		
		calendar.set(Calendar.MONTH,10);
		calendar.set(Calendar.DAY_OF_MONTH, 18);
		expected = 0.0;
		result = taxService.getTax(calendar);
		assertEquals(expected, result, 0.001);
		
	}

}
