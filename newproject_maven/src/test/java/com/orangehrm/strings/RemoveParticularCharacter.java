package com.orangehrm.strings;

public class RemoveParticularCharacter {
	public static void main (String args[]) {
		String str = "posina siva kumar";
		System.out.println(removeCharAt(str, 4));
	}

	private static String removeCharAt(String str, int p) {
		return str.subSequence(0, p)+ str.substring(p+1);
	}

}
