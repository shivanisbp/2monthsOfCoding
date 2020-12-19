/*
Problem name: 1470. Shuffle the Array
Problem link: https://leetcode.com/problems/shuffle-the-array/
*/

class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> ans;
        bool flag=false;
        for(int i=0,j=n;j<2*n;){
            if(!flag){
                ans.push_back(nums[i]);
                i++;
                flag=true;
            }
            else{
                ans.push_back(nums[j]);
                j++;
                flag=false;
            }
        }
        return ans;
    }
};
