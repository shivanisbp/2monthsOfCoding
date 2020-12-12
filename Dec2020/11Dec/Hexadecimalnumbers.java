/*
Problem Name: Hexadecimal numbers
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/yet-another-easy-problem-1f3273a0/submissions/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int l = in.nextInt(), r = in.nextInt(), cnt = 0;
            for(;l<=r;l++){
                if(gcd(l,hex(l)) > 1)
                    cnt++;
            }
            out.println(cnt);
        }
        out.flush();
    }
    static int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    static int hex(int n){
        int s = 0;
        while(n > 0){
            s += n%16;
            n = n/16;
        }
        return s;
    }
}
