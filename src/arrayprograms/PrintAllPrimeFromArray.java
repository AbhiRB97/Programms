package arrayprograms;

public class PrintAllPrimeFromArray {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,9,10,11,12,13};
		int n,j;
		for (int i = 0; i < arr.length; i++) {
			n=arr[i];
			j=2;
			while(true)
			{
				if(n%j==0)
				{
					break;
				}
				j++;
			
			}
			if(n==j)
			{
				System.out.print(n+" ");
			}
			
		}
	}
}
