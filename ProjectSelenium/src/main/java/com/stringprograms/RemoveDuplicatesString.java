package com.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
String str = "sivakumar";
int length = str.length();
StringBuilder sb = new StringBuilder();
Set<Character> set = new LinkedHashSet<Character>();
for(int i=0; i<length; i++) {
set.add(str.charAt(i));
}
for(Character c:set) {
	sb.append(c);
}
System.out.println(sb);
	}

}
