package vea.itm.jade2015.m01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import vea.itm.jade2015.m01.paymentservice.Order;
import vea.itm.jade2015.m01.productservice.Visitor;
import vea.itm.jade2015.m01.taxServices.TaxFactory;
import vea.itm.jade2015.m01.taxServices.TaxServiceFactory;

public class ShoppingCart {
	
	ArrayList<Item> orderItems = new ArrayList<Item>();
	TaxFactory taxFactory;
	
	ShoppingCart(Customer c){
		this(new TaxServiceFactory(c));
	}
	
	ShoppingCart(TaxFactory taxFactory){
		this.taxFactory = taxFactory;
	}
	
	/**
	 * Calculate total costs of items in the ShoppingCart - including taxes
	 * @param customer - customer in question 
	 * @return total costs
	 */
    public double calculateTotal()
    {
    	double total = 0;
    	for (Item item : orderItems) {
			total += item.getProduct().getCost() * item.getQuantity();
		}
        return total;
    }
    
    public double calculateTotal(Visitor discountVisitor)
    {
    	double total = 0;
    	for (Item item : orderItems) {
			total += item.getProduct().getCost() * item.getQuantity() - item.getProduct().getCategory().getDiscount(discountVisitor, item);
		}
        return total;
    }
    
    public void removeItem(Item item){
    	orderItems.remove(item);
    }
    
    public void addItem(Item item){
    	orderItems.add(item);
    }
    
    public Order checkout(){
    	
    	double subTotal = calculateTotal();
    	
    	double tax = taxFactory.getTaxService().getTax(subTotal);
    	subTotal = subTotal + tax;
    	
    	return new Order(subTotal);
    }
    
    public Order checkout(Visitor discountVisitor){
    	
    	double subTotal = calculateTotal(discountVisitor);
    	
    	double tax = taxFactory.getTaxService().getTax(subTotal);
    	subTotal = subTotal + tax;
    	
    	return new Order(subTotal);
    }

}

