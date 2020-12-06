/*
Problem name: 942. DI String Match
Problem link: https://leetcode.com/problems/di-string-match/
*/

class Solution {
public:
    vector<int> diStringMatch(string S) {
        vector<int> res(S.length()+1, -1);
        int counter = 0;
        for(int i=0;i<S.length();++i){
            if(S[i] == 'I'){
                res[i] = counter;
                counter++;
            }
        }
        for(int i=S.length();i>=0;--i){
            if(res[i] == -1){
                res[i] = counter;
                counter++;
            }
        }
        return res;
    }
};
