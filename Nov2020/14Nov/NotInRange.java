/*
Problem Name: Not in Range
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/not-in-range-44d19403/
*/
import java.io.*;
import java.util.*;
public class NotInRange {
    static long NotinRange(int[] R, int[] L, int n){
        // Write your code here
        int arr[] = new int[1000000+1];
        for(int i=0;i<n;i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }
        int running = 0;
        long ans = 0;
        for(int i=0;i<=1000000;i++){
            running += arr[i];
            if(running == 0)
                ans += i;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         int[] L = new int[n];
         int[] R = new int[n];
         for(int i_L=0; i_L<n; i_L++)
         {
         	String[] tmp = br.readLine().split(" ");
            L[i_L] = Integer.parseInt(tmp[0]);
         	R[i_L] = Integer.parseInt(tmp[1]);
         	
         }

         long out_ = NotinRange(R, L, n);
         System.out.println(out_);

         wr.close();
         br.close();
    }
}
