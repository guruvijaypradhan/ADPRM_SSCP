package com.adp.shoppingApp.model;
import java.util.Map;
import com.adp.shoppingApp.Imp.Product;

public interface IBilling  {

	void generateBill(Map<String,Product> cart);
	Double calculateTax(Double mrp,int quantity,String category);
	
}
