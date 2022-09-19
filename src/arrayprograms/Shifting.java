package arrayprograms;

public class Shifting {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5};
		/*  int key=1;
		 	for (int i = 0; i < key; i++) {
			 int temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=arr[i+2];
			 arr[i+2]=arr[i+3];
			 arr[i+3]=arr[i+4];
			 arr[4]=temp;			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		int key=3;
		for (int j = 0; j < key; j++) {
		int temp=arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1]=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
