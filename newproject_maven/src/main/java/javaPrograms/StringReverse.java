package javaPrograms;

public class StringReverse {
	public static void main(String args[]) {
		String str = "SivaKumar";
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
// StringBuffer buffer = new StringBuffer(str);
//buffer = buffer.reverse();
// system.out.println(buffer);