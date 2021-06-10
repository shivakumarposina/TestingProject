package javaPrograms;

public class StringComparison {
	public static void main (String args[]) {
	String a = "sivakumar";
	String b = "Sivakumar";
	/*if(a.equals(b)) {
		System.out.println("a and b are same Strings");
	}else {
		System.out.println("not equal");
	}*/

	if(a.equalsIgnoreCase(b)) {
		System.out.println("a and b are same Strings");
	}else {
			System.out.println("not equal");
		}
		
	}
	}

