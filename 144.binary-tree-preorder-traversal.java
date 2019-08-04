/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    ArrayList<Integer> toReturn = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return toReturn;
        }
        toReturn.add(root.val);
        traverse(root.left);
        traverse(root.right);
        return toReturn;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        toReturn.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}   

