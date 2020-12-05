/*
Problem Name: 1518. Water Bottles
Problem Link: https://leetcode.com/problems/water-bottles/
*/
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0, empty = 0;
        for(;numBottles>0;){
            empty += numBottles;
            sum += numBottles;
            numBottles = empty/numExchange;
            empty %= numExchange;
        }
        return sum;
    }
}
