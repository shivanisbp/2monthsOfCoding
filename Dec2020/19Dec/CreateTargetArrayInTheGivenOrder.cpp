/*
Problem name: 1389. Create Target Array in the Given Order
Problem link: https://leetcode.com/problems/create-target-array-in-the-given-order/
*/

class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        vector<int> ans(0,nums.size());
        
        for(int i=0;i<index.size();++i)
            ans.insert(ans.begin()+index[i], nums[i]);
        
        return ans;
    }
};
