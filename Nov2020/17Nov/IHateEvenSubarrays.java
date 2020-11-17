/*
Problem Name: I hate Even Subarrays
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/i-hate-even-subarrays/
*/
import java.util.*;
class IHateEvenSubarrays {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            String s = in.next();
            Stack<Character> st = new Stack<Character>();
            for(char c: s.toCharArray()){
                if(st.isEmpty())
                    st.push(c);
                else if(st.peek() == c)
                    st.pop();
                else
                    st.push(c);
            }
            if(st.isEmpty())
                System.out.println("KHALI");
            else{
                s = "";
                while(!st.isEmpty())
                    s = st.pop() + s;
                System.out.println(s);
            }
        }
    }
}
