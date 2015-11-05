package vea.itm.jade2015.taxServices;

import static org.junit.Assert.*;

import org.junit.Test;

import vea.itm.jade2015.m01.Customer;

public class HardcodedTaxTest {

	@Test
	public void testGetTax() {
		HardcodedTax ht = new HardcodedTax();
		TaxObject to = new TaxObject(0, "LVL", "LVL", "zip");
		TaxObject to1 = new TaxObject(0, "RUS", "RUS", "zip1");
		TaxObject to2 = new TaxObject(0, "US", "US", "zip2");
		TaxObject to3 = new TaxObject(0, "KR", "KR", "zip3");
		TaxObject to4 = new TaxObject(0, "JP", "JP", "zip4");
		TaxObject to5 = new TaxObject(0, "EST", "EST", "zip5");
		TaxObject to6 = new TaxObject(0, "LT", "LT", "zip6");
		TaxObject to7 = new TaxObject(0, "FR", "FR", "zip7");
		TaxObject to8 = new TaxObject(0, "DE", "DE", "zip8");
		TaxObject to9 = new TaxObject(0, "UK", "UK", "zip9");
		TaxObject to10 = new TaxObject(0, "FIN", "FIN", "zip10");
		double rate = ht.getTax(to);
		double rate1 = ht.getTax(to1);
		double rate2 = ht.getTax(to2);
		double rate3 = ht.getTax(to3);
		double rate4 = ht.getTax(to4);
		double rate5 = ht.getTax(to5);
		double rate6 = ht.getTax(to6);
		double rate7 = ht.getTax(to7);
		double rate8 = ht.getTax(to8);
		double rate9 = ht.getTax(to9);
		double rate10 = ht.getTax(to10);
		assertEquals(0.04, rate,0.001);
		assertEquals(0.03, rate1,0.001);
		assertEquals(0.05, rate2,0.001);
		assertEquals(0.06, rate3,0.001);
		assertEquals(0.08, rate4,0.001);
		assertEquals(0.06, rate5,0.001);
		assertEquals(0.03, rate6,0.001);
		assertEquals(0.09, rate7,0.001);
		assertEquals(0.08, rate8,0.001);
		assertEquals(0.04, rate9,0.001);
		assertEquals(0, rate10,0.001);
	}

}
