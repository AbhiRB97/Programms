package arrayprograms;

public class CheckWeatherNumIsPrime {

	public static void main(String[] args) {
		 int n=9;
		 int i=2;
		 while(true)
		 {
			 if(n%i==0)
			 {
				 break;
			 }
			 i++;
		 }
		 if(i==n)
		 {
			 System.out.println("Its a prime");
		 }
		 else
		 {
			 System.out.println("not a prime");
		 }
	}
}
