/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */
class MinStack {

    ArrayList<Integer> ints;
    PriorityQueue<Integer> mins;

    /** initialize your data structure here. */
    public MinStack() {
        ints = new ArrayList<>();
        mins = new PriorityQueue<>();
    }
    
    public void push(int x) {
        ints.add(x);
        mins.add(x);
     }
    
    public void pop() {
        mins.remove(ints.get(ints.size() - 1));
        ints.remove(ints.size() - 1);
    }
    
    public int top() {
        return ints.get(ints.size() - 1);
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

