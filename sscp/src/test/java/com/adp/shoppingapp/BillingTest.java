package com.adp.shoppingapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.adp.shoppingApp.Imp.Billing;
import com.adp.shoppingApp.model.IBilling;

/**
 * Unit test for simple App.
 */
public class BillingTest {
    /**
     * Rigorous Test :-)
     * 
     * 
     */
	
	IBilling billing;
	
	
	
	@Before
	public void setup() {
		System.out.println("1");
		
		billing = new Billing();
		
	}
	
    @Test
    public void calculateTax() {
    	System.out.println("2");
    	assertNotNull(billing.calculateTax(new Double(50), 2, "B"));
    	assertEquals(new Double("20.0"), billing.calculateTax(new Double(50), 2, "B"));    	
    }
}
