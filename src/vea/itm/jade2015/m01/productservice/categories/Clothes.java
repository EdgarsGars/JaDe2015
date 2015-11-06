package vea.itm.jade2015.m01.productservice.categories;

import vea.itm.jade2015.m01.Item;
import vea.itm.jade2015.m01.productservice.Category;
import vea.itm.jade2015.m01.productservice.Visitor;

public class Clothes implements Category {

	public double getDiscount(Visitor visitor, Item item) {
		// TODO Auto-generated method stub
		return visitor.dicount(this,item);
	}

}
