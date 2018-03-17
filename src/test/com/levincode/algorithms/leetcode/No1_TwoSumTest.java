package test.com.levincode.algorithms.leetcode; 

import com.levincode.algorithms.leetcode.No1_TwoSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/** 
* TwoSum Tester. 
* 
* @author <Authors name> 
* @since <pre>三月 17, 2018</pre> 
* @version 1.0 
*/ 
public class No1_TwoSumTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: twoSum(int[] nums, int target) 
* 
*/ 
@Test
public void testTwoSum() throws Exception { 
	No1_TwoSum twoSum = new No1_TwoSum();
	int[] nums = new int[]{2, 4, 6, 8};
	int[] result = twoSum.twoSum(nums, 14);
	assertArrayEquals(new int[]{2, 3}, result);
}


} 
