package arrayprograms;

public class PrintAllPrimeFromArray2 {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,9,10,11,12,13};
		for (int i = 0; i < arr.length; i++) {
			boolean flag=true;
			for (int k = 2; k < arr[i]; k++) {
				if(arr[i]%k==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
