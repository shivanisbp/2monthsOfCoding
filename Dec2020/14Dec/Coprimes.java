/*
Problem Name: Coprimes
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/coprimed-32042ef1/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        for(int i=n-2;i>0;i--){
            if(gcd(i,n) == 1){
                out.println(i);
                break;
            }
        }
        out.flush();
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
