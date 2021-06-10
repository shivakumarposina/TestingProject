package javaPrograms;

public class NumberofDigits {
	public static void main(String args[]) {

		int number = 9912552;
		int count = 0;
		for (; number != 0; number /= 10, count++) {

		}
		System.out.println(count);
	}
}