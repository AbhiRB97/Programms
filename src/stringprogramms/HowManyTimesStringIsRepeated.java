package stringprogramms;

import java.util.LinkedHashSet;

public class HowManyTimesStringIsRepeated {

	public static void main(String[] args) {
		String st="My is name is abhishek";
		LinkedHashSet<String > set=new LinkedHashSet<String>();
		String[] s=st.split(" ");
		for (String string : s) {
			set.add(string);
		}
		for (String string : set) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				if(string.equals(s[i]))
				{
					count++;
				}
				
			}
			//to count how many time string is repeated
		//	System.out.println(string + " is repeated "+count+" time");
			
			// print only duplicates
			if(count>1)
			{
				System.out.println(string + " is repeated "+count+" times");
			}
			if(count==1)
			{
				System.out.println(string + " is repeated "+count+" time");
			}
			
		}
	}
}
