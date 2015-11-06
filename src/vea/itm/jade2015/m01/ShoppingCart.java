package vea.itm.jade2015.m01;

import java.util.ArrayList;

import vea.itm.jade2015.m01.taxServices.TaxFactory;
import vea.itm.jade2015.m01.taxServices.TaxObject;
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
			total += item.getCost() * item.getQuantity();
		}
    	
        double tax = taxFactory.getTaxService().getTax(total);
        total = total + tax;
        return total;
    }
    
    public void removeItem(Item item){
    	orderItems.remove(item);
    }
    
    public void addItem(Item item){
    	orderItems.add(item);
    }
    
    /**
     * On checkout, Pay method is called providing the method of paying (e.g. PayPal, MasterCard). Method uses corresponding services
     * to do money transaction from Customer's account to Companies account.  
     * @param customer - Customer in question
     * @param method - Paying method string
     */
    public void pay(String method){
    	
    	double amount = calculateTotal();
    	
    }


}

