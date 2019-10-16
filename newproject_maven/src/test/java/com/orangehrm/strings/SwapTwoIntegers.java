package com.orangehrm.strings;

public class SwapTwoIntegers {

	public static void main(String[] args) {

		int x = 55;
		int y = 25;

// with using third variable
//	int t;
//	t = x;
//	x= y;
//	y= t;
//	System.out.println(x);
//	System.out.println(y);

		// With out using variable,using with + operator
//		x= x+y;
//		y= x-y;
//		x= x-y;

//		System.out.println("x value is : "+x);
//		System.out.println("y value is : "+y);

		// using with * operator
//		x = x * y;
//		y = x / y;
//		x = x / y;
//		System.out.println("x value is : "+x);
//	System.out.println("y value is : "+y);
		
		//using with xor
		x= x^y;
		y= x^y;
		x= x^y;
		System.out.println("x value is : "+x);
		System.out.println("y value is : "+y);
		

	}

}
