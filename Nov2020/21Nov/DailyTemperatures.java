/*
Problem Name: 739. Daily Temperatures
Problem Link: https://leetcode.com/problems/daily-temperatures/
*/
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int ans[] = new int[T.length];
        int n = T.length;
        Stack<Integer>  st = new Stack<Integer>();
        for(int i=0;i<n;i++){
            while((!st.isEmpty()) && (T[st.peek()] < T[i])){
                int ind = st.pop();
                ans[ind] = i - ind;
            }
            st.push(i);
        }
        return ans;
    }
}
