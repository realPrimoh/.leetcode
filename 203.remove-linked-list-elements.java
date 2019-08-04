/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode fakeHead = head;
        while (fakeHead.next != null) {
            if (fakeHead.next.val == val) {
                fakeHead.next = fakeHead.next.next;
            }
            if (fakeHead.next == null) {
                break;
            }
            if (fakeHead.next.val != val) {
                fakeHead = fakeHead.next;
            }
        }
        return head;
    }
}

