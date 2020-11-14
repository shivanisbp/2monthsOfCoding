/*
Problem Name: Maximum Of K- size subarrays (Deque)
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximum-of-k-size-subarrays-deque/
*/
import java.util.*;
class MaximumOfKSizeSubarraysDeque {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextLong();
        for(int i=0;i<n-k+1;i++){
            long max = 0;
            for(int j=i;j<i+k;j++)
                max = Math.max(max, arr[j]);
            System.out.print(max + " ");
        }
    }
}
