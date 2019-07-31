/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root);
        return sum;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                traverse(root.left);
            }  
        }
        if (root.right != null) {
            traverse(root.right);
        }
    }
}

