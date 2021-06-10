package com.stringprograms;

public class SwapString {

	public static void main(String[] args) {
		String a = "siva";
		String b = "kumar";
		a= a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("afte swapping :");
		System.out.println(a);
		System.out.println(b);

	}

}
