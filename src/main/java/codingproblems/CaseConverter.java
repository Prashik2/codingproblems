package codingproblems;

public class CaseConverter {
	/*
	 *     7. Write functions to convert group of words to
	 *     a.	snake_case
	 *     b.	camelCase 
	 *     c.	PascalCase
	 *     example : user login count
	 *     snake_case: user_login_count
	 *     camelCase: userLoginCount
	 *     PascalCase: UserLoginCount
	 */
	//public static enum Case{ SNAKE_CASE,CAMEL_CASE,PASCAL_CASE};
	public static void main(String[] args) {
		String word="user login count";
		
		String[] cases =convertToCases(word);
	}

	private static String[] convertToCases(String word) {
		String[] convertedCases = new String[3];
		String[] words =word.split(" ");
		convertedCases[0]=  convertToSnakeCase(words);
		convertedCases[1] = convertToCamelCase(words);
		convertedCases[2] = convertToPascalCase(words);
		System.out.println("SNAKE CASE: "+convertedCases[0]);
		System.out.println("CAMEL CASE: "+convertedCases[1]);
		System.out.println("PASCAL CASE: "+convertedCases[2]);
		
		return null;
	}

	private static String convertToPascalCase(String[] words) {
		StringBuffer stringBuffer = new StringBuffer();
		//stringBuffer.append(words[0]);
		for (int i =0; i < words.length; i++) {
			String word = words[i];
			stringBuffer.append(word.substring(0,1).toUpperCase()+word.substring(1, word.length()).toLowerCase());
			
		}
		return stringBuffer.toString();
	}

	private static String convertToCamelCase(String[] words) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(words[0]);
		for (int i = 1; i < words.length; i++) {
			String word = words[i];
			stringBuffer.append(word.substring(0,1).toUpperCase()+word.substring(1, word.length()).toLowerCase());
			
		}
		return stringBuffer.toString();
	}

	private static String convertToSnakeCase(String[] words) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < words.length-1; i++) {
			stringBuffer.append(words[i]+"_");
		}
		stringBuffer.append(words[words.length-1]);
		return stringBuffer.toString();
	}
}
