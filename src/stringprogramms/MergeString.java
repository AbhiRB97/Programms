package stringprogramms;

public class MergeString {

	public static void main(String[] args) {
		String s1="HI";
		String s2="Hello";
		String s3="Bye";
		String s4="";
		System.out.println(s1.concat(s2).concat(s3));
		
		String j=String.join(" ",s1, s2,s3);
		System.out.println(j);
		
		System.out.println(s1+s2+s3);
		
		String s=" hi hello welcome ";
		System.out.println(s.contains("hello"));
		System.out.println(s2.startsWith("he"));
		System.out.println(s3.endsWith("ye"));
		System.out.println(s4.isEmpty());
		System.out.println(s.replace('h', 'H'));
		System.out.println(s.replace(" ", ""));
		System.out.println(s.trim());
		System.out.println(s2.substring(1, 3));
	}
}
