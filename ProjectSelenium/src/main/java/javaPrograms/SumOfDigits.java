package javaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 1234567;
		int i = 0, j = 0;
		while (number > 0) {
			i = number % 10;
			j = j + i;
			number = number / 10;
		}
		System.out.println(j);
	}

}
