/*
Problem Name: 1544. Make The String Great
Problem Link: https://leetcode.com/problems/make-the-string-great/
*/
class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();
        int diff = 'a' - 'A';
        for(char c: s.toCharArray()){
            if(st.isEmpty())
                st.push(c);
            else if(Math.abs(st.peek() - c) == diff)
                st.pop();
            else
                st.push(c);
        }
        s = "";
        while(!st.isEmpty())
            s = st.pop() + s;
        return s;
    }
}
