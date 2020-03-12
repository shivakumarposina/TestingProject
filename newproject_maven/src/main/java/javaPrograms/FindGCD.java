package javaPrograms;

public class FindGCD {

	public static void main(String[] args) {
int n1 =92; int n2 = 34;
int gcd =1;
for(int i =1; i<=n1 && i<=n2; ++i) {
	if(n1%i==0 && n2%i ==0) 
		gcd=i;
		
	}
System.out.printf("GCD of %d and %d is %d", n1, n2, gcd);
}
	
		
	}



	