/*
Problem Name: 53. Maximum Subarray
Problem Link: https://leetcode.com/problems/maximum-subarray/
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int cur = nums[0], max = nums[0], n = nums.length;
        for(int i=1;i<n;i++){
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
            System.out.println(nums[i]+" "+cur+" "+max);
        }
        return max;
    }
}
