/*
Problem Name: Fun Game <Capillary>
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/fun-game-91510e9f/
*/
import java.io.*;
import java.util.*;
public class FunGame<Capillary> {
    static int[] funGame(int[] arr){
        // Write your code here
        int n = arr.length, a = 0, b = n - 1;
        List<Integer> l =new ArrayList<Integer>();
        for(;a<n && b>=0;){
            if(arr[a] > arr[b]){
                l.add(1);
                b--;
            }
            else if(arr[a] < arr[b]){
                l.add(2);
                a++;
            }
            else{
                l.add(0);
                a++;
                b--;
            }
        }
        int ans[] = new int[l.size()];
        for(int i=0;i<l.size();i++)
            ans[i] = l.get(i);
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         int[] out_ = funGame(arr);
         System.out.print(out_[0]);
         for(int i_out_=1; i_out_<out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
}
