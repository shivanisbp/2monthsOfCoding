/*
Problem Name: KK and crush
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/exists/
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
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0;i<n;i++)
                set.add(in.nextInt());
            int k = in.nextInt();
            for(int i=0;i<k;i++)
                if(set.contains(in.nextInt()))
                    out.println("Yes");
                else
                    out.println("No");
        }
        out.flush();
    }
}
