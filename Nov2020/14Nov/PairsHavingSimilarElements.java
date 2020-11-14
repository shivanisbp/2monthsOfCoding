/*
Problem Name: Pairs Having Similar Elements
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-having-similar-element-eed098aa/
*/
import java.io.*;
import java.util.*;
public class PairsHavingSimilarElements {
    static long SimilarElementsPairs(int[] A,int N){
        // Write your code here
        Arrays.sort(A);
        long ans = 0;
        long diff = 1, same = 1;
        for(int i=1;i<N;i++){
            if(A[i] == A[i-1])
                same++;
            else if(A[i] == (A[i-1]+1)){
                diff++;
                same++;
            }
            else{
                if((diff > 1) && (same > 1)){
                    ans += same*(same-1)/2;
                }
                diff = 1;
                same = 1;
            }
        }
        if((diff > 1) && (same > 1)){
            ans += same*(same-1)/2;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }
         
         long out_ = SimilarElementsPairs(A,N);
         System.out.println(out_);

         wr.close();
         br.close();
    }
}
