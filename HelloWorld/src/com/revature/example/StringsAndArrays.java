package com.revature.example;

import java.util.Arrays;

import com.revature.transport.Car;
import com.revature.transport.Kayak;
import com.revature.transport.Tornado;
import com.revature.transport.Vehicle;

public class StringsAndArrays {

	public static void main(String[] args) {
		
		int n=10001;  
		int currentNumber=2; 
		boolean isAPrime=true; 
		int primeCount = 0; 

		
		while(primeCount<n) {
			
				isAPrime = true; 
				
				// Check from 2 to n-1 
		        for (int j = 2; j <= currentNumber/2; j++) {
		            if (currentNumber % j == 0) {
		            	isAPrime = false;  
		            	break; 
		            }
		        }
		        
		        currentNumber++; 
		        if(isAPrime) {
		        	primeCount++; 
		        }
		}
		
		int lastPrime = currentNumber-1; 
		System.out.println("number after loop: "+lastPrime); 
			
		
		/*
		String string= new String("(223). 456-7890"); 
		StringBuilder strBuilder = new StringBuilder();
		
		String[] numbers = string.split("[() -.]+");
		
		for (int i = 0; i < numbers.length; i++) {
			   strBuilder.append(numbers[i]);
			}
	  
	     
	    
	    char nine = '9'; 
	    
	    int num = nine-'0'; 
	    
	    System.out.println(num);
		
		funWithStrings();
		*/
	}
	
	static void funWithArrays() {
		String[] arr1 = {"this", "is", "an", "array"};
		
		for (String s : arr1) {
			System.out.println(s);
		}
		
		/*
		 * augmented (enhanced) for loops - moving through an Array or Iterable
		 */
		String[] arr2 = new String[4]; 
		arr2[0]="element 0"; 
		for(int i=0; i<arr2.length; i++) {
			arr2[i]="element "+i; 
		}
		
		System.out.println(arr2.toString()); 
		System.out.println(Arrays.toString(arr2));
		
		int[][] arr3 = new int[4][3];
		arr3[0][0] = 7; 
		arr3[0][2] = 8; 
		arr3[3][0]= 9; 
		arr3[3][2]= 10; 
		
		for (int[]a : arr3) {
			System.out.println(Arrays.toString(a));
		}
		
		Vehicle[] vehicles = new Vehicle[4]; 
		System.out.println(Arrays.toString(vehicles)); // all null for now -default value for all reference type 
		//vehicles[2].move(); // complies just fine, declared type is Vehicle but throws NullPointerException at runtime
		
		vehicles[0] = new Tornado(147.2);
		vehicles[1] = new Kayak("red",4.2,2,2);
		vehicles[2] = new Car(2021, "spaceship", "Tesla", 50);
		vehicles[3] = new Tornado(256.4);
	}
	
	static void funWithStrings() {
		// string literal
		String a = "hello";
		String b = new String("hello");
		
		/*
		 * .equals () is inherited from Object
		 * most reference types override to define "equality"
		 * (usually by the fields)
		 * 
		 */
		
		System.out.println("string a is equal to string b: "+a.equals(b)); 
		
		/*
		 * == is good for comparing primatives
		 * or checking whether two objects are the same object
		 * (compare the reference)
		 */
		
		System.out.println("string a is the same object as string b: " + (a==b));
		
		// a and be are two different object pointing to the same literal in the string pool
		
		/*
		 * String API methods
		 * substring
		 * concat
		 * toUpperCase
		 * toLowerCase
		 * replace
		 * indexOf
		 * split
		 * trim
		 */
		
		String test1 = "hello world"; 
		
		System.out.println(test1.toUpperCase());
		
		String test2 = "HeLlO WoRlD";
		
		System.out.println(test2.toLowerCase());
		
		System.out.println(test1.substring(3,8));
		
		System.out.println(test1.concat(test2));
		
		System.out.println(test1.replace('l','p'));
		System.out.println(test1.indexOf('l'));
		
		String test3 = "the quick brown fox jumped over the lazy dog";
		
		String[] words = test3.split(" ");
	
		for (String w: words) {
			System.out.println(w);
		}
	}


}
