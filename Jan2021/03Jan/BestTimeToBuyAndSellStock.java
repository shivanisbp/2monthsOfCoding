/*
Problem Name: 121. Best Time to Buy and Sell Stock
Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0, n = prices.length;
        for(int i=1;i<n;i++){
            maxProf = Math.max(maxProf, prices[i] - prices[i-1]);
            prices[i] = Math.min(prices[i],prices[i-1]);
        }
        return maxProf;
    }
}
