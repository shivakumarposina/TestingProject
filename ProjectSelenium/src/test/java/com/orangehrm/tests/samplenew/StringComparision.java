package com.orangehrm.tests.samplenew;

public class StringComparision {

	public static void main(String[] args) {
		String a = "sivakumar";
		String b = "kumarsiva";
		String c = "sivakumar";
		String d = "Sivakumar";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(d));
		System.out.println(a==b);
		System.out.println(a==c);
	}

}
