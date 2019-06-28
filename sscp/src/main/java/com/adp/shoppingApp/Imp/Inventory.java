package com.adp.shoppingApp.Imp;
import java.util.Map;
import java.util.TreeMap;

import com.adp.shoppingApp.Imp.Product;

public class Inventory extends Product {

private	Map<String,Product> availableProducts=new TreeMap<String,Product>();
	
	public Inventory() {
		loadInventory();
	}//end of default constructor
	
	
	public Map<String, Product> getAvailableProducts() {
		return availableProducts;
	}


		
	public void updateQuantity(Product p,int q) {
		getAvailableProducts().get(p.getpId()).setpQuantity(q);
	}//end of method updateQuantity

	private void loadInventory() {		 
        Product p1 =new Product();
        p1.setpCategory("A");
        p1.setpDescription("Vigo Helmat");
        p1.setpDirectTax(2);
        p1.setpDiscountedPrice(Double.valueOf(100.00));
        p1.setpDiscountedPercentage(10);
        p1.setpId("A_000001");
        p1.setpName("Helmat");
        p1.setpPercentageTax(10f);
        p1.setpMRP(Double.valueOf(100.00));
        p1.setpQuantity(20);
        
        System.out.println(p1.toString());
        
        Product p2 =new Product();
        p2.setpCategory("B");
        p2.setpDescription("Vigo cooler");
        p2.setpDirectTax(6);
        p2.setpDiscountedPrice(Double.valueOf(300.00));
        p2.setpDiscountedPercentage(10);
        p2.setpId("B_000001");
        p2.setpName("cooler");
        p2.setpPercentageTax(10f);
        p2.setpMRP(Double.valueOf(200.00));
        p2.setpQuantity(40);
        
        availableProducts.put(p1.getpId(),p1);
        availableProducts.put(p2.getpId(),p2);
		
	}// end of method loadInventory
	
}// end of class Inventory
