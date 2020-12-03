/*
Problem name: 575. Distribute Candies
Problem link: https://leetcode.com/problems/distribute-candies
*/

class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        set<int> types;
        for(int i=0;i<candyType.size();++i)
            types.insert(candyType[i]);
        
        if(types.size() <= candyType.size()/2)
            return types.size();
        else
            return candyType.size()/2;
    }
};
