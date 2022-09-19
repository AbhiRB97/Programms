package arrayprograms;

public class PrintMissingNumbers {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,7,10};
		for (int i = 0; i < arr.length-1; i++) {
			int n=arr[i+1]-arr[i];
			int count =1;
			while(n>1)
			{
				System.out.print(arr[i]+count+" ");
				count++;
				n--;
			}
			
		}
	}

}
