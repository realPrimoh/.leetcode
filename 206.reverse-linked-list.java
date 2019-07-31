/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakeHead = head;
        ListNode helper = null;
        while (fakeHead != null) {
            ListNode temp = fakeHead.next; //now at 2
            fakeHead.next = helper; //fakeHead.next now at null
            helper = fakeHead;
            fakeHead = temp;

            

            //want 2.next = 1
            //have fakeHead at 3
        
        }
    return helper;
    }
}

