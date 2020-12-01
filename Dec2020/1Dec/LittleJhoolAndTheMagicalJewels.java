/*
Problem Name: Little Jhool and the Magical Jewels
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/little-jhool-and-the-magical-jewels/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            String s = in.next();
            int ruby[] = new int[4];
            for(char c: s.toCharArray()){
                switch(c){
                    case 'r':ruby[0]++;break;
                    case 'u':ruby[1]++;break;
                    case 'b':ruby[2]++;break;
                    case 'y':ruby[3]++;break;
                }
            }
            int ans = ruby[0];
            for(int i=0;i<4;i++)
                ans = Math.min(ruby[i], ans);
            out.println(ans);
        }
        out.flush();
    }
}
