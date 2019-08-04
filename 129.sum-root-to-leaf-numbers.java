/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return total;
        }
        if (isLeaf(root)) {
            return root.val;
        }
        if (root.left != null) {
            traverse(root.left, root.val);
        }
        if (root.right != null) {
            traverse(root.right, root.val);
        }
        return total;
    }

    public void traverse(TreeNode node, int num) {
        if (node == null) {
            return;
        }
        num = num * 10 + node.val;
        if (isLeaf(node)) {  
            total += num;
        } else {
            traverse(node.left, num);
            traverse(node.right, num);
        }
    }

    public boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }
}

