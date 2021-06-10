package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;
		int a;
		int i = 0;
		int j = 0;
		a = number;
		while (number > 0) {
			i = number % 10;
			j = j + (i * i * i);
			number = number / 10;

		}
		if (j == a) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("not a armstrong");
		}
	}

}
