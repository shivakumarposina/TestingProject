package javaPrograms;

public class StringReplaceASubString {

	public static void main(String[] args) {
		String str = "I am siva am Kumar";
		/*str = str.replaceFirst("am", "name");
		System.out.println(str);*/
		str= str.replaceAll("am", "name");
		System.out.println(str);
	}

}
