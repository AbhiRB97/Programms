package stringprogramms;

public class ReverseString {

	public static void main(String[] args) {
		String s="my name is abhishek";
		String [] st=s.split(" ");
		
		
		for (String string : st) {
			char [] arr=string.toCharArray();
			for (int i = arr.length-1; i >=0 ; i--) {
				System.out.print(arr[i]);
				
			}
			System.out.print(" ");
			
			
		}
		System.out.println();
		for (String string : st) {
			String c=string;
			for (int i = c.length()-1; i >=0; i--) {
				System.out.print(c.charAt(i));
				
			}
			System.out.print(" ");		}

		System.out.println();
		//To reverse a sentence along with string
		for (int i =st.length-1; i >=0; i--) {
			String ch=st[i];
			for (int j = ch.length()-1; j >=0; j--) {
				System.out.print(ch.charAt(j));
			}
			System.out.print(" ");
			
			
		}
	
	
	
	
	}
}
