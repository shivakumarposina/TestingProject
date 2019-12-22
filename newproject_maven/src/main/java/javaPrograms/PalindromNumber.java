package javaPrograms;

public class PalindromNumber {
	public static void main(String args[]) {
		int number = 12321;
		int a;
		int i = 0, j = 0;
		a = number;
		while (number > 0) {
			i = number % 10;
			j = j * 10 + i;
			number = number / 10;
		}
		if (j == a) {
			System.out.println("it is a palindrom number");
		} else {
			System.out.println("it is not palindrom");
		}
		
	}

}
