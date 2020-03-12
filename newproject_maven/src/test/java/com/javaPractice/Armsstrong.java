package com.javaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Armsstrong {
	public static void main (String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maths");
		al.add("Physics");
		al.add("Chemistry");
		al.add("Social");
		al.add("English");
		System.out.println(al);
	al.remove("Physics");
	System.out.println(al);
	System.out.println(al.size());
	Iterator itr = al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	

		}
			
	
}	
	
		
		
	
		
	
	
		
	
	




