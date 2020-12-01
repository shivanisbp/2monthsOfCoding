/*
Problem Name: F) Find Subsequences
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/e-16/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), max = 0;
        long cnt[] = new long[100000+2];
        for(int i=0;i<n;i++){
            int ele = in.nextInt();
            cnt[ele]++;
            max = Math.max(max,ele);
        }
        boolean possible = true;
        long req = 0, freq = cnt[max];
        for(int i=max-1;i>0;i--){
            if(freq > cnt[i]){
                possible = false;
                req += freq - cnt[i];
            }
            if(cnt[i] > freq)
                freq = cnt[i];
        }
        if(!possible)
            out.println(req);
        else{
            out.println(freq);
            for(int i=1;i<=max;i++){
                if(cnt[i] > cnt[i+1]){
                    long rep = cnt[i] - cnt[i+1];
                    String s = "";
                    for(int j=1;j<=i;j++)
                        s += j + " ";
                    for(;rep>0;rep--)
                        out.println(s);
                }
            }
        }
        out.flush();
    }
}
