/*
Problem Name: 1046. Last Stone Weight
Problem Link: https://leetcode.com/problems/last-stone-weight/
*/
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
            return stones[0];
        int ind = stones.length;
        for(;;){
            Arrays.sort(stones);
            if(stones[ind-2] == 0)
                break;
            stones[ind-1] -= stones[ind-2];
            stones[ind-2] = 0;
        }
        return stones[ind-1];
    }
}
