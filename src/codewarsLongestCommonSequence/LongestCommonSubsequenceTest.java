/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/52756e5ad454534f220001ef/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	09/04/2020
 */

package codewarsLongestCommonSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonSubsequenceTest {

	@Test
	public void findLCSTest_2CharSubsequence_returnCorrectSubsequence() {
		assertEquals("ab", LongestCommonSubsequence.findSubsequence("abc", "ab"));
		assertEquals("bc", LongestCommonSubsequence.findSubsequence("abc", "bc"));
	}
	
	@Test
	public void findLCSTest_3CharSubsequence_returnCorrectSubsequence() {
		assertEquals("abd", LongestCommonSubsequence.findSubsequence("abcd", "abd"));
		assertEquals("abd", LongestCommonSubsequence.findSubsequence("abbd", "abd"));
		assertEquals("abc", LongestCommonSubsequence.findSubsequence("abcdef", "abc"));
		assertEquals("acf", LongestCommonSubsequence.findSubsequence("abcdef", "acf"));
	}
	
	@Test
	public void findLCSTest_9CharSubsequence_returnCorrectSubsequence() {
		assertEquals("12356", LongestCommonSubsequence.findSubsequence("132535365", "123456789"));
	}
	
	@Test
	public void findLCSTest_4CharSubsequence_returnCorrectSubsequence() {
		assertEquals("34", LongestCommonSubsequence.findSubsequence("1234", "3412"));
	}
	
}
