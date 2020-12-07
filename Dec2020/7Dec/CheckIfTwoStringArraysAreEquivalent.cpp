/*
Problem name: 1662. Check If Two String Arrays are Equivalent
Problem link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
*/

class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string s1,s2;
        bool flag = true;
        
        for(int i=0;i<word1.size();++i)
            s1+=word1[i];
        
        for(int i=0;i<word2.size();++i)
            s2+=word2[i];
        
        if(s1 == s2)    return true;
        else    return false;
    }
};
