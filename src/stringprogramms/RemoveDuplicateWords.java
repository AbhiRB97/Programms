package stringprogramms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String st="my name is is is abhishek";
		String[] s=st.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String string : s) {
			set.add(string);
			}
		for (String string : set) {
			System.out.print(string+" ");
		}
	}
}
