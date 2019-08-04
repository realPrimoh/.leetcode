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

 //BRUTE FORCE, slow and high memory solution. Try again with backtracking.
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> toReturn = new ArrayList<>();
        if (root == null) {
            return toReturn;
        }
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(root.val);
        if (isLeaf(root) && sum == root.val) {
            toReturn.add(temp);
            return toReturn;
        }
        traverse(root.left, sum, root.val, new ArrayList<>(temp), toReturn);
        traverse(root.right, sum, root.val, new ArrayList<>(temp), toReturn);
        return toReturn;
    }

    public void traverse(TreeNode root, int sum, int sumSoFar, List<Integer> temp, List<List<Integer>> total) {
        if (root == null) {
            return;
        }
        sumSoFar += root.val;
        temp.add(root.val);
        if (isLeaf(root) && sumSoFar == sum) {
            total.add(new ArrayList<>(temp));
            return;
        }
        traverse(root.left, sum, sumSoFar, new ArrayList<>(temp), total);
        traverse(root.right, sum, sumSoFar, new ArrayList<>(temp), total);

    }

    public boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        } else {
            return false;
        }
    }
}

