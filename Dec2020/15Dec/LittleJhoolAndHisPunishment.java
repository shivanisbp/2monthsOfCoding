/*
Problem Name: Little Jhool and his punishment
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/little-jhool-and-his-punishment/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), b = in.nextInt(), g = in.nextInt();
            if(Math.abs(b - g) >= 2)
                out.println("Little Jhool wins!");
            else
                out.println("The teacher wins!");
        }
        out.flush();
    }
}
