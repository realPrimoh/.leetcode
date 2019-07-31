/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root, 1);
        return min;

    }

    public void traverse(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            min = Math.min(depth, min);
        }
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }

    public boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        } 
        return false;
    }
}

