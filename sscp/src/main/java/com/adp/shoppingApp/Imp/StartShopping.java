package com.adp.shoppingApp.Imp;

import java.util.Map;
import java.util.TreeMap;

public class StartShopping {

	ShoppingCart sc=new ShoppingCart();
	Inventory inventory;
	
	StartShopping(Inventory inventory){
		this.inventory=inventory;
		showInventory();
		ShowMenu.showShoppingMenu(this);
		
		
	}// end of parameterised constructor
	void showInventory() {
		Print.printStar();
		Print.printMessage("Available products in inventory are -");
		Print.printInventoryHeader();
		for(Map.Entry<String,Product> inventoryProduct : this.inventory.getAvailableProducts().entrySet()) {
			Product p=inventoryProduct.getValue();
			Print.printInventory(p);
		}//end of loop
		
	}// end of method showInventory
	
	 void addProducts() {
		Print.printMessage("Please select product to add into cart");
		int i=1;
		Map<Integer,Product> selectFrom=new TreeMap<Integer,Product>();
		for(Map.Entry<String,Product> inventoryProduct : this.inventory.getAvailableProducts().entrySet()) {
			Product p=inventoryProduct.getValue();
			selectFrom.put(i, p);
			Print.printMessage(i+ "==> "+p.getpId()+" | "+ p.getpName()+"  | "+p.getpQuantity()+" | "+p.getpMRP());
			i++;
			
		}//end of loop
		Print.printMessage("0 ==> cancel");
		int selectedProduct=UserInput.takeInput();
		
		 if(selectFrom.containsKey(selectedProduct))
		 {
			 int availableQuantity=selectFrom.get(selectedProduct).getpQuantity();
			 Print.printMessage("Please select quantity. Available quantity is  "+availableQuantity);
				int quantity=UserInput.takeInput();
				if(availableQuantity >= quantity && quantity >0) {
					
					if(sc != null  && sc.getCart().containsKey(selectFrom.get(selectedProduct).getpId()) ) {
						selectFrom.get(selectedProduct).setpQuantity(quantity+selectFrom.get(selectedProduct).getpQuantity());
					}
					else	{					
					selectFrom.get(selectedProduct).setpQuantity(quantity);
					}
					
					this.sc.addProduct(new Product (selectFrom.get(selectedProduct)));
					inventory.updateQuantity(selectFrom.get(selectedProduct), availableQuantity - quantity);
					Print.printMessage("Product added successfully !");
				}//end of inner if
				else {Print.printMessage("You have selected wrong quantity. Please retry.");Print.printStar();
				}
		 }//end of if
		 else {
			 Print.printMessage("Selected unavailable product. Please retry.");Print.printStar();
		 }
		//sc.showCart(sc);
	}//end of method addProducts
	
	void removeProducts() {
		int i=1;		
		Map<Integer,Product> selectFrom=new TreeMap<Integer,Product>();
		//is cart empty
		if(!sc.getCart().isEmpty()) {
			sc.showCart(sc);
			Print.printStar();
			Print.printMessage("Please select from above product to remove from cart");
			
		for(Map.Entry<String,Product> cartProduct : this.sc.getCart().entrySet()) {
			Product p=cartProduct.getValue();
			selectFrom.put(i, p);
			Print.printMessage(i+ "==> "+p.getpId()+" | "+ p.getpName()+"  | "+p.getpQuantity());
			i++;
			
		}//end of loop
		Print.printMessage("0 ==> cancel");
		int selectedProduct=UserInput.takeInput();		
		 if(selectFrom.containsKey(selectedProduct))
		 {	int remainingInventoryQuantity=this.inventory.getAvailableProducts().get(selectFrom.get(selectedProduct).getpId()).getpQuantity();
			 int removalQuantity=selectFrom.get(selectedProduct).getpQuantity();
			 Print.printMessage("Please select quantity. Removable quantity is  "+removalQuantity);
				int quantity=UserInput.takeInput();
				if(removalQuantity >= quantity && quantity >0) {
					//is product already into cart
					if(sc != null  && sc.getCart().containsKey(selectFrom.get(selectedProduct).getpId()) ) {
						selectFrom.get(selectedProduct).setpQuantity(selectFrom.get(selectedProduct).getpQuantity()-quantity);
						inventory.updateQuantity(selectFrom.get(selectedProduct), remainingInventoryQuantity + quantity);
					
						// if quantity 0 then remove product
						if(selectFrom.get(selectedProduct).getpQuantity() ==0) {
							sc.removeProduct(selectFrom.get(selectedProduct));
						}
						Print.printMessage("Product removal success !");
					}
					else	{					
						Print.printMessage("Please select a valid option.");Print.printStar();
						}
						
				}//end of  if
				else {Print.printMessage("You have selected wrong quantity. Please retry.");Print.printStar();
				}
		 }//end of if
		 else {
			 if(selectedProduct !=0 ) Print.printMessage("Selected unavailable product. Please retry.");Print.printStar();
		 }
		}//end of if
		else {
			Print.printMessage("Cart is empty. Can not remove from empty product");Print.printStar();
		}
	}//end of method removeProducts
	
	
	
}// end of class StartShopping
