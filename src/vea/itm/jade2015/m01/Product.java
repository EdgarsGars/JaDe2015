package vea.itm.jade2015.m01;

import vea.itm.jade2015.m01.productservice.Category;

public class Product {

	private String code;
	private double cost;
	private Category category;
	
    public Product(String code, double cost, Category category){
    	setCode(code);
    	setCost(cost);
    	setCategory(category);
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}
}
