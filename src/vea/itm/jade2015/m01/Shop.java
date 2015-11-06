package vea.itm.jade2015.m01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Shop class extends ItemList.
 * Shop allows Customer to know if new items has been added (calling isNewItems()) since last getAllItems() call.
 * @author Janis
 *
 */
public final class Shop extends ItemList {

	private HashMap<String,Boolean> watched = new HashMap<String,Boolean>();
	
	boolean addItem(Item item){
		if(super.addItem(item)){
			resetWatched();
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Sets true in hashmap watched indicating that Customer has been viewed all new Items.
	 * @param customer - Customer in question
	 * @return all items in the Shop
	 */
	ArrayList<Item> getAllItems(Customer customer){
		//Sets true, indicating that Customer has viewed all new Items.
		watched.put(customer.getName(),true);
		return (ArrayList<Item>) super.getAllItems();
	}
	
	private void resetWatched(){
		for (Entry<String, Boolean> pair : watched.entrySet()) {
			pair.setValue(false);
		}
	}
	
	/**
	 * Customer can call this method to view if new Items has arrived in the Shop
	 * @param customer - Customer in question
	 * @return true - if there are new Items in the Shop, false - if not
	 */
	public boolean isNewItems(Customer customer){
		if(watched.containsKey(customer.getName())){
			return watched.get(customer.getName());
		} else 
			return true;
	}
	
	
}
