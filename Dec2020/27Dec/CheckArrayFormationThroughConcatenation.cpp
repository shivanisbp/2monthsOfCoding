/*
Problem name: 1640. Check Array Formation Through Concatenation
Problem link: https://leetcode.com/problems/check-array-formation-through-concatenation/
*/

class Solution {
public:
    bool canFormArray(vector<int>& arr, vector<vector<int>>& pieces) {
        map<int,int> mp;
        for(int i=0;i<arr.size();++i){
            mp[arr[i]]=i;
        }
        for(int i=0;i<pieces.size();++i){
            int prevp=pieces[i][0];
            if(!mp.count(prevp))
                return false;
            for(int j=1;j<pieces[i].size();++j){
                int currp=pieces[i][j], prevp=pieces[i][j-1];
                if( !mp.count(currp) || mp[currp]!= mp[prevp]+1)
                    return false;
            }
        }
        return true;
    }
};
