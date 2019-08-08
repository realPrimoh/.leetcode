/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        Stack<Node> nodes = new Stack<>();
        if (node.neighbors.size() == 0) {
            return new Node(node.val, node.neighbors);
        }
        while (nodes.size() != 0) {

        }
        return node;
    }
}

