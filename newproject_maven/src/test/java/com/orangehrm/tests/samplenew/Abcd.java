package com.orangehrm.tests.samplenew;

public class Abcd {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
			System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
			System.out.print(i + " ");
			}
			System.out.println(" ");
}
	}	}