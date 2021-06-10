package com.orangehrm.tests.samplenew;

public class Palindrom {
	public static void main(String args[]) {
		int number = 12321;
		int reversedInteger = 0;
		int originalInteger = number;
		int remainder;
		for (; number != 0; number /= 10) {
			remainder = number % 10;
			reversedInteger = reversedInteger * 10 + remainder;

		}
		if (originalInteger == reversedInteger) {
			System.out.println("Number is a palindrom");

		} else {
			System.out.println("Number is not a palindrom");
		}
	}

}
