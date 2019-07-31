/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(Integer.toString(root.val));
            return list;
        }
        traverse(root.left, Integer.toString(root.val));
        traverse(root.right, Integer.toString(root.val));
        return list;
    }
    public void traverse(TreeNode node, String s) {
        
        if (node == null) {
            return;
        }
        s += "->" + Integer.toString(node.val);
        if (node.left == null && node.right == null) {
            list.add(s);
        } else {
            traverse(node.left, s);
            traverse(node.right, s);
        }
    }
}

