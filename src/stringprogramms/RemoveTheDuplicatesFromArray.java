package stringprogramms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatesFromArray {
	

	public static void main(String[] args) {
		
	int [] arr= {1,2,1,2,6,6,4};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	for (Integer integer : set) {
		System.out.print(integer+" ");
	}
		
	}
}
