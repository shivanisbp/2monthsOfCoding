/*
Problem Name: Profits by cars
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/jetha-and-cars-2d835131/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = in.nextInt();
            Arrays.sort(arr);
            long sum = arr[0];
            for(int i=1;i<n;i++)
                if(arr[i] != arr[i-1])
                    sum += arr[i];
            out.println(sum);
        }
        out.flush();
    }
}
