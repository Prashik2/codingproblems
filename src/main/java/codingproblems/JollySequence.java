package codingproblems;

	/*
	 * sequence of n > 0 integers is called a jolly jumper if the absolute values of the differences between successive elements take on all possible values 1 through n − 1. For example following sequences are jolly sequences
	 * 1 4 2 3
	 * absolute diff: 3 2 1
	 * 1 2 4 7 11 16 22 29 37 46 56
	 * absolute diff: 1 2 3 4 5 6 7 8 9 10
	 * 2 5 1 3 4
	 * absolute diff: 3 4 2 1
	 * following sequences is not jolly sequences
	 * 1 3 2 4
	 * absolute diff: 2 1 2
	 * Write a method to check whether the given sequence is a Jolly jumper or not. 
	 */

public class JollySequence {
	public static void main(String[] args) {
		int[] array = {1,2,4,7,11,16,22,29,37,46,56};//{1,2,4,7,11,16,22,29,37,46,56};
		boolean ans = isJolly(array);
		System.out.println(ans?"Jolly Jumper":"Not Jolly Jumper");
	}

	private static boolean isJolly(int[] array) {
		// check if array has Jolly sequence
		int size = array.length;
		if(size==0)
			return false;
		int[] differenceArray= new int[size-1];
		int sum =0;
		for(int i=0;i<size-1;i++) {
			int difference = Math.abs(array[i] - array[i+1]);
			differenceArray[i]= difference;
			sum += difference;
		}
		int N=size-1;
		int calculatedSum =N*(N+1)/2;
		if(sum == calculatedSum)
			return true;
		return false;
	}
}
