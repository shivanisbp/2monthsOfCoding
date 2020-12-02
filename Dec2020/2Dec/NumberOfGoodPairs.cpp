/*
Problem name: 1512. Number of Good Pairs
Problem link: https://leetcode.com/problems/number-of-good-pairs/
*/

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int good=0;
        for(int i=0;i<nums.size();++i){
            for(int j=i+1;j<nums.size();++j){
                if(nums[i] == nums[j])
                    good++;
            }
        }
        return good;
    }
};
