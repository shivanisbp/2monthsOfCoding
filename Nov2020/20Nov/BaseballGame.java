/*
Problem Name: 682. Baseball Game
Problem Link: https://leetcode.com/problems/baseball-game/
*/
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        for(String s: ops){
            if(s.equals("C"))
                st.pop();
            else if(s.equals("D"))
                st.push(st.peek()*2);
            else if(s.equals("+")){
                int t1 = st.pop(), t2 = st.pop();
                st.push(t2);
                st.push(t1);
                st.push(t1 + t2);
            }
            else
                st.push(Integer.parseInt(s));
        }
        int sum = 0;
        while(!st.isEmpty())
            sum += st.pop();
        return sum;
    }
}
