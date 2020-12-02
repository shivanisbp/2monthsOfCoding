/*
Problem Name: 1512. Number of Good Pairs
Problem Link: https://leetcode.com/problems/number-of-good-pairs/
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0, n = nums.length;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j])
                    pairs++;
            }
        return pairs;
    }
}
