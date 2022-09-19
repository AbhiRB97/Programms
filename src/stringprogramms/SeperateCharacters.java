package stringprogramms;

public class SeperateCharacters {
	public static void main(String[] args) {
	String s="AAaa!@12";
	String uc="";
	String lc="";
	String num="";
	String sp="";

	/*for (int i = 0; i <s.length(); i++) {
		char c=s.charAt(i);
		if(Character.isAlphabetic(c))
		{
			uc=uc+c;
		}
		else if(Character.isDigit(c))
		{
			num=num+c;
		}
		else
		{
			sp=sp+c;
		}
		
	}
	System.out.println(uc);
	System.out.println(num);
	System.out.println(sp);
	
	*/ 
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		if(c>='a'&& c<='z')
		{
			lc=lc+c;
		}
		else if(c>='A'&& c<='Z')
		{
			uc=uc+c;
		}
		else if(c>='0'&& c<='9')
		{
			num=num+c;
		}
		else
		{
			sp=sp+c;
		}
	}
	System.out.println(uc);
	System.out.println(num);
	System.out.println(sp);
	System.out.println(lc);
	
}

}
