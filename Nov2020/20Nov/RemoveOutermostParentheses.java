/*
Problem Name: 1021. Remove Outermost Parentheses
Problem Link: https://leetcode.com/problems/remove-outermost-parentheses/
*/
class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> st = new Stack<Character>();
        char arr[] = S.toCharArray();
        int ind = 0, n = arr.length;
        for(int i=0;i<n;i++){
            if(st.isEmpty())
                st.push(arr[i]);
            else if(arr[i] == '(')
                st.push(arr[i]);
            else{
                if(st.peek() == ')')
                    st.push(arr[i]);
                else if(st.size() == 1){
                    arr[ind] = ' ';
                    ind = i+1;
                    arr[i] = ' ';
                    st.pop();
                }
                else
                    st.pop();
            }
        }
        String ans = "";
        for(int i=0;i<n;i++)
            if(arr[i] != ' ')
                ans += arr[i];
        return ans;
    }
}
