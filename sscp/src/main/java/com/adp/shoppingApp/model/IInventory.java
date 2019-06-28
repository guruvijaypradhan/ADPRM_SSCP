package com.adp.shoppingApp.model;
import com.adp.shoppingApp.model.IProduct;

public interface IInventory extends IProduct{
	
	// product quantity available
	Integer getProductQuantity();
	Integer setProductQuantity();

}// end of interface IInventory
