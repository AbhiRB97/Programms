package arrayprograms;

public class SumofFirst3MaximumNumber {
	public static void main(String[] args) {
		int temp;
		int sum=0;
		int [] arr= {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+arr[i];
		}
		System.out.println("The Sum fo First Three Maximum Numbers is "+sum);
		
	}

}
