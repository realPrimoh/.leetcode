/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
<<<<<<< HEAD
        if (root == null || p == null || q == null) {
           return root;
        }
        while (root != null) {
            if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else if (q.val < root.val && p.val < root.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return root;

        /** Recursive Solution 
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (q.val < root.val && p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }*/
=======
        
>>>>>>> 6a6d81dc479e8370c039d44d3a1259aa4817c208
    }
}

