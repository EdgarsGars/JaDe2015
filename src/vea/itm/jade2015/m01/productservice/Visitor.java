package vea.itm.jade2015.m01.productservice;

import vea.itm.jade2015.m01.Item;
import vea.itm.jade2015.m01.productservice.categories.*;

public interface Visitor {

	  public double dicount(Books books, Item item);
	  public double dicount(Clothes clothes, Item item);
	  public double dicount(Food food, Item item);
	  //visit other concrete items

}
