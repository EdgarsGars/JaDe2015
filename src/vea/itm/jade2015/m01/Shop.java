package vea.itm.jade2015.m01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import vea.itm.jade2015.m01.paymentservice.Recipient;
import vea.itm.jade2015.m01.productservice.ShopListener;

/**
 * Shop class extends ItemList.
 * Shop allows Customer to know if new items has been added (calling isNewItems()) since last getAllItems() call.
 * @author Janis
 *
 */
public final class Shop extends ProductList{
	
	private ArrayList<ShopListener> listeners = new ArrayList<ShopListener>();
	//private HashMap<String,Boolean> watched = new HashMap<String,Boolean>();
	
	boolean addItem(Product item){
		if(super.addProduct(item)){
			notify(item);
			return true;
		}else{
			return false;
		}
	}
	
	public static Recipient getReciepientForShop(){
		return new Recipient();
	}
	
	public void addListener(ShopListener shopListener){
		listeners.add(shopListener);
	}
	
	public void removeListener(ShopListener shopListener){
		listeners.remove(shopListener);
	}
	
	protected void notify(Product newProduct){
		for (ShopListener shopListener : listeners) {
			shopListener.newProductNotification(newProduct);
		}
	}
	
}
