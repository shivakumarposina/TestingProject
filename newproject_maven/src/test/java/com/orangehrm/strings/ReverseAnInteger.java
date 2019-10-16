package com.orangehrm.strings;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse Number is:"  + rev);
		
		long num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
