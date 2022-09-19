package stringprogramms;

import java.util.LinkedHashSet;

public class SeperatingABC {

	public static void main(String[] args) {
	String s="aababacbacbc";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character character : set) {
		for (int i = 0; i < s.length(); i++) {
			if(character==s.charAt(i))
			{
				System.out.print(s.charAt(i)+" ");
			}
			
		}
	}
}
}