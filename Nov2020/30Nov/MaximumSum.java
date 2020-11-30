/*
Problem Name: Maximum Sum
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-subarray-sum-of-subarrays-7f33aefa/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextLong();
        Set<Long> set = new HashSet<Long>();
        for(int i=0;i<n;i++){
            long maxsum = arr[i], sum = arr[i];
            set.add(maxsum);
            for(int j=i+1;j<n;j++){
                sum = Math.max(arr[j], sum + arr[j]);
                maxsum = Math.max(sum,maxsum);
                set.add(maxsum);
            }
        }
        long sum = 0;
        for(long ele:set){
            sum += ele;
        }
        out.println(sum);
        out.flush();
    }
}
