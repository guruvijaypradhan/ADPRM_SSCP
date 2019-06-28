package com.adp.shoppingApp.Imp;

public class Product  {

	private String pId;
	private String pName;
	private String pDescription;
	private String pCategory;
	private Double pMRP;
	private Double pDiscountedPrice;
	private float pDiscountedPercentage;
	private float pDirectTax;
	private float pPercentageTax;
	private int pQuantity;
		
	public Product() {
		
	}//end of default constructor
	
	public Product(Product p) {
		this.pId = p.pId;
		this.pName = p.pName;
		this.pDescription = p.pDescription;
		this.pCategory = p.pCategory;
		this.pMRP = p.pMRP;
		this.pDiscountedPrice = p.pDiscountedPrice;
		this.pDiscountedPercentage = p.pDiscountedPercentage;
		this.pDirectTax = p.pDirectTax;
		this.pPercentageTax = p.pPercentageTax;
		this.pQuantity = p.pQuantity;
	}
	
	public Product(String pId, String pName, String pDescription, String pCategory, Double pMRP,
			Double pDiscountedPrice, float pDiscountedPercentage, float pDirectTax, float pPercentageTax,
			int pQuantity) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDescription = pDescription;
		this.pCategory = pCategory;
		this.pMRP = pMRP;
		this.pDiscountedPrice = pDiscountedPrice;
		this.pDiscountedPercentage = pDiscountedPercentage;
		this.pDirectTax = pDirectTax;
		this.pPercentageTax = pPercentageTax;
		this.pQuantity = pQuantity;
	}


	public int getpQuantity() {
		return pQuantity;
	}


	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}


	public String getpId() {
		return pId;
	}


	public void setpId(String pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpDescription() {
		return pDescription;
	}


	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}


	public String getpCategory() {
		return pCategory;
	}


	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}


	public Double getpMRP() {
		return pMRP;
	}


	public void setpMRP(Double pMRP) {
		this.pMRP = pMRP;
	}


	public Double getpDiscountedPrice() {
		return pDiscountedPrice;
	}


	public void setpDiscountedPrice(Double pDiscountedPrice) {
		this.pDiscountedPrice = pDiscountedPrice;
	}


	public float getpDiscountedPercentage() {
		return pDiscountedPercentage;
	}


	public void setpDiscountedPercentage(float pDiscountedPercentage) {
		this.pDiscountedPercentage = pDiscountedPercentage;
	}


	public float getpDirectTax() {
		return pDirectTax;
	}


	public void setpDirectTax(float pDirectTax) {
		this.pDirectTax = pDirectTax;
	}


	public float getpPercentageTax() {
		return pPercentageTax;
	}


	public void setpPercentageTax(float pPercentageTax) {
		this.pPercentageTax = pPercentageTax;
	}


	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDescription=" + pDescription + ", pCategory="
				+ pCategory + ", pMRP=" + pMRP + ", pDiscountedPrice=" + pDiscountedPrice + ", pDiscountedPercentage="
				+ pDiscountedPercentage + ", pDirectTax=" + pDirectTax + ", pPercentageTax=" + pPercentageTax
				+ ", pQuantity=" + pQuantity + "]";
	}


	


	
	

}// end of class Product
