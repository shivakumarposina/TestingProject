package javaPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class CountwordsInString {
	public static void main (String aargs[]) {
	String str = "aaabbccd";
	int count = 0;
	char temp;
	temp= str.charAt(0);
	for(int i= 0; i<str.length(); i++) {
		if(str.charAt(i)==temp) 
			count++;
		else {
			System.out.print(temp+""+count);
			count=1;
			temp = str.charAt(i);
			
		}
	}
	System.out.print(temp+""+count);

	
	}

}
