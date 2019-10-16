package com.orangehrm.strings;

public class SplitSprintintoSubSprints {

	/*public static void main(String[] args) {
		String str = "shiva, suresh, raju, mahesh";
		String[] arrsplit = str.split(",");
		for (int i = 0;i<arrsplit.length; i++) {
			System.out.println(arrsplit[i]);
		}

	}*/
	
	/*public static void main(String[] args) {
		String str = "shiva, suresh, raju, mahesh";
		String[] arrsplit1 = str.split(",", 3);
		for (int i = 0;i<arrsplit1.length; i++) {
			System.out.println(arrsplit1[i]);
		}

}*/
	
	// split a straight by space
	public static void main(String[] args) {
		String str = "welcome to java world";
		String[] arrsplit2 = str.split("\\s");
		for (int i = 0;i<arrsplit2.length; i++) {
			System.out.println(arrsplit2[i]);
		}
		
		
	
}
}