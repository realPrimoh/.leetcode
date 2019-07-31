/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public class BalancedTreeNode {
        public boolean balanced;
        public int height;
        public BalancedTreeNode(boolean b, int h) {
            balanced = b;
            height = h;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).balanced;
    }

    public BalancedTreeNode checkBalanced(TreeNode root) {
        if (root == null) {
            return new BalancedTreeNode(true, -1);
        }
        BalancedTreeNode leftTree = checkBalanced(root.left);
        if (!leftTree.balanced) {
            return leftTree;
        }
        BalancedTreeNode rightTree = checkBalanced(root.right);
        if (!rightTree.balanced) {
            return rightTree;
        }

        boolean balanced = Math.abs(leftTree.height - rightTree.height) <= 1;
        int height = Math.max(leftTree.height, rightTree.height) + 1;
        return new BalancedTreeNode(balanced, height);

        

    }
}

