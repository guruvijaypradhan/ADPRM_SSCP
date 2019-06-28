package com.adp.shoppingApp.model;
import java.util.Map;
import com.adp.shoppingApp.Imp.Product;;

public interface IShoppingCart{
	
	void addProduct(Product p);
	void removeProduct(Product p);
	Map<String,Product> getCartForBilling();

}// end of interface IShoppingCart
