/*
Problem name: Best Time to Buy and Sell Stock
Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/


class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        if(n<2)
            return 0;
        int maxprofit=0, rightmax=prices[n-1];
        
        for(int i=n-2 ;i>=0 ;--i){
            maxprofit=max(maxprofit, rightmax-prices[i]);
            rightmax=max(rightmax, prices[i]);
        }
        return maxprofit;
    }
};
