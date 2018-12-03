package com.revature.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    reverse("I'm hungry!"); 
	    
	    char[][] newString = new char[][] {{'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'}, 
			{'D','G'}}; 
			
			System.out.println(newString[0].length);
			
			System.out.println(newString[1].length);
	   
	}

	public static String reverse(String string) {

		char[] charArray = new char[string.length()];
		
		for (int i=0; i<string.length(); i++) {
			
			charArray[i]=string.charAt(string.length()-i-1); 
		}
		
		String reversed = new String(charArray); 
		
		System.out.println(reversed);

		return null;
	}
}
