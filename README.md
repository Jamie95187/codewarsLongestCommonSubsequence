# Longest Common Sequence (5 KYU)

Solving [this](https://www.codewars.com/kata/52756e5ad454534f220001ef/train/java) codewars challenge

## Description

Write a function called `LCS` that accepts two sequences and returns the longest subsequence common to the passed in sequences.

### Subsequence

A subsequence is different from a substring. The terms of a subsequence need not be consecutive terms of the original sequence.

### Example Subsequences

Subsequences of `"abc"` = `"a"`,`"b"`,`"c`","`ab`",`"ac"`,`"bc"` and `"abc`".

### LCS Examples

```
Solution.lcs("abcdef", "abc") => returns "abc"
Solution.lcs("abcdef", "acf") => returns "acf"
Solution.lcs("132535365", "123456789") => returns "12356"
```

### Notes

- Both arguments will be strings
- Return value must be a string
- Return an empty string if there exists no common subsequence
- Both arguments will have one or more characters (in JavaScript)
- All tests will only have a single longest common subsequence. Don't worry about cases such as `LCS( "1234", "3412" )`, which would have two possible longest common subsequences: `"12"` and `"34"`.

## Tests

```
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
	
```