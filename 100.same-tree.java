/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compareTraverse(p, q);
    }
    public boolean compareTraverse(TreeNode rootOne, TreeNode rootTwo) {
        if (rootOne == null && rootTwo == null) {
            return true;
        } 
        if (rootOne == null && rootTwo != null || rootOne != null && rootTwo == null ) {
            return false;
        }
        if (rootOne.val != rootTwo.val) {
            return false;
        }
        if (rootOne.val == rootTwo.val) {
            return compareTraverse(rootOne.left, rootTwo.left) && compareTraverse(rootOne.right, rootTwo.right);
        }
        return true;
    }
}

