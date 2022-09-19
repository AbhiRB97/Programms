package stringprogramms;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		String s="abhishek";
		int count=0;
		for (int i = 0; i <s.length()-1; i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				//to print the vowels
				System.out.print(c+" ");
				count++;
			}
			
		}
		// to print number of vowels
		System.out.println(count);
	}
}
