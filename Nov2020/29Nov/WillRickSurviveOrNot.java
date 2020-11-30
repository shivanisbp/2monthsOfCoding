/*
Problem Name: Will Rick survive or not
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/will-rick-survive-or-not-2/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        for(;t>0;t--){
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];
            String s[] = in.readLine().split(" ");
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(s[i]);
            Arrays.sort(arr);
            int pos = 0, reload = 0;
            boolean ok = true;;
            for(int i=0;i<n;i++){
                if(arr[i] - pos <= 0){
                    out.println("Goodbye Rick\n"+i);
                    ok = false;
                    break;
                }
                pos++;
                reload++;
                if(reload%6 == 0)
                    pos++;
            }
            if(ok)
                out.println("Rick now go and save Carl and Judas");    
        }
        out.flush();
    }
}
