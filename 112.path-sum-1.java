/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (isLeaf(root) && root.val == sum) {
            return true;
        }
        return traverse(root.left, sum, root.val) || traverse(root.right, sum, root.val);
        
    }
    
    public boolean traverse(TreeNode root, int sum, int sumSoFar) {
       if (root == null) {
           return false;
       }
       sumSoFar += root.val;
       if (isLeaf(root) && sum == sumSoFar) {
           return true;
       }
       
       return traverse(root.left, sum, sumSoFar) || traverse(root.right, sum, sumSoFar);

    }

    public boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        } else {
            return false;
        }
    }
}

