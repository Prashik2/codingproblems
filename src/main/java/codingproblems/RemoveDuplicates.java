package codingproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	/*
	 *     6. Remove duplicate elements in an array
	 *     Input 
	 *     array elements: 10, 10, 20, 30, 10, 20
	 *     Output:
	 *     10, 20, 30
	 */
	
	public static void main(String[] args) {
		int[] array = {10, 10, 20, 30, 10, 20};
		int[] noDuplicatesArray =removeDuplicates(array);
		for (int i = 0; i < noDuplicatesArray.length; i++) {
			System.out.print(noDuplicatesArray[i]+" ");
		}
	}

	private static int[] removeDuplicates(int[] array) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		return set.stream().mapToInt(Integer::intValue).toArray();
		
	}
}
