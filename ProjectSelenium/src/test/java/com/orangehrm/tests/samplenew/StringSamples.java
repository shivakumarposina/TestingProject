package com.orangehrm.tests.samplenew;

public class StringSamples {

	public static void main(String[] args) {
		String a = "sivakumar";
		String c  = "@fnf#fjfof%dgdkg*";
		String str = "This is index of method";
		String str1 = "Hello World";
		String str2 = "siva";
		String str3 = "kumar";
		String d = "siva-kumar-posina";
		
	//for  replace character and delete character	
		// a =a.replace("a", "");
		//System.out.println(a);
		
		
		
		//for delete all special characters
		//c= c.replaceAll("[^a-z,A_Z,0-9]", "");
		//System.out.println(c);
		
		// for upper case
		//a= a.toUpperCase();
		//System.out.println(a);
		
		//for index position
		//int index1 =str.indexOf('i');
		//int index2 = str.indexOf("index");
		//int index3 = str.lastIndexOf('x');
		//int index4 = str.lastIndexOf("is", 4);
		//System.out.println(index1);
		//System.out.println(index2);
		//System.out.println(index3);
		//System.out.println(index4);
		
		//for string reverse
		// int len = a.length();
		// String rev = ""; 
			//	 for(int i= len-1; i>=0;i--) {
				//	 rev=rev+a.charAt(i);
				// }
					 
		//System.out.println(rev);
		//StringBuffer buffer = new StringBuffer(a);
				//buffer = buffer.reverse();
				//System.out.println(buffer);
		
		
		//String comparision
		//System.out.println(a.equals(c));
	//	System.out.println(a.equalsIgnoreCase(d));
		//System.out.println(a==b);
		//System.out.println(a==c);
				
		
		//string replace a sub string
		//System.out.println(str1.replace('H', 's'));
		//System.out.println(str1.replaceFirst("Hello", "shiva"));
		//System.out.println(str1.replaceAll("World", "Siva"));
		
		
		// swap two strings
		//str2 = str2+str3;                                      a= a+b;
		//str3 = str2.substring(0, str2.length()-str3.length()); b=a.substring(0,a.length()-b.length());
		//str2 = str2.substring(str3.length());                  a= a.substring(b'length());
		//System.out.println("str2 is"  +str2);                  System.out.println("a is"  +a);
		//System.out.println("str3 is"  +str3);                  System.out.println("b is"  +b);
		
		
		//Split string
		//for(String split : d.split("-")) {  //using regex method
			//System.out.println(split);
		//}
		
		
		
		
		//for delete character using string builder(we r having replace method also here)
		//StringBuilder builder = new StringBuilder(a);
		//builder.deleteCharAt(0);
		//System.out.println(builder);
		

	}

}
