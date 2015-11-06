package vea.itm.jade2015.m01;

import java.text.DecimalFormat;


import vea.itm.jade2015.taxServices.TaxObject;
import vea.itm.jade2015.taxServices.TaxServiceFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dec = new DecimalFormat("#.##");
		Shop s = new Shop();
		Customer customer1 = new Customer("John Doe", "Latvia", "LV", "", "");
		ShoppingCart shopCart = new ShoppingCart();

		// Init shop with items
		s.addItem(new Item(1, "Banana", 2.4));
		s.addItem(new Item(1, "Apple", 0.4));

		// Add some items to cart
		shopCart.addItem(s.getItem("Banana"));
		shopCart.addItem(s.getItem("Banana"));
		shopCart.addItem(s.getItem("Apple"));  //BUG if you add one item it takes all quantity

		// Display Bill
		System.out.println("Item\t\tPrice");
		System.out.println("---------------------");
		double totalWithoutTax = 0;
		for (Item item : shopCart.orderItems) {
			totalWithoutTax += item.getCost();
			System.out.println(item.getCode() + "\t\t" + dec.format(item.getCost()) + "$");

		}
		TaxObject taxObject = new TaxObject(totalWithoutTax, customer1);
		System.out.println("-------CHECKOUT------");
		System.out.println("Tax rate in " + customer1.getCountry() + " = "
				+ TaxServiceFactory.getTaxService("taxJar").getTax(taxObject));
		System.out.println("Total without tax : " + dec.format(totalWithoutTax) + "$");
		System.out.println("---------------------");
		System.out.println("Total cost with tax : " + dec.format(shopCart.calculateTotal(customer1)) + "$");
		// System.out.println(s.getAllItems(new Customer()).toString());

	}

}
