/*
Problem Name: 1672. Richest Customer Wealth
Problem Link: https://leetcode.com/problems/richest-customer-wealth/
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0, sum, n = accounts.length, m = accounts[0].length;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<m;j++)
                sum += accounts[i][j];
            max = Math.max(max, sum);
        }
        return max;
    }
}
