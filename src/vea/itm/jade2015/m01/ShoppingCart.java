package vea.itm.jade2015.m01;

import java.util.ArrayList;

import vea.itm.jade2015.taxServices.TaxObject;
import vea.itm.jade2015.taxServices.TaxServiceFactory;

public class ShoppingCart {
	
	ArrayList<Item> orderItems = new ArrayList<Item>();
	
	/**
	 * Calculate total costs of items in the ShoppingCart - including taxes
	 * @param customer - customer in question 
	 * @return total costs
	 */
    public double calculateTotal(Customer customer)
    {
    	double total = 0;
    	for (Item item : orderItems) {
			total += item.getCost() * item.getQuantity();
		}
    	TaxObject taxObject = new TaxObject(total, customer);
        double tax = TaxServiceFactory.getTaxService("taxJar").getTax(taxObject);
        total = total + total * tax;
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
    public void pay(Customer customer, String method){
    	
    	double amount = calculateTotal(customer);
    	
    	if(method.equalsIgnoreCase("PayPal")){
    		PayPalAccount acc = new PayPalAccount(customer);
    		String account = PayPalAccount.findAccount(new Customer());
    		acc.pay(amount, account);
    	} // TODO Add MasterCard and Visa services in the future
    	
    	
    }


}
