package codingproblems;

public class ReverseArray {
	/*
	 * Write a program to reverse array elements
	 * 
	 */
	
	public static void main(String[] args) {
		int[] array = {1,2,3,43,41};
		int[] reversedArray = reverseArray(array);
		for (int i = 0; i <reversedArray.length; i++) {
			System.out.print(reversedArray[i]+" ");
		}
	}

	private static int[] reverseArray(int[] array) {
		int N = array.length;
		int[] reversedArray = new int[N];
		int index = 0;
		for (int i = N-1; i >=0; i--) {
			reversedArray[index++] = array[i];
		}
		return reversedArray;
	}
}
