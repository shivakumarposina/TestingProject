package com.orangehrm.strings;

public class LargestNumberInArray {

	public static void main(String[] args) {
double numberArray[] = { 23.7,45.6,89.56,-23.3,77.4};
double largest =  numberArray[0];
for(double num : numberArray ) {
	if(largest < num)
		largest = num;
}
System.out.format("Largest element = %.2f", largest);

	}

}
