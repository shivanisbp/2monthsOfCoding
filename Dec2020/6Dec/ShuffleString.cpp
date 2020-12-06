/*
Problem name: 1528. Shuffle String
Problem link: https://leetcode.com/problems/shuffle-string/
*/

class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        vector<char> shuffled(s.length());
        
        for(int i=0;i<indices.size();++i)
            shuffled[indices[i]]=s[i];
        
        string st(shuffled.begin(),shuffled.end());
        return st;
    }
};
