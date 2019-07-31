/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> toReturn = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return toReturn;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            toReturn.add(level);
        }
        return toReturn;
    }
}

