package stringprogramms;

import java.util.LinkedHashSet;

public class CountTheNumberOfVowelsByremovingDuplicates {

	public static void main(String[] args) {
		String s="aaeeiioouu";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (Character character : ch) {
			set.add(character);
		}
		
		for (Character c : set) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.print(c+" ");
			}
			
		}
	}
}
