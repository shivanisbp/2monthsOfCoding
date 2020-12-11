/*
Problem Name: Special Shop
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/special-shop-69904c91/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            long n = in.nextLong(), a = in.nextLong(), b = in.nextLong();
            long c1 = b*n/(a+b), c2 = n - c1;
            long cost = a*c1*c1 + b*c2*c2;
            c1++;
            c2--;
            cost = Math.min(cost, a*c1*c1 + b*c2*c2);
            out.println(cost);
        }
        out.flush();
    }
}
