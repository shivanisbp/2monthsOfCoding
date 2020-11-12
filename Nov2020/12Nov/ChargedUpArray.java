/*
Problem Name: Charged Up Array
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charged-up-array-f35a5e23/
This is a problem which requires writing code for the solve() method only. The input and output has been already done.
*/
import java.io.*;
import java.util.*;
public class ChargedUpArray {
    static int solve(long[] A,int N){
        if(N>=64)
            return 0;
        long m = 1000000000+7, ans = 0, subset = 1;
        for(int i=0;i<N-1;i++)
            subset *= 2;
        for(int i=0;i<N;i++){
            if(A[i] >= subset)
                ans = (ans + (A[i]%m))%m;
        }
        return (int)ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int out_ = solve(A,N);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
}
