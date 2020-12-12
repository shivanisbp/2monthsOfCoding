/*
Problem Name: Bishu and Soldiers
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bishu-and-soldiers/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int power[] = new int[n];
        for(int i=0;i<n;i++)
            power[i] = in.nextInt();
        Arrays.sort(power);
        int q = in.nextInt();
        for(;q>0;q--){
            int m = in.nextInt();
            int ind = bs(power,m);
            out.print((ind+1)+" ");
            int sum = 0;
            for(int i=0;i<=ind;i++)
                sum += power[i];
            out.println(sum);
        }
        out.flush();
    }
    static int bs(int arr[], int k){
        int l = 0, r = arr.length - 1, mid = 0;
        for(;l<=r;){
            mid = (l+r)/2;
            if(arr[mid] <= k)
                l = mid + 1;
            else
                r = mid - 1; 
        }
        return r;
    }
}
