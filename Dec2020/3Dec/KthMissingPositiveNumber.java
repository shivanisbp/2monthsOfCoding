/*
Problem Name: 1539. Kth Missing Positive Number
Problem Link: https://leetcode.com/problems/kth-missing-positive-number/
*/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt[] = new int[2500];
        for(int i=0;i<arr.length;i++)
            cnt[arr[i]] = 1;
        for(int i=1;k>0;i++){
            if(cnt[i] == 0){
                k--;
            }
            if(k == 0)
                return i;
        }
        return 0;
    }
}
