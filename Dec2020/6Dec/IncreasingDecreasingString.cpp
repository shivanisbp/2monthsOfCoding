/*
Problem name: 1370. Increasing Decreasing String
Problem link: https://leetcode.com/problems/increasing-decreasing-string/
*/

class Solution {
public:
    string sortString(string s) {
        vector<int> v(26,0);
        string res="";
        
        for(auto i:s)
            v[i-'a']++;
        
        while(res.size()<s.size()) {
            for(int i=0; i<26; ++i)
                if(v[i]){
                    res+=i+'a';
                    v[i]--;
                }
            
            for(int i=25; i>-1; --i)
                if(v[i]){
                    res+=i+'a';
                    v[i]--;
                }
        }
        return res;
    }
};
