package codingproblems;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceFinder {
	
	/*
	 *     4. find occurrence of an element in a given array.
	 *     Input 
	 *     array elements: 10, 10, 20, 30, 10
	 *     element to find occurrence: 10
	 *     Output:
	 *     3
	 */
	
	public static void main(String[] args) {
		int[] array = {10,5,10,10,20,30};
		int  element= 10;
		int occurrence =findOccurrence(array,element);
		System.out.println("Occurrence of "+element+" is "+occurrence);
	}

	private static int findOccurrence(int[] array, int element) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> occurrenceMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if(occurrenceMap.containsKey(array[i])) {
				Integer key = array[i];
				Integer value = occurrenceMap.get(key) + 1;
				occurrenceMap.replace(key, value);
			}
			else {
				Integer key = array[i];
				Integer value = 1;
				occurrenceMap.put(key, value);
			}
		}
		if(occurrenceMap.containsKey(element))
			return occurrenceMap.get(element);
		return 0;
	}

}
