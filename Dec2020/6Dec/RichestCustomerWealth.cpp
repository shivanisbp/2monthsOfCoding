/*
Problem name: 1672. Richest Customer Wealth
Problem link: https://leetcode.com/problems/richest-customer-wealth/
*/

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max=-1, sum=0;
        for(int i=0;i<accounts.size();++i){
            sum=0;
            for(int j=0;j<accounts[i].size();++j){
                sum+=accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
};
