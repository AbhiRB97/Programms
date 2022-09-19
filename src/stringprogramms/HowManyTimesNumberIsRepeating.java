package stringprogramms;

import java.util.LinkedHashSet;

public class HowManyTimesNumberIsRepeating {
	public static void main(String[] args) {
		int [] arr= {1,1,2,2,3,4,5,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (Integer integer : set) {
			int count =0;
			for (int i = 0; i < arr.length; i++) {
		
				if(arr[i]==integer)
				{
					count++;
				}	
			}
			System.out.println(integer+" is repeating "+count+" times");
		}
	}

}
