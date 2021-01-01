/*
Problem name: 205. Isomorphic Strings
Problem link: https://leetcode.com/problems/isomorphic-strings/
*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,int> s1,t1;
        for(int i=0;i<s.length();++i){
            if(s1[s[i]] != t1[t[i]])
                return false;
            s1[s[i]]=i+1;
            t1[t[i]]=i+1;
        }
        return true;
    }
};
