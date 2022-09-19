package arrayprograms;

public class BubbleSortAscending {

	public static void main(String[] args) throws InterruptedException {
		int temp;
		int [] arr= {4,1,5,3,2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
