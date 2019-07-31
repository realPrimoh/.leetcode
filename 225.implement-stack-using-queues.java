/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */
class MyStack {
    LinkedList<Integer> queue;
   /** Initialize your data structure here. */
   public MyStack() {
       queue = new LinkedList<Integer>();
   }
   
   /** Push element x onto stack. */
   public void push(int x) {
       queue.add(0, x);
   }
   
   /** Removes the element on top of the stack and returns that element. */
   public int pop() {
       return queue.poll();
   }
   
   /** Get the top element. */
   public int top() {
       return queue.peek();
   }
   
   /** Returns whether the stack is empty. */
   public boolean empty() {
       return queue.size()==0;
   }
}

/*
class MyStack {

    private Queue<Integer> main;
    public MyStack() {
       main = new LinkedList<Integer>();
   }

    public void push(int x) {
        main.add(x);
        for (int i = 1; i < main.size(); i++)
            main.add(main.remove());
    }

    public void pop() {
        main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}


 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

