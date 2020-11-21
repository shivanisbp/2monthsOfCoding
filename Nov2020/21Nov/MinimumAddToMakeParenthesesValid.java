/*
Problem Name: 921. Minimum Add to Make Parentheses Valid
Problem Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
*/
class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<Character>();
        for(char c: S.toCharArray()){
            if(st.isEmpty())
                st.push(c);
            else if((c == ')') && (st.peek() == '('))
                st.pop();
            else
                st.push(c);
        }
        return st.size();
    }
}
