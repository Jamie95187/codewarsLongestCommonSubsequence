package codewarsLongestCommonSequence;

public class LongestCommonSubsequence {

	static String findSubsequence(String input, String subsequence) {
		String answer = "";
		String[] subsequenceAsStringArray = subsequence.split("");
		for(String letter : subsequenceAsStringArray) {
			if(input.contains(letter)) {
				answer = answer + letter;
			}
		}
		return answer;
	}
	
}
