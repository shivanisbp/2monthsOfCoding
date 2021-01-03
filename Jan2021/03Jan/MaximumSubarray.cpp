/*
Problem name: Maximum Subarray
Problem link: https://leetcode.com/problems/maximum-subarray/
*/

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int totalmax=nums[0], currmax=nums[0];
        
        for(int i=1; i<nums.size(); ++i){
            currmax = max(nums[i], currmax + nums[i]);
            totalmax = max(totalmax, currmax);
        }
        return totalmax;
    }
};
