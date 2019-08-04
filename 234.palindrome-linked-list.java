/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> pal = new Stack<>();
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        pal.push(slow.val);
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
                pal.push(slow.val);
            } 
            
        }
        while (slow != null) {
            if (slow.val != pal.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}

