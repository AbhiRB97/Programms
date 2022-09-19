package stringprogramms;

//input s="a11b2c13";  output= 11+2+13=26

public class AddNumbersInStringAnotherProgramm {

	public static void main(String[] args) {
		String s="12bc11c4";
		int tsum=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
		if(c>='0' && c<='9')
		{
			int n=c-48;
			tsum=tsum*10+n;
		}
		else
		{
			sum=sum+tsum;
			tsum=0;
		}
		}
		sum=sum+tsum;
			
		
		System.out.println(sum);
		
	}
}
