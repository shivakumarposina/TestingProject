package javaPrograms;

public class DeleteSpecialCharacters {

	public static void main(String[] args) {
		String str = "s@i%Rvak@%$umar12@3";
		str = str.replaceAll("[^a-z, A-Z,0-9]", "");
		System.out.println(str);

	}

}
