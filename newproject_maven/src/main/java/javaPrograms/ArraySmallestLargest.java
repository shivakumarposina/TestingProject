package javaPrograms;

public class ArraySmallestLargest {

	public static void main(String[] args) {
int numbers[] = {-10,40,-45,-99,6547,84473};
int largest= numbers[0];
int smallest = numbers[0];
for(int i=1; i<numbers.length; i++) {
	if(numbers[i]>largest) {
		largest = numbers[i];
	}else if(numbers[i]<smallest) {
		smallest= numbers[i];
	}
}
System.out.println("Larges number is :" +largest);
System.out.println("smallest number is :" +smallest);
	}

}
