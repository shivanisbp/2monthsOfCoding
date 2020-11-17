/*
Problem Name: A Game of Numbers
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/a-game-of-numbers-1-5d3a8cb3/
*/
import java.util.*;
class AGameOfNumbers {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextLong();
        for(int i=0;i<n;i++){
            int ind = -1;
            for(int j=i+1;j<n;j++)
                if(arr[j] > arr[i]){
                    ind  = j;
                    break;
                }
            if(ind == -1){
                System.out.print("-1 ");
                continue;
            }
            int prev = ind;
            for(int j=ind+1;j<n;j++){
                if(arr[j] < arr[ind]){
                    ind = j;
                    break;
                }
            }
            if(prev == ind)
                System.out.print("-1 ");
            else
                System.out.print(arr[ind]+" ");
        }
    }
}
