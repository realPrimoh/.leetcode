/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */
class MyQueue {

    Stack<Integer> main;
    Stack<Integer> helper;
    /** Initialize your data structure here. */
    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!main.isEmpty()) {
            helper.push(main.pop());
        }
        helper.push(x);
        while (!helper.isEmpty()) {
            main.push(helper.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return main.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return main.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

