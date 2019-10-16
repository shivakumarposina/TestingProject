package com.orangehrm.tests.samplenew;

public class StringRemoveCharacter {
	public static void main (String args[]) {
		String str = "this is java";
		System.out.println(removeCharAt(str,3));
		
	}

	private static String removeCharAt(String a, int b) {
		
		return a.substring(0, b)+ a.substring(b+1);
	}



}
