package com.orangehrm.strings;

public class NumberCount {

	public static void main(String[] args) {

		int number = 1234556789;
		int count = 0;
		while(number!= 0) {
			number= number/10;
			count++;
		}
		System.out.println(count);
			
			
			
		}	

	}


