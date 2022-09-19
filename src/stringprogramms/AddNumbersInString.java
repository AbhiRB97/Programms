package stringprogramms;

public class AddNumbersInString {

	public static void main(String[] args) {
	String s="a1s2b3c5";
	String num="";
	int sum=0;
	
	//1st logic
	/*for (int i = 0; i < s.length()-1; i++) {
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			int n = Character.getNumericValue(ch);
			sum=sum+n;
		}
		
	}
	System.out.println(sum);
		*/
	
	
	// 2nd Logic
	
	/*for (int i = 0; i < s.length()-1; i++) {
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			num=num+ch;
		}		
	}
	int i=Integer.parseInt(num);
	while(i!=0)
	{
		sum=sum+(i%10);
		i=i/10;
	}
	System.out.println(sum);
	*/
	
	//3rd logic
	for (int j = 0; j < s.length()-1; j++) {
		char ch=s.charAt(j);
		if(ch>='0'&&ch<='9')
		{
			int n=ch-48;
			sum=sum+n;
		}		
	}
	System.out.println(sum);
	
	
	}
	
}
