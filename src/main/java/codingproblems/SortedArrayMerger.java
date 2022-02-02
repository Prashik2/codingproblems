package codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *     2. Given two sorted arrays A and B.
 *     A is sorted in ascending order.
 *     B is sorted in descending order.
 *     The task is to merge them producing Array C in an ascendingly sorted manner Without using any sort utility or sorting algorithm.
 * 
 */
public class SortedArrayMerger {
	public static void main(String[] args) {
		int[] array1= {1,2,3,5};
		int[] array2 = {7,3,2};
		int[] mergedArray = mergeSortedArray(array1, array2);
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(mergedArray[i]+" ");
		}
	}
	
	public static int[] mergeSortedArray(int[] ascendinglySorted, int[] descendinglySorted) {
		int N = ascendinglySorted.length;
		int M = descendinglySorted.length;
		int[] mergedArray= new int[N+M];
		int index=0;
		int ascIndex=0;
		int desIndex = M-1;
		if(N==0) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < mergedArray.length; i++) {
				list.add(descendinglySorted[i]);
				
			}
			Collections.reverse(list);
			return list.stream().mapToInt(Integer::intValue).toArray();
		}
		if(M==0)
			return ascendinglySorted;
		while(ascIndex<N && desIndex>=0) {
			if(ascendinglySorted[ascIndex] <= descendinglySorted[desIndex]) {
				mergedArray[index++] = ascendinglySorted[ascIndex];
				ascIndex++;
				//N--;
			}
			else {
				mergedArray[index++] = descendinglySorted[desIndex];
				desIndex--;
				M--;
			}
		}
		int[] remArray = null;
		if(ascIndex<N)
			remArray =mergeSortedArray(Arrays.copyOfRange(ascendinglySorted, ascIndex, N-1), new int[0]);
		if(desIndex >=0)
			remArray =mergeSortedArray(new int[0], Arrays.copyOfRange(descendinglySorted, 0,desIndex+1));
		if(remArray != null) {
			N = remArray.length;
			System.arraycopy(remArray, 0, mergedArray, index, N);
		}
		return mergedArray;
	}
}
