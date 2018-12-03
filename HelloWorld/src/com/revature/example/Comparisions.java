package com.revature.example;

import java.util.*;

import com.revature.comparision.CarMakeCompare;
import com.revature.transport.Car;



public class Comparisions {
		
		
		public static void main(String[] args) {
			List<Car> carList = new ArrayList<Car>();
			carList.add(new Car(2021,"spaceship", "Tesla", 50)); 
			carList.add(new Car(2007,"LessFancy", "Cadillac", 50)); 
			carList.add(new Car(1997,"Fiesta", "Ford", 500)); 
			carList.add(new Car(2007,"Fancy", "Cadillac", 50)); 
			
			System.out.println("Cars before sort: ");
			
			for(Car c: carList) {
				System.out.println(c);
			}
			
			sortWithComparator(carList, new CarMakeCompare());
		}

		static List<Car> sortWithComparable(List<Car> carList){
			Collections.sort(carList);
			
			System.out.println("Cars after sort: ");
			
			for(Car c: carList) {
				System.out.println(c);
			}
			
			
			return carList;
		}
		
		static void sortWithComparator(List<Car> carList, Comparator c) {
			Collections.sort(carList, c);
			
			System.out.println("Cars after sort with "+ c.getClass()+":");
			
			for(Car car: carList) {
				System.out.println(car);
			}
		}
}
