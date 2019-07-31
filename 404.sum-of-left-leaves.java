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
<<<<<<< HEAD
    int sum = 0;
=======
    int total = 0;
>>>>>>> 6a6d81dc479e8370c039d44d3a1259aa4817c208
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
<<<<<<< HEAD
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
=======
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
>>>>>>> 6a6d81dc479e8370c039d44d3a1259aa4817c208
    }
}

