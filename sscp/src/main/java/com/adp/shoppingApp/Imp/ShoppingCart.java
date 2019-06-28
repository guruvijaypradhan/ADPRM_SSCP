package com.adp.shoppingApp.Imp;

import java.util.Map;
import java.util.TreeMap;

import com.adp.shoppingApp.model.IShoppingCart;
import com.adp.shoppingApp.Imp.Product;


public class ShoppingCart implements IShoppingCart{



private Map< String,Product> cart= new TreeMap<String,Product>();


@Override
public void addProduct(Product p) {
	
	cart.put(p.getpId(), p);
}//end of overridden method addProduct


@Override
public void removeProduct(Product p) {
	
	cart.remove(p.getpId());
	
	
} //end of overridden method removeProduct


@Override
public Map<String,Product> getCartForBilling() {	
	return this.cart;
}//end of overridden method getCartForBilling
	
	
	public void showCart(ShoppingCart sc) {
		int i=1;
		Print.printStar();
		Print.printMessage("Cart currently having -");
		for(Map.Entry<String,Product> cartProduct : sc.cart.entrySet()) {
			Product p=cartProduct.getValue();
			
			Print.printMessage(i+ "==> "+p.getpId()+" | "+ p.getpName()+" | "+p.getpQuantity());
			i++;
			
		}//end of loop
		
	}// end of method showCart
	
	public void updateQuantity(Product p,int quantity) {
		
		cart.get(p.getpId()).setpQuantity(quantity);
		cart.replace(p.getpId(), cart.get(p.getpId()));
		
	} //end of overridden method removeProduct


	public Map<String, Product> getCart() {
		return cart;
	}


	public void setCart(Map<String, Product> cart) {
		this.cart = cart;
	}
	
	
}//end of class ShoppingCart
