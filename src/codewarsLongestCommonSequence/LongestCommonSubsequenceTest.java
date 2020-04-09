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
	public void findLCSTest_3CharSubsequence_returnCorrectSubsequence() {
		assertEquals("ab", LongestCommonSubsequence.findSubsequence("abc", "ab"));
	}

}
