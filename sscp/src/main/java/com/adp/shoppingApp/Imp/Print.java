package com.adp.shoppingApp.Imp;


import com.adp.shoppingApp.Imp.Product;

public class Print {

	static void printStar() {
		System.out.println("\n*********************************************************************************\n");		
	}// end of static method printStar
	static void printBillHeader() {
		System.out.println("SrNo |"+"   Id"+"     |  "+"Name"+"          |  "+"Qty  "+"| U Price"+"  "+" | F Price"+" | "+"Tax deducted");
				
	}//end of static method printBillHeader
	
	static void printBill(Product p,int srNo,double taxForProducts){
		
		System.out.println(srNo+"   | "+p.getpId()+" | "+p.getpName()+"		|  "+p.getpQuantity()+"   |	"+p.getpMRP()+"  | "+p.getpMRP()*p.getpQuantity()+"  | "+taxForProducts);
		
		
	}// end of static method printBill
	
	static void printMessage(String k) {
		System.out.println(k);
	}//end of static method printMessage
	
	static void printFormattedString(Object j) {
		System.out.println(" %.2f"+j);
	}//end of static method printFormattedString
	
	static void printInventoryHeader() {
		System.out.println("   Id"+"     |  "+"Name"+"          |  "+"Availble Qty  "+"| U Price"+"  "+" Category");
				
	}//end of static method printInventoryHeader
	static void printInventory(Product p) {
		System.out.println(p.getpId()+" | "+p.getpName()+"		|  "+p.getpQuantity()+"   |	"+p.getpMRP()+"  | "+p.getpCategory());
	}//end of static method printInventory
	
}// end of class Print
