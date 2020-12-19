/*
Problem Name: 1470. Shuffle the Array
Problem Link: https://leetcode.com/problems/shuffle-the-array/
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x[] = new int[n], y[] = new int[n];
        for(int i=0;i<n;i++){
            x[i] = nums[i];
            y[i] = nums[i + n];
        }
        for(int i=0;i<n;i++){
            nums[i*2] = x[i];
            nums[i*2 + 1] = y[i];
        }
        return nums;
    }
}
