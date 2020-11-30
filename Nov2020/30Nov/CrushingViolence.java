/*
Problem Name: Crushing Violence
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/crushing-violence/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            int boy[] = new int[n], girl[] = new int[n];
            for(int i=0;i<n;i++)
                boy[i] = in.nextInt() - 1;
            for(int i=0;i<n;i++)
                girl[i] = in.nextInt() - 1;
            int boybeat[] = new int[n], girlbeat[] = new int[n];
            int pairs = 0;
            for(int i=0;i<n;i++){
                if(i != girl[boy[i]]){
                    boybeat[girl[boy[i]]]++;
                    if(girl[boy[girl[boy[i]]]] == i)
                        pairs++;
                }
                if(i != boy[girl[i]]){
                    girlbeat[boy[girl[i]]]++;
                    if(boy[girl[boy[girl[i]]]] == i)
                        pairs++;
                }
            }
            int max = 0;
            for(int i=0;i<n;i++)
                max = Math.max(max, Math.max(boybeat[i],girlbeat[i]));
            out.println(max+" "+(pairs/2));
        }
        out.flush();
    }
}
