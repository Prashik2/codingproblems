package codingproblems;

public class Palindrome {
	/*
	 * Write a program to check whether a given string is palindrome or not.
	 * ABCDBA
	 * Not Palindrome
	 * ABBBA
	 */
	
	public static void main(String[] args) {
		String word ="ABBBA";
		if(isPalindrome(word))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	private static boolean isPalindrome(String word) {
		int endIndex = word.length()-1;
		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(endIndex--))
				return false;
		}
		return true;
	}
}
