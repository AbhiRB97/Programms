package arrayprograms;

public class BubbleSortDescending {

	public static void main(String[] args) throws InterruptedException {
		int temp;
		int [] arr= {1,2,3,4,5,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
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
