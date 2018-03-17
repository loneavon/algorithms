package com.levincode.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class No3_LongestSubstringWithoutRepeatingCharacters {
	public int LongsetSubstring(String a) {
		int start = 0;
		int length = 0;
		Map<Character, Integer> referMap = new HashMap<>();
		for(int i=0; i<a.length(); i++) {
			if(referMap.containsKey(a.charAt(i))) {
				start = Math.max(start, referMap.get(a.charAt(i)) + 1);
			}
			length = Math.max(length, i - start + 1);
			referMap.put(a.charAt(i), i);

		}
		return length;
	}
}
