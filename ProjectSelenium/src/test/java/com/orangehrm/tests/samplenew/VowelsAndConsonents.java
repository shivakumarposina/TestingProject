package com.orangehrm.tests.samplenew;

public class VowelsAndConsonents {
	public static void main (String[]args) {
		int vowels = 0; int consonents = 0;
		String str1 = "World is Flying Flying";
		str1 = str1.toLowerCase();
		for(int i = 0;i< str1.length();i++) {
			if(str1.charAt(i)== 'a'||str1.charAt(i)== 'e'||str1.charAt(i)== 'i'||str1.charAt(i)== 'o'||str1.charAt(i)== 'u') {
				vowels++;
				
			}else if(str1.charAt(i)>='a'&& str1.charAt(i)<='z') {
				consonents++;
			}
		}
		System.out.println("Number of vowels is  :  "+vowels);
		System.out.println("Number of consonents is  :  "+consonents);
		
	}

}
