package javaPrograms;

public class Palindrom1000 {

	public static void main(String[] args) {
		for (int n = 1; n <= 1000; n++) {
			int a;
			int i = 0, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = j * 10 + i;
				a = a / 10;
			}
			if (j == n) {
				System.out.println(n);
			}
		}

	}
}
