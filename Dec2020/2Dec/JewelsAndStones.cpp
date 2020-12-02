/*
Problem name: 771. Jewels and Stones
Problem link: https://leetcode.com/problems/jewels-and-stones/
*/

class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int jewels=0;
        set<char> j;
        
        for(int i=0;i<J.size();++i)
            j.insert(J[i]);
        
        for(int i=0;i<S.size();++i){
            if(j.find(S[i]) != j.end())
                jewels++;
        }
        return jewels;
    }
};
