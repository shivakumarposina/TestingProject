package com.orangehrm.tests.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {
	public static void main(String args[]) {
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("Hyderabad");
		myList.add("chennai");
		myList.add("Bangalore");
		myList.add("vizag");

		myList.remove(0);
		myList.set(2, "Delhi");
		
		

		
		for(String obj : myList)
			System.out.println(obj);

	}

}
