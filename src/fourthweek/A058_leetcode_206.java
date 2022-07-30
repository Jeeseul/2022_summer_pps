package fourthweek;

import java.util.List;

public class A058_leetcode_206 {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	//class Solution {
	    public ListNode reverseList(ListNode head) {
	        ListNode node=null;
	        while(head!=null){
	            ListNode temp = head;
	            head = head.next;
	            temp.next = node;
	            node = temp;
	        }
	        return node;
	    }
	}