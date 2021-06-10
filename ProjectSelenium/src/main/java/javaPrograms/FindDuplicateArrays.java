package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArrays {

	public static void main(String[] args) {
		String names [] = { "java", "c,", "javaScript", "java"};
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is :" +name);
			}
				
			}
		

	}

}
