package javaPrograms;

public class StringSplit {

	public static void main(String[] args) {
		String str = "posina/siva/kumar";
		for (String split : str.split("/")) {
			System.out.println(split);
		}
	}

}
