package com.revature.calculator;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator c; 
	
	@Before
	public void setCalculator() {
		this.c = new Calculator(); 
	}

	/*
	 * TDD: 
	 * red-green refactoring
	 * start with requirement, write test, build code to match
	 * 
	 * Calculator requirements: 
	 * (calculator class)
	 * 1. has an add() method which takes a String parameter
	 * and returns a String
	 * 2. calling add("") returns
	 * 3. Calling add() with null returns zero
	 * 4. calling add() with > 2 arguments ignores extra
	 * 5. calling add() with incorrect characters (anything but , and Doubles) 
	 * throws exception
	 */
	
	@Test 
	public void executeAddMethod() {
		assertTrue(c.add("") instanceof Double);
		
	}
	
	@Test
	public void emptyStringReturnsZero() {
		assertEquals(0,c.add(""),.001); // floating-point assertions require an off
		c.add("12.9,15.3,12.9,15.3"); 
	}
	
	@Test
	public void twoNumbersReturnsSum() {
		assertEquals(28.2,c.add("12.9,15.3"),.001); 
		
		
	}
	
	
}
