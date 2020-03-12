package javaPrograms;

public class Example {

	public static void main(String[] args) {
	int i=0; int j=0;
	int a;
	int number = 153;
	a= number;
	while(number>0) {
		i = number%10;
		j= j+(i*i*i);
		number = number/10;
		
	}if (j==a) {
		System.out.println("it is a armstrong");
	}else {
		System.out.println("it is not a armstrong");
	}

	}

}
