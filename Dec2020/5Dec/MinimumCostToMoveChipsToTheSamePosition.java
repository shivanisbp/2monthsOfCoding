/*
Problem Name: 1217. Minimum Cost to Move Chips to The Same Position
Problem Link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
*/
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int i=0;i<position.length;i++)
            if(position[i]%2 == 0)
                even++;
            else
                odd++;
        return Math.min(even,odd);
    }
}
