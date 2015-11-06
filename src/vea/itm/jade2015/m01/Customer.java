package vea.itm.jade2015.m01;

import vea.itm.jade2015.m01.productservice.ShopListener;

public class Customer implements ShopListener{
	private String name;
	private String country;
	private String countryCode;
	private String stateCode;
	private String zipCode;
	
	public Customer(){}
	
	public Customer(String name,String country,String countryCode,String stateCode,String zipCode){
		setName(name);
		setCountry(country);
		setCountryCode(countryCode);
		setStateCode(stateCode);
		setZipCode(zipCode);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void newProductNotification(Product product) {
		System.out.println(name + ": Nice! I see new product: " + product.getCode());
	}
	
	
}
