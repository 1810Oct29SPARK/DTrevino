package com.revature.example;

public class HelloWorld {

	public static void main(String[] args) {
		
		   Calculator Calc = new Calculator();
           //2. call each of Calculator's instance methods: add, subtract, multiply, and  divide
           // with arguments of your choice, assigning the result to the variables below
		   
		   System.out.println(Calc.toString());

           double arg0 = 2.5;
           double arg1 = 2.0;

           double additionResult = Calc.add(arg0,arg1);
           double subtractionResult = Calc.subtract(arg0, arg1);
           double multiplicationResult = Calc.multiply(arg0,arg1);
           double divisionResult = Calc.divide(arg0,arg1);
           
           String s = "5"; 
           Double d  = Double.parseDouble(s);
           
           System.out.println(d.getClass());

           //3. print the value of each of these variables to the console with a descriptive message

           System.out.println(additionResult);
           System.out.println(subtractionResult);

           System.out.println(multiplicationResult);
           System.out.println(divisionResult);

	}
	
 }




