package vea.itm.jade2015.m01.productservice;

import vea.itm.jade2015.m01.Item;

public interface Category {
	public double getDiscount(Visitor visitor, Item item);

}
