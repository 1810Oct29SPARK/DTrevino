package com.revature.calculator;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Double add(String toAdd) {
		
		Double sum = 0.0; 
	
		
		if (!toAdd.equals("")) {
			// split the string toAdd on a , delimiter
			String[] numbers = toAdd.split(",");
			
			for(String number : numbers) {
				
				sum += Double.parseDouble(number);	
			}
		}
		
		//parse the values as Doubles
		//return their sum
		return 0.0;
	}

}
