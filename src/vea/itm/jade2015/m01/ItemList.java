package vea.itm.jade2015.m01;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract item list class which could be extended to concrete implementation as ShopingList, DeliveryList, etc
 * @author Janis
 *
 */
public abstract class ItemList {
	private HashMap<String,Item> items;
	
	ItemList(){
		items = new HashMap<String,Item>();
	}
	
	boolean addItem(Item item){
		if (item!=null){
			items.put(item.getCode(),item);
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean removeItem(String code){
		if(items.containsKey(code)){
			items.remove(code);
			return true;
		}else{
			return false;
		}
	}
	
	Item getItem(String code){
		return items.get(code);
	}
	

	protected ArrayList<Item> getAllItems(){
		return new ArrayList<Item>(items.values());
	}

}
