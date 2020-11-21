/*
Problem name: 921. Minimum Add to Make Parentheses Valid
Problem link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
*/

class Solution {
public:
    int minAddToMakeValid(string S) {
        int ans=0;
        stack<char> b;
        for(int i=0;i<S.length();++i){
            if(S[i]=='('){
                b.push(S[i]);
            }
            else if(!b.empty()){
                b.pop();
            }
            else{
                ans++;
            }
        }
        if(!b.empty())  ans+=b.size();
        return ans;
    }
};
