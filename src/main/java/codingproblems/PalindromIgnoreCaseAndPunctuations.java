package codingproblems;

public class PalindromIgnoreCaseAndPunctuations {
	/*
	 *     9. Write a program to check whether a given string is palindrome or not ignoring character case, white spaces and punctuations.
	 *     For example: following are valid palindrome
	 *     A man a plan a canal panama
	 *     Was it a cat I saw?
	 */
	
	public static void main(String[] args) {
		String line1 = "A man a plan a canal panama";
		String line2 = "Was it a cat I saw?";
		System.out.println(line1+": "+isPalindrome(line1));
		System.out.println(line2+": "+isPalindrome(line2));
	}

	private static String isPalindrome(String line) {
		StringBuilder stringBuilder = new StringBuilder();
		String noPunctuationString = line.replaceAll("\\W", "").toLowerCase();//\\p{Punct}
		int endIndex = noPunctuationString.length()-1;
		for (int i = 0; i < noPunctuationString.length()/2; i++) {
			if(noPunctuationString.charAt(i)!=noPunctuationString.charAt(endIndex--))
				return "NOT Palindrome";
		}
		return "Palindrome";
	}
}
