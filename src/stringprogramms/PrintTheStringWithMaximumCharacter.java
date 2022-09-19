package stringprogramms;

public class PrintTheStringWithMaximumCharacter {
	public static void main(String[] args) {
		String [] arr= {"Hi","Hello","ABC","Abcde","abcdefg"};
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()>max)
			{
				max=arr[i].length();
			}
				
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()==max)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
