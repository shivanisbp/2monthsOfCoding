/*
Problem Name: Pizza Confusion
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/pizza-confusion/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String ans = in.next();
        int points = in.nextInt();
        for(int i=1;i<n;i++){
            String name = in.next();
            int p = in.nextInt();
            if(p > points){
                points = p;
                ans = name;
            }
            else if(p == points && ans.compareTo(name) > 0){
                ans = name;
            }
        }
        out.println(ans);
        out.flush();
    }
}
