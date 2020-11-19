/*
Problem name: Min Stack 
Problem link: https://leetcode.com/problems/min-stack/
*/

class MinStack {
public:
    stack<int>s;
    stack<int>min;
    
    MinStack() {
        
    }
    
    void push(int x) {
        s.push(x);
        if(!min.empty()){
            if(min.top()>x){
                min.push(x);
            }
            else{
                min.push(min.top());
            }
        }
        else{
            min.push(x);
        }
    }
    
    void pop() {
        s.pop();
        min.pop();
    }
    
    int top() {
        return s.top();
    }
    
    int getMin() {
        return min.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
