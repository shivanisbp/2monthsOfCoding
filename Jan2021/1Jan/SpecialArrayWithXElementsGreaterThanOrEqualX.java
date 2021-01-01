/*
Problem Name: 1608. Special Array With X Elements Greater Than or Equal X
Problem Link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
*/
class Solution {
    public int specialArray(int[] nums) {
        int dp[] = new int[1002];
        for(int i=0;i<nums.length;i++)
            dp[nums[i]]++;
        for(int i=1000;i>=0;i--){
            dp[i] += dp[i+1];
            if(dp[i] == i)
                return i;
        }
        return -1;
    }
}
