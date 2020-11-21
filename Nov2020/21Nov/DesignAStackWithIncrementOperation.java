/*
Problem Name: 1381. Design a Stack With Increment Operation
Problem Link: https://leetcode.com/problems/design-a-stack-with-increment-operation/
*/
class CustomStack {
    int st[];
    int tos, size;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
        tos = -1;
        size = maxSize;
    }
    
    public void push(int x) {
        if(tos < size-1)
            st[++tos] = x;
    }
    
    public int pop() {
        if(tos >= 0)
            return st[tos--];
        return -1;
    }
    
    public void increment(int k, int val) {
        if(k>tos)
            k = tos + 1;
        for(int i=0;i<k;i++)
            st[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
