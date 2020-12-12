/*
Problem Name: C impresses everyone
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/c-impresses-everyone/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), s = 0;
        int sum[] = new int[n];
        for(int i=0;i<n;i++){
            int ele = in.nextInt();
            s += ele;
            sum[i] = s;
        }
        int q = in.nextInt();
        for(;q>0;q--){
            int f = s - in.nextInt() + 1;
            int ind = bs(sum, f);
            out.println(ind%2 == 0 ? "A":"B");
        }
        out.flush();
    }
    static int bs(int[] arr, int k){
        int l = 0, r = arr.length - 1;
        for(;l<=r;){
            int mid = (l+r)/2;
            if(arr[mid] == k)
                return mid;
            if(arr[mid] > k)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
