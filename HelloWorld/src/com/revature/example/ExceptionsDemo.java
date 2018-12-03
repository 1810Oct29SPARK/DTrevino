package com.revature.example;


import com.revature.transport.*; 

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		Car myCar = new Car(2021, "Elantra", "Hyundai", 50);
		
		// in Car, change overridden move() from vehicle so that a MaintenenceException 
		// can be thrown if oil has not been changed recently
		// use a try-catch to handle potential exceptions
		// drive around for a bit
		
		myCar.setMilesSinceOilChange(5500);
		
		try {
			myCar.move();
			System.out.println(myCar);
		} catch (MaintenenceException m) {
			m.printStackTrace();
			myCar.setMilesSinceOilChange(0);
			
			try {
				myCar.move();
			} catch (MaintenenceException e) {
				e.printStackTrace();
			}
		}
		
	}

}
