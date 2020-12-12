/*
Problem Name: Policemen and thieves
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/joker-and-thieves-53e59f4a/
*/
import java.io.*;
import java.util.*;
public class TestClass {
    static int solution(char[][] A, int K){
        // Write your code here
        List<Integer> police = new ArrayList<Integer>();
        List<Integer> thief = new ArrayList<Integer>();
        int n = A.length, ans = 0;
        for(int i=0;i<n;i++){
            police.clear();
            thief.clear();
            for(int j=0;j<n;j++){
                if(A[i][j] == 'P')
                    police.add(j);
                else
                    thief.add(j);
            }
            int p = 0, t = 0;
            for(;(p < police.size()) && (t < thief.size());){
                if(Math.abs(police.get(p) - thief.get(t)) <= K){
                    ans++;
                    p++;
                    t++;
                }
                else if(police.get(p) < thief.get(t))
                    p++;
                else
                    t++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }

            int out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
}
