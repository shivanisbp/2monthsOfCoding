/*
Problem Name: Shubham and Xor
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/shubham-and-xor-8526868e/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        int cur = arr[0];
        long cnt = 1, total = 0;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1])
                cnt++;
            else{
                total += cnt*(cnt - 1)/2;
                cnt = 1;
                cur = arr[i];
            }
        }
        total += cnt*(cnt - 1)/2;
        out.println(total);
        out.flush();
    }
}
