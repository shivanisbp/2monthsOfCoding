/*
Problem Name: 155. Min Stack
Problem Link: https://leetcode.com/problems/min-stack/
*/
class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> st;
    Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<Integer>();
        minSt = new Stack<Integer>();
    }
    
    public void push(int x) {
        st.push(x);
        if(minSt.isEmpty())
            minSt.push(x);
        else
            minSt.push(Math.min(minSt.peek(), x));
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
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
