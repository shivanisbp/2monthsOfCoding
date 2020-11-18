/*
Problem Name: super reduced strings
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/super-reduced-strings-303701dd/
*/
import java.util.*;
class SuperReducedStrings {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
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
            System.out.println("Empty String");
        else{
            s = "";
            while(!st.isEmpty())
                s = st.pop() + s;
            System.out.println(s);
        }
    }
}
