package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 17;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count =1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}
}