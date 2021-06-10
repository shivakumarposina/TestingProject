package com.orangehrm.tests.samplenew;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String a = "siva";
		String b = "kumar";
		a = a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("a is : "+a+b);
		System.out.println("b is : "+b);
		
	}

}
