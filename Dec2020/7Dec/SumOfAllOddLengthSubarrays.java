/*
Problem Name: 1588. Sum of All Odd Length Subarrays
Problem Link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n =arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2)
                for(int k=i;k<=j;k++)
                    sum += arr[k];
        }
        return sum;
    }
}
