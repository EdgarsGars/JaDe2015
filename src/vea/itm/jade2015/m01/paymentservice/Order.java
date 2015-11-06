package vea.itm.jade2015.m01.paymentservice;


public class Order {
	
    private double summ;
    
    public Order(double ammount){
    	summ = ammount;
    }
    
    public double getSum(){
    	return summ;
    }
}
