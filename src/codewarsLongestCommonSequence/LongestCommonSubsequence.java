package codewarsLongestCommonSequence;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {

	static String findSubsequence(String input, String subsequence) {
		if(input.length() < subsequence.length()) {
			String oldSub = subsequence;
			subsequence = input;
			input = oldSub;
		}
		if(input.contentEquals(subsequence)) {
			return subsequence;
		}
		HashMap <String, Integer> mapOfSequences = new HashMap<String, Integer>();
		for(int i = 0; i < subsequence.length() - 1; i++) {
			String commonSequence = "";
			int startOfSubstring = 0;
			for(String letter : subsequence.substring(i).split("")) {
				for(int j = startOfSubstring; j < input.length(); j++) {
					if(input.charAt(j) == letter.charAt(0)) {
						startOfSubstring = j;
						commonSequence += letter;
						j = input.length();
					}
				}
				mapOfSequences.put(commonSequence, commonSequence.length());
			}
		}
		int longestCommonSequenceLength = 0;
		String answer = "";
		for(Map.Entry<String, Integer> me : mapOfSequences.entrySet()) {
			if(me.getValue() > longestCommonSequenceLength) {
				longestCommonSequenceLength = me.getValue();
				answer = me.getKey();
			}
		}
		return answer;
	}	
}
