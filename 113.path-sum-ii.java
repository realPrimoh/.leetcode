/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
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
<<<<<<< HEAD
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
=======

 //Backtracking solution
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> toReturn = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>(), toReturn);
        return toReturn;
    }

    public void pathSum(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> total) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            total.add(new ArrayList<>(temp));
        } else {
            pathSum(root.left, sum - root.val, temp, total);
            pathSum(root.right, sum - root.val, temp, total);
        }
        temp.remove(temp.size() - 1);
>>>>>>> 1cb98fe6640c3813ef3c50066525641c9db6112f
    }
}

