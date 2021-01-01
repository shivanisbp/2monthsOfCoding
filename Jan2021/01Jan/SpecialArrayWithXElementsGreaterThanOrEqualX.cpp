/*
Problem name: 1608. Special Array With X Elements Greater Than or Equal X
Problem link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
*/

class Solution {
public:
    int specialArray(vector<int>& nums) {
        int x=nums.size();
        sort(nums.begin(),nums.end());
        
        for(int i=0;i<nums.size();++i){
            if(nums[i]>=x){
                if(i>0 && nums[i-1] == x)
                    return -1;
                else if(nums.size()-i == x)
                    return x;
            }
            x--;
        }
        return -1;
    }
};
