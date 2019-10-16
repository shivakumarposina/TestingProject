package com.orangehrm.strings;

public class ReplaceSubStringInString {
	public static void main (String args[]) {
		String str = "java world";
		System.out.println(str.replace('v', 'a'));
		System.out.println(str.replace('j', 'b'));
		System.out.println(str.replaceAll("java", "cova"));
	}

}
