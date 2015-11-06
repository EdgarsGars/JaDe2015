package vea.itm.jade2015.taxServices;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import vea.itm.jade2015.tax.TaxJarAPI;
import vea.itm.jade2015.tax.TaxObject;

public class TaxJarAPITest {
	
	

	@Test
	public void testGetTax() {
		TaxJarAPI tja = new TaxJarAPI();
		TaxObject to = new TaxObject(0, "LV", "LV", "3605");
		//double rate = tja.getTax(to);
		//assertEquals(0.21, rate,0.001);
		
		TaxJarAPI tja2 = new TaxJarAPI();
		TaxObject to2 = new TaxObject(0, "US", "NY", "22222");
		//double rate2 = tja2.getTax(to2);
		//assertEquals(0.06, rate2,0.001);
	}
	
	
	@Test
	public void testRuntimeException()
	{
	  try
	  {
		  TaxJarAPI tja3 = new TaxJarAPI();
		  TaxObject to3 = new TaxObject(0, "US", "NY", "33333");
		  //double rate3 = tja3.getTax(to3);
	  }
	  catch( final RuntimeException e )
	  {
	    final String msg = "Failed: HTTP error code : 404";
	    assertEquals(msg, e.getMessage());
	  }
	}

}
