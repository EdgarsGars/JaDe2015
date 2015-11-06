package vea.itm.jade2015.tax;

import vea.itm.jade2015.m01.Customer;

@Deprecated
public class TaxObject {

	private double amount;
	private String countryCode;
	private String state;
	private String zip;

	public TaxObject(double amount, String countryCode, String state, String zip) {
		this.amount = amount;
		this.countryCode = countryCode;
		this.state = state;
		this.zip = zip;
	}
	
	public TaxObject(double amount, Customer customer) {
		this.amount = amount;
		this.countryCode = customer.getCountryCode();
		this.state = customer.getStateCode();
		this.zip = customer.getZipCode();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountry(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return state;
	}

	public void setStateCode(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zip;
	}

	public void setZipCode(String zip) {
		this.zip = zip;
	}
	
	
	

}
