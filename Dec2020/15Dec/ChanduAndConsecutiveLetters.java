/*
Problem Name: Chandu and Consecutive Letters
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/chandu-and-consecutive-letters/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            String s = in.next();
            Stack<Character> st = new Stack<Character>();
            for(char c: s.toCharArray()){
                if(st.isEmpty())
                    st.push(c);
                else if(c == st.peek())
                    ;
                else
                    st.push(c);
            }
            s = "";
            while(!st.isEmpty())
                s = st.pop() + s;
            out.println(s);
        }
        out.flush();
    }
}
