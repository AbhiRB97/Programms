package arrayprograms;

public class PrintTheStringWithMaximumAndMinimumCharacter {
	public static void main(String[] args) {
		String [] arr= {"Hi","Hello","ABC","Abcde","abcdefg"};
		int max=arr[2].length();
		int min=arr[2].length();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()>max)
			{
				max=arr[i].length();
			}
				// logic for minimum character should be written in another class
			else if(arr[i].length()<min)
			{
				min=arr[i].length();
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			
			// for max characters
			if(arr[i].length()==max)
			{
				System.out.println(arr[i]);
			}
			
			
			else if(arr[i].length()==min)
			{
				System.out.println(arr[i]);
				
			}
		}
	}

}
