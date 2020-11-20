/*
Problem name: 1544. Make The String Great
Problem link: https://leetcode.com/problems/make-the-string-great/
*/

class Solution {
public:
    string makeGood(string s) {
        int n=s.length();
        for(int i=0;i<n-1;++i){
            if(i>=0 && tolower(s[i])==tolower(s[i+1])){
                if((islower(s[i]) && isupper(s[i+1])) || (isupper(s[i]) && islower(s[i+1]))) {
                    s.erase(i,2);
                    i=i-2;
                }
            }
        }
        return s;
    }
};
