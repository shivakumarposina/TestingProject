package com.orangehrm.strings;

public class DeleteSpecialCharacters {

	public static void main(String[] args) {
		String s ="@*%$#@ Have a nice day";
		s= s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s);
	}
	


}
