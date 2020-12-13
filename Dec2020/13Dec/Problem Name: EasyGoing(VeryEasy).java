/*
Problem Name: Easy Going.(Very Easy)
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), m = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = in.nextInt();
            Arrays.sort(arr);
            int min = 0, max = 0;
            for(int i=0;i<n-m;i++)
                min += arr[i];
            for(int i=0;i<n-m;i++)
                max += arr[n-i-1];
            out.println(max - min);
        }
        out.flush();
    }
}
