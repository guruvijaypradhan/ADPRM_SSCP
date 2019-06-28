package com.adp.shoppingApp.Imp;

import java.util.Date;
import java.util.Map;

import com.adp.shoppingApp.model.IBilling;
public class Billing implements IBilling {
	private int srNo=0;
	private Double totlaBilledAmount=0d;
	private Double totalTaxDeducted=0d;
	private String billId;
	private Date billingDate;

	@Override
	public void generateBill(Map<String, Product> cart) {
		if(!cart.isEmpty()) {
		Print.printStar();
		Print.printMessage("Bill id- "+this.billId+"\t\t\t Bill date - "+billingDate);
		Print.printBillHeader();
		for(Map.Entry<String,Product> cartProduct : cart.entrySet()) {
			Product p=cartProduct.getValue();
		double taxForProduct=	calculateTax(p.getpMRP(),p.getpQuantity(),p.getpCategory());
			Print.printBill(p,++srNo,taxForProduct);
			totlaBilledAmount=totlaBilledAmount+(p.getpMRP()*p.getpQuantity());
			calculateTax(p.getpMRP(),p.getpQuantity(),p.getpCategory());
			totalTaxDeducted=totalTaxDeducted+taxForProduct;
			
		}//end of loop
		Print.printMessage("Total Tax Amount : "+totalTaxDeducted.toString());
		Print.printMessage("Billed Amount : "+totlaBilledAmount.toString());
		Print.printMessage("Final Bill Amount : "+calculateFinalAmount() .toString());
		Print.printStar();
		cart=null;
		}//end of if
		else {
			Print.printMessage("Cart is empty. Please add few items.");
			Print.printStar();
		}
		
	}// end of overridden method  generateBill

	@Override
	public Double calculateTax(Double mrp,int quantity,String category) {
		
		switch (category) {
		case "A":
			return (mrp*quantity*.1);
		case "B":
			return (mrp*quantity*.2);
			
		default:
			return 0d;
		}// end of switch
		
	}//end of method calculateTax

	public Double calculateFinalAmount() {
		  return totlaBilledAmount+totalTaxDeducted;
	
	}//end of method calculateFinalAmount
	
	
	
	
}// end of class Billing
