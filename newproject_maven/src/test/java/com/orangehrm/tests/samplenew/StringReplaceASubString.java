package com.orangehrm.tests.samplenew;

public class StringReplaceASubString {
	public static void main (String args[]) {
		String str = "Hello World";
		System.out.println(str.replace('H', 's'));
		System.out.println(str.replaceFirst("Hello", "shiva"));
		System.out.println(str.replaceAll("World", "Siva"));
	}

}
