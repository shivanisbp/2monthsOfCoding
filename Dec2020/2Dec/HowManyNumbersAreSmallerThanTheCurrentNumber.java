/*
Problem Name: 1365. How Many Numbers Are Smaller Than the Current Number
Problem Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int cnt[] = new int[501];
        for(int n: nums)
            cnt[n]++;
        int small[] = new int[502];
        for(int i=1;i<=501;i++){
            small[i] = small[i-1] + cnt[i-1];
        }
        for(int i=0;i<nums.length;i++)
            nums[i] = small[nums[i]];
        return nums;
    }
}
