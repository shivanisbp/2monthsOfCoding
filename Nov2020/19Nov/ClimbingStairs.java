/*
Problem Name: 70. Climbing Stairs
Problem Link: https://leetcode.com/problems/climbing-stairs/
*/
class Solution {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int step0 = 1, step1 = 2, step2 = 0;
        for(int i=2;i<n;i++){
            step2 = step0 + step1;
            step0 = step1;
            step1 = step2;
        }
        return step2;
    }
}
