/*
Problem name: 1365. How Many Numbers Are Smaller Than the Current Number
Problem link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/

class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        map<int,int> m;
        
        for(int i=0;i<nums.size();++i)
            m[nums[i]]++;
        
        int sum=0;
        for(auto& l: m){
            int n=l.second;
            l.second=sum;
            sum+=n;
        }
        for(int i=0;i<nums.size();++i)
            nums[i]=m[nums[i]];
        
        return nums;
    }
};
