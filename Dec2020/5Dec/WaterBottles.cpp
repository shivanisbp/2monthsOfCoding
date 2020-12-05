/*
Problem name: 1518. Water Bottles
Problem link:https://leetcode.com/problems/water-bottles/
*/

class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int left;
        do{
            left = numBottles % numExchange;
            numBottles /= numExchange;
            drank += numBottles;
            numBottles += left;
        }while(numBottles >= numExchange);
        
        return drank;
    }
};
