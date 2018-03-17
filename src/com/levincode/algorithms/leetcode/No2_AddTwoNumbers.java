package com.levincode.algorithms.leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list. You may
assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

URL: https://leetcode.com/problems/add-two-numbers/description/
 */
public class No2_AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		ListNode head = new ListNode(0);
		ListNode current = head;
		int carry = 0;
		while(a != null || b != null) {
			int x = (a != null) ? a.val : 0;
			int y = (b != null) ? b.val : 0;
			int sum = x + y + carry;
			carry = sum/10;
			a = (a != null) ? a.next : null;
			b = (b != null) ? b.next : null;
			current.next = new ListNode(sum%10);
			current = current.next;

		}
		if(carry > 0) {
			current.next = new ListNode(carry);
		}
		return head.next;
	}
}
