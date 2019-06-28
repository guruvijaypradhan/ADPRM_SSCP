package com.adp.shoppingApp.Imp;
import java.math.BigDecimal;

import com.adp.shoppingApp.model.IProduct;;

abstract class AbstractProduct implements IProduct{

	@Override
	public String getPId() {
		return null;
	}

	@Override
	public String setPID(String id) {
		return id;
		
	}

	@Override
	public String getPName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPCategory(String category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal getPPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPPrice(BigDecimal mrp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal getPDiscountedPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPDiscountedPrice(BigDecimal discountedPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getPDiscountPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPDiscountPercentage(Integer discountPErcentage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getPDirectax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPDirectax(Integer dTax) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getPPercentagetax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPPercentagetax(Integer pTax) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}//end of abstract class Product
