package com.adp.shoppingApp.Imp;


public class ShowMenu {

	static void mainMenu() {
		
		 int menuOption=0;
	        
	        do {
	        	Inventory inventory=new Inventory();
	        	
	        		Print.printMessage("1==> To start shopping\n0==> Exit");
	        		//Print.printMessage("Press 2 : To start billing");
	        		
	        		menuOption=UserInput.takeInput();
	        		
	        		
	        		switch(menuOption) {
	        		case 0:Print.printMessage("Exit completed");
	        				break;
	        		case 1:new StartShopping(inventory);
	        				break;
	        		default:Print.printMessage("Please select a valid menu option ");
	        		
	        		}//end of switch
	        	
	        }while(menuOption!=0);
	       
		
	}// end of static method shoppingMenu
	
	static void showShoppingMenu(StartShopping ss) {
		int menuOption=0;
		 
	        
	        do {
	        		Print.printStar();
	        		Print.printMessage("Shopping Menu , Please select from below -");
	        		Print.printMessage("1==> To Add");
	        		Print.printMessage("2==> To Remove");
	        		Print.printMessage("3==> To Show Cart");
	        		Print.printMessage("4==> To Bill");
	        		Print.printMessage("0==> To Exit");
	        		Print.printStar();
	        		menuOption=UserInput.takeInput();
	        		switch(menuOption) {
	        		case 0: Print.printMessage("Exit completed");
	        				break;
	        		case 1: ss.addProducts();
	        				break;
	        		case 2:ss.removeProducts();
	        				break;
	        		case 3:ss.sc.showCart(ss.sc);
	        				break;
	        		case 4: new Billing().generateBill(ss.sc.getCartForBilling());
	        				menuOption=0;
	        				Print.printMessage("Thankyou! Visit again.");
	        				break;
	        		default:Print.printMessage("Please select a valid menu option "+menuOption);
	        		
	        		}//end of switch
	        	
	        }while(menuOption!=0);
	}// end of static method showShoppingMenu
	
}//end of class ShowMenu
