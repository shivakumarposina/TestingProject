package com.orangehrm.strings;

public class ReverseString {

/*	public static void main(String[] args) {
String str = "selenium";
int len =str.length();
String reverse = "";
for (int i =len-1; i>=0;i--) {
	reverse = reverse+str.charAt(i);
	
	
	
}
System.out.println(reverse);

	}*/
	
	
	public static void main (String args[]) {
		String str = "selenium";
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(str1.reverse());
		
		
	}

}
