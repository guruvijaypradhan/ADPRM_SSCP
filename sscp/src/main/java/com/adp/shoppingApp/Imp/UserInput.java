package com.adp.shoppingApp.Imp;

import java.util.Scanner;

public class UserInput {
	static Scanner sc = new Scanner(System.in); 
	static int takeInput() {
	 sc = new Scanner(System.in);  
	int inputvalue;
	try
	{		
		inputvalue=sc.nextInt();	
		
	}catch(Exception InputMismatchException) {
				
		inputvalue=0;		
	}//end of catch
	finally {
		//sc.close();
	}//end of finally
	return inputvalue;
	}// end of method takeInput
	
	static void closeConnection() {
		if(sc!= null) sc.close();
		Print.printMessage("Connection closed ");
	}// close connection
}//end of class UserInput
