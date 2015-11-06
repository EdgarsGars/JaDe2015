package vea.itm.jade2015.m01;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract item list class which could be extended to concrete implementation as ShopingList, DeliveryList, etc
 * @author Janis
 *
 */
public abstract class ProductList {
	private HashMap<String,Product> items;
	
	ProductList(){
		items = new HashMap<String,Product>();
	}
	
	boolean addProduct(Product item){
		if (item!=null){
			items.put(item.getCode(),item);
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean removeProduct(String code){
		if(items.containsKey(code)){
			items.remove(code);
			return true;
		}else{
			return false;
		}
	}
	
	Product getProduct(String code){
		return items.get(code);
	}
	

	protected ArrayList<Product> getAllItems(){
		return new ArrayList<Product>(items.values());
	}

}
