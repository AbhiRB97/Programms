package stringprogramms;

public class SwapFirstAndLastWord {
	public static void main(String[] args) {
		
	String st="This is test yantra";
	String [] s=st.split(" ");
	System.out.print(s[s.length-1]+" ");
	for (int i = 1; i <= s.length-2; i++) {
		System.out.print(s[i]+" ");
	}
	System.out.print(s[0]);
		
	}

}
