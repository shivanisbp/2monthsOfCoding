/*
Problem name: Implement Queue using Stacks
Problem link: https://leetcode.com/problems/implement-queue-using-stacks/
*/

class MyQueue {
public:
    /** Initialize your data structure here. */
    stack<int>temp;
    stack<int>q;
    MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        if(!q.empty()){
            while(!q.empty()){
                temp.push(q.top());
                q.pop();
            }
            q.push(x);
            while(!temp.empty()){
                q.push(temp.top());
                temp.pop();
            }
        }
        else{
            q.push(x);
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() {
        int first=q.top();
        q.pop();
        return first;
    }
    
    /** Get the front element. */
    int peek() {
        return q.top();
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
        return q.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
