/*
Problem name: 482. License Key Formatting
Problem link: https://leetcode.com/problems/license-key-formatting/
*/

class Solution {
public:
    string licenseKeyFormatting(string S, int K) {
        string result="";
        int mark=0;
        for(int i=S.length()-1;i>=0;--i){
            if(S[i]!='-'){
                S[i]=toupper(S[i]);
                result += S[i];
                mark++;
                if(mark%K == 0){
                    result += '-';
                    mark=0;
                }
            }
            else
                continue;
        }
        reverse(result.begin(), result.end());
        if(result[0]=='-')
            return result.substr(1);
        return result;
    }
};
