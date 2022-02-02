package codingproblems;

import java.util.HashMap;
import java.util.Map;

public class CountAllElements {
	/*
	 *     5. Find count of each value in an array
	 *     Input 
	 *     array elements: 10, 10, 20, 30, 10, 20
	 *     Output:
	 *     10: 3
	 *     20: 2
	 *     30: 1
	 */
	public static void main(String[] args) {
		int[] array = {10, 10, 20, 30, 10, 20};
		Map<Integer,Integer> occurrenceMap = countAllElements(array);
		for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key +" : "+val);
			
		}
	}

	private static Map<Integer,Integer> countAllElements(int[] array) {
		// TODO Auto-generated method stub

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
		return occurrenceMap;
	
	}
}
