package com.adp.shoppingApp.model;

import java.math.BigDecimal;

public interface IProduct {
	
	// product unique id
	String getPId();
	String setPID(String id);
	
	// product name
	String getPName();
	void setPName(String name);
	
	// product description
	String getPDescription();
	void setPDescription(String description);
	
	// product category
		String getPCategory();
		void setPCategory(String category);
	
	// product actual price
	BigDecimal getPPrice();
	void setPPrice(BigDecimal mrp);
	
	// product discounted price
	BigDecimal getPDiscountedPrice();
	void setPDiscountedPrice(BigDecimal discountedPrice);
	
	// product discounted percentage
	Integer getPDiscountPercentage();
	void setPDiscountPercentage(Integer discountPErcentage);
	
	
	// product direct tax
	Integer getPDirectax();
	void setPDirectax(Integer dTax);
	
	// product tax in percentage
	Integer getPPercentagetax();
	void setPPercentagetax(Integer pTax);
	
	
	
	
	
	
	
	
}// end of Interface IProduct
