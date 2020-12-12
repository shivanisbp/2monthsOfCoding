/*
Problem Name: The Old Monk
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/the-old-monk/
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
            long a[] = new long[n], b[] = new long[n];
            for(int i=0;i<n;i++)
                a[i] = in.nextLong();
            for(int i=0;i<n;i++)
                b[i] = in.nextLong();
            int ans = 0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++)
                    if(b[j] >= a[i])
                        ans = Math.max(ans, j - i);
                    else
                        break; 
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}
