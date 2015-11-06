package vea.itm.jade2015.m01;

public class Item {
	
	private int quantity;
	private String code;
	private double cost;
    
    public Item(int quantity, String code, double cost){
    	setQuantity(quantity);
    	setCode(code);
    	setCost(cost);
    }
	
	
    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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


}
