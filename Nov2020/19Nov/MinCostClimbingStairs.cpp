/*
Problem name: Min Cost Climbing Stairs
Problem link: https://leetcode.com/problems/min-cost-climbing-stairs/
*/

class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size();
        if(n==1)
            return cost[0];
        int op[n];
        op[0]=cost[0];
        op[1]=cost[1];
        for(int i=2;i<n;++i){
            op[i]=cost[i]+min(op[i-1],op[i-2]);
        }
        
        return min(op[n-1],op[n-2]);
    }
};
