/*
Problem Name: Star-studded Lockdown
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/star-studded-lockdown/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            char arr[] = in.next().toCharArray();
            int cnt[] = new int[26];
            long sum = 0;
            for(int i=0;i<n;i++){
                sum += cnt[arr[i] - 'a'];
                cnt[arr[i] - 'a']++;
            }
            out.println(sum);
        }
        out.flush();
    }
}
