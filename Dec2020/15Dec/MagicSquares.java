/*
Problem Name: Magic Squares
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/magic-squares/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long w = in.nextLong(), h=in.nextLong();
        if(w%2 == 0 && h%2 == 0)
            out.println(Math.min(w,h)/2);
        else if(w%2 == 1 && h%2 == 1){
            out.println((Math.min(w,h)+1)/2);
        }
        else
            out.println(-1);
        out.flush();
    }
}
