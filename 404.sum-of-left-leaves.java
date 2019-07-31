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
    int total = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, false);
        return total;
    }

    public void dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (isLeft && root.left == null && root.right == null) {
            total += root.val;
        }
        dfs(root.left, true);
        dfs(root.right, false);
    }
}

