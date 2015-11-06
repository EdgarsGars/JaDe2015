package vea.itm.jade2015.m01;

import java.text.DecimalFormat;

import vea.itm.jade2015.m01.paymentservice.Order;
import vea.itm.jade2015.m01.paymentservice.PaymentFactory;
import vea.itm.jade2015.m01.paymentservice.PaymentService;
import vea.itm.jade2015.m01.productservice.DiscountVisitor;
import vea.itm.jade2015.m01.productservice.categories.Books;
import vea.itm.jade2015.m01.productservice.categories.Food;
import vea.itm.jade2015.m01.taxServices.DateTaxServiceFactory;
import vea.itm.jade2015.m01.taxServices.TaxFactory;
import vea.itm.jade2015.m01.taxServices.TaxServiceFactory;

public class Main {

	public static void main(String[] args) {

		DecimalFormat dec = new DecimalFormat("#.##");
		
		// Create new shop
		Shop shop = new Shop();
		
		// Init shop with items
		shop.addItem(new Product("Banana", 2.4, new Food()));
		shop.addItem(new Product("Apple", 0.4, new Food()));
		shop.addItem(new Product("Square Watermelon", 800, new Food()));
		
		// Create new Customer
		Customer customer1 = new Customer("John Doe", "Latvia", "LV", "", "");
		
		// Add customer to shop listeners
		shop.addListener(customer1);
		
		// Add new Item. Costomer recieves notification
		shop.addItem(new Product("Davinci Code", 25, new Books()));
		
		// Create shopping cart with tax object
		TaxFactory tf= new TaxServiceFactory(customer1);
		tf = new DateTaxServiceFactory(customer1, tf);
		ShoppingCart shopCart = new ShoppingCart(tf);

		// Add some items to cart
		shopCart.addItem(new Item(2, shop.getProduct("Banana")));
		shopCart.addItem(new Item(3, shop.getProduct("Apple")));
		shopCart.addItem(new Item(1, shop.getProduct("Square Watermelon")));
		

		System.out.println("Total cost without tax : " + dec.format(shopCart.calculateTotal()) + "$");
		
		// Checkout
		Order order = shopCart.checkout();
		
		// Get PayService and pay
		PaymentService ps = (new PaymentFactory()).getService("PayPal");
		ps.pay(customer1, order, Shop.getReciepientForShop());
		
		// Create discount, checkout again with discount and pay.
		DiscountVisitor ds = new DiscountVisitor();
		order = shopCart.checkout(ds);
		ps.pay(customer1, order, Shop.getReciepientForShop());


	}

}