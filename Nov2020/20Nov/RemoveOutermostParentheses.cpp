/*
Problem name: Remove Outermost Parentheses
Problem link: https://leetcode.com/problems/remove-outermost-parentheses/
*/

class Solution {
public:
    string removeOuterParentheses(string s) {
        string ans="";
        int count=0;
        for(int i=0;i<s.length();++i){
            if(s[i]=='('){
                count++;
                if(count>1)
                    ans+="(";
            }
            else{
                count--;
                if(count>0)
                    ans+=")";
            }
        }
        return ans;
    }
};
