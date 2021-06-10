package com.orangehrm.tests.sample;

public class DuplicateString {

public static void main(String[] args) {
	String str = "selenium";
	int number = 0;
	char[] abc = str.toCharArray();
	System.out.println("Duplicate numbers in strin are:");
	for(int i= 0; i<str.length(); i++) {
		for(int j=i+1; j<str.length(); j++) {
			if(abc[i]==abc[j]) {
				System.out.println(abc[j]);
				number++;
				break;
			}
			
		}
	}
	
			}
		}





