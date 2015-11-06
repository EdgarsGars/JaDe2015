package vea.itm.jade2015.m01.productservice;

import vea.itm.jade2015.m01.Item;
import vea.itm.jade2015.m01.productservice.categories.Books;
import vea.itm.jade2015.m01.productservice.categories.Clothes;
import vea.itm.jade2015.m01.productservice.categories.Food;

public class DiscountVisitor implements Visitor {

	public double dicount(Books books, Item item) {
		double icost = item.getProduct().getCost();
		
		if (item.getQuantity()*icost > 100)
			return item.getQuantity()*icost*0.20;
		else if (item.getQuantity() > 5)
			return item.getQuantity()*icost*0.15;
		else
			return 0;

	}

	public double dicount(Clothes clothes, Item item) {
		double icost = item.getProduct().getCost();
		
		if (item.getQuantity()*icost > 200)
			return item.getQuantity()*icost*0.20;
		else return 0;
	}

	public double dicount(Food food, Item item) {
		double icost = item.getProduct().getCost();
		
		if (item.getQuantity()*icost > 100)
			return item.getQuantity()*icost*0.10;
		if (item.getQuantity()*icost > 50)
			return item.getQuantity()*icost*0.05;
		else return 0;
	}


}
