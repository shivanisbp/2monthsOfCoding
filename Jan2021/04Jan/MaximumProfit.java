/*
Problem Name: Maximum profit
Problem Link: https://www.hackerearth.com/problem/algorithm/maximum-profit-5-c3c2ce7c/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            SortedSet<Long> set = new TreeSet<Long>();
            int n = in.nextInt(), k = in.nextInt();
            for(int i=0;i<n;i++)
                set.add(in.nextLong());
            for(;set.size() > k;)
                set.remove(set.first());
            long sum = 0;
            for(long ele:set)
                sum += ele;
            out.println(sum);
        }
        out.flush();
    }
}
