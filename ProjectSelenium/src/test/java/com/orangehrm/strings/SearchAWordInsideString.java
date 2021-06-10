package com.orangehrm.strings;

public class SearchAWordInsideString {

	/*public static void main(String[] args) {
String str = "hello java world";
System.out.println(str.contains("java"));
		
	}*/

	public static void main(String[] args) {
	   String strOrig = "Hello readers";
	      int intIndex = strOrig.indexOf("Hello");
	      
	      if(intIndex == - 1) {
	         System.out.println("Hello not found");
	      } else {
	         System.out.println("Found Hello at index " + intIndex);
	      }
	   }
	
	
}
