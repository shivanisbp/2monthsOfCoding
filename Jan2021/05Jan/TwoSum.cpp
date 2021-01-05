/*
Problem name: 1. Two Sum
Problem link: https://leetcode.com/problems/two-sum/
*/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> indices;
        map<int, int> mp;
        for(int i=0;i<nums.size();++i){
            if(mp.count(target-nums[i]) && mp[target-nums[i]]!=i){
                indices.push_back(mp[target-nums[i]]);
                indices.push_back(i);
                break;
            }
            mp[nums[i]]=i;
        }
        return indices;
    }
};
