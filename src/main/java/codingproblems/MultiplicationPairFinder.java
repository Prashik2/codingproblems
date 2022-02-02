package codingproblems;

import java.util.ArrayList;
import java.util.List;

	/*
	 * 3. Write a program to accept a number and print unique pairs of numbers such that multiplication of the pair is given number
	 * Input: 24
	 * Output:
	 * 1 * 24 = 24
	 * 2 * 12 = 24
	 * 3 * 8 = 24
	 * 4 * 6 = 24
	*/

public class MultiplicationPairFinder {
	public static void main(String[] args) {
		int n=24;
		List<Integer> pairs =findMultiplicationPairs(n);
		for (int i = 0; i < pairs.size(); i=i+2) {
			System.out.println(pairs.get(i)+" * "+pairs.get(i+1)+" = "+n);
			
		}
	}

	private static  List<Integer> findMultiplicationPairs(int n) {
		// TODO Auto-generated method stub
		List<Integer> pairs = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			if(n%i==0 && !pairs.contains(i)) {
				pairs.add(i);
				pairs.add(n/i);
			}
		}
		return pairs;
	}
}
