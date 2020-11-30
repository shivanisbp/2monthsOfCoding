/*
Problem Name: Factorial Game
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/factorial-game-1/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long m = 1000000007;
        long fact[] = new long[100000+1];
        fact[0] = 1;
        for(int i=1;i<=100000;i++)
            fact[i] = (i*fact[i-1])%m;
        int q = in.nextInt();
        for(;q>0;q--){
            out.println(fact[in.nextInt()]);
        }
        out.flush();
    }
}
