/*
Problem name: 1381. Design a Stack With Increment Operation
Problem link: https://leetcode.com/problems/design-a-stack-with-increment-operation/
*/

class CustomStack {
public:
    int *arr,top,stackSize;
    CustomStack(int maxSize) {
        arr=new int[maxSize];
        top=0;
        stackSize=maxSize;
    }
    
    void push(int x) {
        if (top<stackSize) {
            arr[top++] = x;
        }
    }
    
    int pop() {
        if (top) {
            return arr[--top];
        }
        return -1;
    }
    
    void increment(int k, int val) {
        for (int i=0; i < top && i < k; ++i) {
            arr[i] += val;
        }
    }
};

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack* obj = new CustomStack(maxSize);
 * obj->push(x);
 * int param_2 = obj->pop();
 * obj->increment(k,val);
 */
