/*
Problem name: 1217. Minimum Cost to Move Chips to The Same Position
Problem link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
*/

class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int even = 0, odd = 0;
        
        for(int i=0; i<position.size(); ++i)
            if(position[i] % 2 ==0)
                even++;
            else
                odd++;
        
        if(odd > even)  return even;
        else    return odd;
    }
};
