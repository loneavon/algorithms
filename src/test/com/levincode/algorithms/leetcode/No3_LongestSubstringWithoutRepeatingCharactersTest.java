package test.com.levincode.algorithms.leetcode; 

import com.levincode.algorithms.leetcode.No3_LongestSubstringWithoutRepeatingCharacters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* No3_LongestSubstringWithoutRepeatingCharacters Tester. 
* 
* @author <Authors name> 
* @since <pre>三月 17, 2018</pre> 
* @version 1.0 
*/ 
public class No3_LongestSubstringWithoutRepeatingCharactersTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: LongsetSubstring(String a) 
* 
*/ 
@Test
public void testLongsetSubstring() throws Exception { 
//TODO: Test goes here...
	String a = "abcabcbb";
	String b = "bbbbb";
	String c = "pwwkew";
	String d = "tmmzuxt";
	No3_LongestSubstringWithoutRepeatingCharacters test = new No3_LongestSubstringWithoutRepeatingCharacters();
	int resultA = test.LongsetSubstring(a);
	int resultB = test.LongsetSubstring(b);
	int resultC = test.LongsetSubstring(c);
	int resultD = test.LongsetSubstring(d);

	assertEquals(resultA, 3);
	assertEquals(resultB, 1);
	assertEquals(resultC, 3);
	assertEquals(resultD, 5);
} 


} 
